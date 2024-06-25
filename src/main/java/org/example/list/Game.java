package org.example.list;
import java.util.List;
import java.time.LocalDate;

public class Game {
    private String title;
    private double price;
    private LocalDate releaseDate;

    public Game(String title, double price, LocalDate releaseDate) {
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Double.compare(game.price, price) == 0 &&
                title.equals(game.title) &&
                releaseDate.equals(game.releaseDate);
    }

    // Пример создания метода, который проверяет наличие объекта Game в списке
    public static boolean containsGame(List<Game> games, Game game) {
        return games.contains(game);
    }


}
