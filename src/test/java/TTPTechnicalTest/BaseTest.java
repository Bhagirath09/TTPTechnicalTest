package TTPTechnicalTest;

import PageObjects.HomePage;
import PageObjects.TestNGPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    protected BrowserSelector browserSelector = new BrowserSelector();
    protected LoadProp loadProp = new LoadProp();
    protected HomePage homePage = new HomePage();
    protected TestNGPage testNGPage = new TestNGPage();


    @BeforeMethod
    public void openBrowser( ) {

       String browser = loadProp.getProperty("browser");

        //open browser
        browserSelector.openBrowser(browser);

        //navigate to homepage (URL)
        driver.get(loadProp.getProperty("testURL"));

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @AfterMethod
    public static void tearDown(ITestResult result)
    {
         // Here will compare if test is failing then only it will enter into if condition
        if(ITestResult.FAILURE==result.getStatus())
        {
          try
            {
                captureScreen(result);
            }
            catch (Exception e)
            {
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }
        // close application
        driver.quit();
    }
}
