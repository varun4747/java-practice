public class MethodsPractice {
    String firstName;
    int age;

    public void m1(){
        System.out.println("calling m1");
    }
    public void m2(int a,int b){
        System.out.println("calling m2");
        System.out.println(a);
        System.out.println(b);
        
    }
    public MethodsPractice(){
        firstName="gandhi";
        age=200;
        System.out.println("Constructor calling");
        System.out.println(firstName);
        System.out.println(age);

    }
    public static void m3(){
        System.out.println("Static method calling");
    }
    public static void main(String[] args) {
        MethodsPractice obj=new MethodsPractice();
        obj.m1();
        obj.m2(10,20);
        m3();
       
        
    }
}
