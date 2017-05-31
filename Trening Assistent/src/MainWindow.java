import java.awt.Dimension;

import javax.swing.*;

public class MainWindow extends JFrame{

	public MainWindow(){
		setSize(600,600);
		setTitle("Trening Assistant");
		JButton button = new JButton("Pokaz Date");
		add(button);
	}
	public static void main(String[] args) {
		
		MainWindow mainWindow = new MainWindow();
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
	}

}
