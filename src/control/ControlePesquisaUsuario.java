package control;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibirUsuario;

public class ControlePesquisaUsuario {
	
	public ControlePesquisaUsuario(String matricula){
		//Cria o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//retornar dados de usuario de acordo com matriculca
		Usuario usu = bds.getUsuarioPorMatricula(matricula);
		
		//Exibir os dados do usuario
		ViewExibirUsuario veu = new ViewExibirUsuario(usu);
	}

}
