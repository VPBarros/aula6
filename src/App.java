import java.util.Locale;
import java.util.Scanner;

public class App {
    //**estrutura condiconal e da seguinte maneira se for if V (condição faz isso)comando se F else
	//comando.(estrutura simples só executa)
	//**if else (se senao)simples e encadeamento (comparativas sinais) (logicas E,Não,OU)
	
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		System.out.printf("Nota final = %.1f%n", notaFinal );// correção realizada
	
	if (notaFinal < 60.0) {
			System.out.println("REPROVADO!Estudar mais.");
	}else {
		System.out.println("Aprovada!Parabens!");
		}
		
	sc.close();
    }
}
