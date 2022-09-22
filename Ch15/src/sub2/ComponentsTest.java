package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class ComponentsTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest frame = new ComponentsTest();
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
	public ComponentsTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(12, 10, 211, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("button 컴포넌트");
		lblNewLabel_1.setBounds(12, 43, 150, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(12, 79, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(110, 79, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "일반대화상자", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(207, 79, 97, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn4.setBounds(304, 79, 97, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(12, 125, 125, 30);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(12, 165, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(12, 195, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(12, 226, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lblTxtf1Result = new JLabel("결과 :");
		lblTxtf1Result.setBounds(249, 164, 102, 23);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 :");
		lblTxtf2Result.setBounds(249, 195, 102, 23);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 :");
		lblTxtf3Result.setBounds(249, 226, 102, 23);
		contentPane.add(lblTxtf3Result);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : "+txt);
			}
		});
		btntxtf1.setBounds(140, 164, 97, 23);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lblTxtf2Result.setText("결과 : "+txt);
			}
		});
		btntxtf2.setBounds(140, 194, 97, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lblTxtf3Result.setText("결과 : "+txt);
			}
		});
		btntxtf3.setBounds(140, 225, 97, 23);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 274, 116, 15);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(12, 295, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(73, 295, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(140, 295, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(207, 295, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(268, 295, 57, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(22, 324, 379, 15);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>(); 
				
				if(chk1.isSelected()) {
					list.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					list.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					list.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					list.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					list.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " + list);
			}
		});
		btnChk.setBounds(333, 295, 69, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_4.setBounds(12, 358, 125, 15);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rb1 = new JRadioButton("남자");
		rb1.setBounds(16, 379, 53, 23);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("여자");
		rb2.setBounds(84, 379, 53, 23);
		contentPane.add(rb2);

		JLabel lblRbResult = new JLabel("결과 :");
		lblRbResult.setBounds(22, 408, 175, 15);
		contentPane.add(lblRbResult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		JButton btnRb = new JButton("확인");
		btnRb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rb1.isSelected()) {
					lblRbResult.setText("결과 : 남자");
			}else {
					lblRbResult.setText("결과 : 여자");
				}
			}
		});
		btnRb.setBounds(156, 379, 69, 23);
		contentPane.add(btnRb);
		
	}
}
