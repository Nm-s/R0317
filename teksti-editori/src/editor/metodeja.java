package editor;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class metodeja extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();

    public metodeja() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            contentPane = (JPanel) getContentPane();
            contentPane.setLayout(new BorderLayout());
            setSize(new Dimension(400, 300));
            setTitle("Tietoja");
           
            contentPane.add(headerLabel, java.awt.BorderLayout.NORTH);
           
            ImageIcon ii = new ImageIcon(this.getClass().getResource(
                    "bm7c.gif"));
            imageLabel.setIcon(ii);
            contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
            
            // näkyviin
            
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }	}