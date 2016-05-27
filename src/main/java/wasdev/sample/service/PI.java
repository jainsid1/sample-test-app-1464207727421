package wasdev.sample.service;

import org.springframework.stereotype.Service;

import com.ibm.watson.developer_cloud.personality_insights.v2.PersonalityInsights;
import com.ibm.watson.developer_cloud.personality_insights.v2.model.Profile;

@Service
public class PI implements IPI{
	
	public Profile getProfile(String text){
		PersonalityInsights service = new PersonalityInsights();
		service.setUsernameAndPassword("89586fb4-26a1-47e2-9765-e25151d907f4","UhdST12ry574");
		Profile personalityProfile = service.getProfile(text);
		return personalityProfile;
	}
}
