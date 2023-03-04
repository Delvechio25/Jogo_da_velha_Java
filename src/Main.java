import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] hash = new char[3][3];
        System.out.println("Player 1 = X");
        System.out.println("Player 2 = O");

        boolean win = false;
        int move = 1;
        char sinal;
        int row = 0, column = 0;

        while (!win){

            if (move % 2 == 1){ //player 1
                System.out.println("player 1 do your move. Choose row and a column");
                sinal = 'X';
            }else {
                System.out.println("player 2 do your move. Choose row and a column");
                sinal = 'O';
            }

            boolean rightRow = false;
            while (!rightRow){
                System.out.println("Iput the row (1,2,3) ");
                row = scanner.nextInt();
                if (row >= 1 && row <=3){
                    rightRow = true;
                }
                else {
                    System.out.println("Try again invalid row");
                }
            }

        }

    }
}