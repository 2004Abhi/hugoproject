class parent{
    int length;
    int breadth;
    public parent(int a){
       this.length = a;
    }
}
class child extends parent{
    public child(int a,int b){
        super(a);
        this.breadth = b;
    }
}
public class parameterisedconstructor {
    public static void main(String[] args){
        child ch=new child(5,6);
        System.out.println(ch.breadth+" "+ch.length);
    }
    
}
