package Steps;

import Pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseStep {

    BasePage base = new BasePage();

    @BeforeTest
    public void setupDriver()
    {
        base.initDriver();
    }
    @Test
    public void seleniumTest()
    {
        System.out.println("Driver opened successfully");
        Assert.assertEquals(base.urlTitle(),"Google","Title is not verified as true");
    }

    @AfterTest
    public void teardownDriver()
    {
        base.cleanDriver();
    }
}
