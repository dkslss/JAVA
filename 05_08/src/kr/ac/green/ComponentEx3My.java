package kr.ac.green;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
// 선택
public class ComponentEx3My extends JFrame {
	
	public ComponentEx3My(){
		
		setLayout(new GridLayout(1,0));
		
		JPanel pnlHobby = new JPanel(new GridLayout(0,1));
		pnlHobby.setBackground(Color.GRAY);
		
		String[] hobbys = {
			"낮잠", "서핑", "게임", "공부", "독서"	
		};
		/*
		 * JCheckBox : 다중선택
		 */
		JCheckBox[] chHobby = new JCheckBox[hobbys.length];
		for(int i=0; i<chHobby.length; i++) {
			chHobby[i] = new JCheckBox(hobbys[i]);
			chHobby[i].setBackground(Color.RED);
			pnlHobby.add(chHobby[i]);
		}
		
		chHobby[0].setSelected(true);
		
		JPanel pnlGrade = new JPanel(new GridLayout(0, 1));
		
		String[] names = {"A", "B", "C", "D"};
		JRadioButton[] rbtns = new JRadioButton[names.length];
		
		// 논리적인 그룹핑
		ButtonGroup group = new ButtonGroup();
		
		for(int i=0; i<names.length; i++) {
			rbtns[i] = new JRadioButton(names[i]);
			pnlGrade.add(rbtns[i]);
			rbtns[i].setBackground(Color.GREEN);
			group.add(rbtns[i]);
		}
		
		rbtns[0].setSelected(true);
		
		
		String[] menu = {"짜장면", "짬뽕", "탕수육", "칠리새우"};
		JComboBox<String> cbMenu  = new JComboBox<String>(menu); 
		JPanel pnlMenu = new JPanel();
		cbMenu.setBackground(Color.ORANGE);
		
		pnlMenu.add(cbMenu);
		
		//초기 선택
		cbMenu.setSelectedIndex(2);
		System.out.println(cbMenu.getSelectedItem());
		
		add(pnlHobby);
		add(pnlGrade);
		add(pnlMenu);
		
		setTitle("ComponentEx3");
		pack();
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		for(JCheckBox temp : chHobby) {
			System.out.println(temp.getText() + " : " + temp.isSelected());
		}
	}
	public static void main(String[] args) {
		new ComponentEx3My();
	}
}
