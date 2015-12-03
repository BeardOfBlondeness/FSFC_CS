package mainPackage;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new hello());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman ex = new Pacman();
                ex.setVisible(true);
            }
        });
    }
}
