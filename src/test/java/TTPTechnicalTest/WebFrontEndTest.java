package TTPTechnicalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.charset.Charset;
import java.util.List;

public class WebFrontEndTest extends BaseTest {

    private By _firstHeading = By.id("firstHeading");

    @Test
    public void wikipediaWebFrontEndTest() {

        //2. Search for a given string in English:

        //(a) Type in a string (i.e. TestNG) given as parameter in the search input field.
        homePage.enterSearchInput();

        //(b) Select English as the search language.
        homePage.selectLanguage();

        //(c) Click the search button.
        homePage.clickSearchButton();

        //3. Validate that the first heading of the search results page matches the search string i.e. TestNG (ignoring case).
        String actual = getText(_firstHeading);
        Assert.assertTrue(actual.equalsIgnoreCase(homePage.search));

        //4. Verify that the search results page has link in another language i.e. French defined as a parameter.
        Assert.assertTrue(linkIsPresentOnPage(loadProp.getProperty("languageFrench")), "No French language link found");

        //5. Navigate to the search results page in the other language.
        testNGPage.clickFrenchLangugaeLink();

        //6. Validate that the search results page in the other language includes a link to the version in English.
        Assert.assertTrue(linkIsPresentOnPage(loadProp.getProperty("languageEnglish")), "No English language link found");

    }
}