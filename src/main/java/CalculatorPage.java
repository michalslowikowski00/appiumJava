import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;

public class CalculatorPage {
    WebDriver driver;

    // digits
    @AndroidFindBy(id = "digit_2")
    WebElement digit_2;
    @AndroidFindBy(id = "digit_3")
    WebElement digit_3;
    @AndroidFindBy(id = "digit_7")
    WebElement digit_7;

    // operators
    @AndroidFindBy(id = "eq")
    WebElement equal;
    @AndroidFindBy(id = "op_add")
    WebElement add;
    @AndroidFindBy(id = "op_mul")
    WebElement op_mul;
    @AndroidFindBy(id = "result")
    WebElement result;

    // inputs
    @AndroidFindBy(id = "formula")
    WebElement formula;

    public CalculatorPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getFormulaText() { return formula.getText(); }

    public String getResultText() { return result.getText(); }

    public void enterFormulaText(String textFormula){
        formula.sendKeys(textFormula);
    }
}
