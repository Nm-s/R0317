package editor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Tekstieditori extends JFrame {

	/**
	 * Launch the application.
	 */
	JEditorPane editorPane = new JEditorPane(); {
	getContentPane().add(editorPane, BorderLayout.CENTER);
}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tekstieditori frame = new Tekstieditori();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tekstieditori() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTiedosto = new JMenu("Tiedosto");
		menuBar.add(mnTiedosto);
		
		JMenuItem mntmAvaa = new JMenuItem("Avaa");
		mntmAvaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Scanner lukija = null;
			File tiedosto = new File("src//gradu.txt"); 
			String rivi = "";
			
			try {
				lukija = new Scanner(tiedosto);
				
				while (lukija.hasNextLine()) {
				rivi += lukija.nextLine()+"\n";
				System.out.println(rivi);
				}
			} catch (FileNotFoundException p) {
				System.out.println("Tiedostoa ei löydy");
				}
			editorPane.setText(rivi);
			}
		});
		mntmAvaa.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnTiedosto.add(mntmAvaa);
		
		JMenuItem mntmTallenna = new JMenuItem("Tallenna");
		mntmTallenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// Tallennus ikkuna
			
			JFileChooser valintaikkuna = new JFileChooser();	
			valintaikkuna.showSaveDialog(null);
			
			String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
			valintaikkuna.setApproveButtonText("Avaa tiedosto");
			valintaikkuna.setDialogTitle("Tiedoston valinta");

			
			System.out.println("Kirjoitettava tiedosto: "+uusiTiedosto);
				
			// Tallennuksen koodi	
				
			try {
				
				PrintWriter writer = new PrintWriter("Tiedosto.txt");
				String sisalto = editorPane.getText();
				
				writer.println( sisalto );
				
				writer.flush();
				writer.close();
				
			} catch (Exception e1) {
				System.out.println("Tiedoston tallennuksessa tapahtui virhe");
				e1.printStackTrace();;
			}
				
			}
		});
		mntmTallenna.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnTiedosto.add(mntmTallenna);
		
		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnTiedosto.add(mntmLopeta);
		
		JMenuItem mntmSulje = new JMenuItem("Sulje");
		mntmSulje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnTiedosto.add(mntmSulje);
		
		JMenu mnMuokkaa = new JMenu("Muokkaa");
		menuBar.add(mnMuokkaa);
		
		JMenuItem mntmEtsi = new JMenuItem("Etsi");
		mntmEtsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
					// Toiminnallisuus etsimiseen
				
				String sisalto = editorPane.getText();
				sisalto = sisalto.toLowerCase();
				String haettava = "Auto";
				int indeksi = sisalto.indexOf(haettava);
				System.out.println("Indeksi: "+indeksi);
				
				editorPane.setSelectionColor(Color.MAGENTA);
				
				editorPane.setSelectionStart(indeksi);
				editorPane.setSelectionEnd(indeksi + haettava.length() );		
						
						
					}
				
				
			}
		);
		mntmEtsi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnMuokkaa.add(mntmEtsi);
		
		JMenuItem mntmKorvaa = new JMenuItem("Korvaa");
		mntmKorvaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmKorvaa.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnMuokkaa.add(mntmKorvaa);
		
		JMenu mnTietoja = new JMenu("Tietoja");
		menuBar.add(mnTietoja);
		
		JMenuItem mntmVersio = new JMenuItem("Tietoja ohjelmasta");
		mntmVersio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		mnTietoja.add(mntmVersio);
		
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		
		JButton btnAvaa = new JButton("");
		btnAvaa.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
			}
		});
		btnAvaa.setIcon(new ImageIcon("C:\\Users\\Ryzen\\Olioty\u00F6t\\teksti-editori\\open \u2013 kopio.png"));
		btnAvaa.setSize(new Dimension(10, 10));
		btnAvaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		toolBar.add(btnAvaa);
		
		JButton btnTallenna = new JButton("");
		btnTallenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTallenna.setIcon(new ImageIcon("C:\\Users\\Ryzen\\Olioty\u00F6t\\teksti-editori\\save.png"));
		toolBar.add(btnTallenna);
		
		JButton btnLeikkaa = new JButton("");
		btnLeikkaa.setIcon(new ImageIcon("C:\\Users\\Ryzen\\Olioty\u00F6t\\teksti-editori\\cut.png"));
		toolBar.add(btnLeikkaa);
		
		
	}

}
