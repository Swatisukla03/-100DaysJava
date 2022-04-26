public class FrequencyChar {
    
    public static void main(String[] args) {
        String str="This website  published by Swati Sukla established sice 1998";
        char ch='e';
        int frequency=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("Frequency of "+ch +"="+frequency);
    }
    
}
