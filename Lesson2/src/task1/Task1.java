package by.epam.task1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Hello,world!");
        /*Lesson2Task1();
        Lesson2Task2();
        Lesson2Task3();
        Lesson2Task4();
        Lesson2Task5();
        Lesson2Task6();
        Lesson2Task7();*/
        /*Lesson2Task8();
        lesson2Task13();
        Lesson2Task14();
        Lesson2Task15();*/
    }
/*
    public static void Lesson2Task1() {
        System.out.println("Hello,world!");
    }

    public static void Lesson2Task2() {
        System.out.println("Хмызов Антон Константинович - ФИО");
        System.out.println("ул. Кальварийская 10,15 - Адресс");
        System.out.println("8(017)2352667 - Телефон");
    }

    public static void Lesson2Task3() {
        String str = "Пройдет много лет, и полковник Аурелиано Буэндиа, стоя у стены в ожидании расстрела,\n" +
                "вспомнит тот далекий вечер, когда отец взял его с собой посмотреть на лед. Макондо было\n" +
                "тогда небольшим селением с двумя десятками хижин, выстроенных из глины и бамбука на\n" +
                "берегу реки, которая мчала свои прозрачные воды …";
        System.out.println(str);
    }

    public static void Lesson2Task4() {
        double k1 = 2.0;
        double k2 = 3.0;

        double area = (1.0 / 2) * k1 * k2;
        double hypot = sqrt(pow(abs(k1), 2) + pow(abs(k2), 2));
        System.out.println(area + "- площадь треугольника");
        System.out.println(hypot + "- гипотенуза треугольника");
    }

    public static void Lesson2Task5() {

        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("argument 1: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }

        System.out.print("argument 2: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        System.out.print("argument 3: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }

        System.out.print("argument 4: ");
        if (sc.hasNextDouble()) {
            d = sc.nextDouble();
        }

        double res = a + b + c + d;

        System.out.println(res + "- сумма четырех слагаемых");
    }

    public static void Lesson2Task6() {
        double a = 0;
        double b = 0;
        double c = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("argument a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }

        System.out.print("argument b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        System.out.print("argument c: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }

        double res = pow(a, 2) - pow(b - c, 2) + Math.log(pow(b, 2) + 1);
        System.out.println(res + "- результат");
    }

    public static void Lesson2Task7() {
        double a = 0;
        double b = 0;
        double c = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("argument a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }

        System.out.print("argument b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        if (a > b) {
            System.out.print("argument c: ");
            if (sc.hasNextDouble()) {
                c = sc.nextDouble();
            }
            System.out.print(b + c);
        } else if (a == b) {
            System.out.print("Конец");
        } else {
            System.out.print("argument c: ");
            if (sc.hasNextInt()) {
                c = sc.nextInt();
            }
            double s = a + b + c;
            System.out.println("a + b + c = " + s);
            System.out.println("Новый Год!");
        }
    }

    public static void Lesson2Task8() {
        double a = 0;
        double b = 0;
        double c = 0;

        double s = 0;
        double s1 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("argument a : ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }

        System.out.print("argument b : ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        if (a == b) {
            System.out.println("Скоро Новый год!!!");
        } else {
            System.out.print("argument с : ");
            if (sc.hasNextDouble()) {
                c = sc.nextDouble();
            }
            s = a + b + c;
            s1 = pow(a, 2) + pow(b, 2);
            System.out.println("(a + b + c) = " + s);
            System.out.println("(a^2 + b^2) = " + s1);
            System.out.println("Моя любимая футбольная команда ");
        }
    }

    public static void Lesson2Task9() {
        int n = 0;

        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("dimension n : ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            System.out.print(" int element a[" + i + "]: ");
            if (sc.hasNextInt()) {
                int x = sc.nextInt();

                if (x % 2 == 0) {
                    x1++;
                }

                if (x % 3 == 0) {
                    x2 = x2 + x;
                }

                if (Math.abs(x) < 3) {
                    x3++;
                }
            }
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
    }

    public static void Lesson2Task10() {
        int n = 0;
        int x1 = 0;
        int x2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("dimension n: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("double element a[" + i + "]: ");
            if (sc.hasNextDouble()) {
                double x = sc.nextDouble();

                if (Math.round(x) % 2 == 0) {
                    x1++;
                }

                if (Math.round(x) > 15) {
                    x2++;
                }
            }
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }

    public static void Lesson2Task11() {
        int q = 0;
        int x = 0;
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("dimension n: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" integer a[" + i + "]: ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();

                if (x > 15 || x < 2) {
                    x1++;
                }

                if (x % 5 == 4) {
                    x2 = x2 + x;
                }
            }
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    public static void Lesson2Rask12(Object[] args) {

        int sum = 0;
        if (args.length <= 0){
            System.out.println("No arguments");
            return;
        }

        for(int i = 0; i < args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println(" sum is " + sum);
    }

    public static void lesson2Task13() {
        Random rnd = new Random(100);
        double a = rnd.nextDouble();
        double b = rnd.nextDouble();
        double c = rnd.nextDouble();
        double d = rnd.nextDouble();
        double s1 = 0;
        double s2 = 0;

        if (a != 0) {
            s1 = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
        }

        if (c != 0 && d != 0) {
            s2 = (a / c) * (b / d) - (a * b - c) / (c * d);
        }


        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);
        System.out.println("d =  " + d);

        System.out.println("(b + Math.sqrt(b*b + 4*a*c)) / (2*a) - Math.pow(a, 3)*c + b =   " + s1);
        System.out.println("(a/c)*(b/d) - (a*b - c)/(c*d) =  " + s2);
    }

    public static void Lesson2Task14(){
        Random rnd = new Random(100);
        double a = rnd.nextDouble();
        double b = rnd.nextDouble();
        double c = rnd.nextDouble();

        if (a < 0) {
            a = Math.pow(a, 4);
        }
        else {
            a = Math.pow(a, 2);
        }

        if (b < 0) {
            b = Math.pow(b, 4);
        }
        else {
            b = Math.pow(b, 2);
        }

        if (c < 0) {
            c = Math.pow(c, 4);
        }
        else {
            c = Math.pow(c, 2);
        }

        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);

    }
    public static void Lesson2Task15(){
        Random rnd = new Random(100);
        double a = rnd.nextDouble();
        double b = rnd.nextDouble();
        double h = 0.1;
        double f = 0;

        if (a > b){
            double c = b;
            b = a;
            a = c;
        }

        for (double x = a; x <= b; x = x + h) {
            f = 2*Math.tan(x/2) + 1;
            System.out.println("x =  " + x + " " + "F(x)= " + f);
        }
    }
    public static void Lesson2Task16(){
        Random rnd = new Random(100);
        int a = rnd.nextInt();
        int r = 5; //radius
        double len = 2*Math.PI*r; //length
        double area = Math.pow(Math.PI,2)*r; //area
        System.out.println(len + " - длина");
        System.out.println(area + " - площадь");
    }

    public static void Lesson2Task17(double x) {
            double z= 0;
            if (x <= -3) {
               z= 9;
            }
            else if (x > 3){
                z= 1/(x*x + 1);
            }
            else {
                System.out.println("value not defined - x > 3 and x <=-3; inputed x =" + x);
            }
        System.out.println("f(3.5) = " + z);

    }*/
}
