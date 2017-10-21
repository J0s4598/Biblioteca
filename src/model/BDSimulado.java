package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	//Atributo
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public BDSimulado() {
		//Criando livro
		Livro l1 = new Livro("Livro 1", "Autor 1", "Editora A", "2012", "123");
		Livro l2 = new Livro("Livro 2", "Autor 2", "Editora A", "2016", "456");
		Livro l3 = new Livro("Livro 3", "Autor 3", "Editora B", "2017", "789");
		//Adicionando livros
		this.livros.add(l1);
		this.livros.add(l2);
		this.livros.add(l3);
		
		//Criando Usurios
		Usuario u1 = new Usuario("João da Silva", "RA3434", "Direito");
		Usuario u2 = new Usuario("Maria Joaquina", "RA123", "Nutrição");
		//Add Us
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		
		//Craindo Bibliotecario
		Bibliotecario b1 = new Bibliotecario("Marcio", "123456");
		Bibliotecario b2 = new Bibliotecario("José", "654321");
		//Add Bt
		this.bibliotecarios.add(b1);
		this.bibliotecarios.add(b2);
		
		//Criando Emprestimos
		Emprestimo e1 = new Emprestimo(l1, u1, b1, LocalDate.of(2017, 10, 10), LocalDate.of(2017, 10, 15));
		Emprestimo e2 = new Emprestimo(l2, u2, b1, LocalDate.of(2017, 10, 11), LocalDate.of(2017, 10, 16));
		Emprestimo e3 = new Emprestimo(l1, u1, b1, LocalDate.of(2017, 10, 18), LocalDate.of(2017, 10, 23));
		//ADD Et
		this.emprestimos.add(e1);
		this.emprestimos.add(e2);
		this.emprestimos.add(e3);
		
	}	
		
		//recupera o ArrayList de emprestimo
	public ArrayList<Emprestimo> getEmprestimo(){
		
		return this.emprestimos;
	}
	
	//Retorna usuario de acordo com a matricula
	public Usuario getUsuarioPorMatricula(String matricula){
		Usuario retorno = null;
		
		//Percorrer a lista de usuario
		for (int i = 0; i < this.usuarios.size(); i++) {
			if (this.usuarios.get(i).getMatricula().equals(matricula)) {
				retorno = this.usuarios.get(i);
			}
		}
		return retorno;
	}
	
	
	

	
}
