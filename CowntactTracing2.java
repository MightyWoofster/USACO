import java.util.Scanner;
import java.util.ArrayList;
public class CowntactTracing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCows = sc.nextInt();
        sc.nextLine();
        String infections = sc.nextLine();
        int streak = 1;
        ArrayList<Integer> inf = new ArrayList<Integer>();
        for(int i = 0; i<numCows-1; i++){
            if(infections.charAt(i) == '1' && (infections.charAt(i) == infections.charAt(i+1))){
                streak++;
            } 
            else{
                if(infections.charAt(i) == 1){
                    inf.add(streak);
                }
                streak = 1;
            }
        }
        inf.add(streak);
    
        int length = inf.size();
        if(length == 1){
            System.out.println(1);
        }else{
            int min = 10000;
            int max = 0;
            for(int i = 0; i<length; i++){
                if (inf.get(i)< min){
                    min = inf.get(i);
                }
                if(inf.get(i)>max){
                    max = inf.get(i);
                }
            }
            if(min == 1){
                System.out.println(min+max);
            }else if (min == 2){
                System.out.println();
            }
                
                System.out.println();
            
            


        }
    }
}
