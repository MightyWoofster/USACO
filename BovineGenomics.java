import java.util.Scanner;
public class BovineGenomics {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] spotted = new char[n][m];
        char[][] plain = new char[n][m];
        String input;
        int counter = 0;
        for(int i=0; i<n; i++){
            input = sc.nextLine();
            for(int j = 0; j<m; j++){
                spotted[i][j] = input.charAt(j);
            }
        }
        for(int i=0; i<n; i++){
            input = sc.nextLine();
            for(int j = 0; j<m; j++){
                plain[i][j] = input.charAt(j);
            }
        }
        for(int x = 0; x<m; x++){
            boolean duplicate = false;

            for(int y = 0; y<n; y++){
                for(int z = 0; z<n; z++){
                    if(spotted[y][x] == plain[z][x]){
                        duplicate = true;
                    }
                }
                
            }
            if(duplicate == false){
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
