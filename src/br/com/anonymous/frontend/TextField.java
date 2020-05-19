package br.com.anonymous.frontend;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextField extends JTextField {
	
	public TextField(int largura, int altura, String txt, Font font, Color background, Color foreground) {
		setSize(largura, altura);
		setText(txt);
		setFont(font);
		setBackground(background);
		setForeground(foreground);
		setBorder(null);
	}
}