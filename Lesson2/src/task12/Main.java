package by.epam.task12;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */

//TODO fix the class
public class Main {
    public static void main(String[] args){
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
}
