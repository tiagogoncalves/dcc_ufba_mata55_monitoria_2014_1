package br.ufba.mata55;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeiroProgramaFlowLayout extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public PrimeiroProgramaFlowLayout() {
		setTitle("Meu primeiro programa");
		setResizable(false);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
