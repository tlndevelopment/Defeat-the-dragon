import java.util.Scanner;

public class DefeatTheDragon {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int dragaoHP = 20000;
		int danoDragao = 300;
		int classe;
		int hp = 0;
		int dano = 0;
		int cura = 0;
		int opcao;
		boolean classeValida = false;
		
		System.out.println("Seu objetivo é derrotar o Dragão, para salvar o reino e a princesa!");
		System.out.println("Escolha entre estas classes (digite o número da classe):");
		System.out.println("1 - Bárbaro");
		System.out.println("HP: 3000");
		System.out.println("Dano: 1000");
		System.out.println("2 - Guerreiro");
		System.out.println("HP: 2000");
		System.out.println("Dano: 2000");
		System.out.println("3 - Arqueiro");
		System.out.println("HP: 1500");
		System.out.println("Dano: 2500");
		System.out.println("4 - Mago");
		System.out.println("HP: 1000");
		System.out.println("Dano: 3000");
		classe = kb.nextInt();
		
		if (classe == 1) {
			System.out.println("Você escolheu o Bárbaro");
			hp = 3000;
			cura = hp;
			dano = 1000;
			classeValida = true;
		}
		
		if (classe == 2) {
			System.out.println("Você escolheu o Guerreiro");
			hp = 2000;
			cura = hp;
			dano = 2000;
			classeValida = true;
		}
		
		if (classe == 3) {
			System.out.println("Você escolheu o Arqueiro");
			hp = 1500;
			cura = hp;
			dano = 2500;
			classeValida = true;
		}
		
		if (classe == 4) {
			System.out.println("Você escolheu o Mago");
			hp = 1000;
			cura = hp;
			dano = 3000;
			classeValida = true;
		}
		
		if (!classeValida) {
			System.out.println("ERRO!!! CLASSE INVÁLIDA!");
		}

		while (classeValida) {
			System.out.println("HP do dragão: " + dragaoHP);
			System.out.println("Seu HP: " + hp);
			System.out.println("Escolha o que fazer: ");
			System.out.println("1 - ATACAR");
			System.out.println("2 - CURAR-SE");
			System.out.println("3 - FUGIR");
			opcao = kb.nextInt();
			
			if (opcao == 1) {
				if (dano < dragaoHP) {
					dragaoHP = dragaoHP - dano;
					hp = hp - danoDragao;
				} else {
					dragaoHP = dragaoHP - dano;
				}
				
			} else if (opcao == 2) {
				hp = cura;
			} else if (opcao == 3) {
				System.out.println("Você fugiu. Agora o reino está destruido, e a princesa foi morta.");
				System.out.println("Parabéns, SEU COVARDE!");
				classeValida = false;
			} else {
				System.out.println("ERRO!!! OPÇÃO INVÁLIDA!");
				classeValida = false;
			}
			
			if (hp <= 0) {
				System.out.println("Você morreu, e sua história nunca será contada.");
				classeValida = false;
			}
			
			if (dragaoHP <= 0) {
				System.out.println("Parabéns, você derrotou o dragão!");
				System.out.println("Mas nossa princesa está em outro castelo...");
				classeValida = false;
			}
			
			continue;
		}
		kb.close();
	}
}
