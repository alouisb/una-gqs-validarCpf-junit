package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidadorCpfTest {

    @Test
    public void deveInstanciarClasseValidadorCpf() {
    new ValidadorCpf();
    }


    @Test
    public void deveRetornarTrueQuandoCpfTiver11Digitos() {
        assertTrue(ValidadorCpf.validarCpf("12345678901"));
    }

    @Test
    public void deveRetornarFalseQuandoCpfTiverMenosDe11Digitos() {
        assertFalse(ValidadorCpf.validarCpf("1234567890"));
    }

    @Test
    public void deveRetornarFalseQuandoCpfTiverMaisDe11Digitos() {
        assertFalse(ValidadorCpf.validarCpf("123456789012"));
    }

    @Test
    public void deveRetornarFalseQuandoCpfForNulo() {
        assertFalse(ValidadorCpf.validarCpf(null));
    }
}
