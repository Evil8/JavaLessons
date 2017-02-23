package by.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Three();
        //Four();
        //Five();
        Six();

    }

    public static void One()
    {
        int k = 2; //кратность
        int n = 10; //dimension
        int s = 0; //sum

        int[] mas = new int[]{1,2,3,4,5,6};
        for(int i= 1;i<mas.length;i++ )
        {
            if(mas[i] % k == 0){
                s = mas[i]+s;
            }
        }

        System.out.print(s);
    }
    public static void Two(){
        int c = 0;

        int[] mas =  new int[]{1,0,2,3,0,4,0,0,6}; // initial

        for(int i= 1;i<mas.length;i++ )
        {
            if(mas[i] == 0){
                c= c + 1;
            }
        }

        int[] res = new int[c];

        int j = 0;
        for(int i= 0;i<mas.length;i++ )
        {
            if(mas[i] == 0){

                res[j] = i;
                j++;
            }
        }

        for(j= 0;j<res.length;j++)
        {
            System.out.print(res[j]);
        }
    }

    public static void Three()
    {
        double[] mas = new double[]{1.1,2.0,1.4,4.6};
        //double[] mas = new double[]{1.1,1.4,4.6};


        int i = 0; //mas index
        int j = 1; //mas index

        while(j < mas.length)
        {
            if (mas[i]>mas[j])
            {
                break;
            }
            i++;
            j++;
        }
        if (j<mas.length)
        {
            System.out.print("не возрастающая");
        }
        else
        {
            System.out.print("возрастающая");
        }
    }
    public static void Four(){
        //int[] mas = new int[]{1,6,3,4,5,8};
        int[] mas = new int[]{1,3,5,7,9};
        int n = 0; //dimension

        for(int i : mas){
            if(i%2 == 0)
            {
                n++;
            }
        }

        if(n != 0) {
            int[] res = new int[n];
            int j = 0;
            for (int i : mas) {
                if (i % 2 == 0) {
                    res[j] = i;
                    System.out.print(i+", ");
                }
            }
        }
        else {
            System.out.print("no elements");
        }

    }
    public static void Five(){
        int n = 6;//dimension
        int[][] matr = new int[n][n];

        for(int i = 0; i< n; i++){
            for (int j = 0; j < n; j++){
                if(i%2 == 0) {
                    matr[i][j] = j + 1;
                }
                else {
                    matr[i][j] = n - j;
                }
                System.out.print(matr[i][j] + " " );
            }
            System.out.print("\n");
        }
    }

    public static void Six(){
        int n = 6;//dimension
        int[][] matr = new int[n][n];

        for(int i = 0; i< n; i++){
            for (int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    matr[i][j] = 1;
                }
                else {
                    matr[i][j] = 0;
                }
                System.out.print(matr[i][j] + " " );
            }
            System.out.print("\n");
        }
    }
}
