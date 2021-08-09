import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("MyLogin UI ");
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();
		JButton bt1 = new JButton("Login");
		
		JLabel lb2 = new JLabel("Username");
		JLabel lb3 = new JLabel("Password");
		JLabel lb1 = new JLabel("Login");
	    lb1.setBounds(220,70, 50, 50);
	    lb2.setBounds(110,140,80,50);
	    lb3.setBounds(110,180,80,50);
	    tf1.setBounds(230,150,140,30);
	    tf2.setBounds(230,190,140,30);
	    
	    bt1.setBounds(200,250,80,50);
		
		
		frame.add(lb1); frame.add(tf1); frame.add(tf2); frame.add(lb2);
		frame.add(lb3); frame.add(bt1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
}
