package Practice7;


class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound() {

        System.out.println("The pig says : weee wee");
        
    }
}


class dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says :Bark");
    }
}






 class Polymorphismss {


    public static void main(String args[]){

        Animal myAnimal=new Animal();
        Animal mypig=new Pig();
        Animal mydog=new dog();


        myAnimal.animalSound();
        mypig.animalSound();
        mydog.animalSound();
        
    }



    
}
