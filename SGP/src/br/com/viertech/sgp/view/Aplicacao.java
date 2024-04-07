package br.com.viertech.sgp.view;

import javax.swing.SwingUtilities;

import br.com.viertech.sgp.DAO.UsuarioDao;
import br.com.viertech.sgp.model.Usuario;

public class Aplicacao {
	public static void main(String[] args) {
//		frmLogin login = new frmLogin();
//		login.setVisible(true);
		UsuarioDao dao = new UsuarioDao();
		
		for(Usuario u : dao.listarUsuarios()) {
			System.out.println(u.toString());
		}
	}
}
