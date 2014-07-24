import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Evaluar {
	
	@Test
	public void setYGetBaseRectangulo() {
		Rectangulo  r = new Rectangulo(0,0);
		r.setBase(10);
		assertEquals("Metodo set o get implementado incorrectamente", 10, r.getBase());
		
		Rectangulo r2 = new Rectangulo(0,0);
		r2.setBase(20);
		assertEquals("Metodo set o get implementado incorrectamente", 20, r2.getBase());
	}
	
	@Test
	public void setYGetAlturaRectangulo() {
		Rectangulo  r = new Rectangulo(0,0);
		r.setAltura(10);
		assertEquals("Metodo set o get implementado incorrectamente", 10, r.getAltura());
		
		Rectangulo r2 = new Rectangulo(0,0);
		r2.setAltura(20);
		assertEquals("Metodo set o get implementado incorrectamente", 20, r2.getAltura());
	}
	
	@Test
	public void getAreaRectangulo() {
		Rectangulo r = new Rectangulo(10,5);
		assertEquals("Metodo set o get implementado incorrectamente", 50, r.getArea());
		
		Rectangulo r2 = new Rectangulo(20,10);
		assertEquals("Metodo set o get implementado incorrectamente", 200, r2.getArea());
	}
	
	@Test
	public void getPerimetroRectangulo() {
		Rectangulo r = new Rectangulo(10,5);
		assertEquals("Metodo set o get implementado incorrectamente", 30, r.getPerimetro());
		
		Rectangulo r2 = new Rectangulo(20,10);
		assertEquals("Metodo set o get implementado incorrectamente", 60, r2.getPerimetro());
	}
	
	@Test
	public void setYGetLadoPentagonoRegular() {
		PentagonoRegular p = new PentagonoRegular(0);
		p.setLado(10);
		assertEquals("Metodo set o get implementado incorrectamente", 10, p.getLado());
		
		PentagonoRegular p2 = new PentagonoRegular(0);
		p2.setLado(20);
		assertEquals("Metodo set o get implementado incorrectamente", 20, p2.getLado());
	}
	
	@Test
	public void getPerimetroPentagonoRegular() {
		PentagonoRegular p = new PentagonoRegular(5);
		assertEquals("Metodo set o get implementado incorrectamente", 25, p.getPerimetro());
		
		PentagonoRegular p2 = new PentagonoRegular(3);
		assertEquals("Metodo set o get implementado incorrectamente", 15, p2.getPerimetro());
	}
	
	@Test
	public void getPerimetroPentagonoRegular2() {
		PentagonoRegular p = new PentagonoRegular(4);
		assertEquals("Metodo set o get implementado incorrectamente", 20, p.getPerimetro());
		
		PentagonoRegular p2 = new PentagonoRegular(2);
		assertEquals("Metodo set o get implementado incorrectamente", 10, p2.getPerimetro());
	}
}
