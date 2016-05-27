package wasdev.sample.service;

import com.ibm.watson.developer_cloud.personality_insights.v2.model.Profile;

public interface IPI {
	public Profile getProfile(String text);
}
