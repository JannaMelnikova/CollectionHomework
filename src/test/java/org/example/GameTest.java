package org.example;

import org.example.list.Game;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void testContainsGame() {
        // Создаем несколько объектов Game
        Game game1 = new Game("Counter-Strike", 29.99, LocalDate.of(2015, 5, 19));
        Game game2 = new Game("StandOff", 39.99, LocalDate.of(2020, 12, 10));
        Game game3 = new Game("Minecraft", 49.99, LocalDate.of(2018, 12, 10));

        // Создаем список игр и добавляем в него игры
        List<Game> games = new ArrayList<>();
        games.add(game1);
       games.add(game2);
       games.add(game3);

        // Создаем объект игры, который есть в списке
        Game gameToFind1 = new Game("Counter-Strike", 29.99, LocalDate.of(2015, 5, 19));
        assertTrue(Game.containsGame(games, gameToFind1), "Ожидается, что игра Counter-Strike будет найдена в списке");

        // Создаем объект игры, которого нет в списке
        Game gameToFind2 = new Game("Valorant", 0.0, LocalDate.of(2021, 6, 2));
        assertFalse(Game.containsGame(games, gameToFind2), "Ожидается, что игра Valorant не будет найдена в списке");
    }
    // Пример создания метода, который проверяет наличие объекта Game в списке
    private static boolean containsGame(List<Game> games, Game gameToFind1) {
        return games.contains(gameToFind1);
    }


}
