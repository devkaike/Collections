import java.util.Random;
//import java.util.stream.DoubleStream;

public class Funcionario {
	private String nome;
	private String salario;
	Random aleatorio = new Random();
	public String geraNome() {
		 
         nome = "";
         char l;
         int num;
         num = aleatorio.nextInt(26)+ 65;
         l = (char)num;
         nome += l;
         for(int i = 0; i < 19; i++) {
             num = aleatorio.nextInt(26) + 97;
             l = (char)num;
             nome += l;
         }
         return nome;
	}
	
	public String geraSalario() {
		salario = "";
		for(int i = 0; i < 8; i++) {
			int n = aleatorio.nextInt(9)+1;
			int nn = (char)n;
			salario += nn;
		}
		salario += ".";
		for(int i = 0; i < 2; i++) {
			int n = aleatorio.nextInt(9)+1;
			int nn = (char)n;
			salario += nn;
		}
		return salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getNumero() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
