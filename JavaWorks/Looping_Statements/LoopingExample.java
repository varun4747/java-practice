package Looping_Statements;

public class LoopingExample {
    public void m1(){
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        for(int num:numbers){
           if (num>5){
            System.out.println(num+" "+"is greater than 5");
           }else{
            System.out.println(num+" "+"is less than 5");
           }
        }
    }
    public static void main(String[] args) {
        LoopingExample obj=new LoopingExample();
        obj.m1();
    }
}
