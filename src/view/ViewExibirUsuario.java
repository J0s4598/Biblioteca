package view;

import javax.swing.JOptionPane;

import model.Usuario;

public class ViewExibirUsuario {
	
	public ViewExibirUsuario(Usuario usuario) {
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, usuario);
	}

}
