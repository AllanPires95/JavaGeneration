//package POO;
//public class Funcionario {
	//private double Salario;
	//private String Nome;
	//private String Setor;
	//private int Idade;
	
//	public double getSalario() {
	//	return Salario;
	//}
//	public void setSalario() {
//		this.Salario = Salario;
//	}
//	public String getNome() {
//		return Nome;
//	}
//	public void setNome(String nome) {
	//	this.Nome = Nome;
	//}
	//public String getSetor() {
		//return Setor;
	//}
	//public void setSetor(String setor) {
		//this.Setor = Setor;
	//	}
	//	public int getIdade() {
	//	return Idade;
	//}
	//	public void setIdade(int idade) {
	//	this.Idade = Idade;
	//}
	




package POO;
public class TesteFuncionario {

	public static void main(String args[]) {
		Funcionario func = new Funcionario();
		func.setNome("Allan");
		func.setSetor("Caixa");
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		

	}

}
