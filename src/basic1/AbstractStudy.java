package basic1;

abstract class Person{
    abstract void printInfo();
}

class Student extends Person{

    public void printInfo(){
        System.out.println("basic1.Student.printInfo");
    }
}

public class AbstractStudy {
    public static void main(String[] args) {

        Person p1 = new Student();
        p1.printInfo();
    }
}
