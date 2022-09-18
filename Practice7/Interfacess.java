package Practice7;

interface Animal{
    public void animalSound();
    public void sleep();
}


class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says :zzzz zzzz");
    }



    public void sleep(){
        System.out.println("Zzzzzzz");
    }
}

public class Interfacess {


    public static void main(String args[]){
        Pig mypig=new Pig();
        mypig.animalSound();
        mypig.sleep();
    }
    
}
