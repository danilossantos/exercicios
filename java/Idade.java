class Idade {

	public static void main (String[] args){

		int idade = 15;
		boolean amigoDoDono = true;
		System.out.println(idade);
	
		int idadeNoAnoQueVem = idade + 1;
		System.out.println(idadeNoAnoQueVem);
		
		if (idade < 18 && !amigoDoDono){
			System.out.println("Nao pode entrar");
		} else {
			System.out.println("Pode entrar");
			}

	}
}
