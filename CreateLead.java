package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		// Setup the driver
		WebDriverManager.chromedriver().setup();

		// Launch the driver
		ChromeDriver chromeDriver = new ChromeDriver();

		// Load the url
		chromeDriver.get("http://leaftaps.com/opentaps");

		// Maximize the browser
		chromeDriver.manage().window().maximize();

		// Enter the Username
		WebElement userName = chromeDriver.findElement(By.id("username"));

		userName.sendKeys("DemoSalesManager");

		// Enter the password"
		chromeDriver.findElement(By.id("password")).sendKeys("crmsfa");

		Thread.sleep(3000);

		// Click Submit button
		chromeDriver.findElement(By.className("decorativeSubmit")).click();

		Thread.sleep(3000);

		// Click CRM/SFA
		chromeDriver.findElement(By.linkText("CRM/SFA")).click();

		Thread.sleep(3000);

		// Click Leads tab
		chromeDriver.findElement(By.linkText("Leads")).click();

		Thread.sleep(3000);

		// Click Create Lead
		chromeDriver.findElement(By.linkText("Create Lead")).click();

		// Enter Company Name
		chromeDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter First Name
		chromeDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");

		// Enter Last Name
		chromeDriver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathivanan");

		// Enter Birth Date
		chromeDriver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/02/22");

		// Create object for Select class
		Select sourceDropDownSelect = new Select(chromeDriver.findElement(By.id("createLeadForm_dataSourceId")));
		sourceDropDownSelect.selectByVisibleText("Employee");

		// Contact Information

		// Enter Area Code
		chromeDriver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("22");

		// Enter Phone Number
		chromeDriver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9790573762");

		// Enter Extension
		chromeDriver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");

		// Enter Person Name
		chromeDriver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sangeetha");

		// Enter Primary Email
		chromeDriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sangeethaoc@gmail.com");

		// Enter Primary URL
		chromeDriver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://sangeethaoc@gmail.com");

		// Primary Address

		// Enter Reciepient Name
		chromeDriver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sangeetha");

		// Enter Attention Name
		chromeDriver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Sangeetha");

		// Enter Address Line 1
		chromeDriver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("H918,Rajiv Gandhi Street");

		// Enter Address Line 2
		chromeDriver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sholinganallur");

		// Enter City
		chromeDriver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");

		// Enter Country
		Select countrySelect = new Select(chromeDriver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		countrySelect.selectByVisibleText("India");

		// Enter Postal Code
		chromeDriver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("638030");

		// Enter Postal Code Extension
		chromeDriver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("12");

		Thread.sleep(3000);

		// Enter State
		WebElement stateWE = chromeDriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateSelect = new Select(stateWE);
		stateSelect.selectByValue("IN-TN");

		// Click Create Lead button
		chromeDriver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);

		String pageTitle = chromeDriver.getTitle();
		// Print Page Title
		if (pageTitle.startsWith("View Lead"))
		{
			System.out.println("Page Title Received is as expected");
			System.out.println("Page Title : " + chromeDriver.getTitle());
		}
		else
			System.out.println("Page Title is not as expected");

	}

}
