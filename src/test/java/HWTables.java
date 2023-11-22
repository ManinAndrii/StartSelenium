import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class HWTables  {

     WebDriver  wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void testCSS() {

        List<WebElement> elements = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println(elements.size());
        List<WebElement> elements1 indElements(By.cssSelector("#customers th"));
        System.out.println(elements1.size());
        String text = wd.findElement(By.cssSelector("#customers tr:nth-child(3)")).getText();
        Assert.assertTrue(text.contains("Berglun"));
        String text1 = wd.findElement(By.cssSelector("#customers th:last-child")).getText();
        Assert.assertTrue(text1.contains("Country"));

    }
    @Test
    public void testMethod1(){

    }



    @AfterMethod
    public void postcondition() {
        wd.close();
        //      wd.quit();

    }

}
