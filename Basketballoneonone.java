import java.util.Scanner;

public class Basketballoneonone{
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        Scanner s = new Scanner(System.in);
        String record = s.nextLine();
        for(int x = 0; x < record.length(); x+=2){
            if(record.charAt(x) == 'A'){
                if(record.charAt(x+1) == '1'){
                    a++;
                }else{
                    a+=2;
                }
            }else{
                if(record.charAt(x+1) == '1'){
                    b++;
                }else{
                    b+=2;
                }
            }
        }
        if(a > b){
            System.out.print('A');
        } else{
            System.out.print('B');
        }
        s.close();
    }
}