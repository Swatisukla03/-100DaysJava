package practice.practiceD2;

public class waveprint {
    public static void main(String[]args){
        int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        wavePrint(arr);
    }
    public static void waveprint(int[][]arr){

        //1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13 17 18 19 20
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");

                }
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--)
            }

        }
    }
    
}
