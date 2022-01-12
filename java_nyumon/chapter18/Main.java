import java.io.*;
import java.awt.FlowLayout;
import javax.swing.*;


public class Main {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while (input != -1) {
			System.out.println((char) input);
			input = fr.read();
		}
		fr.close();

		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hello World!");
		JButton button = new JButton("押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);

	}
}