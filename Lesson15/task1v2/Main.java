package task1v2;

import java.util.ArrayList;
import java.util.List;

/*refactored version of the matrix calculation in multiple threads*/

public class Main {
        public static void main(String[] args) throws InterruptedException {

            double[][] A = {{4.00, 3.00, 5.00,7.8}, {2.00, 1.00, 6.00,7.9},{1.00,1.00,1.0, 4.5},{7.0, 9.0, 3.0,
                    9.5}};
            double[][] B = {{-0.5, 1.5, 5.9,9.8}, {1.0, -2.00, 6.00, 6.7},{1.0,1.0,1.0,5.6},{7.0, 5.0,
                    2.0,6.7}};

            Matrix m = new Matrix(A,B);
            List<Thread> threadList = new ArrayList<Thread>();

            for (int rowId = 0; rowId < m.getA().length; rowId++) {
                for (int columnId = 0; columnId < m.getB()[0].length; columnId++) {
                    NewThread nw = new NewThread(m, rowId, columnId);
                    Thread thread = new Thread(nw);
                    threadList.add(thread);
                    thread.start();
                }
            }

            for (Thread thread : threadList ) {
               while(thread.isAlive()){
                thread.join();}
            }

            m.show();
        }
    }
