package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SelenideSoftAssertionsTest {




    @Test
    void softAssertionsJUnit5Check() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".wiki-rightbar").$$("li").last().$("button").click();
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $("#wiki-body").$$("h4").shouldHave(itemWithText("3. Using JUnit5 extend test class:"));
    }
}
