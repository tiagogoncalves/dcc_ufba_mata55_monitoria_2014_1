package br.ufba.mata55;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JCheckBox;

public class PrimeiroPrograma extends JFrame{
	private JTextField textField;
	public PrimeiroPrograma() {
		setTitle("Meu primeiro programa");
		setResizable(false);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("442px"),},
			new RowSpec[] {
				RowSpec.decode("29px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel, "1, 1, fill, top");
		
		JLabel lblNewLabel = new JLabel("Nome:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		panel.add(lblSexo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}