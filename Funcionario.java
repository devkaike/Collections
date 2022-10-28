package gg;
import java.util.Random;
//import java.util.stream.DoubleStream;

public class Funcionario {
	private String nome;
	private double salario;
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
	
	public double geraSalario() {
		String s = "";
		
		for(int i = 0; i < 8; i++) {
			int n = aleatorio.nextInt(9)+1;
			int nn = (char)n;
			s += nn;
		}
		s += ".";
		for(int i = 0; i < 2; i++) {
			int n = aleatorio.nextInt(9)+1;
			int nn = (char)n;
			s += nn;
			double aux = Double.valueOf(s).doubleValue();
			int aux1 = (int)aux;
			salario = aux1 / 10 + 0.34 * n;
			
		}
		return salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNumero() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
