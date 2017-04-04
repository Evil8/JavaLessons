package task1;


import java.util.ArrayList;
import java.util.List;


public class Matrix {
    private Double [][] a;
    private Double [][] b;
    private List<Double[]> c;

    public Matrix(Double[][] a, Double[][] b) {
        this.a = a;
        this.b = b;
        this.c = initC(a.length,b.length);
    }
    private List<Double[]> initC(int alength, int blength){
       List<Double[]> list = new ArrayList<Double[]>();
        for (int i=0;i < alength; i++ ){
            Double[] e = new Double[blength];
            list.add(e);
        }
        return list;
    }

    public Double[][] getA() {
        return a;
    }

    public Double[][] getB() {
        return b;
    }

    public List<Double[]> getC() {
        return c;
    }

    public Double[] getRow(int rowID){

        Double [] row = new Double[b.length];
        for (int j = 0; j < b[0].length; j++) {
            row[j] = 0.00000;
        }

        for (int j = 0; j < b[0].length; j++) { // bColumn
            for (int k = 0; k < a[0].length; k++) { // aColumn
                row[j] += a[rowID][k] * b[k][j];
            }
        }
        return row;
    }

    public void setC(List<Double[]> c) {
        this.c = c;
    }

    public void add(int rowId,Double[] row){
        c.set(rowId,row);
    }

    public void show(){

        System.out.println(c.toString());
        for(Double[] row: c){
            for (int j = 0; j < row.length; j++)
                System.out.print(row[j] + " ");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Matrix{");
        sb.append("c=").append(c);
        sb.append('}');
        return sb.toString();
    }
}
