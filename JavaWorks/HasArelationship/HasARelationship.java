package HasArelationship;

class Engine {
public void engineMethod(){
    System.out.println("Engine created");
}    
}


class Driver{
     Engine engine=new Engine();
    public void carDriver(){
       engine.engineMethod();
        System.out.println("car moving");
    }
}
public class HasARelationship{
    public static void main(String[] args) {
        Driver d=new Driver();
        d.carDriver();
    }
}