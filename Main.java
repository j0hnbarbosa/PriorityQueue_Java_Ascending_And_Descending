import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    static class NumCom implements Comparator<Integer> {

        @Override
        public int compare(Integer t, Integer t1) {
            //Modo Descendente
            return t1 - t;

            //Modo Acendente
            //return t1 + t;
        }

    }

    public static void main(String[] args) {

        PriorityQueue<Integer> ld = new PriorityQueue<>(new NumCom());
        
        ld.add(59);
        ld.add(60);
        ld.add(23);
        ld.add(99);
        ld.add(85);
        ld.add(35);
        
        while (!ld.isEmpty()) {
            System.out.printf("%d\n", ld.poll());

        }

    }

}
