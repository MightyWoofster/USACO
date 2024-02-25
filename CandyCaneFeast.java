import java.util.Arrays;
import java.util.Scanner;

public class CandyCaneFeast {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cowHeights = new int[n];
        int[] caneHeights = new int[m];
        for(int i=0; i<n; i++){
            cowHeights[i] = sc.nextInt();
        }
        for(int j = 0; j<m; j++){
            caneHeights[j] = sc.nextInt();
        }
        for(int a = 0; a<m; a++){
            int low = 0;
            for(int b = 0; b<n; b++){
                
                if(cowHeights[b]>low){
                    if(cowHeights[b]>caneHeights[a]){
                        cowHeights[b]+=caneHeights[a]-low;
                        break;
                    }
                    int temp = low;
                    low = cowHeights[b];
                    cowHeights[b] = cowHeights[b] + cowHeights[b]-temp;
                    
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(cowHeights[i]);
        }
        

    }
}
