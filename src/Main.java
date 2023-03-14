import java.util.Scanner;

public class Main {

    static String [] myArray = new String[] {"B", "Kb", "Mb", "Gb", "Tb"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        printBytes(Double.parseDouble(input.nextLine()));

    }
    public static void printBytes(double size){
        int tmp = 0;
        while (size >= 1024){
            tmp++;
            size/=1024;
        }
        System.out.println(String.format("%.1f", size).replace(',', '.') + " " +myArray[tmp]);
    }
}