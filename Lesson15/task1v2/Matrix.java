package task1v2;


import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private double [][] a;
    private double [][] b;
    private double[][] c;

    public Matrix(double[][] a, double[][] b) {
        this.a = a;
        this.b = b;
        this.c = new double[a.length][b.length];
    }

    public double[][] getA() {
        return a;
    }

    public double[][] getB() {
        return b;
    }

    public double getCell(int rowId, int columnId){

        double row = 0;

        for (int k = 0; k < a[0].length; k++) { // aColumn
            row += a[rowId][k] * b[k][columnId];
        }

        return row;
    }

    public void addCell(int rowId, int columnId){
        c[rowId][columnId] = getCell(rowId, columnId);
    }

    public void show(){

        for(double[] row: c){
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
