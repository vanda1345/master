package dss;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;

public class Question extends JFrame {

	private JPanel contentPane;
	ArrayList<Integer> answers = new ArrayList<Integer>();
	String result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question frame = new Question();
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
	public Question() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 409);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Retake");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				int answer = questionBox("Are you sure you want to retake the questionnaire?");
				if(answer == JOptionPane.YES_OPTION) dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Last result");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Welcome");
		mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				String msg = "This is a Decision Support System application that will help you determine which ML/RDBMS combination would suit you best.\n You need to answer 7 questions to receive a supported decision!";
				messageBox(msg);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("About");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				openWebpage("https://github.com/vanda1345/master_fri");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(SystemColor.control);
		panel1.setBounds(0, 0, 570, 350);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 570, 350);
		contentPane.add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 0, 570, 350);
		contentPane.add(panel3);
		panel3.setLayout(null);
		panel3.setVisible(false);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(0, 0, 570, 350);
		contentPane.add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(0, 0, 570, 350);
		contentPane.add(panel5);
		panel5.setLayout(null);
		panel5.setVisible(false);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(0, 0, 570, 350);
		contentPane.add(panel6);
		panel6.setLayout(null);
		panel6.setVisible(false);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(0, 0, 570, 350);
		contentPane.add(panel7);
		panel7.setLayout(null);
		panel7.setVisible(false);
		
		JPanel panel8 = new JPanel();
		panel8.setBounds(0, 0, 570, 350);
		contentPane.add(panel8);
		panel8.setLayout(null);
		panel8.setVisible(false);
		
		
		
		JTextPane txtpnAreYou = new JTextPane();
		txtpnAreYou.setEditable(false);
		txtpnAreYou.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnAreYou.setText("1. Are you computerly literate - do you think you know your way around computers and coding?");
		txtpnAreYou.setBounds(29, 37, 356, 34);
		panel1.add(txtpnAreYou);
		
		JRadioButton panel1RBtnYes = new JRadioButton("Yes");
		panel1RBtnYes.setFont(new Font("Arial", Font.PLAIN, 12));
		panel1RBtnYes.setBounds(33, 85, 103, 21);
		panel1.add(panel1RBtnYes);
		
		JRadioButton panel1RBtnNo = new JRadioButton("No");
		panel1RBtnNo.setFont(new Font("Arial", Font.PLAIN, 12));
		panel1RBtnNo.setBounds(33, 116, 103, 21);
		panel1.add(panel1RBtnNo);
		
		JButton panel1BtnBack = new JButton("Go back");
		panel1BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION)
					dispose();
			}
		});
		
		ButtonGroup btnsPanel1 = new ButtonGroup();
		btnsPanel1.add(panel1RBtnYes);
		btnsPanel1.add(panel1RBtnNo);
		
		panel1BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel1BtnBack.setBounds(30, 252, 166, 47);
		panel1.add(panel1BtnBack);
		
		JButton panel1BtnNext = new JButton("Next question");
		panel1BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel1RBtnYes.isSelected()) {
					answers.add(1);
					panel1.setVisible(false);
					panel2.setVisible(true);
				}
				else if(panel1RBtnNo.isSelected()) {
					answers.add(0);
					panel1.setVisible(false);
					panel2.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel1BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel1BtnNext.setBounds(252, 252, 166, 47);
		panel1.add(panel1BtnNext);
		
		
		JTextPane txtpnWhatOperating = new JTextPane();
		txtpnWhatOperating.setText("2. What operating system are you using on your computer?");
		txtpnWhatOperating.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnWhatOperating.setEditable(false);
		txtpnWhatOperating.setBounds(29, 37, 356, 33);
		panel2.add(txtpnWhatOperating);
		
		JRadioButton rdbtnWins = new JRadioButton("Microsoft Windows");
		rdbtnWins.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnWins.setBounds(33, 85, 141, 21);
		panel2.add(rdbtnWins);
		
		JRadioButton rdbtnMac = new JRadioButton("MacOS");
		rdbtnMac.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnMac.setBounds(33, 116, 103, 21);
		panel2.add(rdbtnMac);
		
		JRadioButton rdbtnDebianUbuntu = new JRadioButton("Debian Ubuntu");
		rdbtnDebianUbuntu.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnDebianUbuntu.setBounds(180, 86, 103, 21);
		panel2.add(rdbtnDebianUbuntu);
		
		JRadioButton rdbtnFedoraRedhat = new JRadioButton("Fedora Red Hat");
		rdbtnFedoraRedhat.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnFedoraRedhat.setBounds(180, 115, 121, 21);
		panel2.add(rdbtnFedoraRedhat);
		
		JRadioButton rdbtnOtherSystem = new JRadioButton("Other linux system");
		rdbtnOtherSystem.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnOtherSystem.setBounds(322, 85, 140, 21);
		panel2.add(rdbtnOtherSystem);
		
		ButtonGroup btnsPanel2 = new ButtonGroup();
		btnsPanel2.add(rdbtnWins);
		btnsPanel2.add(rdbtnMac);
		btnsPanel2.add(rdbtnDebianUbuntu);
		btnsPanel2.add(rdbtnFedoraRedhat);
		btnsPanel2.add(rdbtnOtherSystem);
		
		JButton panel2BtnBack = new JButton("Go back");
		panel2BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					panel2.setVisible(false);
					panel1.setVisible(true);
				}
			}
		});
		panel2BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel2BtnBack.setBounds(30, 252, 166, 47);
		panel2.add(panel2BtnBack);
		
		
		JButton panel2BtnNext = new JButton("Next question");
		panel2BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnWins.isSelected()) {
					answers.add(0);
					panel2.setVisible(false);
					panel3.setVisible(true);
				}else if(rdbtnMac.isSelected()) {
					answers.add(1);
					panel2.setVisible(false);
					panel3.setVisible(true);
				}else if(rdbtnDebianUbuntu.isSelected()) {
					answers.add(2);
					panel2.setVisible(false);
					panel3.setVisible(true);
				}else if(rdbtnFedoraRedhat.isSelected()) {
					answers.add(3);
					panel2.setVisible(false);
					panel3.setVisible(true);
				}else if(rdbtnOtherSystem.isSelected()) {
					answers.add(4);
					panel2.setVisible(false);
					panel3.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel2BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel2BtnNext.setBounds(252, 252, 166, 47);
		panel2.add(panel2BtnNext);
				
		
		JTextPane txtpnHaveYou = new JTextPane();
		txtpnHaveYou.setText("3. Have you ever coded in Python?");
		txtpnHaveYou.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnHaveYou.setEditable(false);
		txtpnHaveYou.setBounds(29, 37, 356, 34);
		panel3.add(txtpnHaveYou);
		
		JRadioButton panel3RBtnYes = new JRadioButton("Yes");
		panel3RBtnYes.setFont(new Font("Arial", Font.PLAIN, 12));
		panel3RBtnYes.setBounds(33, 85, 103, 21);
		panel3.add(panel3RBtnYes);
		
		JRadioButton panel3RBtnNo = new JRadioButton("No");
		panel3RBtnNo.setFont(new Font("Arial", Font.PLAIN, 12));
		panel3RBtnNo.setBounds(33, 116, 103, 21);
		panel3.add(panel3RBtnNo);
		
		ButtonGroup btnsPanel3 = new ButtonGroup();
		btnsPanel3.add(panel3RBtnYes);
		btnsPanel3.add(panel3RBtnNo);
		
		JButton panel3BtnBack = new JButton("Go back");
		panel3BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					panel3.setVisible(false);
					panel2.setVisible(true);
				}
			}
		});
		panel3BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel3BtnBack.setBounds(30, 252, 166, 47);
		panel3.add(panel3BtnBack);
		
		JButton panel3BtnNext = new JButton("Next question");
		panel3BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel3RBtnYes.isSelected()) {
					answers.add(1);
					panel3.setVisible(false);
					panel4.setVisible(true);
				}
				else if(panel3RBtnNo.isSelected()) {
					answers.add(0);
					panel3.setVisible(false);
					panel4.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
				
			}
		});
		panel3BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel3BtnNext.setBounds(252, 252, 166, 47);
		panel3.add(panel3BtnNext);
		
		JTextPane txtpnWhatHas = new JTextPane();
		txtpnWhatHas.setText("4. What has higher importance? ");
		txtpnWhatHas.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnWhatHas.setEditable(false);
		txtpnWhatHas.setBounds(29, 37, 356, 34);
		panel4.add(txtpnWhatHas);
		panel4.setVisible(false);
		
		JRadioButton rdbtnRatio = new JRadioButton("Ratio of input effort and time needed for predictions");
		rdbtnRatio.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnRatio.setBounds(33, 85, 311, 21);
		panel4.add(rdbtnRatio);
		
		JRadioButton rdbtnQuality = new JRadioButton("Easier process, no matter the quality or duration");
		rdbtnQuality.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnQuality.setBounds(33, 116, 311, 21);
		panel4.add(rdbtnQuality);
		
		ButtonGroup btnsPanel4 = new ButtonGroup();
		btnsPanel4.add(rdbtnRatio);
		btnsPanel4.add(rdbtnQuality);
		
		JButton panel4BtnBack = new JButton("Go back");
		panel4BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					panel4.setVisible(false);
					panel3.setVisible(true);
				}
			}
		});
		panel4BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel4BtnBack.setBounds(30, 252, 166, 47);
		panel4.add(panel4BtnBack);
		
		
		JButton panel4BtnNext = new JButton("Next question");
		panel4BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(rdbtnRatio.isSelected()) {
					answers.add(0);
					panel4.setVisible(false);
					panel5.setVisible(true);
				}
				else if(rdbtnQuality.isSelected()) {
					answers.add(1);
					panel4.setVisible(false);
					panel5.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
				
			}
		});
		panel4BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel4BtnNext.setBounds(252, 252, 166, 47);
		panel4.add(panel4BtnNext);
		
	
		JTextPane txtpnHowFast = new JTextPane();
		txtpnHowFast.setEditable(false);
		txtpnHowFast.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnHowFast.setText("5. How fast do you need your predictions?");
		txtpnHowFast.setBounds(29, 37, 356, 34);
		panel5.add(txtpnHowFast);
		
		JRadioButton rdbtnImmediately = new JRadioButton("Immediately");
		rdbtnImmediately.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnImmediately.setBounds(33, 85, 141, 21);
		panel5.add(rdbtnImmediately);
		
		JRadioButton rdbtnNoHurry = new JRadioButton("I am in no hurry");
		rdbtnNoHurry.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnNoHurry.setBounds(33, 116, 141, 21);
		panel5.add(rdbtnNoHurry);
		
		JRadioButton rdbtnSoon = new JRadioButton("Soon");
		rdbtnSoon.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnSoon.setBounds(33, 147, 141, 21);
		panel5.add(rdbtnSoon);
		
		ButtonGroup btnsPanel5 = new ButtonGroup();
		btnsPanel5.add(rdbtnImmediately);
		btnsPanel5.add(rdbtnNoHurry);
		btnsPanel5.add(rdbtnSoon);
		
		JButton panel5BtnBack = new JButton("Go back");
		panel5BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					panel5.setVisible(false);
					panel4.setVisible(true);
				}
			}
		});
		
		panel5BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel5BtnBack.setBounds(30, 252, 166, 47);
		panel5.add(panel5BtnBack);
		
		JButton panel5BtnNext = new JButton("Next question");
		panel5BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnImmediately.isSelected()) {
					answers.add(0);
					panel5.setVisible(false);
					panel6.setVisible(true);
				}else if(rdbtnNoHurry.isSelected()) {
					answers.add(1);
					panel5.setVisible(false);
					panel6.setVisible(true);
				}else if(rdbtnSoon.isSelected()) {
					answers.add(2);
					panel5.setVisible(false);
					panel6.setVisible(true);
				}else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel5BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel5BtnNext.setBounds(252, 252, 166, 47);
		panel5.add(panel5BtnNext);
		
		JTextPane txtpnHowMuch = new JTextPane();
		txtpnHowMuch.setEditable(false);
		txtpnHowMuch.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnHowMuch.setText("6. How much free space for different needed installations do you have on your computer?");
		txtpnHowMuch.setBounds(29, 37, 356, 34);
		panel6.add(txtpnHowMuch);
		
		JRadioButton rdbtnLesst1gb = new JRadioButton("Less than 1GB");
		rdbtnLesst1gb.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnLesst1gb.setBounds(33, 85, 141, 21);
		panel6.add(rdbtnLesst1gb);
		
		JRadioButton rdbtnBetween = new JRadioButton("Between 1GB and 10GB");
		rdbtnBetween.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnBetween.setBounds(33, 116, 167, 21);
		panel6.add(rdbtnBetween);
		
		JRadioButton rdbtnEnough = new JRadioButton("More than 10GB");
		rdbtnEnough.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnEnough.setBounds(270, 85, 141, 21);
		panel6.add(rdbtnEnough);
		
		JRadioButton rdbtnIdk = new JRadioButton("I don't know");
		rdbtnIdk.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnIdk.setBounds(270, 116, 141, 21);
		panel6.add(rdbtnIdk);
		
		ButtonGroup btnsPanel6 = new ButtonGroup();
		btnsPanel6.add(rdbtnLesst1gb);
		btnsPanel6.add(rdbtnBetween);
		btnsPanel6.add(rdbtnEnough);
		btnsPanel6.add(rdbtnIdk);
		
		JButton panel6BtnBack = new JButton("Go back");
		panel6BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					panel6.setVisible(false);
					panel5.setVisible(true);
				}
			}
		});
		
		panel6BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel6BtnBack.setBounds(30, 252, 166, 47);
		panel6.add(panel6BtnBack);
		
		JButton panel6BtnNext = new JButton("Next question");
		panel6BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnLesst1gb.isSelected()) {
					answers.add(0);
					panel6.setVisible(false);
					panel7.setVisible(true);
				}else if(rdbtnBetween.isSelected()) {
					answers.add(1);
					panel6.setVisible(false);
					panel7.setVisible(true);
				}
				else if(rdbtnEnough.isSelected()) {
					answers.add(2);
					panel6.setVisible(false);
					panel7.setVisible(true);
				}else if(rdbtnIdk.isSelected()) {
					answers.add(3);
					panel6.setVisible(false);
					panel7.setVisible(true);
				}else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel6BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel6BtnNext.setBounds(252, 252, 166, 47);
		panel6.add(panel6BtnNext);
		
		JTextPane txtpnWhatKind = new JTextPane();
		txtpnWhatKind.setText("7. What kind of predictions will you be needing?");
		txtpnWhatKind.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnWhatKind.setEditable(false);
		txtpnWhatKind.setBounds(29, 37, 356, 34);
		panel7.add(txtpnWhatKind);
		panel7.setVisible(false);
		
		JRadioButton rdbtnClass = new JRadioButton("Predictions of class labels");
		rdbtnClass.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnClass.setBounds(33, 85, 311, 21);
		panel7.add(rdbtnClass);	
		
		JRadioButton rdbtnRegres = new JRadioButton("Predictions of a continuous quantity");
		rdbtnRegres.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnRegres.setBounds(33, 116, 216, 21);
		panel7.add(rdbtnRegres);
		
		ButtonGroup btnsPanel7 = new ButtonGroup();
		btnsPanel7.add(rdbtnClass);
		btnsPanel7.add(rdbtnRegres);
		
		JButton panel7BtnBack = new JButton("Go back");
		panel7BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					panel7.setVisible(false);
					panel6.setVisible(true);
				}
			}
		});
		panel7BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel7BtnBack.setBounds(30, 252, 166, 47);
		panel7.add(panel7BtnBack);
		
		
		JButton panel7BtnNext = new JButton("Next question");
		panel7BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(rdbtnClass.isSelected()) {
					answers.add(0);
					panel7.setVisible(false);
					panel8.setVisible(true);
				}
				else if(rdbtnRegres.isSelected()) {
					answers.add(1);
					panel7.setVisible(false);
					panel8.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
				
			}
		});
		panel7BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel7BtnNext.setBounds(252, 252, 166, 47);
		panel7.add(panel7BtnNext);
		
		
		JTextPane txtpnHowBig = new JTextPane();
		txtpnHowBig.setEditable(false);
		txtpnHowBig.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnHowBig.setText("8. How big of a dataset you need processed?");
		txtpnHowBig.setBounds(29, 37, 356, 34);
		panel8.add(txtpnHowBig);
		
		JRadioButton rdbtnLt1k = new JRadioButton("Less than 1k rows");
		rdbtnLt1k.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnLt1k.setBounds(33, 85, 141, 21);
		panel8.add(rdbtnLt1k);
		
		JRadioButton rdbtn1to10k = new JRadioButton("1 - 10k rows");
		rdbtn1to10k.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtn1to10k.setBounds(33, 116, 141, 21);
		panel8.add(rdbtn1to10k);
		
		JRadioButton rdbtn10to100k = new JRadioButton("10 - 100k rows");
		rdbtn10to100k.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtn10to100k.setBounds(180, 86, 141, 21);
		panel8.add(rdbtn10to100k);
		
		JRadioButton rdbtnMt100k = new JRadioButton("More than 100k rows");
		rdbtnMt100k.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnMt100k.setBounds(180, 115, 141, 21);
		panel8.add(rdbtnMt100k);
		
		ButtonGroup btnsPanel8 = new ButtonGroup();
		btnsPanel8.add(rdbtnLt1k);
		btnsPanel8.add(rdbtn1to10k);
		btnsPanel8.add(rdbtn10to100k);
		btnsPanel8.add(rdbtnMt100k);
		
		
		JButton panel8BtnBack = new JButton("Go back");
		panel8BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					panel8.setVisible(false);
					panel7.setVisible(true);
				}
			}
		});
		panel8BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel8BtnBack.setBounds(30, 252, 166, 47);
		panel8.add(panel8BtnBack);
		
		//JButton panel6BtnNext = new JButton("Next question");
		JButton panel8BtnFinish = new JButton("Finish");
		panel8BtnFinish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnLt1k.isSelected()) {
					answers.add(0);
					int answer = calculate();
					if(answer == JOptionPane.OK_OPTION) dispose();
					else btnsPanel8.clearSelection();
					//else rdbtnLt1k.
					//panel6.setVisible(false);
					//panel7.setVisible(true);
				}else if(rdbtn1to10k.isSelected()) {
					answers.add(1);
					int answer = calculate();
					if(answer == JOptionPane.OK_OPTION) dispose();
					else btnsPanel8.clearSelection();
					//panel6.setVisible(false);
					//panel7.setVisible(true);
				}else if(rdbtn10to100k.isSelected()) {
					answers.add(2);
					int answer = calculate();
					if(answer == JOptionPane.OK_OPTION) dispose();
					else btnsPanel8.clearSelection();
					//panel6.setVisible(false);
					//panel7.setVisible(true);
				}else if(rdbtnMt100k.isSelected()) {
					answers.add(3);
					int answer = calculate();
					if(answer == JOptionPane.OK_OPTION) dispose();
					else btnsPanel8.clearSelection();
					//panel6.setVisible(false);
					//panel7.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel8BtnFinish.setFont(new Font("Arial", Font.BOLD, 12));
		panel8BtnFinish.setBounds(252, 252, 166, 47);
		panel8.add(panel8BtnFinish);
		
		
	}
	
	public static void openWebpage(String urlString) {
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void warningBox(String infoMessage) { 
		JOptionPane.showMessageDialog(null, infoMessage, "Warning", JOptionPane.WARNING_MESSAGE); 
	}
	
	public static void messageBox(String infoMessage){
		JOptionPane.showMessageDialog(null, infoMessage, "Welcome message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int questionBox(String infoMessage){
		int n = JOptionPane.showConfirmDialog(null, infoMessage, "Question", JOptionPane.YES_NO_OPTION);
		return n;
    }
	
	public static int resultBox(String infoMessage){
		int answer = JOptionPane.showConfirmDialog(null, "Your best combination is: " + infoMessage, "Results", JOptionPane.OK_CANCEL_OPTION);
		return answer;
	}
	
	public int calculate() {
		result = "TZ";
		int sum = 0;
		for(int i=0; i < answers.size(); i++) {
			sum+=answers.get(i);
		}
		result = Integer.toString(sum);
		int answer = resultBox(result);
		
		return answer;

	}
}
