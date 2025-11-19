package ex_26_Collection_Framework.List;

public class Student {
    private String name;
    private String rollno;

    public Student(String name, String rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String toString()
    {
        return "Student{" + "name'" +name + '\'' + ", rollno='" + rollno + '\'' + '}';
    }

    public void printDetails()
    {
        System.out.println("Student name is " + this.name);
        System.out.println("Strudent roll no is " + this.rollno);
    }
}
