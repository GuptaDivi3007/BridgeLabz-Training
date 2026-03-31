import java.util.*;

public class Browser {

    private Tab currentTab;
    private Stack<Tab> closedTabs;

    public Browser() {
        closedTabs = new Stack<>();
    }

    public void openTab(String url) {
        currentTab = new Tab();
        currentTab.visit(url);
    }

    public void visit(String url) {
        if (currentTab == null) {
            return;
        }
        currentTab.visit(url);
    }

    public void back() {
        if (currentTab != null) {
            currentTab.goBack();
        }
    }

    public void forward() {
        if (currentTab != null) {
            currentTab.goForward();
        }
    }

    public void closeTab() {
        if (currentTab == null) {
            return;
        }
        closedTabs.push(currentTab);
        currentTab = null;
    }

    public void restoreClosedTab() {
        if (closedTabs.isEmpty()) {
            return;
        }
        currentTab = closedTabs.pop();
    }

    public void printCurrentTab() {
        if (currentTab == null) {
            System.out.println("No active tab");
            return;
        }
        System.out.println("Current Page: " + currentTab.getCurrentPage());
    }
}
