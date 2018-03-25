package net.comments;

import net.comments.objects.BCommentsPage;
import net.comments.objects.CommentsPage;
import net.comments.selenium.BDriver;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test3 extends BDriver {
    private final CommentsPage commentPage;

    public Test3() {
        super();
        this.commentPage = new BCommentsPage(this.driver);
    }

    @Test
    public void test() {
        commentPage.open();
        this.driver.findElements(By.name("SelectedId")).get(0).click();
        this.driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        this.driver.findElement(By.xpath("//span[text()=\"Yes\"]")).click();
        final String page = this.driver.getPageSource();
        MatcherAssert.assertThat("Comment Text 0 is present", !page.contains("Comment Text 0"));
    }
}
