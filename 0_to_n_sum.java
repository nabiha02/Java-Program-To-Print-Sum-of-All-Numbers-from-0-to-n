import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int sum = 0;
        int i=0;
        while(i<num){

            sum = sum +i;
            i++;

        }
        System.out.println("The total from 0 to "+num+ " is "+sum);

    }

}
