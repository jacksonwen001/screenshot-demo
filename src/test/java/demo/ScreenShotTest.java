package demo;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ScreenShotTest {
    @Test
    public void test(){
        open("https://zxc0328.github.io/2017/08/03/headlesschrome/");
        sleep(3000);
        for(int i=0; i < 10; i++) {
            executeJavaScript("window.scrollTo(0,"+(i * 500)+")");
            sleep(1000);
            screenshot("headless" + i);

        }
    }
}
