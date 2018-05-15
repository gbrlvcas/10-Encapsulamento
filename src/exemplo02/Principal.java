package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		//Enviar dados
		p.setNome("Gabriel");
		p.setIdade(21);
		
		//Obter dados
		System.out.println(p.getNome());
		System.out.println(p.getIdade());

	}

}
