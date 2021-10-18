package dss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Main_screen {

	private JFrame frmDss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_screen window = new Main_screen();
					window.frmDss.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDss = new JFrame();
		frmDss.setTitle("DSS");
		frmDss.setBounds(100, 100, 640, 390);
		frmDss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDss.getContentPane().setLayout(null);
		
		JTextPane txtpnWelcomeToDecision = new JTextPane();
		txtpnWelcomeToDecision.setEditable(false);
		txtpnWelcomeToDecision.setForeground(Color.WHITE);
		txtpnWelcomeToDecision.setBackground(new Color(0, 153, 102));
		txtpnWelcomeToDecision.setFont(new Font("Courier New", Font.BOLD, 13));
		txtpnWelcomeToDecision.setText("Welcome to Decision Support System application that will help you determine which ML/RDBMS combination would suit you best. \r\n\r\nBy clicking the Start button, you will have to answer a few question that will ease the process decision.\r\n\r\nLet's begin!");
		txtpnWelcomeToDecision.setBounds(10, 49, 545, 141);
		frmDss.getContentPane().add(txtpnWelcomeToDecision);
		
		JButton btnStartButton = new JButton("START");
		btnStartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Question window = new Question();
				window.setVisible(true) ;
			}
		});
		btnStartButton.setBounds(10, 221, 117, 34);
		frmDss.getContentPane().add(btnStartButton);
		
		JMenuBar menuBar = new JMenuBar();
		frmDss.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmRetake = new JMenuItem("Retake");
		mntmRetake.setEnabled(true);
		mntmRetake.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Question window = new Question();
				window.setVisible(true);
            }
        });
		mnHome.add(mntmRetake);
		
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mntmWelcome.setForeground(new Color(0, 0, 0));
		mntmWelcome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				String msg = "This is a Decision Support System application that will help you determine which ML/RDBMS combination would suit you best.\n You need to answer 6 to 7 questions to receive a supported decision!";
				messageBox(msg);
			}
		});
		mnHelp.add(mntmWelcome);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				openWebpage("https://github.com/vanda1345/master_fri");
			}
			
		});
		mnHelp.add(mntmAbout);
	}
	
	public static void messageBox(String infoMessage)
    {
		JOptionPane.showMessageDialog(null,
			    infoMessage,
			    "Welcome message", 
			    JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void openWebpage(String urlString) {
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
