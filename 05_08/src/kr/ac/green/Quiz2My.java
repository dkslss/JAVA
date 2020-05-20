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
		lblInfo = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
		tfInput = new JTextField(10);

		btnCalc = new JButton("��ȯ");

		tfOutput = new JTextField(25);
		tfOutput.setText("��й�ȣ");
		tfOutput.setEditable(false);
		// tfOutput.setBackground(Color.WHITE);

	}

	// ��ġ
	// Panel�� ��ġ�� �ϴ°Ŷ� ��������� ���� ������
	private void setDisPlay() {
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(lblInfo);
		pnlNorth.add(tfInput);
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCalc);

		JPanel pnlSouth = new JPanel();
		pnlSouth.add(tfOutput);

		// �����ؾ� ���� ���ִ�.
		add(pnlNorth, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
	}

	private void showFrame() {
		setTitle("���ϰ���");
		pack();
		setLocation(400, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Quiz2My();

	}
}