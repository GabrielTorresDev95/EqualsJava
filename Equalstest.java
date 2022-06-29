package Arrays1;

public class Equalstest {
	String nome;
	String email;
	
	//Declaração 2 variaveis para trabalhar com a interface main do equals2 como visto a cima.
	// utilizei o Padrão do equals e declarei um novo usuario fazendo uma "cast" com objeto;

	public boolean equals(Object objeto) {
		Usuario outro = (Usuario) objeto;
		
		boolean mesmoNome = outro.nome.equals(nome);
		boolean mesmoEmail = outro.email.equals(email);
		
		return mesmoNome && mesmoEmail;
	}                                           
}
