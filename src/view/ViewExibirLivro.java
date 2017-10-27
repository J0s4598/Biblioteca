package view;

import javax.swing.JOptionPane;

import model.Livro;

public class ViewExibirLivro {
	
	public ViewExibirLivro(Livro livro){
		//Verificar se tem livro para encontra
		if (livro == null) {
			JOptionPane.showMessageDialog(null, "Livro não Existe");
		}else{
		//Exibir
		JOptionPane.showMessageDialog(null, livro);
	}

}
}