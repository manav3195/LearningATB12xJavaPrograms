package ex_19_OOPs_Part2.inheritance.singleinheritance.realExample;

public class TestCase2 extends CommonTOAllTest {

    void running_tc2()
    {
        startBrowser();
        readExcelFile();
        readDatabaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}
