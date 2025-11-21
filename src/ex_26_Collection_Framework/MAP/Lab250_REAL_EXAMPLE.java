package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab250_REAL_EXAMPLE {
    public static void main(String args[])
    {
        Map<String,String> envConfig = new HashMap<>();
        envConfig.put("production","Https://production.api.com");
        envConfig.put("staging","https://staging.api.com");

        Map<String,String> credentials = new HashMap<>();
        credentials.put("admin","admin123");
        credentials.put("user","user123");
    }
}
