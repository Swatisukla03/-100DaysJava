package Practice7;
 class person{
    private String name;


    public String getname(){
        return name;
    }




    public void setName(String newName){
        this.name=newName;
    }
}
public class getterSetter {

    public static void main(String args[]){
        person myobj=new person();
        myobj.setName("Swati");
        System.out.println(myobj.getname());

    }


    
}
