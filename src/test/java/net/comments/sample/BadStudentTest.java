package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class BadStudentTest {

    @Test
    public void testName() {
        MatcherAssert.assertThat(new BadStudent("Vasya").name(), Matchers.is("Vasya"));
    }
}
