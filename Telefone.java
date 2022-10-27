import java.util.Random;

public class Telefone {
	private String numero;
	Random aleatorio = new Random();
	public String geraTelefone() {
		numero = "";
		Random aleatorio = new Random();
		int n = aleatorio.nextInt(6);
		for(int a = 0; a < n; a++) {
			for(int i = 0; i < 8; i++) {
				int x = aleatorio.nextInt(9)+1;
				int nn = (char)x;
				numero+= nn;
			}
			numero += " -";
		}
		
		return numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
