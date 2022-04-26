// Here we are going to swap two numbers
public class swapNo{
     public static void main(String[] args) {
         float First=1.20f;
         float Second=5.23f;
         System.out.println("--Before Swapping--");
         System.out.println("First Number ="+First);
         System.out.println("Second number ="+Second);

         //taking temp as third variable
        //   float temp=First;
        //   First=Second;
        //   Second=temp;
        //   System.out.println("--After swap--");
        //   System.out.println("First Number ="+First);
        //   System.out.println("Second Number ="+Second);

        //without using temp
        First=First-Second;
        Second=First+Second;
        First=Second-First;
        System.out.println("--After Swap--");
        System.out.println("First number ="+First);
        System.out.println("Second number ="+Second);

        
    } 
}