package Szymon_zadanie10.test;

import org.fluttercode.datafactory.impl.DataFactory;
import org.testng.annotations.Test;

public class temp {
    @Test
    public void temp() {
        DataFactory df = new DataFactory();
        for (int i = 0; i < 2; i++) {
            String name = df.getEmailAddress() + "2 " + df.getAddressLine2()+"3 " + df.getAddressLine2(5)+"4 " + df.getAddressLine2(10, "stringDefaultValue");
            System.out.println(name);
        }
    }
}