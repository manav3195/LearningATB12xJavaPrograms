package ex_22_ENUM;

public enum APIURLS{
    katalon("https://www.katalon.com"),
    google("https://www.google.com");

    private String url;

    APIURLS(String url)
    {
        this.url=url;
    }

    String getUrl()
    {
        return this.url;
    }



}
