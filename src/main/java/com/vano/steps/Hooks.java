package com.vano.steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.*;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    private static String URL = "https://www.apple.com/ru";

    @Before
    public void openSite(){
        Configuration.browser = "chrome";
        open(URL);
    }

}
