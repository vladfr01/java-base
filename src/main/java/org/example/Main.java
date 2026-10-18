package org.example;
import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        List<Film> films = new ArrayList<>();
        films.add(new Film("Il sorpasso", 1962, 105, "Commedia/Drammatico"));
        films.add(new Film("La grande bellezza", 2013, 141, "Commedia"));
        films.add(new Film("Oppenheimer", 2023, 180, "Drammatico/Thriller"));

        System.out.println("=== Tutti i Film ===");
        for (Film f : films){
            System.out.println(f);
        }

        System.out.println("=== Film Lunghi ===");
        for (Film f : films){
            if (f.isLungo()){
                System.out.println(f.getTitolo());
            }
        }

        System.out.println("=== Film Recenti ===");
        for(Film f : films){
            if(f.isRecente()){
                System.out.println(f.getTitolo());
            }
        }
    }
}