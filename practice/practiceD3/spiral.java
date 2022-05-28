package practice.practiceD3;
import java.util.*;

public class spiral {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int [][]arr1=new int[r][c];

    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[0].length;j++){
            arr1[i][j]=sc.nextInt();
        }
    }

    int minr=0;
    int minc=0;
    int maxr=arr1.length;
    int maxc=arr1[0].length;
    int tne=r*c;
    int cnt=0;
     while(cnt<tne){
        //left wall
        for(int i=minr;i<maxr && cnt<tne;i++){
            System.out.print(arr1[i][minc]);
            cnt++;
        }
        minc++;
        //right wall
        for(int i=maxr;i>=minr && cnt<tne;i--){
            System.out.println(arr1[i][maxc]);
            cnt++;
        }
        maxc--;
        //bottom wall
        for(int j=minc;j<maxc &&cnt<tne;j++){
            System.out.println(arr1[maxr][j]);
            cnt++;
        }
        maxr--;
        //top wall
        for(int j=maxc;j>=minc && cnt<tne;j--){
            System.out.println(arr1[minr][j]);
            cnt++;
        }
        minr++;
    }


    
}
}
