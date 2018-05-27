package ru.artlebedev.pages;

import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MatrixPage {

    public MatrixPage inputSearch(String search) {
        $("[name=\"Word\"]").setValue(search);
        return this;
    }

    public MatrixPage searchButton() {
        $("button").click();
        return this;
    }

    public MatrixPage assertInput(String assertSearch) {
        $$(".text-double-margin").shouldHave(CollectionCondition.texts(assertSearch));
        return this;
    }


}
