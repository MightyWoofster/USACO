import java.util.Scanner;
public class CowGymnastics{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] ranking = new int[k][n];
        int[][] better = new int[n][n];
        int ans = 0;
        for(int i = 0; i<k; i++){
            for(int j = 0; j<n; j++){
                ranking[i][j] = sc.nextInt()-1;
            }
        }

        for(int z = 0; z<k; z++){
            for(int x = 0; x<n; x++){
                for(int y = x+1; y<n; y++){
                    better[ranking[z][x]][ranking[z][y]]++;
                
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(better[i][j] == k){
                    ans++;

                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}