package ank.umqra;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class Four {

    @BeforeAll
    static void initDB() {
        System.out.println("### @BeforeEach");
        Selenide.open();
    }//бефоре алл всегда статик

    @BeforeEach //выполнять перед каждым тестом
    void openGo(){
        Selenide.open("https://google.org");
        }
    @AfterEach //выполнять после каждого кейса
    void closeGo(){
        WebDriverRunner.closeWindow();
    }

    @Test
    void assertTest(){
       Assertions.assertTrue(1 > 5);//проверяет, верно ли выражение
    }

    @Test
    void assertTest2(){
        Assertions.assertTrue(1 < 5);
    }


}
