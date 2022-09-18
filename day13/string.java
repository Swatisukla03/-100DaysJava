package day13;

public class string {

    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s1);
        System.out.println(s1==s2); 
        System.out.println(s2==s3);
        System.out.println(s1.concat((s2)));
        
        String  sT="";
        long start=System.currentTimeMillis(); //starting time
        
        for(int i=0;i<=10000;i++){
            sT=sT+"a";
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        
    }
    
}
