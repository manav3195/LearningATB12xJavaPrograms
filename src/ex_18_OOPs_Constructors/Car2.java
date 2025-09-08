package ex_18_OOPs_Constructors;

public class Car2 {

    String name;
    int year;

    Car2()
    {
        name="Unknown Car2";
        year =1990;
        System.out.println("DC");
    }

    Car2(String model_name, int year_created)
    {
        this("3000");
        this.name= model_name;
        this.year = year_created;
    }

    Car2(String model_name)
    {
        this.name=model_name;
    }
}
