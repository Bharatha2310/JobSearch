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

				//Getting ProfileKey1
				public String getProfileKey6()
				{
					String pk6 = pro.getProperty("profilekey6");
					return pk6;
				}

				//Getting ProfileKey1
				public String getProfileKey7()
				{
					String pk7 = pro.getProperty("profilekey7");
					return pk7;
				}

				//Getting ProfileKey1
				public String getProfileKey8()
				{
					String pk8 = pro.getProperty("profilekey8");
					return pk8;
				}
				//Getting ProfileKey1
				public String getProfileKey9()
				{
					String pk9 = pro.getProperty("profilekey9");
					return pk9;
				}
				//Getting ProfileKey1
				public String getProfileKey10()
				{
					String pk10 = pro.getProperty("profilekey10");
					return pk10;
				}
				//Getting ProfileKey1
				public String getProfileKey11()
				{
					String pk11 = pro.getProperty("profilekey11");
					return pk11;
				}
				//Getting ProfileKey1
				public String getProfileKey12()
				{
					String pk12 = pro.getProperty("profilekey12");
					return pk12;
				}
				//Getting ProfileKey1
				public String getProfileKey13()
				{
					String pk13 = pro.getProperty("profilekey13");
					return pk13;
				}
				//Getting ProfileKey1
				public String getProfileKey14()
				{
					String pk14 = pro.getProperty("profilekey14");
					return pk14;
				}
				//Getting ProfileKey1
				public String getProfileKey15()
				{
					String pk15 = pro.getProperty("profilekey15");
					return pk15;
				}
				//Getting ProfileKey1
				public String getProfileKey16()
				{
					String pk16 = pro.getProperty("profilekey16");
					return pk16;
				}
				//Getting ProfileKey1
				public String getProfileKey17()
				{
					String pk17 = pro.getProperty("profilekey17");
					return pk17;
				}
				//Getting ProfileKey1
				public String getProfileKey18()
				{
					String pk18 = pro.getProperty("profilekey18");
					return pk18;
				}
				//Getting ProfileKey1
				public String getProfileKey19()
				{
					String pk19 = pro.getProperty("profilekey19");
					return pk19;
				}
				//Getting ProfileKey1
				public String getProfileKey20()
				{
					String pk20 = pro.getProperty("profilekey20");
					return pk20;
				}
				//Getting ProfileKey1
				public String getProfileKey21()
				{
					String pk21 = pro.getProperty("profilekey21");
					return pk21;
				}
				//Getting ProfileKey1
				public String getProfileKey22()
				{
					String pk22 = pro.getProperty("profilekey22");
					return pk22;
				}
				//Getting ProfileKey1
				public String getProfileKey23()
				{
					String pk23 = pro.getProperty("profilekey23");
					return pk23;
				}

		//Getting Naukri location
		public String getNaukriLocation()
		{
			String loc = pro.getProperty("location");
			return loc;
		}

}
