package kr.ac.green;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * ctrl + s : save + compile
 * ctrl + f11 : run
 * alt + shift + x -> j : run
 * ctrl + m : â �ִ�ȭ, ����
 * ctrl + / : �ּ�ó��, ����
 */
public class HelloJava extends JFrame{
	private JLabel lbl;
	public HelloJava () {
		
		lbl = new JLabel(new ImageIcon("YO.jpg"));
		lbl.setText("������");
		
		lbl.setHorizontalTextPosition(JLabel.CENTER);
		lbl.setVerticalTextPosition(JLabel.BOTTOM);
		
		lbl.setToolTipText("�����Դϴ�.")
	
		JPanel pnlSouth = new JPanel();
		
	}
	
	public static void main(String[] args) {
		new HelloJava();
	}
}
