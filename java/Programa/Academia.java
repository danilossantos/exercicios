import java.util.Scanner;
public class Academia {
	public static void main (String []arg){
		Scanner ler = new Scanner(System.in);
		Atleta atleta= new Atleta();
		System.out.println ("Qual seu Peso?");
		atleta.peso= ler.nextFloat();
		System.out.println ("Qual sua altura?");
		atleta.altura=ler.nextFloat();
		System.out.println("Imc="+ atleta.imc());
		System.out.println(atleta.classificar());
	}
}
		//Alguns códigos (Next()= lê um caracter)
		//(nextline()= lê uma linha)
		//nextint()=lê número inteiro)
		//(nextfloat()=lê número flutuante)	
