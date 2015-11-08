public class Casa
{
	float porcent;

	double Calcula( float PrecoC, double AreaTerreno )
	{
		return (PrecoC * AreaTerreno ); 
	}

	boolean Condicao( double AreaTerreno )
	{
		if ( porcent <= ( AreaTerreno * 0.6) )
		{
			return true;
		}
		else
			return false;
	}
	
}