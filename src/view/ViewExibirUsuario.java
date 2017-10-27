package view;

import javax.swing.JOptionPane;

import model.Usuario;

public class ViewExibirUsuario {
	
	public ViewExibirUsuario(Usuario usuario) {
		//verificar se tem usuario para mostra
		if (usuario == null) {
			JOptionPane.showMessageDialog(null, "Usuario não existe");
		}else{		
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, usuario);
	}


}
}