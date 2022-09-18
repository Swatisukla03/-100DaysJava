package day19;

import javax.sound.midi.Sequence;

public class subsequencestring {
    public static void main(String[] args) {
        sequence("abc","");

        
    }
    public static void sequenec(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);


        }
        else{
            sequence(ques.substring(1),ans+ques.charAt(0));
        }
    }
    
    
}
