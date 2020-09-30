package com.vano.steps;

import io.cucumber.java.ru.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MacPage {


    @Когда("пользователь нажимает на кнопку {string}")
    public void пользователь_нажимает_на_кнопку(String string) {
        $x("//span[text()='"+string+"']/..").click();
    }


    @Тогда("появляется страница с на которой есть иконка с текстом {string}")
    public void появляетсяСтраницаСНаКоторойЕстьИконкаСТекстом(String string) {
        $x("//li[@class='chapternav-item chapternav-item-macbook-air']//span").shouldHave(text(string));
    }
}
