public class Rectangulo 
{
	// NO NECESITE NINGUNA FUENTE PARA DESARROLLARLO MAS QUE EL EJEMPLO SUBIDO A GITHUB
	// https://github.com/Ceutec/EjemploHerenciaSencilla/blob/master/src/Triangulo.java
	
	// Se crean las variables base y altura que actualmente tienen valor de 0
	int base;
	int altura;
	
	// se asignan las variables que contendra "Rectangulo"
	Rectangulo(int base,int altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	// se obtiene el valor de area, en este caso se multiplica la base por la altura 
	int getArea()
	{
		return (base*altura);
	}
		
	// se obtiene el valor de perimetro, y perimetro es igual a dos veces la base mas dos veces la altura
	int getPerimetro()
	{
		return (base*2 + altura*2);
	}
	
	// se obtiene el valor de base
	int getBase()
	{
		return base;
	}
	
	// se obtiene el valor de altura
	int getAltura()
	{
		return altura;
	}
	
	// se establece el valor de base con la variable asignada
	void setBase(int base)
	{
		this.base = base;
	}
	
	// se establece el valor de altura con la variable previamente creada
	void setAltura(int altura)
	{
		this.altura = altura;
	}
 

}
