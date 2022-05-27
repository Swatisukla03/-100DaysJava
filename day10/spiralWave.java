package day10;
import java.util.*;

public class spiralWave {
    public static void main(String[]args){
    // int[][] arr= new int[3][4];
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        display(arr);
		// Scanner sc = new Scanner(System.in);
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		arr[0][0] = 100;
//		System.out.println(arr[0][0]);
//		for(int i = 0; i < arr.length;i++)
//		{
//			for(int j = 0; j < arr[0].length;j++)
//			{
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
		// int[][] crr = new int[3][];
		// System.out.println(crr[0]);
		// crr[0] = new int[3];
		// crr[1] = new int[2];
		// crr[2] = new int[4];
		
		// display(crr);
		
		

	}
	public static void display(int[][] arr)
	{
		for(int i = 0; i < arr.length;i++)
		{
			if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }


            }
            else{
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }


            }
			System.out.println();
		}
		// System.out.println("------------------------");
		
		// for(int[] i :arr)
		// {
		// 	for(int j:i)
		// 	{
		// 		System.out.print(j+" ");
		// 	}
		// 	System.out.println();
		// }
	}

}
    

