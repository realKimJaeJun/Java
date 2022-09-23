package sub3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;

public class MyCalculator extends JFrame {
	static JLabel label;
	static JLabel info;
	double result = 0;
	String math = "";
	double num = 0;
	String tostring = "";
	private JPanel contentPane;
	private JTextField txtfDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container MyCon = getContentPane();
		MyCon.setLayout(new BorderLayout(5, 5));
		MyCon.setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 318, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setLocationRelativeTo(null); // 화면 가운데 띄움
		setResizable(false);  // 사이즈 조절 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을때 실행중인 프로그램도 종료되도록 함
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		txtfDisp = new JTextField();
		txtfDisp.setEditable(false);
		txtfDisp.setFont(new Font("굴림", Font.BOLD, 22));
		txtfDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtfDisp.setText("0");
		txtfDisp.setBounds(12, 10, 275, 50);
		contentPane.add(txtfDisp);
		txtfDisp.setColumns(10);
		
		class UpPanel extends JPanel{
			public UpPanel() {
				setLayout(new GridLayout(3, 1));
				setBackground(Color.LIGHT_GRAY);
				info = new JLabel("");
				label = new JLabel("0");
				
				info.setFont(new Font("맑은 고딕", 0, 40));
				info.setForeground(Color.BLACK);
				info.setHorizontalAlignment(SwingConstants.RIGHT);
				
				add(info);
				add(label);
			}
		}
		
				JButton[] bt = new JButton[24];
				setLayout(new GridLayout(5, 4, 5, 5));
				setBackground(Color.DARK_GRAY);
		
				JButton btnPercent = new JButton("%");
				btnPercent.setBounds(12, 70, 60, 60);
				contentPane.add(btnPercent);
				
				JButton btnCent = new JButton("CE");
				btnCent.setBounds(84, 70, 60, 60);
				contentPane.add(btnCent);
				
				JButton btnClear = new JButton("C");
				btnClear.setBounds(156, 70, 60, 60);
				contentPane.add(btnClear);
				
				JButton btnBack = new JButton("←");
				btnBack.setBounds(228, 70, 60, 60);
				contentPane.add(btnBack);
				
				JButton btnDiv = new JButton("÷");
				btnDiv.setBounds(228, 140, 60, 60);
				contentPane.add(btnDiv);
				
				JButton btnFrac = new JButton("1/x");
				btnFrac.setBounds(12, 140, 60, 60);
				contentPane.add(btnFrac);
				
				JButton btn2Expo = new JButton("x²");
				btn2Expo.setBounds(84, 140, 60, 60);
				contentPane.add(btn2Expo);
				
				JButton btn2Root = new JButton("²√x");
				btn2Root.setBounds(156, 140, 60, 60);
				contentPane.add(btn2Root);
				
				JButton btnMulti = new JButton("×");
				btnMulti.setBounds(228, 210, 60, 60);
				contentPane.add(btnMulti);
				
				JButton btn7 = new JButton("7");
				btn7.setBounds(12, 210, 60, 60);
				contentPane.add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.setBounds(84, 210, 60, 60);
				contentPane.add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.setBounds(156, 210, 60, 60);
				contentPane.add(btn9);
				
				JButton btnMinus = new JButton("-");
				btnMinus.setBounds(228, 280, 60, 60);
				contentPane.add(btnMinus);
				
				JButton btn4 = new JButton("4");
				btn4.setBounds(12, 280, 60, 60);
				contentPane.add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.setBounds(84, 280, 60, 60);
				contentPane.add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.setBounds(156, 280, 60, 60);
				contentPane.add(btn6);
				
				JButton btnPlus = new JButton("+");
				btnPlus.setBounds(227, 350, 60, 60);
				contentPane.add(btnPlus);
				
				JButton btn1 = new JButton("1");
				btn1.setBounds(12, 350, 60, 60);
				contentPane.add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.setBounds(83, 350, 60, 60);
				contentPane.add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.setBounds(155, 350, 60, 60);
				contentPane.add(btn3);
				
				JButton btnNegat = new JButton("+/-");
				btnNegat.setBounds(12, 420, 60, 60);
				contentPane.add(btnNegat);
				
				JButton btn0 = new JButton("0");
				btn0.setBounds(84, 420, 60, 60);
				contentPane.add(btn0);
				
				JButton btnDec = new JButton(".");
				btnDec.setBounds(156, 420, 60, 60);
				contentPane.add(btnDec);
				
				JButton btnEqual = new JButton("=");
				btnEqual.setBounds(228, 420, 60, 60);
				contentPane.add(btnEqual);
				
		
		UpPanel UP = new UpPanel();
		MyCon.add(UP, BorderLayout.EAST);
		
				
	}
}
