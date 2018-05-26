package ru.artlebedev;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void test() {
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();
        open("https://www.artlebedev.ru");
        $("[href=\"\\/tools\\/\"]").click();
        $("#item-matrix").click();
        $("[name=\"Word\"]").setValue("блок");
        $("button").click();
        $$(".text-double-margin").shouldHave(CollectionCondition.texts("блок"));

    }
}
