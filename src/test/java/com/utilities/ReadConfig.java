package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
	
	public  ReadConfig()
	{
		File src = new File("./Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		}
		}
	
	//Getting URL
	public String getbaseURL() {
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	//Getting email address
	public String getEmail()
	{
	String emailaddress = pro.getProperty("email");	
	return emailaddress;
	
	}
	
	//Getting Password
	public String getPassword()
	{
		String pwd = pro.getProperty("password");
		return pwd;
	}
	
	//Getting ProfileSearch
		public String getProfileSearch()
		{
			String ps = pro.getProperty("profilesearch");
			return ps;
		}
		
		//Getting ProfileKey1
				public String getProfileKey1()
				{
					String pk1 = pro.getProperty("profilekey1");
					return pk1;
				}
		
				//Getting ProfileKey2
				public String getProfileKey2()
				{
					String pk2 = pro.getProperty("profilekey2");
					return pk2;
				}
				//Getting ProfileKey3
				public String getProfileKey3()
				{
					String pk3 = pro.getProperty("profilekey3");
					return pk3;
				}
				//Getting ProfileKey1
				public String getProfileKey4()
				{
					String pk4 = pro.getProperty("profilekey4");
					return pk4;
				}
				//Getting ProfileKey1
				public String getProfileKey5()
				{
					String pk5 = pro.getProperty("profilekey5");
					return pk5;
				}
		
		//Getting Naukri location
		public String getNaukriLocation()
		{
			String loc = pro.getProperty("location");
			return loc;
		}

}
