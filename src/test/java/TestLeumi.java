import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestLeumi {


    WebDriver wd;


    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.get("https://www.leumi.co.il/");
        //  wd.navigate().to("https://telranedu.web.app/home");
        //    wd.navigate().refresh();
    }

    @Test
    public void testCSS() {
        String text = wd.findElement(By.linkText("פרטי")).getText();
        Assert.assertEquals(text, "פרטי");
        System.out.println(text);

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
