package ru.artlebedev.test;

import org.testng.annotations.Test;

import static ru.artlebedev.pages.MainPage.openMainPage;

public class ChainTest {

    private static final String searchInput = "цветы";

    @Test
    public void chainTest() {
        openMainPage()
                .clickOnTools()
                .clickIdeaMatrix()
                .inputSearch(searchInput)
                .searchButton()
                .assertInput(searchInput);
    }
}
