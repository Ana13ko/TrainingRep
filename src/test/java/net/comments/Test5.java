package net.comments;

import net.comments.objects.BCommentsActions;
import net.comments.objects.BCommentsPage;
import net.comments.objects.CommentsActions;
import net.comments.objects.CommentsPage;
import net.comments.selenium.BDriver;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test5 extends BDriver {
    private final CommentsPage commentsPage;
    private final CommentsActions commentsActions;

    public Test5() {
        super();
        this.commentsPage = new BCommentsPage(this.driver);
        this.commentsActions = new BCommentsActions(this.driver);
    }

    @Test(dataProvider = "createData1")
    public void test(String s) {
        commentsPage.open();
        commentsActions.create();
        this.driver.findElement(By.xpath("/*[@id=\"Text\"]")).sendKeys(s);
    }

    @DataProvider
    public Object[][] createData1() {
        return new Object[][]{
                {"!@#$%^&*()"},
                {" "},
                {"№:?-+="},
        };
    }
}
