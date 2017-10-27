package model;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private String anoLancamento;
	private String ISBM;
	
	//Metodo Construtor
	public Livro(String titulo, String autor, String editora, String anoLancamento, String iSBM) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoLancamento = anoLancamento;
		ISBM = iSBM;
	}

	//Get e Set
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getISBM() {
		return ISBM;
	}
	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}

	//Metodo toString
		public String toString(){
			return "Nome do Titulo: " + this.titulo + "\n" + 
					"Nome do Autor: " + this.autor + "\n" + 
					"Editora: " + this.editora + "\n" + 
					"Ano de Lançamento: " + this.anoLancamento + "\n" + 
					"ISBM: " + this.ISBM + "\n";
		}
}
