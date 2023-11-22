import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void testCSS() {

        String text = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child")).getText();
        Assert.assertEquals(text,"Canada");
        Assert.assertTrue(text.contains("Can"));
    }
}