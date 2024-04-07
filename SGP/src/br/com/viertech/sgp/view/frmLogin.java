package br.com.viertech.sgp.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class frmLogin extends JFrame{
	
	protected JPanel pnlRodape;
	protected JPanel pnlForm;
	
	// Login
	protected JLabel lblLogin;
	protected JTextField txtLogin;
	
	// Senha
	protected JLabel lblSenha;
	protected JPasswordField txtSenha;
	protected JButton btnVisualizarSenha;
	
	protected JLabel lblDataHora;
	
	public frmLogin() {
		this.initialize();
	}
	
	public JPanel getPnlRodape() {
		if(pnlRodape == null) {
			pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));
			
			lblDataHora= new JLabel("domingo, 7 de abril de 2024");
		}
		return pnlRodape;
	}	
	
	public JPanel getPnlForm() {
		if(pnlForm == null) {
			pnlForm = new JPanel(new FlowLayout(FlowLayout.CENTER));
			
			lblLogin = new JLabel("Login: ");
			txtLogin = new JTextField();
			lblSenha = new JLabel("Senha: ");
			txtSenha = new JPasswordField();
			btnVisualizarSenha = new JButton("Visualizar Senha");

			pnlForm.add(lblLogin);
			pnlForm.add(txtLogin);
			pnlForm.add(lblSenha);
			pnlForm.add(txtSenha);
			pnlForm.add(btnVisualizarSenha);
		}
		return pnlForm;
	}
	
	private void initialize() {
		this.setTitle("SGP - Sistema de Gerenciamento de Prestadores");
		this.setSize(640, 480);
		this.getContentPane().setLayout(new BorderLayout());
		
		this.getContentPane().add(getPnlForm(),BorderLayout.PAGE_START);
		this.getContentPane().add(getPnlRodape(),BorderLayout.PAGE_END);
		
	}
}
