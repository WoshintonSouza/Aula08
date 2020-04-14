package br.souza;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class ListaTest {
    
    private Lista lista;
    private final String name1 = "Nome1";
    private final String name2 = "Nome2";


    @Before
    public void setup(){
        lista = new Lista();
    }

    @Test
    public void testIsEmpty() {
        boolean vazia = lista.isEmpty();
        assertTrue("Lista devera estar vazia.", vazia);
    }

    @Test
    public void testNotEmpty() {


        lista.addEnd(name1);
        boolean vazia = lista.isEmpty();

        assertFalse("Lista com um elemento não deve estar vazia.", vazia);
    }

    @Test
    public void testAddEndOnEmptyList() {


        lista.addEnd(name1);
        String out = lista.Show();

        String expected = name1 + "; ";

        assertEquals("Após inserção de ser exibito o nome "+ name1, expected , out);
    }

    @Test
    public void testAddEndOnNonEmptyList() {


        lista.addEnd(name1);
        lista.addEnd(name2);
        String out = lista.Show();

        String expected = name1 + "; " + name2 + "; ";

        assertEquals("Após inserção de dois nomes ambos devem ser exibidos, respeitando a ordem ", expected , out);
    }

    @Test
    public void testAddStartOnEmptyList() {


        lista.addStart(name1);
        String out = lista.Show();

        String expected = name1 + "; ";

        assertEquals("Após inserção de ser exibito o nome "+ name1, expected , out);
    }

    @Test
    public void testAddStartOnNonEmptyList() {


        lista.addStart(name1);
        lista.addStart(name2);
        String out = lista.Show();

        String expected = name2 + "; " + name1 + "; ";

        assertEquals("Após inserção de dois nomes ambos devem ser exibidos, respeitando a ordem ", expected , out);
    }

    @Test
    public void testRemoveStartOnNonEmptyList() {


        lista.addStart(name1);
        lista.addStart(name2);

        String name = lista.removeStart().getInfo();

        assertEquals("Deve ser removido o nome que estava no inicio da lista.", name2 , name);
    }

    @Test
    public void testRemoveEndOnNonEmptyList() {


        lista.addStart(name1);
        lista.addStart(name2);

        String name = lista.removeEnd().getInfo();

        assertEquals("Deve ser removido o nome que estava no inicio da lista.", name1 , name);
    }

    @Test
    public void testRemoveStartOnEmptyList() {

        No removido = lista.removeStart();

        assertEquals("Remoção de uma lista vazia deve retornar null", null , removido);
    }

    @Test
    public void testRemoveEndOnEmptyList() {

        No removido = lista.removeEnd();

        assertEquals("Remoção de uma lista vazia deve retornar null", null , removido);
    }

}
