package control;

import javax.swing.JOptionPane;

import model.BDSimulado;
import view.ViewPrincipal;

public class ControlPrincipal {
	//Atributos
	private BDSimulado bds;
	private ViewPrincipal vp;
	private ControlExibirEmprestimo cee;
	private ControlePesquisaUsuario cpu;
	private ControlUsuario cu;
	
	//Metodo construtor
	public ControlPrincipal(){
		//Instanciar o objeto BDSimulado
		this.bds = new BDSimulado();
		//Instanciar a ViewPrincipal
		this.vp = new ViewPrincipal();
		//Criar controles
		this.cee = new ControlExibirEmprestimo(bds);
		this.cpu = new ControlePesquisaUsuario(bds);
		this.cu = new ControlUsuario(bds);
		
		//exibir a janela de opcao pela primeira vez
		tratarOpcao(this.vp.getOpcao());
	}
	
	//Metodo para tratar a opcao do usuario
	public void tratarOpcao(String opcao){
		while(true){
			switch(opcao){
			case "1": this.cu.cadastraUsuario();
							break;
		    
			case "2": this.cpu.pesquisarUsuario();
							break;
							
			case "3": this.cee.exibirEmprestimos();
			  				break;
							
			case "4": JOptionPane.showMessageDialog(null, "Até breve!");
		      return;

	default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido!");
		     break;				
			}
			
			//exibir a janela de opcoes
			opcao = this.vp.getOpcao();
		}
	}
	

}
