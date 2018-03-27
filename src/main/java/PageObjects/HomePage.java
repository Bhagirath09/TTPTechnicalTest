package PageObjects;

import TTPTechnicalTest.LoadProp;
import TTPTechnicalTest.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {

    protected LoadProp loadProp = new LoadProp();

    private By _searchInput = By.id("searchInput");
    private By _searchLanguage = By.id("searchLanguage");
    private By _searchButton = By.xpath("//button[@type=\"submit\"]");

    public String search = loadProp.getProperty("search");
    String languageValue = loadProp.getProperty("languageValue");

    public void enterSearchInput(){
        enterText(_searchInput, search);
    }

    public void selectLanguage(){
        selectByValue(_searchLanguage, languageValue);
    }

    public void clickSearchButton(){
        click(_searchButton);
    }



}
