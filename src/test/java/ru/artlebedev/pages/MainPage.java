package ru.artlebedev.pages;


import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage <MainPage> {

    public static MainPage openMainPage() {
        open("https://www.artlebedev.ru");
        return page(MainPage.class);
    }

    public ToolsPage clickOnTools() {
        $("[href=\"\\/tools\\/\"]").click();
        return page(ToolsPage.class);
    }
}
