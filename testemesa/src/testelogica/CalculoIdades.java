package testelogica;

	import java.util.Scanner;

	public class CalculoIdades {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2;
	        
	        System.out.print("Digite a idade do primeiro homem: ");
	        idadeHomem1 = scanner.nextInt();
	        
	        System.out.print("Digite a idade do segundo homem: ");
	        idadeHomem2 = scanner.nextInt();
	        
	        System.out.print("Digite a idade da primeira mulher: ");
	        idadeMulher1 = scanner.nextInt();
	        
	        System.out.print("Digite a idade da segunda mulher: ");
	        idadeMulher2 = scanner.nextInt();
	        
	        int homemMaisVelho, homemMaisNovo, mulherMaisVelha, mulherMaisNova;
	        
	        if (idadeHomem1 > idadeHomem2) {
	            homemMaisVelho = idadeHomem1;
	            homemMaisNovo = idadeHomem2;
	        } else {
	            homemMaisVelho = idadeHomem2;
	            homemMaisNovo = idadeHomem1;
	        }
	        
	        if (idadeMulher1 > idadeMulher2) {
	            mulherMaisVelha = idadeMulher1;
	            mulherMaisNova = idadeMulher2;
	        } else {
	            mulherMaisVelha = idadeMulher2;
	            mulherMaisNova = idadeMulher1;
	        }
	        
	        int somaIdades = homemMaisVelho + mulherMaisNova;
	        int produtoIdades = homemMaisNovo * mulherMaisVelha;
	        
	        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
	        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);
	        
	        scanner.close();
	    }
	}

