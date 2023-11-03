package com.utility;

import com.api.pojo.JobDetailsPOJO;
import com.google.gson.Gson;

public class TestUtility {
	
	public static JobDetailsPOJO getJobDetailsPOJO() {
		 
		JobDetailsPOJO job = new JobDetailsPOJO("morpheus","leader");
		
		return job;

	}
	
	public static String getJsonObject(Object pojo) {
		Gson gson = new Gson();
		String jsonData = gson.toJson(pojo);
		return jsonData;
		
	}

}

   