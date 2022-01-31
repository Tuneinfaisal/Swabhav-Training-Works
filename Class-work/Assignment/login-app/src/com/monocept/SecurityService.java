package com.monocept;

import java.util.HashMap;

public class SecurityService {
	
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
	public SecurityService()
	{
		loginInfo.put("faisal", "123");
		loginInfo.put("ankit", "456");
		loginInfo.put("asif", "789");
		loginInfo.put("nongamba", "369");
	}
	
	protected HashMap getLoginInfo()
	{
		return loginInfo;
	}

}
