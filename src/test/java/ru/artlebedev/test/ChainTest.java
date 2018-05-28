package ru.artlebedev.test;

import org.testng.annotations.Test;

import static ru.artlebedev.pages.MainPage.openMainPage;

public class ChainTest {
    @Test
    public void chainTest() {
        openMainPage()
                .clickOnTools()
                .clickIdeaMatrix()
                .inputSearch("цветы")
                .searchButton()
                .assertInput("цветы");
    }
}
