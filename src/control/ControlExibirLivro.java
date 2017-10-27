package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Livro;
import view.ViewCadastraLivro;
import view.ViewExibirLivro2;

public class ControlExibirLivro {
	
	public ControlExibirLivro(){
		//Criando o BDSimulado
		BDSimulado bds = new BDSimulado();
				
		//Solicitar dados do livro
		ViewCadastraLivro vcl = new ViewCadastraLivro();
		
		//Criar objeto livro com os dados digitado
		Livro livro = new Livro(vcl.getTitulo(), vcl.getAutor(), vcl.getEditora(), vcl.getAnoLancamento(), vcl.getISBM());
		
		//Colocar o livro na lista de livro
		bds.insereLivro(livro);
		
		//Recuperar todos os livro
		ArrayList<Livro> livros = bds.getLivros();
		
		//Exibir todos os Usuario
				String s3 = "";
				
				for (int i = 0; i < livros.size(); i++) {
					s3 = s3 + "-----------\n" + livros.get(i);
			}
				ViewExibirLivro2 vel2 = new ViewExibirLivro2(s3);
	}
}
