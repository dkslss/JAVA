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
		lbl.setText("������");
		
		lbl.setHorizontalTextPosition(JLabel.CENTER);
		lbl.setVerticalTextPosition(JLabel.BOTTOM);

		lbl.setToolTipText("�����Դϴ�.");
		
		
		//�гο� ������ ��ư ����
		JPanel pnlSouth = new JPanel();
		//�г� ������ ����
		pnlSouth.setBackground(Color.WHITE);
		//��ư����
		JButton btnGood = new JButton(new ImageIcon("icon2.png"));
		
		btnGood.setRolloverIcon(new ImageIcon("icon1.png"));
		
		btnGood.setPressedIcon(new ImageIcon("icon3.png"));
		
		
		btnGood.setText("���ƿ�");
		btnGood.setHorizontalTextPosition(JButton.CENTER);
		btnGood.setVerticalTextPosition(JButton.BOTTOM);
		pnlSouth.add(btnGood);
		
		
		
		//����	  
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
