import java.util.Arrays;
import java.util.Scanner;
public class Apartment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int applicants = sc.nextInt();
        int apartments = sc.nextInt();
        int diff = sc.nextInt();
        int[] appSize = new int[applicants];
        int[] apartSize = new int[apartments];
        for(int i = 0; i<applicants; i++){
            appSize[i] = sc.nextInt();
        }
        Arrays.sort(appSize);
        for(int j = 0; j<apartments; j++){
            apartSize[j] = sc.nextInt();
        }
        Arrays.sort(apartSize);
        Arrays.sort(appSize);
        int i = 0;
		int j = 0;
		int ans = 0;
		while (i < applicants && j < apartments) {
            if (Math.abs(appSize[i]-apartSize[j]) <= diff){
                i++;
                j++;
                ans++;
            } else if(appSize[i]>apartSize[j]){
                j++;
            } else{
                i++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
