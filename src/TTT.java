import java.util.Scanner;
public class TTT {
    public static int row,col;
    public static Scanner scan= new Scanner (System.in);
    public static char [] [] board = new char [3][3];
    public static char turn = 'X';
    public static void main (String [] args){
        for ( int i=0; i<3; i++){
            for (int j=0; j<3; j++) {
                board [i][j] = '_';
            }
        }
        PrintBoard ();

    }
    public static void play () {
        boolean playing = true;
        while (playing){
            System.out.println ("please enter a row and column");
            row =scan.nextInt() -1;
            col = scan.nextInt() -1;
            board[row][col] |= turn;
            if (GameOver(row,col)){
                playing = false;
                System.out.println("Game over! Player" + turn + "wins!");
            }
            PrintBoard();
            if (turn == 'X')
                turn= 'O';
            else
                turn = 'X';
        }

    }
    public static void PrintBoard (){
        for ( int i=0; i<3; i++){
            System.out.println ();
            for ( int j=0; j<3; j++){
                if (j==0)
                    System.out.print("|");
                System.out.print (board[i][j] + "|");
            }
        }
        System.out.println();
    }
    public static boolean GameOver (int rmove, int cmove){
        if (board[0][cmove]== board[1][cmove]
                &&board[0][cmove] == board[2][cmove])
            return true;
        else

            return false;
    }

}