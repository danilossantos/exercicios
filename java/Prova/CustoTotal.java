import java.util.Scanner;

public class CustoTotal
{
	public static void main (String[] arg)	
	{
		double custo_total;
		double preco_casa;
		double preco_piscina;		
		
		Scanner ler = new Scanner(System.in);
		Casa	house = new Casa();
		Piscina	pool = new Piscina();
		Terreno terrain = new Terreno();

		System.out.println("Informe a largura do terreno");
		terrain.largura = ler.nextFloat();
			
		System.out.println("Informe o comprimento do terreno");
		terrain.comprimento = ler.nextFloat();

		System.out.println("Informe a % construida da casa");
		house.porcent = ler.nextFloat();

		System.out.println("Informe o diâmetro da piscina");
		pool.diametro = ler.nextFloat();

		System.out.println("Informe o custo do metro quadrado da casa");
		preco_casa = house.Calcula(ler.nextFloat(), terrain.Area());

		System.out.println("Informe o custo do metro quadrado da piscina");
		preco_piscina = pool.Calcula(ler.nextFloat());
		
		custo_total = preco_casa + preco_piscina;

		if( house.Condicao( terrain.Area() ) == true )
			System.out.println("Srs, o custo total da obra foi: U$ "+ custo_total);
		else
			System.out.println("O Limite da casa ultrapassou os 60% do tamanho do terreno");
	}			

}
