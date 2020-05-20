package kr.ac.green;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComponentEx1My extends JFrame{
	private JLabel lbl;
	
	public ComponentEx1My () {
		
		lbl = new JLabel(new ImageIcon("YO.jpg"));
		lbl.setText("연우임");
		
		lbl.setHorizontalTextPosition(JLabel.CENTER);
		lbl.setVerticalTextPosition(JLabel.BOTTOM);

		lbl.setToolTipText("연우입니다.");
		
		
		//패널에 부착된 버튼 설정
		JPanel pnlSouth = new JPanel();
		//패널 배경색상 변경
		pnlSouth.setBackground(Color.WHITE);
		//버튼생성
		JButton btnGood = new JButton(new ImageIcon("icon2.png"));
		
		btnGood.setRolloverIcon(new ImageIcon("icon1.png"));
		
		btnGood.setPressedIcon(new ImageIcon("icon3.png"));
		
		
		btnGood.setText("좋아요");
		btnGood.setHorizontalTextPosition(JButton.CENTER);
		btnGood.setVerticalTextPosition(JButton.BOTTOM);
		pnlSouth.add(btnGood);
		
		
		
		//부착	  
		add(lbl,BorderLayout.CENTER);
		add(pnlSouth,BorderLayout.SOUTH);
		
		setTitle("ComponenetEx1My");
		pack();
		//setSize(400,300);
		setLocation(100,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		 new ComponentEx1My();
		
	}
}
