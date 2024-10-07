package com.exemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSaudacao() {
        // Teste se a saudação é "Olá, Maven!"
        assertEquals("Olá, Maven!!!", App.saudacao());
    }
}