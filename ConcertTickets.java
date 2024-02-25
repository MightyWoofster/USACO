import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ConcertTickets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTickets = sc.nextInt();
        int numCustomers = sc. nextInt();
        ArrayList<Integer> price = new ArrayList<Integer>();
        int[] maxPrice = new int[numCustomers];
        for(int i = 0; i<numTickets; i++){
            price.add(sc.nextInt());
        }
        for(int i = 0; i<numCustomers; i++){
            maxPrice[i] = sc.nextInt();
        }
        Collections.sort(price);
        
        for(int i = 0; i<numCustomers; i++){
            Iterator<Integer> it = price.iterator();
            Integer x = -1;
            while(it.hasNext()) {
                if(it.next()>maxPrice[i]){
                    System.out.println(x);
                    it.remove();
                    continue;
                }
                x = it.next();
            }
        }
        
    }
}