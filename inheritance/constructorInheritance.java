
class parent{
    public parent() {
        System.out.println("i am parent class");
    }
}
class child extends parent{
    public child() {
        System.out.println("i am child class");
    }
}
/**
 * constructorInheritance
 */
public class constructorInheritance {
    public static void main(String[] args) {
        child ch=new child();

    }
    
}