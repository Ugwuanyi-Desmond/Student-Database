package studentDatabase;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentDatabase {

	private JFrame frame;
	private JTextField txtRegNumber;
	private JTextField txtFName;
	private JTextField txtSurname;
	private JTextField txtMicroProcessors;
	private JTextField txtCommunication;
	private JTextField txtDigElectronics;
	private JTextField txtAutomation;
	private JTextField txtSWEngr;
	private JTextField txtControlEngr;
	private JTextField txtNetworkEngr;
	private JTextField txtAverage;
	private JTextField txtRobotics;
	private JTextField txtTotalScore;
	private JTextField txtRanking;
	private JTextField txtSerialNumber;
	private JTextField txtGP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDatabase window = new StudentDatabase();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDatabase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(0, 0, 1360, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(102, 204, 204));
		panel1.setBorder(new LineBorder(new Color(102, 153, 153), 10));
		panel1.setBounds(10, 11, 875, 637);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reg. Number:");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel.setBounds(38, 47, 110, 36);
		panel1.add(lblNewLabel);
		
		txtRegNumber = new JTextField();
		txtRegNumber.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtRegNumber.setBounds(196, 47, 201, 36);
		panel1.add(txtRegNumber);
		txtRegNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_1.setBounds(38, 94, 110, 36);
		panel1.add(lblNewLabel_1);
		
		txtFName = new JTextField();
		txtFName.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtFName.setColumns(10);
		txtFName.setBounds(196, 94, 201, 36);
		panel1.add(txtFName);
		
		JLabel lblNewLabel_2 = new JLabel("Surname:");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_2.setBounds(38, 141, 110, 36);
		panel1.add(lblNewLabel_2);
		
		txtSurname = new JTextField();
		txtSurname.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtSurname.setColumns(10);
		txtSurname.setBounds(196, 141, 201, 36);
		panel1.add(txtSurname);
		
		JLabel lblNewLabel_3 = new JLabel("MicroProcessors:");
		lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_3.setBounds(451, 47, 160, 36);
		panel1.add(lblNewLabel_3);
		
		txtMicroProcessors = new JTextField();
		txtMicroProcessors.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtMicroProcessors.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtMicroProcessors.setColumns(10);
		txtMicroProcessors.setBounds(637, 48, 201, 36);
		panel1.add(txtMicroProcessors);
		
		JLabel lblNewLabel_4 = new JLabel("Communication:");
		lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4.setBounds(451, 93, 160, 36);
		panel1.add(lblNewLabel_4);
		
		txtCommunication = new JTextField();
		txtCommunication.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtCommunication.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtCommunication.setColumns(10);
		txtCommunication.setBounds(637, 95, 201, 36);
		panel1.add(txtCommunication);
		
		JLabel lblNewLabel_5 = new JLabel("Digital Electronics:");
		lblNewLabel_5.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_5.setBounds(451, 140, 160, 36);
		panel1.add(lblNewLabel_5);
		
		txtDigElectronics = new JTextField();
		txtDigElectronics.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtDigElectronics.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtDigElectronics.setColumns(10);
		txtDigElectronics.setBounds(637, 142, 201, 36);
		panel1.add(txtDigElectronics);
		
		JLabel lblNewLabel_6 = new JLabel("Automation:");
		lblNewLabel_6.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_6.setBounds(451, 187, 160, 36);
		panel1.add(lblNewLabel_6);
		
		txtAutomation = new JTextField();
		txtAutomation.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtAutomation.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtAutomation.setColumns(10);
		txtAutomation.setBounds(637, 188, 201, 36);
		panel1.add(txtAutomation);
		
		JLabel lblNewLabel_7 = new JLabel("SW Engineering:");
		lblNewLabel_7.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_7.setBounds(451, 234, 160, 36);
		panel1.add(lblNewLabel_7);
		
		txtSWEngr = new JTextField();
		txtSWEngr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtSWEngr.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtSWEngr.setColumns(10);
		txtSWEngr.setBounds(637, 235, 201, 36);
		panel1.add(txtSWEngr);
		
		JLabel lblNewLabel_8 = new JLabel("Control Engr:");
		lblNewLabel_8.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_8.setBounds(451, 281, 160, 36);
		panel1.add(lblNewLabel_8);
		
		txtControlEngr = new JTextField();
		txtControlEngr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtControlEngr.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtControlEngr.setColumns(10);
		txtControlEngr.setBounds(637, 282, 201, 36);
		panel1.add(txtControlEngr);
		
		JLabel lblNewLabel_9 = new JLabel("Network Engr:");
		lblNewLabel_9.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_9.setBounds(451, 328, 160, 36);
		panel1.add(lblNewLabel_9);
		
		txtNetworkEngr = new JTextField();
		txtNetworkEngr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtNetworkEngr.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtNetworkEngr.setColumns(10);
		txtNetworkEngr.setBounds(637, 329, 201, 36);
		panel1.add(txtNetworkEngr);
		
		JLabel lblNewLabel_10 = new JLabel("Average:");
		lblNewLabel_10.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_10.setBounds(451, 469, 160, 36);
		panel1.add(lblNewLabel_10);
		
		txtAverage = new JTextField();
		txtAverage.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtAverage.setEditable(false);
		txtAverage.setColumns(10);
		txtAverage.setBounds(637, 470, 201, 36);
		panel1.add(txtAverage);
		
		JLabel lblNewLabel_11 = new JLabel("Robotics:");
		lblNewLabel_11.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_11.setBounds(451, 375, 160, 36);
		panel1.add(lblNewLabel_11);
		
		txtRobotics = new JTextField();
		txtRobotics.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				StudentRegNumOnly iNum = new StudentRegNumOnly();
				iNum.numbersOnly(e);
			}
		});
		txtRobotics.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtRobotics.setColumns(10);
		txtRobotics.setBounds(637, 376, 201, 36);
		panel1.add(txtRobotics);
		
		JLabel lblNewLabel_12 = new JLabel("Total Score:");
		lblNewLabel_12.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_12.setBounds(451, 422, 160, 36);
		panel1.add(lblNewLabel_12);
		
		txtTotalScore = new JTextField();
		txtTotalScore.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtTotalScore.setEditable(false);
		txtTotalScore.setColumns(10);
		txtTotalScore.setBounds(637, 422, 201, 36);
		panel1.add(txtTotalScore);
		
		JLabel lblNewLabel_13 = new JLabel("Ranking:");
		lblNewLabel_13.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_13.setBounds(451, 563, 160, 36);
		panel1.add(lblNewLabel_13);
		
		txtRanking = new JTextField();
		txtRanking.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtRanking.setEditable(false);
		txtRanking.setColumns(10);
		txtRanking.setBounds(637, 564, 201, 36);
		panel1.add(txtRanking);
		
		JLabel lblNewLabel_14 = new JLabel("Serial No:");
		lblNewLabel_14.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_14.setBounds(38, 234, 110, 36);
		panel1.add(lblNewLabel_14);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtSerialNumber.setColumns(10);
		txtSerialNumber.setBounds(196, 234, 201, 36);
		panel1.add(txtSerialNumber);
		
		JLabel lblNewLabel_15 = new JLabel("Gender:");
		lblNewLabel_15.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_15.setBounds(38, 281, 110, 36);
		panel1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Date of Birth:");
		lblNewLabel_16.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_16.setBounds(38, 328, 110, 36);
		panel1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_16_1 = new JLabel("Level:");
		lblNewLabel_16_1.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_16_1.setBounds(38, 187, 110, 36);
		panel1.add(lblNewLabel_16_1);
		
		JComboBox comboLevel = new JComboBox();
		comboLevel.setModel(new DefaultComboBoxModel(new String[] {"Select Level", "100 Level", "200 Level", "300 Level", "400 Level", "500 Level"}));
		comboLevel.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		comboLevel.setBounds(196, 188, 201, 35);
		panel1.add(comboLevel);
		
		JLabel lblNewLabel_16_2 = new JLabel("Address:");
		lblNewLabel_16_2.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_16_2.setBounds(38, 375, 110, 36);
		panel1.add(lblNewLabel_16_2);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtAddress.setBounds(196, 381, 201, 171);
		panel1.add(txtAddress);
		
		JComboBox comboGender = new JComboBox();
		comboGender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female"}));
		comboGender.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		comboGender.setBounds(196, 281, 201, 32);
		panel1.add(comboGender);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dateChooser.setBounds(196, 328, 201, 36);
		panel1.add(dateChooser);
		
		JLabel lblNewLabel_13_1 = new JLabel("Grade Point:");
		lblNewLabel_13_1.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_13_1.setBounds(451, 516, 160, 36);
		panel1.add(lblNewLabel_13_1);
		
		txtGP = new JTextField();
		txtGP.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		txtGP.setEditable(false);
		txtGP.setColumns(10);
		txtGP.setBounds(637, 517, 201, 36);
		panel1.add(txtGP);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new LineBorder(new Color(102, 153, 153), 10));
		panel3.setBackground(new Color(102, 204, 204));
		panel3.setBounds(895, 11, 455, 637);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		
		JTextArea txtTranscript = new JTextArea();
		txtTranscript.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtTranscript.setBounds(21, 21, 413, 569);
		panel3.add(txtTranscript);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(102, 153, 153), 10));
		panel_2.setBackground(new Color(102, 204, 204));
		panel_2.setBounds(10, 659, 1340, 87);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double[] R = new double[14]; 
				
				R[0] = Double.parseDouble(txtMicroProcessors.getText());
				R[1] = Double.parseDouble(txtCommunication.getText());
				R[2] = Double.parseDouble(txtDigElectronics.getText());
				R[3] = Double.parseDouble(txtAutomation.getText());
				R[4] = Double.parseDouble(txtSWEngr.getText());
				R[5] = Double.parseDouble(txtControlEngr.getText());
				R[6] = Double.parseDouble(txtNetworkEngr.getText());
				R[7] = Double.parseDouble(txtRobotics.getText());
				
				R[8] = R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7];
				R[9] = R[8]/8;
				
				String Total = String.format("%.0f", R[8]);
				txtTotalScore.setText(Total);
				
				String Average = String.format("%.0f", R[9]);
				txtAverage.setText(Average);

				R[10] = R[9]/20;
				if(R[10] >= 4.50)
				{
					String Rank = "First Class";
					txtRanking.setText(Rank);
				}
				
				else if(R[10] >= 3.50 && R[10] < 4.50)
				{
					String Rank = "Second Class Upper";
					txtRanking.setText(Rank);
				}
				
				else if(R[10] >= 2.50 && R[10] < 3.50)
				{
					String Rank = "Second Class Lower";					
					txtRanking.setText(Rank);
				}
				
				else 
				{
					String Rank = "Third Class";
				}
				
				String GP = String.format("%.2f", R[10]);
				txtGP.setText(GP);
				
				if(R[0] > 100 || R[0] < 0)
				{
					txtMicroProcessors.setText("");
					txtMicroProcessors.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");
					txtRanking.setText("");
					txtGP.setText("");
				}
				if(R[1] > 100 || R[1] < 0)
				{
					txtCommunication.setText("");
					txtCommunication.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");
					txtRanking.setText("");
					txtGP.setText("");
				}
				if(R[2] > 100 || R[2] < 0)
				{
					txtDigElectronics.setText("");
					txtDigElectronics.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");					
					txtRanking.setText("");
					txtGP.setText("");
				}
				if(R[3] > 100 || R[3] < 0)
				{
					txtAutomation.setText("");
					txtAutomation.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");
					txtGP.setText("");
					txtRanking.setText("");
				}
				if(R[4] > 100 || R[4] < 0)
				{
					txtSWEngr.setText("");
					txtSWEngr.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");
					txtGP.setText("");
					txtRanking.setText("");
				}
				if(R[5] > 100 || R[5] < 0)
				{
					txtControlEngr.setText("");
					txtControlEngr.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");
					txtGP.setText("");
					txtRanking.setText("");
				}
				if(R[6] > 100 || R[6] < 0)
				{
					txtNetworkEngr.setText("");
					txtNetworkEngr.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");
					txtGP.setText("");
					txtRanking.setText("");
				}
				if(R[7] > 100 || R[7] < 0)
				{
					txtRobotics.setText("");
					txtRobotics.requestFocus();
					txtAverage.setText("");
					txtTotalScore.setText("");
					txtGP.setText("");
					txtRanking.setText("");
				}

			}
		});
		btnResult.setFocusable(false);
		btnResult.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnResult.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.CYAN, null));
		btnResult.setBounds(80, 24, 119, 40);
		panel_2.add(btnResult);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTranscript.setText("");
				txtTranscript.append("Student Result Recording System\n"
				+"=====================================\n"
				+"Reg. Number: \t\t"+txtRegNumber.getText()
				+"\nFirst Name: \t\t"+txtFName.getText()
				+"\nSurname: \t\t"+txtSurname.getText()
				+"\nLevel: \t\t\t"+comboLevel.getSelectedItem()
				+"\nMicroProcessors: \t"+txtMicroProcessors.getText()
				+"\nCommunication: \t\t"+txtCommunication.getText()
				+"\nDigital Electronics: \t"+txtDigElectronics.getText()
				+"\nAutomation: \t\t"+txtAutomation.getText()
				+"\nSoftware Engineering: \t"+txtSWEngr.getText()
				+"\nControl Engineering: \t"+txtControlEngr.getText()
				+"\nNetwork Engineering: \t"+txtNetworkEngr.getText()
				+"\nRobotics: \t\t"+txtRobotics.getText()
				+"\n====================================="
				+"\nTotal Score: \t\t"+txtTotalScore.getText()
				+"\nAverage: \t\t"+txtAverage.getText()
				+"\nGrade Point: \t\t"+txtGP.getText()
				+"\nRanking: \t\t"+txtRanking.getText()
				
				);
			}
		});
		btnTranscript.setFocusable(false);
		btnTranscript.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnTranscript.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.CYAN, null));
		btnTranscript.setBounds(343, 24, 119, 40);
		panel_2.add(btnTranscript);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Printing in Progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				try
				{
					txtTranscript.print();
				}
				catch(java.awt.print.PrinterException awt)
				{
					System.err.format("No Printer Found", awt.getMessage());
				}
			}
		});
		btnPrint.setFocusable(false);
		btnPrint.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnPrint.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.CYAN, null));
		btnPrint.setBounds(611, 24, 119, 40);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFocusable(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Exit?", "Student Database", JOptionPane.YES_NO_OPTION);
			
						if (i == 0)
						{
							System.exit(0);
						}
			
			}
		});
		btnExit.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnExit.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.CYAN, null));
		btnExit.setBounds(1157, 24, 119, 40);
		panel_2.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtRegNumber.setText(null);
				txtFName.setText(null);
				txtSurname.setText(null);
				comboLevel.setSelectedIndex(0);
				txtSerialNumber.setText(null);
				comboGender.setSelectedIndex(0);
				dateChooser.setDate(null);
				txtAddress.setText(null);
				
				txtMicroProcessors.setText(null);
				txtCommunication.setText(null);
				txtDigElectronics.setText(null);
				txtAutomation.setText(null);
				txtSWEngr.setText(null);
				txtControlEngr.setText(null);
				txtNetworkEngr.setText(null);
				txtRobotics.setText(null);
				txtTotalScore.setText(null);
				txtAverage.setText(null);
				txtGP.setText("");
				txtRanking.setText(null);

				txtTranscript.setText(null);
			}
		});
		btnReset.setFocusable(false);
		btnReset.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		btnReset.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.CYAN, null));
		btnReset.setBounds(872, 24, 119, 40);
		panel_2.add(btnReset);
	}
}
