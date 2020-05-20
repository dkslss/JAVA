package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz2My extends JFrame {
	private JLabel lblInfo;
	private JTextField tfInput;
	private JButton btnCalc;
	private JTextField tfOutput;

	public Quiz2My() {
		init();
		setDisPlay();
		showFrame();

	}

	private void init() {
		lblInfo = new JLabel("거리를 마일 단위로 입력하시오");
		tfInput = new JTextField(10);

		btnCalc = new JButton("변환");

		tfOutput = new JTextField(25);
		tfOutput.setText("비밀번호");
		tfOutput.setEditable(false);
		// tfOutput.setBackground(Color.WHITE);

	}

	// 배치
	// Panel은 배치만 하는거라 멤버변수로 만들 수있음
	private void setDisPlay() {
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(lblInfo);
		pnlNorth.add(tfInput);
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCalc);

		JPanel pnlSouth = new JPanel();
		pnlSouth.add(tfOutput);

		// 부착해야 보일 수있다.
		add(pnlNorth, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
	}

	private void showFrame() {
		setTitle("마일계산기");
		pack();
		setLocation(400, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Quiz2My();

	}
}