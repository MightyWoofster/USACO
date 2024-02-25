import java.util.Scanner;
public class Lifeguards {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int[] time = new int[1000];
        for(int i = 0; i<n; i++){
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
            for(int j = start[i]; j<end[i]; j++){
                time[j]++;
            }
        }
        int ans = -1;
        
        for(int i = 0; i<n; i++){
            for(int x = start[i]; x<end[i]; x++){
                time[x]--;
            }
            int covered = 0;
            for(int y = 0; y<1000; y++){
                    if(time[y]>0){
                        covered++;
                    }
            }
            ans = Math.max(ans, covered);
            for(int z = start[i]; z<end[i]; z++){
                time[z]++;
            }

        }
    System.out.println(ans);
    sc.close();


    }
}
