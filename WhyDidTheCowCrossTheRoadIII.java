import java.util.TreeMap;
import java.util.Scanner;
public class WhyDidTheCowCrossTheRoadIII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> line = new TreeMap<>();
        int time = 0;
        int x;
        int y;
        for(int i = 0; i<n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            while(line.containsKey(x)){
                x++;
            }
            line.put(x, y);
        }
        for(int i = 0; i<n; i++){
            time = Math.max(line.firstKey(), time);
            time = time + line.get(line.firstKey());
            line.remove(line.firstKey());
        }
        System.out.println(time);
        sc.close();


    }
}
