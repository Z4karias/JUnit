package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import syspagos.Empleado;
import excepciones.*;

public class TestEmpleado 
{
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("4");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4,e.getNumeroEmpleado());
	}
	
	@Test 
	public void establecerNombredeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("Jesus");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Jesus",e.getNumeroEmpleado());
	}
	
	@Test
	public void estableceMesesTrabajoCorrecto() {
		Empleado e = new Empleado();
		try {
			e.estableceMesesTrabajo("7");
		} catch (MesesTrabajoException ex) {
			fail();
		}
		assertEquals(7, e.getMesesTrabajo());
	}
	
	@Test
	public void establecerSerDirectivoCorrecto() {
		Empleado e = new Empleado();
		try {
			e.establecerSerDirectivo("+");
		} catch (CargoException ex) {
			fail();
		}
		assertEquals(true, e.getDirectivo());
	}

	
	@Test
	public void calcularPrimaCorrecto() {
		Empleado e = new Empleado();
		try {
			e.establecerNumeroEmpleado("4");
		} catch (NumeroEmpleadoException ex) {
			fail();
		}
		assertEquals(4, e.getNumeroEmpleado());

		try {
			e.estableceNombreEmpleado("Jesus");
		} catch (NombreEmpleadoException ex) {
			fail();
		}
		assertEquals("Jesus", e.getNombreEmpleado());

		try {
			e.estableceMesesTrabajo("7");
		} catch (MesesTrabajoException ex) {
			fail();
		}
		assertEquals(7, e.getMesesTrabajo());

		try {
			e.establecerSerDirectivo("+");
		} catch (CargoException ex) {
			fail();
		}
		assertEquals(true, e.getDirectivo());
	}

}
