package Practice7;

public class SimpleInherit {
    protected String brand="Ford";
    public void hunk(){
        System.out.println("No honk Zone");
    }
     

}


    class student extends SimpleInherit{

    private String modelName="new Series";
    public static void main(String args[]){
        student s1=new student();
        System.out.println(s1.brand);
        s1.hunk();
        System.out.println(s1.modelName);     
    }
    
}
