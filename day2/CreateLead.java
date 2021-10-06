package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	@Test(dataProvider = "dataSupply")
	public void creatingLead(String CompName, String fName, String lName, String phNm) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNm);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider()
	public String[][] dataSupply() throws IOException {
		return new ReadExcel().readExcel("CreateLead");
		/*
		 * val[0][0] = "Testleaf"; val[0][1] = "krishna"; val[0][2] = "bharathi";
		 * val[0][3] = "9876";
		 * 
		 * val[1][0] = "TCS"; val[1][1] = "Nivetha"; val[1][2] = "Saravanan"; val[1][3]
		 * = "6543";
		 * 
		 * val[2][0] = "CTS"; val[2][1] = "Ramesh"; val[2][2] = "Venkat"; val[2][3] =
		 * "12345";
		 */
		
	}
}
