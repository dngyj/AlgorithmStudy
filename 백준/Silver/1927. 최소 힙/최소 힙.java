import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int N = sc.nextInt();

        for(int i = 0; i<N; i++){

            int num = sc.nextInt();

            if(num == 0){
                if(!pq.isEmpty()) sb.append(pq.poll()).append("\n");
                else sb.append(0).append("\n");
            }
            else{
                pq.add(num);
            }
        }
        System.out.println(sb);
    }

}