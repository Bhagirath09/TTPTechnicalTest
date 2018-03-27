package TTPTechnicalTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Utils extends BasePage {

    public static void click(By by) {
        driver.findElement(by).click();
    }

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Select by Index
    public static void selectByIndex(By by, int index) {
        Select s = new Select (driver.findElement(by));
        s.selectByIndex(index);
    }

    //Select by Value
    public static void selectByValue(By by, String value) {
        Select s = new Select (driver.findElement(by));
        s.selectByValue(value);
    }

    //Select by VisibleText
    public static Select selectByVisibleText(By by, String text) {
        Select s = new Select (driver.findElement(by));
        s.selectByVisibleText(text);
        return s;
    }

    //Get text method
    public static String getText(By by){
        String text = driver.findElement(by).getText();
        return text;
    }

    //provide linkText in String and make sure link is present on Page
    public boolean linkIsPresentOnPage(String linkText){

        String actualText = "";

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement e : links) {

            if(e.getText().equalsIgnoreCase(linkText)){
                actualText = e.getText();
            }
        }
        return  (actualText.contains(linkText));
    }


    public static String captureScreen(ITestResult result) throws IOException {

        String fileName = result.getName()+".png";
        String imagePath = "target/ScreenShots/"+fileName;

        File imgFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(imgFile, new File(imagePath));

        System.out.println("Screenshot taken");

        return "target/ScreenShots/"+fileName;
    }

}
