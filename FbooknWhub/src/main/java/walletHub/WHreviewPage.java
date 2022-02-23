package walletHub;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class WHreviewPage extends Data {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div")
	WebElement unmae;
	
	By highlighted = By.cssSelector("#reviews-section > modal-dialog > div > div > write-review > review-star > div > svg:nth-child(n) > g > path:nth-child(2)");
	//WebElement Star4  = driver.findElement(By.cssSelector("#reviews-section > modal-dialog > div > div > write-review > review-star > div > svg:nth-child(4)"));
	By Starss = By.cssSelector("#reviews-section > div.review-stat-box > div.rv.review-action.ng-enter-element > review-star > div > svg:nth-child(4)");
	By dropdown2 = By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div");
	By reviewtext = By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/div[1]/textarea");
	By reviewsubmitbut=  By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/sub-navigation/div/div[2]");
	By dropdown = By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div/span");
	By healthoption = By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div/ul/li[2]");


	
	public WHreviewPage(WebDriver driver1) {
		this.driver = driver1;
	}
	
		
	
	
	public void hoveronstarandverify() throws InterruptedException {
		
		WebElement ab = driver.findElement(Starss);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ab);

		Thread.sleep(6000);
		
		Actions act = new Actions(driver);
		act.moveToElement(ab).build().perform();
		
		Thread.sleep(15000);
		
		List<WebElement> High_starts = driver.findElements(highlighted);
		int starsexpected = 4;
		
		Assert.assertEquals(High_starts.size(), starsexpected);
		System.out.println("No. of Starts are highlighted= "+High_starts.size());
		
		
			
		}
		
		
		
		    
		
		

	
		public void giverating() {
			driver.findElement(Starss).click();
			driver.findElement(dropdown).click();
			driver.findElement(healthoption).click();
			driver.findElement(reviewtext).sendKeys(reviewdata);
			driver.findElement(reviewsubmitbut).click();

		}
	
}
