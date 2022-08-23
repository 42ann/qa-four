package ank.umqra;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class Four {

    @BeforeAll//выполнять перед всем скоупом
    static void initDB() {
        System.out.println("### @BeforeAll");
    }//бефореAлл всегда статик. инитДБ неведомая хрень, погуглить

    @BeforeEach//выполнять перед каждым тестом
    void openGo(){
        System.out.println("### @BeforeEach");
        Selenide.open("https://google.org");
    }
    @AfterEach //выполнять после каждого кейса
    void closeGo(){
        System.out.println("### @AfterEach");
        WebDriverRunner.closeWindow();
    }
    @AfterAll
    static void cleanDB() {
        System.out.println("### @AfterAll");
    }//афтер алл всегда статик. клинДБ хрень полуведомая, вроде к начальному состоянию приводит. погуглить
    @Test
        void assertTest(){
       Assertions.assertTrue(1 > 0);//проверяет, верно ли выражение
    }

    @Test
        void assertTest2(){
        Assertions.assertTrue(1 < 5);
    }


}
