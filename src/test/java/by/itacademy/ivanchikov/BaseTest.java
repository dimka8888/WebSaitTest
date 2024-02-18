package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.driver.MyDriver;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {


    @AfterEach
    public void baseFinish()throws InterruptedException{
        Thread.sleep(1000);
        MyDriver.getDriver();
    }
}
