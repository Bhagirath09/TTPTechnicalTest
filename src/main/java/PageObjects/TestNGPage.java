package PageObjects;

import TTPTechnicalTest.Utils;
import org.openqa.selenium.By;

public class TestNGPage extends Utils {

    private By _frenchLanguage = By.linkText("Français");


    public void clickFrenchLangugaeLink(){

        click(_frenchLanguage);
    }
}
