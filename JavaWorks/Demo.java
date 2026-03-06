public class Demo {
    int x=40;
    String s="String";
    static String sclName="orchids";
    public void loacalVariables(){
        int a =20;
        int b=30;
        String firstName="Ravi";
        String SecondName="teja";
        System.out.println(a);
        System.out.println(firstName);
        System.out.println(sclName);
    }
    public static void main(String[] args) {
        Demo obj=new Demo();
        System.out.println(sclName);
        obj.loacalVariables();
        System.out.println(obj.x);
        System.out.println(obj.s);
        System.out.println(sclName);


    }
}
