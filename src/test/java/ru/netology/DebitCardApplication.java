package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DebitCardApplication {

    @Test
    @DisplayName("Should submit request")
    void shouldSubmitRequest() {
        open("http://localhost:9999");
        SelenideElement form = $("[form form]");

        $("[data-test-id=name] input").setValue("Петр Петров");
        $("[data-test-id=phone] input").setValue("+74785125462");
        $("[data-test-id=agreement]").click();
        $(By.tagName("button")).click();
        $("[data-test-id=order-success]").should(exist);
    }



}

