package view;

import java.util.ArrayList;

import model.Emprestimo;

public class ViewExibirEmprestimo {
	
	public ViewExibirEmprestimo(ArrayList<Emprestimo> emprestimos) {
		//Exibir todos emprestimos
		for (int i = 0; i < emprestimos.size(); i++) {
			//Imprimir no console
			System.out.println("----------");
			System.out.println("Titulo: " + emprestimos.get(i).getLivro().getTitulo());
			System.out.println("Autor: " + emprestimos.get(i).getLivro().getAutor());
			System.out.println("Usuario: " + emprestimos.get(i).getUsuario().getNome());
			/*System.out.println("Data de Retirda: " + emprestimos.get(i).getDataDeretirada());
			System.out.println("Data de Retirda: " + emprestimos.get(i).getDataDevolucao());*/
		}
	}

}
