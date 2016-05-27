package wasdev.sample.servlet;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.personality_insights.v2.model.Profile;

import wasdev.sample.service.IPI;
@Controller
public class PersonalityInsightsController {
	@Autowired
	IPI PersonalityInsightsSvc;
	@RequestMapping(value="/pi",method=RequestMethod.GET)
	public String getText(){
		return "watson/PI/home";
	}
	@RequestMapping(value="/pi",method=RequestMethod.POST)
	public ModelAndView getPersonality(@RequestParam("text") String text){
		Profile profile=PersonalityInsightsSvc.getProfile(text);
		Map<String,String> result=new HashMap<>();
		result.put("profile",profile.toString());
		
		return new ModelAndView("watson/PI/result",result);
	}
	
	//@RequestMapping(value = "/ex/foos", method = RequestMethod.POST)

}
