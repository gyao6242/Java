import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
/*
 * Gregory Yao
 * Summer 2019
 */
public class ChessLabel extends JLabel {
	//light brown
    Color bgLight = new Color(222, 184, 135);
    //dark brown
    Color bgDark  = new Color(139, 69, 19);

    ChessLabel(String s){
        super(s);
    }

    void set(int file, int row){
    	//setting the tiles: 32 of each color
    	boolean isColorLight = (file + row) % 2 == 0;
    	
    	setOpaque(true);
    	setBackground(isColorLight ? bgDark : bgLight);
    	setHorizontalAlignment( SwingConstants.CENTER );
    }

}
