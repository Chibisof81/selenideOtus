package ru.artlebedev.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ToolsPage {

    public MatrixPage clickIdeaMatrix() {
        $("#item-matrix").click();
        return page(MatrixPage.class);
    }
}
