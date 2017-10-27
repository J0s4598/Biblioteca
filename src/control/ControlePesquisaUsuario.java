 package control;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibirUsuario;
import view.ViewSolicitaMatricula;

public class ControlePesquisaUsuario {
	
	public ControlePesquisaUsuario(){
		//Cria o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Criar View Para Solicitar a Matricula
		ViewSolicitaMatricula vsm = new ViewSolicitaMatricula();
		
		//Recuperando a matricula digitada pelo usuario
		String matricula = vsm.getMatricula();
		
		//retornar dados de usuario de acordo com matriculca
		Usuario usu = bds.getUsuarioPorMatricula(matricula);
		
		//Exibir os dados do usuario
		ViewExibirUsuario veu = new ViewExibirUsuario(usu);
	}

}
