package Day3;

public class func_demo {
    public static int glo=1000;
    public static void main(String[] args) {
        System.out.println("Hi");
        int a=10;
        int b=20;
       int c= add(a,b);
       System.out.println(c);
        
    }
    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    // public static void global(){
    //     int glo=10;
    //     System.out.println();
    // }
    
}
