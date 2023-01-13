import java.util.Scanner;

/*package ProjetoJava;

public class Carteira {

	private double[] saldo =
//          0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
			{150,100,200,180,120,170,0,100,200,200,150,0,100,100,100,200,200,150,0,200,180,250,150,199,200, 0, 100, 150, 200, 200, 200};
//          1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
	private double saldoTotal = 0.0f;
	
	private int[] km =
//          0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
			{100,100,100,100,100,120,150,0,100,200,150,250,200,140,0,120,40,50,30,40,80, 0,100,30,50,40,30,60, 0,40,45};
	private int kmTotal = 0;

	public double[] getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo, int linha) {
		this.saldo[linha] = saldo;
	}
	
	public double getSaldoTotal() {
		saldoTotal = 0;
		for(int linha = 0; linha < saldo.length; linha++) {
			this.saldoTotal += saldo[linha];
		}
		
		return saldoTotal;
	}
	
	public int[] getKm() {
		return km;
	}

	public void setKm(int km, int linha) {
		this.km[linha] = km;
	}

	public double getKmTotal() {
		kmTotal = 0;
		for(int linha = 0; linha < km.length; linha++) {
			this.kmTotal += km[linha];
		}
		return kmTotal;
	}
	
	public int totalDia() {
		int contador = 0;
		for(int linha = 0; linha < saldo.length; linha++) {
			if(saldo[linha] != 0)
				contador++;
		}
		return contador;
	}

}

package ProjetoJava;

public class Menu {
	
	public void cabecalho(String nome) {
		System.out.printf("\n\t==================== CARTEIRA DO(A) %s ====================\n", nome);
	}
	
	public static void imprimeMenu() {
		System.out.printf("\n\t\t1 - Registrar Meta"
						+ "\n\t\t2 - Carteira"
						+ "\n\t\t3 - Ver Resultado"
						+ "\n\t\t9 - Sair"
						+ "\n\t============================================================="
						);
		System.out.printf("\n\tDigite uma opção: \n\n");
	}
	
	public static void meta(double meta, String nome) {
		System.out.printf("\n\t\tSua meta mensal atual: R$ %.2f"
						+ "\n\t======================================================="
						, meta);
		System.out.printf("\n\t%s, Digite uma meta para sua renda mensal: \n\n", nome);
		
	}
	
	public static void diaria(double saldo, String nome) {
		System.out.printf("\n\t\tSaldo: R$ %.2f"
						+ "\n\n\tDigite:"
						+ "\n\t1 - Registrar diária"
						+ "\n\t2 - Ver extrato"
						+ "\n\t9 - Sair"
						+ "\n\t==========================================================="
						, saldo);
	}
}

package ProjetoJava;

public class Pessoa {

	private String nome = "";
	private double metaMensal = 0.0f;
	private double custoKm = 0.2;//Manutenção + combustível + alimentação 
	private int totalDiaTrabalhado = 0;
	private int totalKmPercorrido = 0;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getMetaMensal() {
		return metaMensal;
	}
	
	public void setMetaMensal(double meta) {
		this.metaMensal = meta;
		System.out.printf("\n\t%s, Sua meta de ganho mensal agora é: R$ %.2f\n", nome, meta);
	}
	

	public double getCustoKm() {
		return custoKm;
	}

	public void setCustoKm(double custoKm) {
		this.custoKm = custoKm;
	}

	public int getTotalDiaTrabalhado() {
		return totalDiaTrabalhado;
	}

	public void setTotalDiaTrabalhado(int totalDiaTrabalhado) {
		this.totalDiaTrabalhado = totalDiaTrabalhado;
	}

	public int getTotalKmPercorrido() {
		return totalKmPercorrido;
	}

	public void setTotalKmPercorrido(int totalKmPercorrido) {
		this.totalKmPercorrido = totalKmPercorrido;
	}
	
	
}
import java.util.Scanner;

public class MainCarteira {

	public static void main(String[] args) {
		int opcao = 0;
		int dia = 0;
		String nome;
		double meta;
		
		Pessoa motoca = new Pessoa("");
		Menu menu = new Menu();
		Carteira cart = new Carteira();
		
		if(motoca.getNome().equals("")) {
			System.out.printf("\n\tDigite seu nome: ");
			motoca.setNome(lerNextLine());
		}
		nome = motoca.getNome();
		
		do {
			menu.cabecalho(nome);
			menu.imprimeMenu();
			opcao = lerNextLine(0);
			
			if(opcao == 1) {
				menu.cabecalho(nome);
				menu.meta(motoca.getMetaMensal(), nome);
				motoca.setMetaMensal(lerNextLine(0.1));
				
				while(opcao != 0) {
					System.out.printf("\n\tDigite 9 para sair: \n\n");
					opcao = lerNextLine(0);
					
					if(opcao == 9)
						opcao = 0;
					else if(opcao == 0)
						opcao = 1;
				}
			
			}
			else if(opcao == 2) {
				while(opcao != 0) {
					menu.cabecalho(nome);
					menu.diaria(cart.getSaldoTotal(), nome);
					
					double[] media = cart.getSaldo();
					System.out.printf("\n\t%s, seu saldo atual é de: R$ %.2f\n",nome, cart.getSaldoTotal());
				
					opcao = lerNextLine(0);
					if(opcao == 1) {
						System.out.printf("\n\t%s, digite o dia: ", nome);
						dia = lerNextLine(0);
						System.out.printf("\t%s, digite o total ganho do dia: ", nome);
						cart.setSaldo(lerNextLine(0.0f),(dia - 1));
						System.out.printf("\t%s, digite o km percorrido no dia: ", nome);
						cart.setKm(lerNextLine(0),(dia - 1));
						
						while(opcao != 8) {
							System.out.printf("\n\n\tDigite 9 para sair: \n\n");
							opcao = lerNextLine(0);
							
							if(opcao == 9)
								opcao = 8;
							else if(opcao == 8)
								opcao = 1;
						}
					}
					else if(opcao == 2) {
						double[] vetorSaldo = cart.getSaldo();
						for(int i = 0; i < vetorSaldo.length; i++) {
							String zero = "";
							if(i < 9)
								zero ="0";
							else
								zero ="";
							System.out.printf("\tDia %s%d: %.2f", zero, i + 1, vetorSaldo[i]);
							if((i + 1) % 5 == 0)
								System.out.printf("\n");
							
							
						}
						while(opcao != 8) {
							System.out.printf("\n\n\tDigite 9 para sair: \n\n");
							opcao = lerNextLine(0);
							
							if(opcao == 9)
								opcao = 8;
							else if(opcao == 8)
								opcao = 1;
						}
					}
										
					if(opcao == 9)
						opcao = 0;
					else if(opcao == 0)
						opcao = 1;
				}
			}
			else if(opcao == 3) {
				if(motoca.getMetaMensal() <= 0)
					meta = 0;
				else
					meta = (cart.getSaldoTotal() - cart.getKmTotal() * motoca.getCustoKm()) / motoca.getMetaMensal() * 100;
					double ganhoLiquido = cart.getSaldoTotal() - cart.getKmTotal() * motoca.getCustoKm();
				
				System.out.printf("\n\tResultado: \n");
				System.out.printf("\n\t* Ganho total: R$ %.2f", cart.getSaldoTotal());
				System.out.printf("\t* Dias trabalhados: %d", cart.totalDia());
				System.out.printf("\t\t* Ganho por dia (média): R$ %.2f", cart.getSaldoTotal() / cart.totalDia());
				System.out.printf("\n\t* Custo total: R$ %.2f", cart.getKmTotal() * motoca.getCustoKm());
				System.out.printf("\t* Km percorrido: %.2f", cart.getKmTotal());
				System.out.printf("\t* Ganho por km (média): R$ %.2f", cart.getSaldoTotal() / cart.getKmTotal());
				System.out.printf("\n\t* Custo operacional: %.2f%%",cart.getKmTotal() * motoca.getCustoKm() * 100 /cart.getSaldoTotal());
				System.out.printf("\t* Km por dia (média): %.2f", cart.getKmTotal() / cart.totalDia());
				System.out.printf("\n\t* Ganho líquido: R$ %.2f", cart.getSaldoTotal() - cart.getKmTotal() * motoca.getCustoKm());
				
				if(motoca.getMetaMensal() > 0) {
					System.out.printf("\n\n\t%s, você atingiu %.2f%% da sua meta.", nome, meta);
					if(ganhoLiquido < motoca.getMetaMensal())
						System.out.printf("\n\tPrecisa faturar +/- R$ %.2f para "
							+ "a tingir o ganho líquido de R$ %.2f", 
							(motoca.getMetaMensal() - ganhoLiquido) * (cart.getSaldoTotal() / ganhoLiquido), motoca.getMetaMensal());
				}else
					System.out.printf("\n\n\tVocê ainda não registrou sua meta");
				
				//meta = cart.getSaldoTotal() / motoca.getMetaMensal() * 100;
				if(meta <= 99)
					System.out.printf("\n\n\t**** Sai do NetFlix e vai trabalhar! ****");
				else if(meta == 100)
					System.out.printf("\n\n\t**** Parabéns, você atingiu a meta do mês!!! ****");
				else
					System.out.printf("\n\n\t**** Assim você vai ficar rico Zé! ****");
				
				while(opcao != 8) {
					System.out.printf("\n\n\tDigite 9 para sair: \n\n");
					opcao = lerNextLine(0);
					
					if(opcao == 9)
						opcao = 8;
					else if(opcao == 8)
						opcao = 1;
				}						
			}
		}while(opcao != 9);
		System.out.println("\n\t\t********** CARTEIRA FECHADA **********\n\n");
		
	}
	
	private static String lerNextLine() {
		Scanner ler = new Scanner(System.in);
		return ler.nextLine();
	}
	
	private static int lerNextLine(int n) {
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}
	
	private static double lerNextLine(double n) {
		Scanner ler = new Scanner(System.in);
		return ler.nextDouble();
	}
	
}*/
