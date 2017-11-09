package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;
import view.ViewExibirEmprestimoString;

public class ControlExibirEmprestimo {
	//Atributo
	private BDSimulado bds;
	
		public ControlExibirEmprestimo(BDSimulado bds){
			//guardar o bdSimulado
			this.bds = bds;
		}
				
		//Metodo que exibe todos os emprestimos
		public void exibirEmprestimos(){
			
			
			//Recuperar todos os emprestimos
			ArrayList<Emprestimo> emprestimos = bds.getEmprestimo();
		
			//exibir todos os empestimos
			/*ViewExibirEmprestimo vee = new ViewExibirEmprestimo(emprestimos);*/
		
		
			//Exibir todos os emprestimos usando outra classe
			String s = "";
		
			for (int i = 0; i < emprestimos.size(); i++) {
				s = s + "------------\n" + emprestimos.get(i);
		}
		
			ViewExibirEmprestimoString vees = new ViewExibirEmprestimoString(s); 
		

	}

}
