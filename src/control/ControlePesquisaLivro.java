package control;

import model.BDSimulado;
import model.Livro;
import view.ViewExibirLivro;
import view.ViewSolicitaLivro;

public class ControlePesquisaLivro {
	
	public ControlePesquisaLivro(){
		//Cria o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Criar View para solicitar livro
		ViewSolicitaLivro vsl = new ViewSolicitaLivro();
		
		//Recuperando o livro digitado pelo usuario
		String livro = vsl.getLivro();
		
		//retornar dados
		Livro liv = bds.getPesquisaLivro(livro);
		
		//Exibir
		ViewExibirLivro vel = new ViewExibirLivro(liv);
	}

}
