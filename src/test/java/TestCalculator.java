import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator extends TestBase {

    @Test
    public void sumTwoNumbers() {
        calculatorPage.digit_2.click();
        calculatorPage.add.click();
        calculatorPage.digit_3.click();
        calculatorPage.result.click();
        String actualResult = calculatorPage.getResultText();
        assertEquals("actual result should be 5", "5", actualResult);
    }

    @Test
    public void shouldPromptResultBelowAction() {
        calculatorPage.digit_2.click();
        calculatorPage.op_mul.click();
        calculatorPage.digit_3.click();
        String formulaText = calculatorPage.getFormulaText();
        String resultText = calculatorPage.getResultText();
        assertEquals("formula text should be 2×3", "2×3", formulaText);
        assertEquals("actual result should be 6", "6", resultText);
    }

    @Test
    public void promptResultBelowAction(){
        calculatorPage.enterFormulaText("2+3");
        String formulaText = calculatorPage.getFormulaText();
        assertEquals("formula text should be 2+3", "2+3", formulaText);
    }
}
