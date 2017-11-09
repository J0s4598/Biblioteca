 package control;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibirUsuario;
import view.ViewSolicitaMatricula;

public class ControlePesquisaUsuario {
	//Atributos
	private BDSimulado bds;
	
	public ControlePesquisaUsuario(BDSimulado bds){
		//guardar o bdSimulado
		this.bds = bds;
			}
					
		//Metodo que exibe todos os Usuario
		public void pesquisarUsuario(){

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
