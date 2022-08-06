import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
             ChromeDriver driver=new ChromeDriver();
             driver.get("https://www.flights.com/flights/newark-ewr-to-houston-iah/");
             driver.manage().window().maximize();
             System.out.println(driver.getCurrentUrl());
             WebElement age = driver.findElement(By.xpath("//select[@name='numadult']"));
             Select s=new Select(age);
        // method 1(select by indix)    //s.selectByIndex(0);
        //method 2(select by value)     //s.selectByValue("4");
         //method 3(select by visible text)
             s.selectByVisibleText("4");
	}
		
}
}
