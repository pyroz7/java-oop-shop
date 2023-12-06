import java.util.Random;

public class Prodotto {


    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;



    //COSTRUTTORI
    public Prodotto (int codice, String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }



    //GETTER E SETTER
    public int getCodice() {
        return codice;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }



    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }



    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }



    //METODI
    //metodo per generare numero random
    private int generateRandomCode() {
        return new Random().nextInt();
    }

    // Metodo per ottenere il nome esteso
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

    public double getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);
    }
}
