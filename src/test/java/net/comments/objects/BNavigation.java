package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BNavigation implements Navigation {
    private final WebDriver driver;

    public BNavigation(WebDriver driver) {
        this.driver = driver;
    }

//    public void navigateForward() {
//        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tfoot/tr/td/a[3]")).click();
//    }

    public void navigateFourthPage() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tfoot/tr/td/a[3]")).click();
    }

//    public void navigateBackward() {
//        driver.findElement(By.xpath("")).click();
//    }
}
