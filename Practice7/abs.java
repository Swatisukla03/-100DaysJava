package Practice7;

abstract class abs {

    public String fname="Swati";
    public String lname="Sukla";
    public String email="suklaswati03@gmail.com";


    public abstract void study();


    
}

class Student extends abs{
    public int graduationYr=2024;
    public void study(){
        System.out.println("Studying all the day long.");
    }
}


class second{


    public static void main(String args[]){


        Student mypersonal=new Student();


        System.out.println("Name:"+mypersonal.fname+" "+mypersonal.lname);
        System.out.println("email :"+mypersonal.email);
        mypersonal.study();
    }

}
