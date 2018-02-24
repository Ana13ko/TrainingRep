package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void testName() {
        MatcherAssert.assertThat(new Person("Vasya").name(), Matchers.is("Vasya"));
    }
}
