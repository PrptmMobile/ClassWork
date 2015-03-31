package lesson150331.linked_list.anonymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UIExample {
	
	
	static class ButtonClickProcessor implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			System.out.println("It happened!");
		}
	}

	public static void main(final String[] args) {
		
		JFrame frame = new JFrame("Example");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 400);
		
//		frame.show();   // deprecated
		
//		JButton button = new JButton("Click me!");
//		
//		button.addActionListener(new ButtonClickProcessor());
//		
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(final ActionEvent e) {
//				System.out.println("Oh yeah!");
//			}
//		});
//		
//		frame.add(button);
		
		frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(final MouseEvent e) {
				System.out.println("released" + e);
			}
			
			@Override
			public void mousePressed(final MouseEvent e) {
				System.out.println("pressed");
			}
			
			@Override
			public void mouseExited(final MouseEvent e) {
				System.out.println("exited");
			}
			
			@Override
			public void mouseEntered(final MouseEvent e) {
				System.out.println("entered");
			}
			
			@Override
			public void mouseClicked(final MouseEvent e) {
				System.out.println("clicked");
			}
		});
		
		frame.setVisible(true);
		
	}
	
}
