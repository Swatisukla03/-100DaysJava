package Practice7;

public class cons {
    String modelName;
    int ModelYear;

    cons(String name,int yr){
        modelName=name;
        ModelYear=yr;
    }


    public static void main(String args[]){
        cons myCar=new cons("AUDI-X7",2017);
        System.out.println(myCar.ModelYear+" "+myCar.modelName);
    }
    
}
