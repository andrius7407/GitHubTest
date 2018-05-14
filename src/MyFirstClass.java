import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        MyFirstClass myFirstClass = new MyFirstClass();

        float ff = 5.6f;

        myFirstClass.notStaticMethod("jonas");
        System.out.println(sayHi());
        myFirstClass.checkThisNumber(20);
        System.out.println("please insert a number!!!");
        Scanner scanner = new Scanner(System.in);
        try {

            int numb = scanner.nextInt();
            System.out.println("Your number is: " + numb);
        }catch (InputMismatchException e){
            System.out.println("ivedete ne skaiciu");

        }

    }

    private void notStaticMethod(String name){
        System.out.println(name);
    }

    private static String sayHi (){

        return "Hi Andrius";
    }
    private void checkThisNumber(int numb){
        if(numb > 10){
            System.out.println("daugiau");
        }else if(numb > 15){
            System.out.println("daugiau uz 15");
        }else {
            System.out.println("maziau");
        }
    }
}
