package com.search.test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.baseclass.BaseClass;


public class SearchTaxConsult extends BaseClass {

	@Test
	public void searchTaxConsultIndia() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		WebDriverWait wait = new WebDriverWait(driver, 100);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@placeholder=\"Enter your password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"btn-primary loginButton\"]")).click();
		driver.findElement(By.xpath("//span[text()='Search jobs here']")).click();

		driver.findElement(By.xpath("//*[@placeholder=\"Enter keyword / designation / companies\"]"))
				.sendKeys(profilesearch);
		driver.findElement(By.xpath("//*[@placeholder=\"Enter keyword / designation / companies\"]"))
				.sendKeys(Keys.TAB);

		driver.findElement(By.xpath("//*[@id=\"sa-dd-scrollexperienceDD\"]/div[1]/ul/li[5]")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"Enter location\"]")).sendKeys(location);
		driver.findElement(By.xpath("//*[@placeholder=\"Enter location\"]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@placeholder=\"Enter location\"]")).sendKeys(Keys.ENTER);
		String getNaukriTitle = driver.getTitle();
		wait.until(ExpectedConditions.titleContains(getNaukriTitle));
		Thread.sleep(3000);
		// inserting the loops
		for (int i = 1; i <= 10; i++) { // Outer Loop

			for (int j = 10; j <= 20; j++) { // Inner Loop

				Thread.sleep(5000);
				WebElement article = driver
						.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[2]/div[2]/article[" + j + "]"));
				js.executeScript("arguments[0].scrollIntoView(true);", article);
				String JobProfile = driver.findElement(By
						.xpath("//*[@id=\"root\"]/div[4]/div/div/section[2]/div[2]/article[" + j + "]/div[1]/div[1]/a"))
						.getAttribute("title");
				if (JobProfile.contains(profilekey1) || JobProfile.contains(profilekey2)
						|| JobProfile.contains(profilekey3) || JobProfile.contains(profilekey4)
						|| JobProfile.contains(profilekey5) || JobProfile.contains(profilekey6)
						|| JobProfile.contains(profilekey7) || JobProfile.contains(profilekey8)
						|| JobProfile.contains(profilekey9) || JobProfile.contains(profilekey10)
						|| JobProfile.contains(profilekey11) || JobProfile.contains(profilekey12)
						|| JobProfile.contains(profilekey13) || JobProfile.contains(profilekey14)
						|| JobProfile.contains(profilekey15) || JobProfile.contains(profilekey16)
						|| JobProfile.contains(profilekey17) || JobProfile.contains(profilekey18)
						|| JobProfile.contains(profilekey19) || JobProfile.contains(profilekey20)
						|| JobProfile.contains(profilekey21) || JobProfile.contains(profilekey22)
						|| JobProfile.contains(profilekey23)) {
					driver.findElement(
							By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[2]/div[2]/article[" + j + "]")).click();
					for (String handle : driver.getWindowHandles()) {
						driver.switchTo().window(handle);
					}
					String jobtitle = driver.getTitle();
					if (jobtitle.contains(JobProfile)) {
						
						 String applyButtonXPath = "//*[@id=\"apply-button\"]";
				            String alternateButtonXPath = "//*[@id=\"root\"]/main/div[2]/div[1]/section[1]/div[2]/div[2]/button[2]";

				            // Try locating and clicking the Apply button using explicit wait
				            if (clickButton(driver, applyButtonXPath)) {
				                System.out.println("Apply button clicked successfully.");
				            } else {
				                // If Apply button click fails, try the alternate button
				                if (clickButton(driver, alternateButtonXPath)) {
				                    System.out.println("Alternate button clicked successfully.");
				                } else {
				                    System.out.println("Both button clicks failed.");
				                }
				            }
				            Thread.sleep(3000);
							System.out.println("Job Applied successfully");				
						driver.switchTo().window(tabs.get(0));
					} else {
						driver.switchTo().window(tabs.get(0));
					}
				}
			}
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[2]/div[3]/div/a[2]")).click();
			Thread.sleep(5000);
		}
	}
	
	 public static boolean clickButton(WebDriver driver, String xpath) {
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        
	        try {
	            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	            button.click();
	            return true; // Click succeeded
	        } catch (Exception e) {
	            return false; // Click failed
	        }
	    }
}
