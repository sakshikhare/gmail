import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  
  @BeforeTest
  public void launch_browser() {
	  System.setProperty("webdriver.gecko.driver", "/home/qainfotech/Desktop/geckodriver");
	 driver = new FirefoxDriver();
	  
  }
  @Test
  public void f() throws InterruptedException {
	  //launchingurl
	  driver.get("http://gmail.com");
	  
	  //enteringemailid
	  driver.findElement(By.id("identifierId")).clear();
      driver.findElement(By.id("identifierId")).sendKeys("sakshikhare026@gmail.com");
      driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
      Thread.sleep(2000);
      
      //enteringpasswrd
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/form/content/div[1]/div/div[1]/div/div[1]/input")).sendKeys("viratanushkaa");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content")).click();
	  Thread.sleep(2000);
	  //logout
	  driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	  driver.findElement(By.cssSelector("#gb_71")).click();
  }
  @AfterTest
  public void afterTest() {
  }

}
