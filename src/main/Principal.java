package main;

import control.ControlExibirEmprestimo;
import control.ControlExibirUsuario;
import control.ControlePesquisaLivro;
import control.ControlePesquisaUsuario;

public class Principal {

	public static void main(String[] args) {
		//Cria objeo da ControleExibirEmprestimo
		ControlExibirEmprestimo cee = new ControlExibirEmprestimo();
		
		ControlePesquisaUsuario cpu = new ControlePesquisaUsuario();
		
		ControlePesquisaLivro cpl = new ControlePesquisaLivro();
		
		ControlExibirUsuario ceu = new ControlExibirUsuario();
		

	}

}
