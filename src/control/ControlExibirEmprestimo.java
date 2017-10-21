package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;
import view.ViewExibirEmprestimo;
import view.ViewExibirEmprestimoString;

public class ControlExibirEmprestimo {
	
	public ControlExibirEmprestimo(){
		//Criando o BDSimulado
		BDSimulado bds = new BDSimulado();
		
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
