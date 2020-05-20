package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz1My extends JFrame {

	
	public Quiz1My() {
		//레이블만들기
		JLabel lblText = new JLabel(
				"자바피자에 오신것을 환영합니다. 피자를 고르세요.", JLabel.CENTER);
		JButton btnCombo = new JButton("콤보피자");
		JButton btnPotato = new JButton("포테이토 피자");
		JButton btnBul = new JButton("불고기피자");
		
		
		
		
		//패널생성 
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBackground(Color. cyan);
		pnlSouth.add(btnCombo);
		pnlSouth.add(btnPotato);
		pnlSouth.add(btnBul);
		
		//부착
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
