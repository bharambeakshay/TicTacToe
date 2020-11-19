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
    public static void displayBoard() {
        System.out.println(board.get(0).get(0)+ " | " +board.get(0).get(1)+ " | " +board.get(0).get(2));
        System.out.println("----------");
        System.out.println(board.get(1).get(0)+ " | " +board.get(1).get(1)+ " | " +board.get(1).get(2));
        System.out.println("----------");
        System.out.println(board.get(2).get(0)+ " | " +board.get(2).get(1)+ " | " +board.get(2).get(2)+"\n");
    }

    //main method
    public static void main(String args[]){
        TicTacToeGame tictactoe = new TicTacToeGame();
        tictactoe.initBoard();
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter the Symbol Choice ");
        int symChoice = choice.nextInt();
        tictactoe.chooseSymbol(symChoice);
        tictactoe.displayBoard();


    }
}
