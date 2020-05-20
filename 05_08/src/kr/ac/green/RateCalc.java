package kr.ac.green;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RateCalc extends JFrame {
	private JLabel lblMoney;
	private JTextField tfInput;
	private JButton btnCalc;
	private JTextField tfOutput;
	
	public RateCalc(){
			init();
			setDisPlay();
			showFrame();
		
	}
	         
	public void init() {
	      lblMoney  =  new JLabel("원금을 입력하시오");
	
	
	}
	      
	      
	      private void showFrame() {
	  		setTitle("이자 계산기");
	  		pack();
	  		setLocation(400,0);
	  		setDefaultCloseOperation(EXIT_ON_CLOSE);
	  		setVisible(true);
	  		
	  	}
	  public static void main(String[] args) {
		       new RateCalc();
		
	}
	}