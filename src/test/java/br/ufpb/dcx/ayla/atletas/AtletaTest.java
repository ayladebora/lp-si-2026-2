package br.ufpb.dcx.ayla.atletas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtletaTest {
    @Test
    public void testaConstrutor(){
        Atleta a1 = new Atleta("123", 20, new ArrayList<>());
        assertEquals("123", a1.getCodigo());

    }
}
