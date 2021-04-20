package bddFramework.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDefinations {

    WebDriver driver;
@Given("Application is up and running")
public void application_is_up_and_running() {
System.setProperty("webdriver.chrome.driver", "E:\\Automation-training\\Drivers\\chromedriver.exe");
driver= new ChromeDriver();

//implicit wait
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
}

@When("user enters valid credentials")
public void user_enters_valid_credentials() {
 //  driver.findElement(By.xpath("//a[text()='Login']")).click();
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc1233@gmail.com");
driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Temp123");
driver.findElement(By.xpath("//button[@type='submit'][@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
 
}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() {
System.out.println(driver.getTitle());
 
}

}