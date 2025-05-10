package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void verifyTitle() {
        page.navigate("https://google.com");
        String title = page.title();
        System.out.println("Page Title: " + title);
        Assert.assertEquals(title, "Example Domain");
    }
}
