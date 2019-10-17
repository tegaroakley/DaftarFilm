/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan32.daftarfilm;

/**
 *
 * @author DRAGON
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public Film(String Name, String Genre, double Rating, int Duration){
        this.filmName = Name;
        this.filmGenre = Genre;
        this.filmRating = Rating;
        this.filmDuration = Duration;
    }

    public String getName() {
        return filmName;
    }

    public String getGenre() {
        return filmGenre;
    }

    public double getRating() {
        return filmRating;
    }

    public int getDuration() {
        return filmDuration;
    }
    
    
}
