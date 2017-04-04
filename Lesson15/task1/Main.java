package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
        public static void main(String[] args) throws InterruptedException {

            Double[][] A = {{4.00, 3.00, 5.00,7.8}, {2.00, 1.00, 6.00,7.9},{1.00,1.00,1.00, 4.5},{7.00, 9.00, 3.00,
                    9.5}};
            Double[][] B = {{-0.500, 1.500, 5.9,9.8}, {1.000, -2.0000, 6.00, 6.7},{1.00,1.00,1.00,5.6},{7.00, 5.00,
                    2.00,6.7}};

            Matrix m = new Matrix(A,B);
            List<Thread> threadList = new ArrayList<Thread>();

            for(int rowId = 0; rowId < m.getA().length; rowId++) {
              NewThread nw = new NewThread(m,rowId);
              Thread thread = new Thread(nw);
              threadList.add(thread);
              thread.start();
            }


            for (Thread thread : threadList ) {
               while(thread.isAlive()){
                thread.join();}
            }

            m.show();
        }
}