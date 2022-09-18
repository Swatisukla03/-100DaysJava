package Day14;

public class ReverseWord {
    
         
        public static void main(String[] args) {
            String st="The Sky is Blue.";
            String ns=" ";
    public static String rw(String st){
   
     int i=st.lastIndexOf(' ');
     while(i!=-1){
         ns=ns+st.substring(i+1);
         st=st.substring(0,i);
         i=st.lastIndexOf(' ');



     }

     return ns+st;
    }
}


    }