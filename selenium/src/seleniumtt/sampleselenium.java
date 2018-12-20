package seleniumtt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sampleselenium {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty(/*"webdriver.chrome.driver"*/
		"webdriver.gecko.driver",
		/*"C:\\Users\\ASMA\\Desktop\\Nouveau dossier\\chromedriver_win32\\chromedriver.exe"*/
		"C:\\Users\\ASMA\\Desktop\\Nouveau dossier\\geckodriver-v0.23.0-win64\\geckodriver.exe");
WebDriver webdriver = new FirefoxDriver();
webdriver.get("http://chewie.one2team.com");
WebElement username = webdriver.findElement(By.id("userName"));
WebElement password = webdriver.findElement(By.id("passWord"));
WebElement domainName = webdriver.findElement(By.id("domainName"));
WebElement submit = webdriver.findElement(By.xpath("//input[@type='submit']"));
username.clear();
password.clear();
domainName.clear();
username.sendKeys("candidat");
password.sendKeys("Candidat1*");
domainName.sendKeys("telco");
submit.submit();
WebElement slideboards = webdriver.findElement(By.id("slideboard"));
slideboards.click();
	}

}
