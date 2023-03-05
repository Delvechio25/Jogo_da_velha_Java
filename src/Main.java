import java.sql.SQLOutput;
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

            boolean validRow = false;
            while (!validRow){
                System.out.println("Iput the row (0, 1, 2). ");
                row = scanner.nextInt();
                if (row >= 1 && row <=3){
                    validRow = true;
                }
                else {
                    System.out.println("Try again invalid row.");
                }
            }

            boolean validcolumn = true;
            while (!validcolumn){
                System.out.println("input the column (0, 1, 2). ");
                column = scanner.nextInt();
                if (column >= 1 && column <=3){
                    validcolumn = true;
                }
                else {
                    System.out.println("Try again invalid column.");
                }
            }
            //row--;
            //column--;
            if (hash[row][column] == 'X' || hash[row][column] == 'O'){
                System.out.println("Try another position");
            }else { // jogada valida
                hash[row][column] = sinal;
                move++;
            }
            for (int i = 0; i <hash.length; i++){
                for (int j = 0;j < hash[i].length; j++){
                    System.out.print(hash[i][j] + " | ");
                }
                System.out.println();
            }
            if ((hash[0][0] == 'X' && hash[0][1] == 'X' && hash[0][2] == 'X') || // row 1
                    (hash[1][0] == 'X' && hash[1][1] == 'X' && hash[1][2] == 'X')|| // row 2
                    (hash[2][0] == 'X' && hash[2][1] == 'X' && hash[2][2] == 'X')|| // row 3
                    (hash[0][0] == 'X' && hash[1][1] == 'X' && hash[2][2] == 'X')|| //column 1
                    (hash[0][0] == 'X' && hash[0][1] == 'X' && hash[0][2] == 'X')|| //column 1
                    (hash[0][1] == 'X' && hash[0][1] == 'X' && hash[0][1] == 'X')|| //column 1
                    (hash[0][0] == 'X' && hash[1][1] == 'X' && hash[2][2] == 'X')){ // diagonal
                win = true;
                System.out.println("Congrats. Player one is the winner");

            } else if ((hash[0][0] == 'O' && hash[0][1] == 'O' && hash[0][2] == 'O') || // row 1
                    (hash[1][0] == 'O' && hash[1][1] == 'O' && hash[1][2] == 'O')|| // row 2
                    (hash[2][0] == 'O' && hash[2][1] == 'O' && hash[2][2] == 'O')|| // row 3
                    (hash[0][0] == 'O' && hash[1][1] == 'O' && hash[2][2] == 'O')|| //column 1
                    (hash[0][0] == 'O' && hash[0][1] == 'O' && hash[0][2] == 'O')|| //column 1
                    (hash[0][1] == 'O' && hash[0][1] == 'O' && hash[0][1] == 'O')|| //column 1
                    (hash[0][0] == 'O' && hash[1][1] == 'O' && hash[2][2] == 'O')) {
                win = true;
                System.out.println("Congrats. Player two is the winner");
                
            }else if (move > 9){
                win = true;
                System.out.println("Anyone won the game.");
            }

        }

    }
}