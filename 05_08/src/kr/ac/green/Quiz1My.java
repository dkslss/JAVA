package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz1My extends JFrame {

	
	public Quiz1My() {
		//���̺����
		JLabel lblText = new JLabel(
				"�ڹ����ڿ� ���Ű��� ȯ���մϴ�. ���ڸ� ������.", JLabel.CENTER);
		JButton btnCombo = new JButton("�޺�����");
		JButton btnPotato = new JButton("�������� ����");
		JButton btnBul = new JButton("�Ұ������");
		
		
		
		
		//�гλ��� 
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBackground(Color. cyan);
		pnlSouth.add(btnCombo);
		pnlSouth.add(btnPotato);
		pnlSouth.add(btnBul);
		
		//����
		add(lblText,BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
		
		//extends JFrame
		setTitle("Quiz1My");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
}
	
	

	public static void main(String[] args) {
		new Quiz1My();
		
		
	}
}
