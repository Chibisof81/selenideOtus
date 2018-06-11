package ru.artlebedev.test;

import com.codeborne.selenide.CollectionCondition;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.artlebedev.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest extends BaseTest{

    @Test
    public void test() {
        open("https://www.artlebedev.ru");
        $("[href=\"\\/tools\\/\"]").click();
        $("#item-matrix").click();
        $("[name=\"Word\"]").setValue("блок");
        $("button").click();
        $$(".text-double-margin").shouldHave(CollectionCondition.texts("блок"));
        Assert.assertTrue(false);
    }
}
