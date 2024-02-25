import java.util.Scanner;
import java.util.TreeSet;
public class TeamTicTacToe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        String s;
        for(int i = 0; i<3; i++){
            s = sc.nextLine();
            for(int j = 0; j<3; j++){
                board[i][j] = s.charAt(j);
            }
        }
        TreeSet<Character> cows = new TreeSet<Character>();
        TreeSet<Character> ans1 = new TreeSet<>();
        TreeSet<String> ans2 = new TreeSet<>();
        for(int i = 0; i<3;  i++){
            for(int j = 0; j<3; j++){
                cows.add(board[i][j]);
                
            }
            if(cows.size() == 1){
                ans1.add(cows.first());
            }
            if(cows.size() == 2){
                ans2.add(cows.first() + " " + cows.last());
            }
            cows.clear();

        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                cows.add(board[j][i]);
            }
            if(cows.size() == 1){
                ans1.add(cows.first());
            }
            if(cows.size() == 2){
                ans2.add(cows.first() + " " + cows.last());
            }
            cows.clear();
        }
        for(int i = 0; i<3; i++){
            cows.add(board[i][i]);
        }
        if(cows.size() == 1){
            ans1.add(cows.first());
        }
        if(cows.size() == 2){
            ans2.add(cows.first() + " " + cows.last());
        }
        cows.clear();
        cows.add(board[0][2]);
        cows.add(board[1][1]);
        cows.add(board[2][0]);
        if(cows.size() == 1){
            ans1.add(cows.first());
        }
        if(cows.size() == 2){
            ans2.add(cows.first() + " " + cows.last());
        }
        System.out.println(ans1.size());
        System.out.println(ans2.size());
        sc.close();
    }
}
