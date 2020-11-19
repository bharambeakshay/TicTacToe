import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    private static ArrayList<ArrayList<String> > board;
    private static String playerSymbol = " ";
    private static String cpuSymbol = " ";
    

    //board to be initialized
    public void initBoard(){
        board = new ArrayList<ArrayList<String>>();
        board.add( new ArrayList<String>(Arrays.asList(" "," "," ")));
        board.add( new ArrayList<String>(Arrays.asList(" "," "," ")));
        board.add( new ArrayList<String>(Arrays.asList(" "," "," ")));
        }

    //Symbol Selection
    public static void chooseSymbol(int userSymbolChoice){
        if (userSymbolChoice == 1){
            playerSymbol = "X";
            cpuSymbol  =  "O";
        }
        else{
            playerSymbol = "O";
            cpuSymbol = "X";
        }

    }

    //displaying board
    public static void printGameBoard() {
        System.out.println(board.get(0).get(0)+ " | " +board.get(0).get(1)+ " | " +board.get(0).get(2));
        System.out.println("----------");
        System.out.println(board.get(1).get(0)+ " | " +board.get(1).get(1)+ " | " +board.get(1).get(2));
        System.out.println("----------");
        System.out.println(board.get(2).get(0)+ " | " +board.get(2).get(1)+ " | " +board.get(2).get(2)+"\n");
    }

    //valid position
    public static int checkValidPosition(int positionValid) {
        int rowPosition = (int) Math.floor((positionValid-1)/3); //
        int colPosition = (positionValid-1)%3;
        String strPos = Integer.toString((positionValid));
        if (board.get(rowPosition).get(colPosition).equals(strPos))
            return 1;
        else
            return 0;
    }

    //main method
    public static void main(String args[]){
        TicTacToeGame ticTacToe = new TicTacToeGame();
        ticTacToe.initBoard();
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter the Symbol Choice  between 1 and 2 ");
        int symChoice = choice.nextInt();
        ticTacToe.chooseSymbol(symChoice);
        ticTacToe.printGameBoard();
        Scanner validPos = new Scanner(System.in);
        System.out.println("Enter the valid position between 1 to 9 ");
        int validPosition = validPos.nextInt();
        ticTacToe.checkValidPosition(validPosition);


    }
}
