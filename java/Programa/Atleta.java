class Atleta {
	float peso,altura;
	Atleta(){
		peso=100;
		altura= 1.74f;
}
Atleta (float a, float p){
	altura=a;
	peso=p;
}
float imc(){
	return peso/(altura*altura);
}
String classificar (){
	String saida="";
	float indice= imc();
	if (indice <= 18.5f)
		saida="Abaixo do Peso";
	else if (indice<=245f)			//Não utilizar os seguintes comandos:
		saida= "Peso Normal";		//Then, endif, and=(??), or=(||), not!
	else					//<>= !=, =(==)
		saida= "Acima do Peso";
	return saida;
	}
}
