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
	public String profilekey6 = read_config.getProfileKey6();
	public String profilekey7 = read_config.getProfileKey7();
	public String profilekey8 = read_config.getProfileKey8();
	public String profilekey9 = read_config.getProfileKey9();
	public String profilekey10 = read_config.getProfileKey10();
	public String profilekey11 = read_config.getProfileKey11();
	public String profilekey12 = read_config.getProfileKey12();
	public String profilekey13 = read_config.getProfileKey13();
	public String profilekey14 = read_config.getProfileKey14();
	public String profilekey15 = read_config.getProfileKey15();
	public String profilekey16 = read_config.getProfileKey16();
	public String profilekey17 = read_config.getProfileKey17();
	public String profilekey18 = read_config.getProfileKey18();
	public String profilekey19 = read_config.getProfileKey19();
	public String profilekey20 = read_config.getProfileKey20();
	public String profilekey21= read_config.getProfileKey21();
	public String profilekey22 = read_config.getProfileKey22();
	public String profilekey23 = read_config.getProfileKey23();

	protected WebDriver driver;

	@BeforeClass
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
