package atividade.LPC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Atividade de Lógica e Pensamento computacional
 *  Alunos: Marcos Augusto e Claudemir Francisco 2ºA DS.
 */

public class Teste {
	
	public static void main(String[] args) {
	 List<Veiculo>list = new ArrayList<>();	
	 for(int count=0 ; count < 5; count++){
		 Veiculo carro= new Veiculo();
			criandoVeiculo(carro);
			list.add(carro);
	 }
	 for(int count=0 ; count < 5; count++){
		 System.out.println("veiculo " + (count + 1));
		 System.out.println(list.get(count).toString());
		 System.out.println("--------------------------------------------------------------------------");
	 }
		
	}
	 /* metodo criado utilizando o Scanner para pegar as entradas do usuario,
	  * para pode construir um veiculo. 
	  */

	public static void criandoVeiculo(Veiculo veiculo) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite qual e a placa do veiculo: ");
		String placa= entrada.nextLine();
		System.out.println("Digite qual e a marca do veiculo: ");
		String marca= entrada.nextLine();
		System.out.println("Digite qual e o modelo do veiculo: ");
		String modelo= entrada.nextLine();
		System.out.println("Digite qual e a cor do veiculo: ");
		String cor= entrada.nextLine();
		System.out.println("Digite qual e a velocidade maxima do veiculo: ");
		float velocMax= entrada.nextFloat();
		System.out.println("Digite qual e a quantidade de rodas do veiculo: ");
		int qtdRodas= entrada.nextInt();
		System.out.println("Digite qual e a potencia do motor: ");
		int potencia =entrada.nextInt();
		System.out.println("Digite qual e a quantidade de pistoes do motor: ");
		int qtdPist =entrada.nextInt();
		System.out.println("----------------------------------------------------------------------");
		//Depois de pegar as entradas e colocar nas variáveis correspondentes,
		
		/*  Vamos utilizar o método set para colocar as entradas nas variáveis
		 * da classe veiculo. 
		 */
		
		veiculo.setPlaca(placa);
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setCor(cor);
		veiculo.setVelocMax(velocMax);
		veiculo.setQtdRodas(qtdRodas);
		veiculo.criandoMotor(potencia, qtdPist);
		
	}

}
