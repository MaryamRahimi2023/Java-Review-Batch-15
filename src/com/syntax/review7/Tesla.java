package com.syntax.review7;

public class Tesla extends Car{ // you as subclass need to have the fetuares of that main class car

    String type;
    boolean autoPilot;
    public Tesla(String make, String model,int year,int horsePower,String type, boolean autoPilot){
        // constructor can not be used in inheritance because it always needs to start by
        // its own class name but complain if we do not put the same parameters that we have in superclass constructor
        super(make,model,year,horsePower);// we these from superclass
        this.type=type;
        this.autoPilot=autoPilot;
         }

         public void haveAutopilot(){
             System.out.println(make+" have auto pilot "+autoPilot);
         }

         public void start(){

         }
         // overriding-is when we have same method name in 2 different class (Parent-Child)
        // In Overriding - INHERITANCE IS A MUST
        //In Overriding method signature should be SAME

}

class teslaTester{
    public static void main(String[] args) {

         Tesla tesla=new Tesla("Tesla","S",2022,340,"electric",true);
         tesla.start();
         tesla.drive(100);
         tesla.haveAutopilot();
        tesla.drive("Miami");//overloaded method from car class


    }
}
