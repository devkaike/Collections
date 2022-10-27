import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList < Funcionario > lista = new  ArrayList <>();
		ArrayList < Telefone > listaT = new  ArrayList <>();
		for(int i = 0; i < 30; i++) {
			Funcionario f = new Funcionario();
			
			f.geraNome();
			f.geraSalario();
			lista.add(f);
			
		}
			
		for(int j = 0; j < 30; j++) {
			Telefone t = new Telefone();
			t.geraTelefone();
			listaT.add(t);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.print("\nFUNCIONARIO "+ (i+1) +"\n\n");
			Funcionario f = new Funcionario();
			f = lista.get(i);
			System.out.println("NOME: "+ f.getNome() +"\nSALARIO: "+f.geraSalario());
			System.out.print("FONES: ");
			Telefone t = new Telefone();
			t = listaT.get(i);
			System.out.print(" - "+t.getNumero());
			System.out.println();
		}
	}
}
