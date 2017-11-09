package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Usuario;
import view.ViewCadastraUsuario;
import view.ViewExibirListaUsuarios;

public class ControlUsuario {
	//Atrributo
	private BDSimulado bds;
	
	//Metodo construtor
	public ControlUsuario(BDSimulado bds){
		//Guardar o BDSimulado
		this.bds = bds;
	}
	
	//Metodo para Cadastra usuario
	public void cadastraUsuario(){
		
		//Solicitar dados do usuario
		ViewCadastraUsuario vcu = new ViewCadastraUsuario();
		
		//Criar objeto usuario com os dados digitados
		Usuario usuario = new Usuario(vcu.getNome(), vcu.getMatricula(), vcu.getCurso());
		
		//Colocar o usuario na lista de usuario
		this.bds.insereUsuario(usuario);
		
		//recuperar a lista de usuarios
		ArrayList<Usuario> usuarios = this.bds.getUsuarios();
		
		//Cria uma string representado todos os usuarios da lista
		String s = "";
		for (int i = 0; i < usuarios.size(); i++) {
			s = s + "-----------------\n" + usuarios.get(i);
		}
		
		//exibir a lista de usuario
		ViewExibirListaUsuarios velu = new ViewExibirListaUsuarios(s);
	}


}
