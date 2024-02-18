package Test_unitarios.Serie_videojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PruebaEntregable {
    private static Videojuego juego1;
    private static Videojuego juego2;
    private static Serie serie1;
    private static Serie serie2;

    @BeforeEach
    public void in() {
        juego1 = new Videojuego("Juego 1", 50, "Aventura", "Sega");
        juego2 = new Videojuego();
        serie1 = new Serie("Serie 1", 10, "Comedia", "Alguien");
        serie2 = new Serie();
    }

    //Videojuego
    @Test
    public void MétodosPublicosVideojuegos() {
    	assertEquals("Juego 1",juego1.getTitulo());
    	assertEquals(50,juego1.getHorasEstimadas());
    	assertEquals("Aventura",juego1.getGenero());
    	assertEquals("Sega",juego1.getcompañia());
    	assertEquals(100,juego2.getHorasEstimadas());
    }
    
    @Test
    public void testEntrega() {
    	assertEquals(false,juego1.isEntregado());
        juego1.entregar();
        assertEquals(true,juego1.isEntregado());
    }

    @Test
    public void testCompararVideojuego() {
    	assertEquals(Videojuego.MENOR,juego1.compareTo(juego2));
    	assertEquals(Videojuego.IGUAL,juego1.compareTo(juego1));
    	assertEquals(Videojuego.MAYOR,juego2.compareTo(juego1));
    }

    @Test
    public void testEqualsVideojuego() {
    	assertEquals(true,juego1.equals(juego1));
    	assertEquals(false,juego1.equals(juego2));	
    }
   

    //Serie
    @Test
    public void MétodosPublicosSerie() {
    	assertEquals("Serie 1",serie1.getTitulo());
    	assertEquals(10,serie1.getnumeroTemporadas());
    	assertEquals("Comedia",serie1.getGenero());
    	assertEquals("Alguien",serie1.getcreador());
    	assertEquals(3,serie2.getnumeroTemporadas());
    }
    
    @Test
    public void testEntregado() {
    	assertEquals(false,serie1.isEntregado());
        serie1.entregar();
        assertEquals(true,serie1.isEntregado());
    }

    @Test
    public void testCompareTo() {
    	assertEquals(Serie.MAYOR,serie1.compareTo(serie2));
    	assertEquals(Serie.IGUAL,serie1.compareTo(serie1));
    	assertEquals(Serie.MENOR,serie2.compareTo(serie1));
    }

    @Test
    public void testEqual() {
    	assertEquals(true,serie1.equals(serie1));
    	assertEquals(false,serie1.equals(serie2));
    }
    
    @AfterEach
	public void finish() {
		juego1 = null;
		juego2 = null;
		serie1 = null;
		serie2 = null;
	}
}