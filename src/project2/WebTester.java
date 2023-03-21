package project2;

public class WebTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new FirefoxDriver(),new SafariDriver(),new ChromeDriver()};
        for(WebDriver sites:webDrivers){
            sites.open();
            sites.close();
            sites.getTitle();

        }
    }
    }
