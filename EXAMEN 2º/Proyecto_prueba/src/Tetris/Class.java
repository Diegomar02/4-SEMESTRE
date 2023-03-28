
package Tetris;
        
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Class extends JFrame {
    JLabel statusbar;
    public Class(){
        //statusbar = new JLabel("000000");
        //statusbar.setBounds(10,10,10,10);
        //add(statusbar);
        Board gameBoard = new Board(this);
        add(gameBoard);
        gameBoard.start();
        setSize(600, 800);
        
        setTitle("TETRIS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

 

   public JLabel getStatusBar(){
       return statusbar;    
   }
   
    public static void main(String[] args){
        
     
        Class newGame=new Class();
        newGame.setLocationRelativeTo(null);
        newGame.setVisible(true);
        newGame.setAlwaysOnTop(true);
        //newGame.setAlwaysOnTop(true);
        newGame.setResizable(false);
    }

    static class Shape {
        public Shape() {
        }
    }
}

