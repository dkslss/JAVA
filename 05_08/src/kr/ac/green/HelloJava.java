package kr.ac.green;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * ctrl + s : save + compile
 * ctrl + f11 : run
 * alt + shift + x -> j : run
 * ctrl + m : 창 최대화, 복원
 * ctrl + / : 주석처리, 해제
 */
public class HelloJava extends JFrame{
	private JLabel lbl;
	public HelloJava () {
		
		lbl = new JLabel(new ImageIcon("YO.jpg"));
		lbl.setText("연우임");
		
		lbl.setHorizontalTextPosition(JLabel.CENTER);
		lbl.setVerticalTextPosition(JLabel.BOTTOM);
		
		lbl.setToolTipText("연우입니다.")
	
		JPanel pnlSouth = new JPanel();
		
	}
	
	public static void main(String[] args) {
		new HelloJava();
	}
}
