public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LessonOneTaskTwo();
        LessonOneTaskThree();
    }

    public static void LessonOneTaskTwo(){
        int r = 5; //radius
        double len = 2*Math.PI*r; //length
        double area = Math.pow(Math.PI,2)*r; //area
        System.out.println(len + " - длина");
        System.out.println(area + " - площадь");
    }
    public static void LessonOneTaskThree(){
        int num = 1234;
        int mult = 1;
        while (num > 0)
        {
            mult = mult*(num % 10);
            num = num/10;
        }
        System.out.println(mult + " - произведение");
    }
}
