package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Usuario;
import view.ViewCadastraUsuario;
import view.ViewExibirUsuario2;

public class ControlExibirUsuario {
	
	public ControlExibirUsuario(){
		//Criando o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Solicitar dados do usuario
		ViewCadastraUsuario vcu = new ViewCadastraUsuario();
		
		//Criar objeto usuario com os dados digitado
		Usuario usuario = new Usuario(vcu.getNome(), vcu.getMatricula(), vcu.getCurso());
		
		//colocar o usuario na lista de usuario
		bds.insereUsuario(usuario);
		
		//Recuperar todos os usuario
		ArrayList<Usuario> usuarios = bds.getUsuarios();
		
		//Exibir todos os Usuario
		String s2 = "";
		
		for (int i = 0; i < usuarios.size(); i++) {
			s2 = s2 + "-----------\n" + usuarios.get(i);
		}
		
		ViewExibirUsuario2 veu2 = new ViewExibirUsuario2(s2);
	}

}
