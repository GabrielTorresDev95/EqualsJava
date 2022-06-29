package Arrays1;

public class equals2 {
	public static void main(String[] args) {
		//Código de comparação de objetos com equals
		Usuario user = new Usuario();
		user.nome = "Gabriel Torres";
		user.email = "gabriel.almeida95@gmail.com";
		
		Usuario user2 = new Usuario();
		user2.nome = "Gabriel Torres";
		user2.email = "gabriel.almeida95@gmail.com";
		
		System.out.println(user ==(user2));
		System.out.println(user.equals(user2));
		System.out.println(user == user2);
		
	}
}
