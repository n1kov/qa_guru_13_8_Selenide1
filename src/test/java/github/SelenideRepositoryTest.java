package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryTest {

    @Test
    void shouldFindSelenideAsFirstRepository(){
        // region с чего начинаем?
        // открыть страницу github.com
        open("http://github.com/");
        // ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        // нажимаем на линк от первого результата поиска
        $$("ul.repo-list li").first().$("a").click();
        // check: в заголовке встречается selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

        // endregion

        sleep(5000);
        //ARRANGE
        //ACT
        //ASSERT

    }
}