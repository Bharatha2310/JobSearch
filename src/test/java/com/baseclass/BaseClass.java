package com.baseclass;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig read_config = new ReadConfig();
	public String baseUrl = read_config.getbaseURL();
	public String email = read_config.getEmail();
	public String password = read_config.getPassword();
	public String profilesearch = read_config.getProfileSearch();
	public String location = read_config.getNaukriLocation();
	public String profilekey1 = read_config.getProfileKey1();
	public String profilekey2 = read_config.getProfileKey2();
	public String profilekey3 = read_config.getProfileKey3();
	public String profilekey4 = read_config.getProfileKey4();
	public String profilekey5 = read_config.getProfileKey5();
	protected WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
}
