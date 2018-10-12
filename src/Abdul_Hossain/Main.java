package Abdul_Hossain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("enter an integer"); //enter an integer
        Scanner input = new Scanner(System.in);//Scanner input
        int put = input.nextInt();//input is put

        int SumUpto = 0;
        SumUpto = ((put*put)+put)/2; //addition factorial
        System.out.println("the sum from 1 to" + put );//print sentence
        System.out.print(SumUpto); // print sum
    }

}