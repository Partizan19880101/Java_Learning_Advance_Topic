package selenide;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;



public class TestSelenide {

    @Test
    public void test() {
        open("https://www.onliner.by/");
        WebElement logo = $(".onliner_logo");
        $(".onliner_logo").shouldBe(Condition.visible);
        Assertions.assertTrue(logo.isDisplayed());

    }
}
