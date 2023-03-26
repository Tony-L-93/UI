package Git_CI_UI.UI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldWindow {

	public JFrame frame;
	
	public HelloWorldWindow() {
		
	}
	
	public void intialize(boolean bool) {
		frame = new JFrame();
		frame.setBounds(250, 250, 250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel(String.valueOf(bool));
		label.setBounds(150, 150, 150, 150);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
	}
}
