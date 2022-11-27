package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class ActionListenerController {

	public static void btnALCloseFrame(JButton b, JFrame f) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
	}
	
	public static void btnALSetText(JButton b, JTextPane p, Object o) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setText((String) o);
			}
		});
	}
}
