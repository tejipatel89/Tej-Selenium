package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FLoginpage {
	
	WebDriver driver;
	By login_id = By.xpath("//div[@class='IiD88i _351hSN']/input[contains(@type,'text')]");
	By login_password = By.xpath("//div[@class='IiD88i _351hSN']/input[contains(@type,'password')]");
	By login = By.xpath("//div[@class='_1D1L_j']//button[@type='submit']");
	By name = By.xpath("//div[@class='_2Xfa2_']/div[3]");
	By mychat = By.xpath("//div[text()= 'My Chats']");
	By allchats = By.xpath("//span[text()= 'All Chats']");

	public FLoginpage(WebDriver driver1) {
		this.driver = driver1;

	}
	
	
	public void doLogin(String u, String p) throws InterruptedException {

		driver.findElement(login_id).sendKeys(u);
		driver.findElement(login_password).sendKeys(p);
		driver.findElement(login).click();
		Thread.sleep(5000);
		driver.findElement(name).click();
		driver.findElement(mychat).click();
		String allchat = driver.findElement(allchats).getText();
		if (allchat.contains("All Chats")) {
			System.out.println("login Success");
		} else {
			System.out.println("login failed");
		}

	}

}
