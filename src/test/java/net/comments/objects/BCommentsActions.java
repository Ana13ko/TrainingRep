package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class BCommentsActions implements CommentsActions {
    private final WebDriver driver;

    public BCommentsActions(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void duplicate() {
        this.driver.findElement(By.xpath("//*[@value=\"Duplicate...\"]")).click();
    }

    public void edit(String comment) {
        throw new UnsupportedOperationException("Please implement");
    }

    public void delete(String comment) {
        throw new UnsupportedOperationException("Please implement");
    }
}
