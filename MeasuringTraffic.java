import java.util.Scanner;
public class MeasuringTraffic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sensors = sc.nextInt();

        String[] ramps = new String[sensors];
        int[] lower = new int[sensors];
        int[] higher = new int[sensors];
        for(int i = 0; i<sensors; i++){
            ramps[i] = sc.next();
            lower[i] = sc.nextInt();
            higher[i] = sc.nextInt();
        }
        int a = -9999, b = 9999;
        for(int x = sensors-1; x>=0; x--){
            if(ramps[x].equals("none")){
                a = Math.max(a, lower[x]);
                b = Math.min(b, higher[x]);
            } else if(ramps[x].equals("on")){
                a = a-higher[x];
                b = b-lower[x];
                a = Math.max(0, a);
            } else{
                a = a+lower[x];
                b = b+higher[x];
            }
        }
        System.out.println(a + " " + b);
        a = -9999; b = 9999;
        for(int y = 0; y<sensors; y++){
            if(ramps[y].equals("none")){
                a = Math.max(a, lower[y]);
                b = Math.min(b, higher[y]);
            } else if(ramps[y].equals("on")){
                a = a+lower[y];
                b = b+higher[y];
            } else{
                a = a-higher[y];
                b = b-lower[y];
                a = Math.max(0, a);
            }
        }
        System.out.println(a + " " + b);
        sc.close();
    }

}

