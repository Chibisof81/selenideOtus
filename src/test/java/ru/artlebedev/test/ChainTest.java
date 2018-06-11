package ru.artlebedev.test;

import org.testng.annotations.Test;
import ru.artlebedev.BaseTest;

import static ru.artlebedev.pages.MainPage.openMainPage;


public class ChainTest extends BaseTest {

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
