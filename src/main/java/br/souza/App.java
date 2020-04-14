package br.souza;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(("a"));
        pilha.push(("b"));
        pilha.push("c");
        pilha.push(("d"));

        System.out.println(pilha.Show());
        System.out.println("No topo está o valor: " + pilha.peek());

        No removido = pilha.pop();
        System.out.println("removido " + removido.getInfo());

        System.out.println(pilha.Show());
    }
}
