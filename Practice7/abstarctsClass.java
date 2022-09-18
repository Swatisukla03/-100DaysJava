package Practice7;

abstract class Animal {
    public abstract void animalSound();
     


    public void sleep(){
        System.out.println("Zzzzzz");
    }

    
}


class pig extends Animal{

    public void animalSound(){
        System.out.println("The pig says :wee weee");
    }

}


public class abstarctsClass{

    public static void main(String args[]){
        pig mypig=new pig();
        mypig.animalSound();
        mypig.sleep();
    }
}
