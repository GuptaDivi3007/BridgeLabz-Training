import java.util.*;

public class Main {

    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.openTab("google.com");
        browser.visit("gmail.com");
        browser.visit("youtube.com");

        browser.back();
        browser.back();
        browser.forward();

        browser.closeTab();

        browser.restoreClosedTab();
        browser.printCurrentTab();
    }
}
