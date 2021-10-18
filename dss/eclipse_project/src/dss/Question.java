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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
	String text = "";
	final static boolean shouldFill = true;

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
		setBounds(10, 10, 700, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Retake");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				int answer = questionBox("Are you sure you want to retake the questionnaire?");
				if(answer == JOptionPane.YES_OPTION) dispose();
				Question window = new Question();
				window.setVisible(true) ;
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Welcome");
		mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				String msg = "This is a Decision Support System application that will help you determine which ML/RDBMS combination would suit you best.\n You need to answer 6 to 7 questions to receive a supported decision!";
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
		panel1.setBounds(0, 0, 800, 600);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 800, 600);
		contentPane.add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 0, 800, 600);
		contentPane.add(panel3);
		panel3.setLayout(null);
		panel3.setVisible(false);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(0, 0, 800, 600);
		contentPane.add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(0, 0, 800, 600);
		contentPane.add(panel5);
		panel5.setLayout(null);
		panel5.setVisible(false);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(0, 0, 800, 600);
		contentPane.add(panel6);
		panel6.setLayout(null);
		panel6.setVisible(false);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(0, 0, 800, 600);
		contentPane.add(panel7);
		panel7.setLayout(null);
		panel7.setVisible(false);
		
		
		// ******************* PANEL 1 ******************* 
		
		JTextPane txtpnWhatOperating = new JTextPane();
		txtpnWhatOperating.setEditable(false);
		txtpnWhatOperating.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnWhatOperating.setText("1. What operating system are you using on your computer?");
		txtpnWhatOperating.setBounds(70, 37, 530, 34);
		panel1.add(txtpnWhatOperating);
		
		JRadioButton rdbtnWins = new JRadioButton("Microsoft Windows");
		rdbtnWins.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnWins.setBounds(90, 95, 141, 21);
		panel1.add(rdbtnWins);
		
		JRadioButton rdbtnMac = new JRadioButton("MacOS");
		rdbtnMac.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnMac.setBounds(90, 135, 141, 21);
		panel1.add(rdbtnMac);
		
		JRadioButton rdbtnDebianUbuntu = new JRadioButton("Debian Ubuntu");
		rdbtnDebianUbuntu.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnDebianUbuntu.setBounds(90, 175, 141, 21);
		panel1.add(rdbtnDebianUbuntu);
		
		JRadioButton rdbtnFedoraRedhat = new JRadioButton("Fedora Red Hat");
		rdbtnFedoraRedhat.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnFedoraRedhat.setBounds(380, 95, 141, 21);
		panel1.add(rdbtnFedoraRedhat);
		
		JRadioButton rdbtnOtherSystem = new JRadioButton("Other linux system");
		rdbtnOtherSystem.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnOtherSystem.setBounds(380, 135, 141, 21);
		panel1.add(rdbtnOtherSystem);
		
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
		btnsPanel1.add(rdbtnWins);
		btnsPanel1.add(rdbtnMac);
		btnsPanel1.add(rdbtnDebianUbuntu);
		btnsPanel1.add(rdbtnFedoraRedhat);
		btnsPanel1.add(rdbtnOtherSystem);
		
		panel1BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel1BtnBack.setBounds(70, 252, 250, 47);
		panel1.add(panel1BtnBack);
		
		JButton panel1BtnNext = new JButton("Next question");
		panel1BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnWins.isSelected()) {
					answers.add(0);
					panel1.setVisible(false);
					panel2.setVisible(true);
				}else if(rdbtnMac.isSelected()) {
					answers.add(1);
					panel1.setVisible(false);
					panel2.setVisible(true);
				}else if(rdbtnDebianUbuntu.isSelected()) {
					answers.add(2);
					panel1.setVisible(false);
					panel2.setVisible(true);
				}else if(rdbtnFedoraRedhat.isSelected()) {
					answers.add(3);
					panel1.setVisible(false);
					panel2.setVisible(true);
				}else if(rdbtnOtherSystem.isSelected()) {
					answers.add(4);
					panel1.setVisible(false);
					panel2.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel1BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel1BtnNext.setBounds(350, 252, 250, 47);
		panel1.add(panel1BtnNext);
		
		
		
		// ******************* PANEL 2 ******************* 
		JTextPane txtpnHaveYou = new JTextPane();
		txtpnHaveYou.setText("2. Have you ever coded in Python?");
		txtpnHaveYou.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnHaveYou.setEditable(false);
		txtpnHaveYou.setBounds(70, 37, 530, 34);
		panel2.add(txtpnHaveYou);
		
		JRadioButton panel2RBtnYes = new JRadioButton("Yes");
		panel2RBtnYes.setFont(new Font("Arial", Font.PLAIN, 12));
		panel2RBtnYes.setBounds(90, 95, 103, 21);
		panel2.add(panel2RBtnYes);
		
		JRadioButton panel2RBtnNo = new JRadioButton("No");
		panel2RBtnNo.setFont(new Font("Arial", Font.PLAIN, 12));
		panel2RBtnNo.setBounds(380, 95, 103, 21);
		panel2.add(panel2RBtnNo);
		
		ButtonGroup btnsPanel2 = new ButtonGroup();
		btnsPanel2.add(panel2RBtnYes);
		btnsPanel2.add(panel2RBtnNo);
		
		JButton panel2BtnBack = new JButton("Go back");
		panel2BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					if(answers.size() == 1) answers.remove(0);
					//System.out.println(answers);
					panel2.setVisible(false);
					panel1.setVisible(true);
					btnsPanel1.clearSelection();
				}
			}
		});
		panel2BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel2BtnBack.setBounds(70, 252, 250, 47);
		panel2.add(panel2BtnBack);
		
		
		JButton panel2BtnNext = new JButton("Next question");
		panel2BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel2RBtnYes.isSelected()) {
					answers.add(1);
					panel2.setVisible(false);
					panel3.setVisible(true);
				}
				else if(panel2RBtnNo.isSelected()) {
					answers.add(0);
					panel2.setVisible(false);
					panel3.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel2BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel2BtnNext.setBounds(350, 252, 250, 47);
		panel2.add(panel2BtnNext);
				
		
		
		// ******************* PANEL 3 *******************
		JTextPane txtpnHowMuch = new JTextPane();
		txtpnHowMuch.setText("3. How much free space for different needed installations do you have on your computer?");
		txtpnHowMuch.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnHowMuch.setEditable(false);
		txtpnHowMuch.setBounds(70, 37, 530, 34);
		panel3.add(txtpnHowMuch);
		
		JRadioButton rdbtnLesst1gb = new JRadioButton("Less than 1GB");
		rdbtnLesst1gb.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnLesst1gb.setBounds(90, 95, 141, 21);
		panel3.add(rdbtnLesst1gb);
		
		JRadioButton rdbtnBetween = new JRadioButton("Between 1GB and 10GB");
		rdbtnBetween.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnBetween.setBounds(90, 135, 167, 21);
		panel3.add(rdbtnBetween);
		
		JRadioButton rdbtnEnough = new JRadioButton("More than 10GB");
		rdbtnEnough.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnEnough.setBounds(380, 95, 141, 21);
		panel3.add(rdbtnEnough);
		
		JRadioButton rdbtnIdk = new JRadioButton("I don't know");
		rdbtnIdk.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnIdk.setBounds(380, 135, 141, 21);
		panel3.add(rdbtnIdk);
		
		ButtonGroup btnsPanel3 = new ButtonGroup();
		btnsPanel3.add(rdbtnLesst1gb);
		btnsPanel3.add(rdbtnBetween);
		btnsPanel3.add(rdbtnEnough);
		btnsPanel3.add(rdbtnIdk);
		
		JButton panel3BtnBack = new JButton("Go back");
		panel3BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					if(answers.size() == 2) answers.remove(1);
					//System.out.println(answers);
					panel3.setVisible(false);
					panel2.setVisible(true);
					btnsPanel2.clearSelection();
				}
			}
		});
		panel3BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel3BtnBack.setBounds(70, 252, 250, 47);
		panel3.add(panel3BtnBack);
		
		JButton panel3BtnNext = new JButton("Next question");
		panel3BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnLesst1gb.isSelected()) {
					answers.add(0);
					panel3.setVisible(false);
					panel4.setVisible(true);
				}else if(rdbtnBetween.isSelected()) {
					answers.add(1);
					panel3.setVisible(false);
					panel4.setVisible(true);
				}else if(rdbtnEnough.isSelected()) {
					answers.add(2);
					panel3.setVisible(false);
					panel4.setVisible(true);
				}else if(rdbtnIdk.isSelected()) {
					answers.add(3);
					panel3.setVisible(false);
					panel4.setVisible(true);
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
				
			}
		});
		panel3BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel3BtnNext.setBounds(350, 252, 250, 47);
		panel3.add(panel3BtnNext);
		
		
		// ******************* PANEL 4 *******************
		JTextPane txtpnWhatKind = new JTextPane();
		txtpnWhatKind.setText("4. What kind of predictions will you be needing?");
		txtpnWhatKind.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnWhatKind.setEditable(false);
		txtpnWhatKind.setBounds(70, 37, 530, 34);
		panel4.add(txtpnWhatKind);
		panel4.setVisible(false);
		
		JRadioButton rdbtnClass = new JRadioButton("Predictions of class labels");
		rdbtnClass.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnClass.setBounds(90, 95, 250, 21);
		panel4.add(rdbtnClass);	
		
		JRadioButton rdbtnRegres = new JRadioButton("Predictions of a continuous quantity");
		rdbtnRegres.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnRegres.setBounds(380, 95, 250, 21);
		panel4.add(rdbtnRegres);
		
		ButtonGroup btnsPanel4 = new ButtonGroup();
		btnsPanel4.add(rdbtnClass);
		btnsPanel4.add(rdbtnRegres);
		
		JButton panel4BtnBack = new JButton("Go back");
		panel4BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					if(answers.size()  == 3) answers.remove(2);
					//System.out.println(answers);
					panel4.setVisible(false);
					panel3.setVisible(true);
					btnsPanel3.clearSelection();
				}
			}
		});
		panel4BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel4BtnBack.setBounds(70, 252, 250, 47);
		panel4.add(panel4BtnBack);
		
		
		JButton panel4BtnNext = new JButton("Next question");
		panel4BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnClass.isSelected()) {
					answers.add(0);
					panel4.setVisible(false);
					panel5.setVisible(true);
				}
				else if(rdbtnRegres.isSelected()) {
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
		panel4BtnNext.setBounds(350, 252, 250, 47);
		panel4.add(panel4BtnNext);
		
		
		// ******************* PANEL 5 *******************
	
		JTextPane txtpnWhatKindData = new JTextPane();
		txtpnWhatKindData.setEditable(false);
		txtpnWhatKindData.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnWhatKindData.setText("5. What kind of data does your dataset contain?");
		txtpnWhatKindData.setBounds(70, 37, 530, 34);
		panel5.add(txtpnWhatKindData);
		
		JRadioButton rdbtnNum = new JRadioButton("Mostly numerical");
		rdbtnNum.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnNum.setBounds(90, 95, 250, 21);
		panel5.add(rdbtnNum);
		
		JRadioButton rdbtnOneWord = new JRadioButton("Mostly one word records");
		rdbtnOneWord.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnOneWord.setBounds(90, 135, 250, 21);
		panel5.add(rdbtnOneWord);
		
		JRadioButton rdbtnNumStr = new JRadioButton("Combination of numerical and one word strings");
		rdbtnNumStr.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnNumStr.setBounds(380, 95, 311, 21);
		panel5.add(rdbtnNumStr);
		
		JRadioButton rdbtnLonStr = new JRadioButton("Mostly longer strings");
		rdbtnLonStr.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnLonStr.setBounds(380, 135, 250, 21);
		panel5.add(rdbtnLonStr);
		
		ButtonGroup btnsPanel5 = new ButtonGroup();
		btnsPanel5.add(rdbtnNum);
		btnsPanel5.add(rdbtnNumStr);
		btnsPanel5.add(rdbtnOneWord);
		btnsPanel5.add(rdbtnLonStr);
		
		JButton panel5BtnBack = new JButton("Go back");
		panel5BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) { 
					if(answers.size() == 4) answers.remove(3);
					//System.out.println(answers);
					panel5.setVisible(false);
					panel4.setVisible(true);
					btnsPanel4.clearSelection();
				}
			}
		});
		
		panel5BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel5BtnBack.setBounds(70, 252, 250, 47);
		panel5.add(panel5BtnBack);
		
		JButton panel6BtnNext = new JButton(text);
		JButton panel5BtnNext = new JButton("Next question");
		panel5BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(answers.get(1) == 0) {
					text = "Finish";
					panel6BtnNext.setText(text);
					
				}else if(answers.get(1) == 1){
					text = "Next question";
					panel6BtnNext.setText(text); 
				}
				if(rdbtnNum.isSelected()) {
					answers.add(0);
					panel5.setVisible(false);
					panel6.setVisible(true);
				}
				else if(rdbtnNumStr.isSelected()) {
					answers.add(1);
					panel5.setVisible(false);
					panel6.setVisible(true);
				}
				else if(rdbtnOneWord.isSelected()) {
					answers.add(2);
					panel5.setVisible(false);
					panel6.setVisible(true);
				}
				else if(rdbtnLonStr.isSelected()) {
					answers.add(3);
					panel5.setVisible(false);
					panel6.setVisible(true);
				}else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel5BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel5BtnNext.setBounds(350, 252, 250, 47);
		panel5.add(panel5BtnNext);
		
		
		
		// ******************* PANEL 6 *******************
		JTextPane txtpnHowFast = new JTextPane();
		txtpnHowFast.setEditable(false);
		txtpnHowFast.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnHowFast.setText("6. How fast do you need to get predictions?");
		txtpnHowFast.setBounds(70, 37, 530, 34);
		panel6.add(txtpnHowFast);
		
		JRadioButton rdbtnAsap = new JRadioButton("As soon as possible");
		rdbtnAsap.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnAsap.setBounds(90, 95, 141, 21);
		panel6.add(rdbtnAsap);
		
		JRadioButton rdbtnHaveTime = new JRadioButton("I have some time");
		rdbtnHaveTime.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnHaveTime.setBounds(380, 95, 141, 21);
		panel6.add(rdbtnHaveTime);
		
		ButtonGroup btnsPanel6 = new ButtonGroup();
		btnsPanel6.add(rdbtnAsap);
		btnsPanel6.add(rdbtnHaveTime);
		
		JButton panel6BtnBack = new JButton("Go back");
		panel6BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) {
					if(answers.size() == 5) answers.remove(4);
					//System.out.println(answers);
					panel6.setVisible(false);
					panel5.setVisible(true);
					btnsPanel5.clearSelection();
				}
			}
		});
		
		panel6BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel6BtnBack.setBounds(70, 252, 250, 47);
		panel6.add(panel6BtnBack);
		
		
		//JButton panel6BtnNext = new JButton(text);
		panel6BtnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnAsap.isSelected()) {
					answers.add(0);
					btnsPanel6.clearSelection();
					if(answers.get(1) == 1) {
						panel6.setVisible(false);
						panel7.setVisible(true);
					}else {
						int answer = getAnswer();
						if(answer == JOptionPane.OK_OPTION) dispose();
						else if(answers.size() == 6){
							answers.remove(5);
							btnsPanel6.clearSelection();
						}
					}
				}else if(rdbtnHaveTime.isSelected()) {
					answers.add(1);
					if(answers.get(1) == 1) {
						panel6.setVisible(false);
						panel7.setVisible(true);
					}else {
						int answer = getAnswer();
						if(answer == JOptionPane.OK_OPTION) dispose();
						else if(answers.size() == 6) {
							answers.remove(5);
							btnsPanel6.clearSelection();
						}
						
					}
				}else {
					warningBox("You have to pick one of the given answers!");
				}
			}
		});
		panel6BtnNext.setFont(new Font("Arial", Font.BOLD, 12));
		panel6BtnNext.setBounds(350, 252, 250, 47);
		panel6.add(panel6BtnNext);
		
		
		
		// ******************* PANEL 7 *******************
		JTextPane txtpnAreWilling = new JTextPane();
		txtpnAreWilling.setText("7. Are you willing to invest some time in manual data optimization?");
		txtpnAreWilling.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnAreWilling.setEditable(false);
		txtpnAreWilling.setBounds(70, 37, 530, 34);
		panel7.add(txtpnAreWilling);
		//panel7.setVisible(false);
		
		JRadioButton panel7RBtnYes = new JRadioButton("Yes");
		panel7RBtnYes.setFont(new Font("Arial", Font.PLAIN, 12));
		panel7RBtnYes.setBounds(90, 95, 103, 21);
		panel7.add(panel7RBtnYes);
		
		JRadioButton panel7RBtnNo = new JRadioButton("No");
		panel7RBtnNo.setFont(new Font("Arial", Font.PLAIN, 12));
		panel7RBtnNo.setBounds(380, 95, 103, 21);
		panel7.add(panel7RBtnNo);
		
		ButtonGroup btnsPanel7 = new ButtonGroup();
		btnsPanel7.add(panel7RBtnYes);
		btnsPanel7.add(panel7RBtnNo);
		
		JButton panel7BtnBack = new JButton("Go back");
		panel7BtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = questionBox("Are you sure you want to go back?");
				if(answer == JOptionPane.YES_OPTION) { 
					if(answers.size() == 6) answers.remove(5);
					//System.out.println(answers);
					panel7.setVisible(false);
					panel6.setVisible(true);
					btnsPanel6.clearSelection();
				}
			}
		});
		panel7BtnBack.setFont(new Font("Arial", Font.BOLD, 12));
		panel7BtnBack.setBounds(70, 252, 250, 47);
		panel7.add(panel7BtnBack);
		
		
		JButton panel7BtnFinish = new JButton("Finish");
		panel7BtnFinish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(panel7RBtnYes.isSelected()) {
					answers.add(1);
					int answer = getAnswer();
					if(answer == JOptionPane.OK_OPTION) dispose();
					else if(answers.size() == 7) {
						answers.remove(6);
						btnsPanel7.clearSelection();
					}
				}else if(panel7RBtnNo.isSelected()) {
					answers.add(0);
					int answer = getAnswer();
					if(answer == JOptionPane.OK_OPTION) dispose();
					else if(answers.size() == 7) {
						answers.remove(6);
						btnsPanel7.clearSelection();
					}
				}
				else {
					warningBox("You have to pick one of the given answers!");
				}
				
			}
		});
		panel7BtnFinish.setFont(new Font("Arial", Font.BOLD, 12));
		panel7BtnFinish.setBounds(350, 252, 250, 47);
		panel7.add(panel7BtnFinish);
		
		
		
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
	
	public int getAnswer() {
		result = finalDecisionRDBMS();
		int answer = resultBox(result);
		
		return answer;

	}
	
	public String finalDecisionRDBMS() {
		String final_result = "";
		
		// 1
		if(answers.get(0) == 0 || answers.get(0) == 3 || answers.get(0) == 4) {
			//2
			if(answers.get(1) == 0) {
				//3
				if(answers.get(2) == 0) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
				//3
				else if(answers.get(2) == 1 || answers.get(2) == 3) {
					//4
					if(answers.get(3) == 1) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
					//4
					else if(answers.get(3) == 0) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6
							if(answers.get(5) == 0) {final_result = "MindsDB / PostgreSQL";}
							else if(answers.get(5) == 1) {final_result = "MindsDB / MariaDB or PostgreSQL";}
 						}
						//5
						else if(answers.get(4) == 3) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
					}
				}
				//3
				else if(answers.get(2) == 2) {
					//4
					if(answers.get(3) == 0) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6
							if(answers.get(5) == 0) {final_result = "Oracle / Oracle Machine Learning";}
							else if(answers.get(5) == 1) {final_result  = "MindsDB / MariaDB or PostgreSQL, Oracle / Oracle Machine Learning";}
						}
						//5
						else if(answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0 || answers.get(5) == 1) {final_result = "Oracle / Oracle Machine Learning";}
						}
					}
					//4
					else if(answers.get(3) == 1) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0 || answers.get(5) == 1) {final_result = "Oracle / Oracle Machine Learning";}
						}
					}
				}
			}
			//2
			else if(answers.get(1) == 1) {
				//3 
				if(answers.get(2) == 0 || (answers.get(2) == 3)) {
					//4 
					if(answers.get(3) == 0 || answers.get(3) == 1) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite.";}
							}
						}
					}
				}
				//3
				else if(answers.get(2) == 1) {
					//4
					if(answers.get(3) == 0) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6
							if(answers.get(5) == 0) {final_result = "MindsDB / PostgreSQL";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "MindsDB / MariaDB or PostgreSQL";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite, MindsDB / MariaDB or PostgreSQL";}
							}
						}
						//5
						else if(answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
					//4
					else if(answers.get(3) == 1) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1  || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
				}
				//3
				else if(answers.get(2) == 2) {
					//4
					if(answers.get(3) == 0) {
						//5 
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6
							if(answers.get(5) == 0) {final_result = "MindsDB / PostgreSQL, Oracle / Oracle Machine Learning";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "MindsDB / MariaDB or PostgreSQL, Oracle / Oracle Machine Learning";}
								else if(answers.get(6) == 1) {final_result = "Any - Python / SQLite, MindsDB / Maria DB or PostgreSQL, Oracle / Oracle Machine Learning";}
							}
						}
						//5
						else if(answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "Oracle / Oracle Machine Learning";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "Oracle / Oracle Machine Learning";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite, Oracle / Oracle Machine Learning";}
							}
						}
					}
					//4
					else if(answers.get(3) == 1) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "Oracle / Oracle Machine Learning";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "Oracle / Oracle Machine Learning";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite, Oracle / Oracle Machine Learning";}
							}
						}
					}
				}
			}
		}
		//1
		else if (answers.get(0) == 1) {
			//2
			if(answers.get(1) == 0) {
				//3
				if(answers.get(2) == 0) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
				//3
				else if(answers.get(2) == 1 || answers.get(2) == 2 || answers.get(2) == 3) {
					//4
					if(answers.get(3) == 0) {
						//5 
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6
							if(answers.get(5) == 0 || answers.get(5) == 1) {final_result = "MindsDB / PostgreSQL";}
						}
						//5
						else if(answers.get(4) == 3) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
					}
					//4
					if(answers.get(3) == 1) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
				}
			}
			//2
			else if(answers.get(1) == 1) {
				//3
				if(answers.get(2) == 0 || answers.get(2) == 3) {
					//4
					if(answers.get(3) == 0 || answers.get(3) == 1) {
						//5 
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
				}
				//3
				else if(answers.get(2) == 1 || answers.get(2) == 2) {
					//4
					if(answers.get(3) == 0) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6
							if(answers.get(5) == 0) {final_result = "MindsDB / PostgreSQL";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "MindsDB / PostgreSQL";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite, MindsDB / PostgreSQL";}
								
							}
						}
						//5
						else if(answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result  = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
					//4
					else if(answers.get(3) == 1) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result  = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
				}
			}
		}
		//1
		else if(answers.get(0) == 2) {
			//2
			if(answers.get(1) == 0) {
				//3
				if(answers.get(2) == 0) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
				//3
				else if(answers.get(2) == 1 || answers.get(2) == 2 || answers.get(2) == 3) {
					//4
					if(answers.get(3) == 0) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6 
							if(answers.get(5) == 0) {final_result = "MindsDB / PostgreSQL";}
							else if(answers.get(5) == 1) {final_result = "MindsDB / MariaDB or PostgreSQL";}
						}
						//5
						else if(answers.get(4) == 3) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
					}
					//4
					else if(answers.get(3) == 1) {final_result = "Unfortunately, none of the here analyzed solutions are compatible with your needs.";}
				}
					
			}
			//2
			else if(answers.get(1) == 1) {
				//3
				if(answers.get(2) == 0 || answers.get(2) == 3) {
					//4
					if(answers.get(3) == 0 || answers.get(3) == 1) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							//6
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
				}
				//3
				else if(answers.get(2) == 1 || answers.get(2) == 2 ) {
					//4
					if(answers.get(3) == 0) {
						//5
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2) {
							//6
							if(answers.get(5) == 0) {final_result = "MindsDB / PostgreSQL";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "MindsDB / MariaDB or PostgreSQL";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite, MindsDB - MariaDB or PostgreSQL";}
							}
						}
						//5
						else if(answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							else if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
					//4
					else if(answers.get(3) == 1) {
						//5 
						if(answers.get(4) == 0 || answers.get(4) == 1 || answers.get(4) == 2 || answers.get(4) == 3) {
							//6
							if(answers.get(5) == 0) {final_result = "None. Unless you can take a bit longer to reach your predictions, then Python / SQLite.";}
							if(answers.get(5) == 1) {
								//7
								if(answers.get(6) == 0) {final_result = "None. Unless you're willing to do manual optimization by yourself with the help of Python / SQLite.";}
								else if(answers.get(6) == 1) {final_result = "Python / SQLite";}
							}
						}
					}
				}
			}
		}
		
		
		
		return final_result;
	}
}
