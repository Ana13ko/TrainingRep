package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BCommentsTable implements CommentsTable {
    private final WebDriver driver;

    public BCommentsTable(WebDriver driver) {
        this.driver = driver;
    }

    public boolean commentIsPresentWithID(int i) {
        try {
            driver.findElements(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tbody/tr[1]/td[2]"));
            return true;
        } catch (NoSuchElementException a) {
            return false;
        }
    }
}
