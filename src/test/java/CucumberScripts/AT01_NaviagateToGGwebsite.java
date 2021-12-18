package CucumberScripts;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AT01_NaviagateToGGwebsite {

// Navigate to website
    @Test
    public static void Nav() throws IOException {
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("GoodGuysHomePage"));

    }

    @Test
    public static void AssertHomePage() throws IOException {
        //get title
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("title : " + ActualTitle);
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
//        //Assertion version-1
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

}