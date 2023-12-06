
public class Main {
    public static void main(String[] args) {
        // Creazione di un nuovo prodotto
        Prodotto prodotto = new Prodotto( 9822112,"Red bull"," Bevanda energetica analcolica",2.99,22.0);

        // Funzionalità della classe Prodotto
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("IVA: " + prodotto.getIva());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome Esteso: " + prodotto.getNomeEsteso());
    }
}