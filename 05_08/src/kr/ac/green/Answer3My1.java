package kr.ac.green;

public class Answer3My1 extends JFrame {

	private JLabel lblMoney;
	private JTextField tfMoney;
	private JLabel lblRate;
	private JTextField tfRate;
	private JButton btnCalc;
	private JTextfield tfResult;
	
	public Answer3	My1() {
	    init();
	    setDisplay();
	    showFrame();
	} 
	public void init() {
		lblMoney = new JLabel("원금을 입력하시오", JLabel.LEFT);
		
	}
	
}
