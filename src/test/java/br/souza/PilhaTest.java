package br.souza;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class PilhaTest {
    
    private Pilha pilha;
    private final String name1 = "Nome1";
    private final String name2 = "Nome2";


    @Before
    public void setup(){
        pilha = new Pilha();
    }

    @Test
    public void testIsEmpty() {
        boolean vazia = pilha.isEmpty();
        assertTrue("pilha devera estar vazia.", vazia);
    }

    @Test
    public void testNotEmpty() {


        pilha.push(name1);
        boolean vazia = pilha.isEmpty();

        assertFalse("pilha com um elemento não deve estar vazia.", vazia);
    }

    @Test
    public void testAddOnEmptyStack() {


        pilha.push(name1);
        String out = pilha.Show();

        String expected = name1 + "; ";

        assertEquals("Após inserção de ser exibito o nome "+ name1, expected , out);
    }

    @Test
    public void testAddOnNonEmptyStack() {


        pilha.push(name1);
        pilha.push(name2);
        String out = pilha.Show();

        String expected = name2 + "; " + name1 + "; ";

        assertEquals("Após inserção de dois nomes ambos devem ser exibidos, respeitando a ordem ", expected , out);
    }

    @Test
    public void testRemoveOnNonEmptyStack() {


        pilha.push(name1);
        pilha.push(name2);

        String name = pilha.pop().getInfo();

        assertEquals("Deve ser removido o nome que estava no topo da pilha.", name2 , name);
    }

    @Test
    public void testRemoveOnEmptyStack() {

        No removido = pilha.pop();

        assertEquals("Remoção de uma pilha vazia deve retornar null", null , removido);
    }

}


