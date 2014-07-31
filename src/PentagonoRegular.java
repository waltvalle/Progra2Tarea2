
public class PentagonoRegular 
{
	// Se crea la variable entera de lado que actualmente esta en 0
	int lado;
	
	// se asigna la variable lado que sera utilizada en "PentagonoRegular"
	PentagonoRegular(int lado)
	{
		this.lado = lado;
	}
	
	//se obtiene el valor de lado
	int getLado()
	{
		return (lado);
	}
	
	// se obtiene el valor del Perimetro multiplicando un lado por 5
	int getPerimetro()
	{
		return (lado*5);
	}
	
	// se asigna el valor lado con la variable previamente creada	
	void setLado(int lado)
	{
		this.lado = lado;
	}
}
