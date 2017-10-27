package view;

import javax.swing.JOptionPane;

public class ViewCadastraLivro {
	//Atributo
	private String titulo;
	private String autor;
	private String editora;
	private String anoLancamento;
	private String ISBM;
	
	//Metodo Construtor
	public ViewCadastraLivro(){
		//Titulo
		this.titulo = JOptionPane.showInputDialog("Digita o titulo do Livro:");
		
		//Autor
		this.autor = JOptionPane.showInputDialog("Digita o nome do Autor:");
		
		//Editora
		this.editora = JOptionPane.showInputDialog("Digita a editora do Livro:");
		
		//Ano de Lançamento
		this.anoLancamento = JOptionPane.showInputDialog("Digita o ano de lançamento do Livro:");
		
		//ISBM
		this.ISBM = JOptionPane.showInputDialog("Digita o ISBM do Livro:");
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public String getISBM() {
		return ISBM;
	}
	
	
	
	

}
