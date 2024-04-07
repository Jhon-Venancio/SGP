package br.com.viertech.sgp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.viertech.sgp.model.Usuario;

public class UsuarioDao extends Usuario{
	
	public List<Usuario> listarUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement smt = con.prepareStatement("Select * from tblUsuario");
			ResultSet rs = smt.executeQuery();
			
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setNome(rs.getString("nome"));
				u.setTelefone(rs.getString("telefone"));
				u.setEmail(rs.getString("email"));
				u.setIdSetor(rs.getInt("FK_idSetor"));
				u.setIdFuncao(rs.getInt("FK_idFuncao"));
				u.setIdNvAcesso(rs.getInt("FK_idNvAcesso"));
				u.setStatus(rs.getString("status"));
				
				usuarios.add(u);
			}
			rs.close();
			smt.close();
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return usuarios;
	}
}
