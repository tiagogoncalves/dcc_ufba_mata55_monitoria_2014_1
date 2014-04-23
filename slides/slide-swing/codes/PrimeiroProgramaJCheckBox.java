package br.ufba.mata55;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class PrimeiroPrograma extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	public PrimeiroPrograma() {
		setTitle("Meu primeiro programa");
		setResizable(false);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("442px:grow"),},
			new RowSpec[] {
				RowSpec.decode("29px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel, "1, 1, fill, top");
		
		JLabel lblNewLabel = new JLabel("Nome:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel.add(passwordField);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel_1, "1, 3, fill, fill");
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JLabel lblSexo = new JLabel("Sexo:");
		panel_2.add(lblSexo);
		
		JCheckBox chckbxMasculino = new JCheckBox("Masculino");
		panel_2.add(chckbxMasculino);
		
		JCheckBox chckbxFeminino = new JCheckBox("Feminino");
		panel_2.add(chckbxFeminino);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setRows(3);
		textArea.setColumns(39);
		scrollPane.setViewportView(textArea);
		
		JLabel lblDescricao = new JLabel("Descricao:");
		scrollPane.setColumnHeaderView(lblDescricao);
		
		JButton btnSalvar = new JButton("Salvar");
		panel_1.add(btnSalvar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
