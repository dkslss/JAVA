package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyComponent6 extends JFrame {
	
	private JLabel lblInitMoney;
	private JLabel lblRate;
	private JTextField tfInitMoney;
	private JTextField tfRate;
	private JButton btnConvert;
	private JTextField tfOutput;
	private JPanel pnlTop;
	private JPanel pnlMid;
	private JPanel pnlBot;
	private JPanel pnlpnlLeft;
	private JPanel pnlpnlRight;
		
	public MyComponent6() {
		init();
		display();
		showFrame();
	}
	
	private void init() {
		lblInitMoney = new JLabel("원금을 입력하시오");
		lblRate = new JLabel("이자율을 입력하시오");
		tfInitMoney = new JTextField(6);
		tfRate = new JTextField(6);
		btnConvert = new JButton("변환");
		tfOutput = new JTextField(20);
		
		pnlTop = new JPanel();
		pnlMid = new JPanel();
		pnlBot = new JPanel();
		pnlpnlLeft = new JPanel();
		pnlpnlRight = new JPanel();
			
	}
		
	
	private void display() {
		
		pnlpnlLeft.setLayout(new GridLayout(0, 1, 0, 5));
		pnlpnlLeft.add(lblInitMoney);
		pnlpnlLeft.add(lblRate);
		
		pnlpnlRight.setLayout(new GridLayout(0, 1, 0, 5));
		pnlpnlRight.add(tfInitMoney);
		pnlpnlRight.add(tfRate);
		
		pnlTop.add(pnlpnlLeft);
		pnlTop.add(pnlpnlRight);
		
		pnlMid.add(btnConvert);
		
		pnlBot.add(tfOutput);
		tfOutput.setEditable(false);
		tfOutput.setBackground(Color.WHITE);
		
		add(pnlTop, BorderLayout.NORTH);
		add(pnlMid, BorderLayout.CENTER);
		add(pnlBot, BorderLayout.SOUTH);
		
	}
	
	
	
	private void showFrame() {
		setTitle("이자 계산기");
		pack();
		setLocation(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyComponent6();
	
	}

}
