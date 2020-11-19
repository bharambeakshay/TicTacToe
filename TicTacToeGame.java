import java.util.ArrayList;
import java.util.Arrays;

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


    public static void main(String args[]){
        TicTacToeGame tictactoe = new TicTacToeGame();
        tictactoe.initBoard();


    }
}
