import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(750,750);
		f.setVisible(true);

		JPanel red = new JPanel();
		red.setBackground(Color.red);
		red.setBounds(0, 0, 250, 250);
		
		f.add(red);
        

		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		blue.setBounds(250, 0, 250, 250);
 
 	    f.add(blue);
 	    
 	   JPanel green = new JPanel();
		green.setBackground(Color.green);
		green.setBounds(0, 250, 500, 250);
		
		f.add(green);
		JLabel l = new JLabel();
		l.setText("HI");
		red.add(l);
		
		JLabel m = new JLabel();
		m.setText("HOW");
		blue.add(m);
		
		JLabel n = new JLabel();
		n.setText("ARE YOU!!");
		green.add(n);
	}

}
