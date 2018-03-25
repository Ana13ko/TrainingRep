package net.comments;

import net.comments.objects.*;
import net.comments.selenium.BDriver;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test4 extends BDriver {
    private final CommentsPage commentsPage;
    private final CommentsActions commentsActions;
    private final Navigation navigation;
    private final CommentsTable table;

    public Test4() {
        super();
        this.commentsPage = new BCommentsPage(this.driver);
        this.commentsActions = new BCommentsActions(this.driver);
        this.navigation = new BNavigation(this.driver);
        this.table = new BCommentsTable(this.driver);
    }

    @Test
    public void test() {
        commentsPage.open();
        this.driver.findElements(By.name("SelectedId")).get(3).click();
        commentsActions.duplicate(); //implementation used to be:  this.driver.findElement(By.xpath("//*[@value=\"Duplicate...\"]")).click();
        WebElement numberField = this.driver.findElement(By.xpath("//*[@id=\"Number\"]"));
        numberField.clear();
        numberField.sendKeys("333");
        this.driver.findElement(By.xpath("//*[@value=\"Save & Return\"]")).click();
        navigation.navigateFourthPage();
        MatcherAssert.assertThat("Comment Text 333 is present", table.commentIsPresentWithID(333));
    }
}
