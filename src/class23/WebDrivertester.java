package class23;

public class WebDrivertester {
    public static void main(String[] args) {
        Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();
        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();
    }
    }

