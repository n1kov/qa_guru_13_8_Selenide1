package github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {

    @Test
    void solntsevShouldBeFirstContributer(){

        // open repository page
        open("http://github.com/selenide/selenide");

        // bring mouse over the first avatar on contributors tab
        $(".Layout-sidebar").$$("h2").filterBy(text("Contributors"))
                .first()
                .sibling(0).$$("li").first().hover();

        // check: popup is showing Andrei Solntsev
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
        //$(".Popover-message").shouldHave( text("Andrey Solntcev") );
    }



}
