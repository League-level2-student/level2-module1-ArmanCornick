package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton add;
	ArrayList<String> list;
	JButton view;
	GuestBook(){
		view = new JButton("view");
		add = new JButton("add");
		panel = new JPanel();
		frame = new JFrame();
		list = new ArrayList<String>();
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.pack();
		frame.setSize(200,200);
		frame.setVisible(true);
		add.addActionListener(this);
		view.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
			String name = JOptionPane.showInputDialog("Add person to list:");
			list.add(name);
		} else {
			JOptionPane.showMessageDialog(null, list);
		}

	}

}
