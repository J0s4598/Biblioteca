package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibirUsuario2;

public class ControlExibirUsuario {
	
	public ControlExibirUsuario(){
		//Criando o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Recuperar todos os usuario
		ArrayList<Usuario> usuario = bds.getUsuarios();
		
		//Exibir todos os Usuario
		String s2 = "";
		
		for (int i = 0; i < usuario.size(); i++) {
			s2 = s2 + "-----------\n" + usuario.get(i);
		}
		
		ViewExibirUsuario2 veu2 = new ViewExibirUsuario2(s2);
	}

}
