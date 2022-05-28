package practice.practiceD3;

public class equalArray {
    public static void main(String[]args){
        int a[]={10,20,30};
        int b[]={10,20,90,18};
        boolean result=true;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    result=false;
                }
            }
        }
        else{
            result=false;
        }
        if(result==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
    
}
