package exemplo01;

import javax.swing.JOptionPane;

public class IMC {
	
	/*
	DEFAULT  : Atributos e métodos são exibidos em todas as classes no mesmo pacote
	PUBLIC   : Atributos e métodos exibidos em todo o projeto
	PRIVATE  : Atributos e métodos exibir e métodos exibidos apenas na classe onde são criados
	PROTECTED: Atributos e métodos exibidos nas classes onde são criados ou herdados
	 */

	//Atributos
	double peso, altura;
	
	//Método para pedir o peso e a altura
	public void obterDdados(){
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		
	}
	
	//Método para realizar o cálculo de imc
	public double calculoIMC(){
		
		double resultado = peso / Math.pow(altura, 2);
		return resultado;
		
	}
	
	//Método para retornar a situação do imc
	public String situacaoIMC(){
		
		double resultado = calculoIMC();
		String situacao = "";
		
		if(resultado < 17) {
			situacao = "Muito abaixo do peso";
		}else if(resultado < 18.5){
			situacao = "Abaixo do peso";
		}else if(resultado < 25){
			situacao = "Peso normal";
		}else if(resultado < 30){
			situacao = "Acima do peso";
		}else if(resultado < 35){
			situacao = "Obesidade I";
		}else if(resultado < 40){
			situacao = "Obesidade II";
		}else{
			situacao = "Obesidade III";
		}
		
		return situacao;
	}
	
	//Método para exibir a situação do imc
	public void exibirdados(){
		String mensagem = "***IMC***\n\n";
			   mensagem+= "Seu imc é de "+String.format("%.2f", calculoIMC());
			   mensagem+= "\nSua situação é: "+situacaoIMC();
			   
			   JOptionPane.showMessageDialog(null, mensagem);
	}
	
	//Método void principal
	public void principal() {
		obterDdados();
		exibirdados();
	}
}
