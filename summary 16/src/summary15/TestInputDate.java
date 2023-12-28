package summary15;

import java.util.Random;
import java.util.Scanner;

public class TestInputDate {
    public static void main (String[]args){
        int myInt;
        myInt =25;
        System.out.println("Присвоение = "+myInt);
        myInt=inputInt();
        System.out.println("Вход с клаветуры= "+myInt);

    myInt=randomInt(18,66+myInt /2);

    }
    static int inputInt(){
        System.out.println("");
        Scanner  scanner= new Scanner(System.in);
        int inpInt =scanner.nextInt();
        return inpInt;
    }
    static  int randomInt(int min,int max){ //50..100 99+50=149
        Random random= new Random();
        int ranInd=random.nextInt(max-min)+min;
        return ranInd;
    }
}
