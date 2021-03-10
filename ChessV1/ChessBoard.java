import java.awt.*;
import javax.swing.JFrame;
/*
 * Gregory Yao
 * Summer 2019
 */
public class ChessBoard extends JFrame {
   //Sets up the board to represent the start of a chess game.

    private ChessLabel[] labels = new ChessLabel[] {

    // white pieces in order back rank, then pawns
    new ChessLabel("\u2656"), new ChessLabel("\u2658"), new ChessLabel("\u2657"), 
    new ChessLabel("\u2655"), new ChessLabel("\u2654"), new ChessLabel("\u2657"), 
    new ChessLabel("\u2658"), new ChessLabel("\u2656"), new ChessLabel("\u2659"), 
    new ChessLabel("\u2659"), new ChessLabel("\u2659"), new ChessLabel("\u2659"),
    new ChessLabel("\u2659"), new ChessLabel("\u2659"), new ChessLabel("\u2659"), 
    new  ChessLabel("\u2659"), 
    // empty space in starting position
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "),
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
    new ChessLabel(" "), new ChessLabel(" "),
    // black in order, pawns then back rank
    new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
    new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
    new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265C"), 
    new ChessLabel("\u265E"), new ChessLabel("\u265D"), new ChessLabel("\u265B"), 
    new ChessLabel("\u265A"), new ChessLabel("\u265D"), new ChessLabel("\u265E"), 
    new ChessLabel("\u265C")
    };

    void display(){
        setTitle("Chess using unicode images");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);
        
        int rank = -1;
        for (int file = 0; file < labels.length; file++){
	            if(file % 8 == 0) 
	            	rank++; // increment row number
	            labels[file].set(file, rank);
	            contentPane.add(labels[file]);
        	
        }
        // default size set to 600x600, but can be adjusted
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

    } 
    
    public static void main(String args[]) {
    	ChessBoard board = new ChessBoard();

        board.display();
    }
}