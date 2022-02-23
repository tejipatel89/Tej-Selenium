package walletHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Profile_page {
	
	WebDriver driver;
	
	By login_name = By.xpath("//*[@id='web-app']/header/div/nav[1]/div[5]/span");
	By profile = By.xpath("//*[@id='web-app']/header/div/nav[1]/div[5]/span/div");
	By review_company = By.xpath("//a[contains(@href, 'wallethub')]");
	//By  review_company2= By.xpath("//p[@class='pr-rec-type']");
	By  review_company2= By.xpath("//a[text()='Test Insurance Company']");
	
	
	public Profile_page(WebDriver driver1) {
		this.driver = driver1;
	}
	

	
	public void verifyreviewpresent () {
		
		driver.get("review_url");
		String Act= driver.findElement(review_company2).getText();
		Assert.assertEquals(Act, "Insurance Company", "Review not present");
		System.out.println("Review present");
		
		
	}
	
}
