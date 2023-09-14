package inheritance;


public class Parent {
    public void m1(){
        System.out.println("Parent");
    }

}
class Child extends Parent {
    public void m2() {
        System.out.println("Child");
    }
}
class Test{
    public static void main(String[] args) {
       Child c = new Child();
        c.m1();
        c.m2();

    }
}
