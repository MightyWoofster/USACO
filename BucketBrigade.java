import java.util.Scanner;
public class BucketBrigade{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int li=0;
        int lj=0;
        int bi=0;
        int bj=0;
        int ri=0;
        int rj=0;
        for(int i = 0; i<10; i++){
            String row = sc.next();
            for(int j = 0; j<10; j++){
                if (row.charAt(j) == 'B'){
                    bi = i;
                    bj = j;
                } 
                else if(row.charAt(j) == 'R'){
                    ri = i;
                    rj = j;
                } else if (row.charAt(j) == 'L'){
                    li = i;
                    lj = j;
                }
            }
        }

        int cows = Math.abs(bi-li) + Math.abs(bj-lj)-1;
        if(bi==li && bi==ri && ((bj<rj && rj<lj) || (lj<rj&&rj<bj))){
            cows +=2;
        }else if(bj==lj && bj==rj && ((bi<ri && ri<li) || (li<ri&&ri<bi))){
            cows+=2;
        }
        System.out.println(cows);
        sc.close();
    } 

}