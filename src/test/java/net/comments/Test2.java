package net.comments;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test2 {

    private final WebDriver[] driver = new WebDriver[1];

    @Test
    public void test() {
        this.driver().get("http://commentssprintone.azurewebsites.net/");
        final String page = this.driver().getPageSource();
        MatcherAssert.assertThat("Number 333 is present", !page.contains("333"));
        this.driver().findElements(By.name("SelectedId")).get(3).click();
        this.driver().findElement(By.xpath("//*[@value=\"Duplicate...\"]")).click();
        WebElement numberField = this.driver().findElement(By.xpath("//*[@id=\"Number\"]"));
        numberField.clear();
        numberField.sendKeys("333");
        this.driver().findElement(By.xpath("//*[@value=\"Save & Return\"]")).click();
        MatcherAssert.assertThat("Number 333 is added", page.contains("333"));
    }

    @BeforeMethod
    public void createDriver() {
        driver[0] = new ChromeDriver();
    }

    @AfterMethod
    public void closeDriver() {
        driver[0].close();
    }

    private WebDriver driver() {
        return this.driver[0];
    }
}
