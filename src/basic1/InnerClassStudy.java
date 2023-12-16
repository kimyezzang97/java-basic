package basic1;

/**
 * 내부 클래스 공부
 */

class Outer{
    public void print(){
        System.out.println("Outer.print");
    }

    class Inner{
        public void innerPrint(){
            Outer.this.print();
        }
    }

    static class InnerStaticClass {
        void innerPrint(){
            // Outer.this.print(); static 클래스에서는 메모리에 먼저 올라가기 때문에 메서드 호출 불가능
            System.out.println();
        }
    }
}

abstract class Persons{
    public abstract void printInfo();
}
class Students extends Persons{
    @Override
    public void printInfo() {
        System.out.println("Students.printInfo");
    }
}
public class InnerClassStudy {
    public static void main(String[] args) {
        // 외부 클래스
        Outer o1 = new Outer();

        // 내부 클래스 - 인스턴스
        Outer.Inner l1 = new Outer().new Inner();

        // 내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();

        // 익명 클래스
        Persons p1 = new Persons() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
    }
}
