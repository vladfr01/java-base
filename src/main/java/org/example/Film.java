package org.example;

public class Film {
    //ATTRIBUTI
    private String titolo;
    private String genere;
    private int anno;
    private int durata;

    //COSTRUTTORE
    public Film(String titolo, int anno, int durata, String genere){
        this.titolo = titolo;
        this.genere = genere;
        this.anno = anno;
        this.durata = durata;
    }

    //GETTER
    public String getTitolo() { return titolo; }
    public int getAnno() { return anno; }
    public int getDurata() { return durata; }
    public String getGenere(){ return genere; }

    //METODI
    public boolean isLungo(){
        return durata > 120;
    }
    public boolean isRecente() {return anno >= 2000; }
    public String getDurataFormattata(){
        int ore = durata / 60;
        int minuti = durata % 60;
        return ore + "h " + minuti + "min";
    }


    //come l'oggetto si presenta quando lo stampi
    @Override
    public String toString(){
        return titolo + " (" + anno + ") - " + durata + " min - " + genere;
    }
}
