package Practice7;

public class statickey {

    static void myStatic(){
        System.out.println("Static method can be called without object");
    }



    public void myPublicMethod(){
        System.out.println("Public methods must be called");
    }


    public static void main(String args[]){
        myStatic();
        statickey mykey=new statickey();
        mykey.myPublicMethod();
    }
    
}
