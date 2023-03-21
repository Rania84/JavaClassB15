package project2;

public  interface  WebDriver {
    void open();
    void close();
    String getTitle();

}
  interface TakesScreenshot extends WebDriver{
    void getScreenshot();

}
interface RemoteWebDriver extends WebDriver{
    void navigate();
    }
    class FirefoxDriver implements RemoteWebDriver{

        @Override
        public void open() {
            System.out.println("open Firefox browser");
        }

        @Override
        public void close() {
            System.out.println("close Firefox browser");

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {
            System.out.println("navigate Firefox browser");

        }
    } class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open Safari browser");
    }

    @Override
    public void close() {
        System.out.println("close Safari browser");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("navigate Safari browser");

    }
} class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("close Chrome browser");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("navigate Chrome browser");

    }
}

