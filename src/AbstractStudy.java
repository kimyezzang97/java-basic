

abstract class Person{
    abstract void printInfo();
}

class Student extends Person{

    public void printInfo(){
        System.out.println("Student.printInfo");
    }
}

public class AbstractStudy {
    public static void main(String[] args) {

        Person p1 = new Student();
        p1.printInfo();
    }
}
