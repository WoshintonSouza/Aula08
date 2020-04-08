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
        Lista lista = new Lista();

        lista.addEnd(("Huguinho"));
        lista.addEnd(("Zezinho"));
        lista.addStart("Patinhas");
        lista.addEnd(("Luizinho"));

        System.out.println(lista.Show());

        No removido = lista.removeStart();
    
        System.out.println("removido " + removido.getInfo());
        System.out.println(lista.Show());

        removido = lista.removeEnd();

        System.out.println("removido " + removido.getInfo());
        System.out.println(lista.Show());
    }
}
