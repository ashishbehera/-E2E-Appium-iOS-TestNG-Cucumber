package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Base;

public class Hooks {
	Base testBase;

	
	@Before("@smokeTestAmazonLogin")
	public void beforeValidation() {
		System.out.println("Before Mobile Test");
	}
	

	@After
	public void endTest(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {

			try {
				TakesScreenshot ts = (TakesScreenshot) Base.driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				String time = timestamp.toString();
				String destFile = System.getProperty("user.dir") + "//Screenshots//" + scenario.getName() + "_" + time + ".png";
				FileUtils.copyFile(source, new File(destFile));
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} 

		//if(!Base.hasQuit(Base.driver))
		//Base.driver.quit();
	}
}
