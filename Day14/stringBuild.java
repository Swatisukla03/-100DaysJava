package Day14;

public class stringBuild {
    public static void main(String[] args) {
        StringBuilder st= new StringBuilder("Hello");
        StringBuilder st1= new StringBuilder("Hello");
        StringBuilder st2= st;
        System.out.println(st==st2);
        st2.insert(2,"Swati");
        System.out.println(st2); //insert in between the string
        


        System.out.println(st==st1);
        System.out.println();
        System.out.println(st);
        st2.deleteCharAt(2);
        System.out.println(st2);
        st2.delete(2, 5);
        System.out.println(st2);
        StringBuilder ns=new StringBuilder();
        long start=System.currentTimeMillis();
        for(int i=0;i<=1000000;i++){
            ns.append("a");

        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);


    }
    
}
