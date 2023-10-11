package Iframe.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
}

}
