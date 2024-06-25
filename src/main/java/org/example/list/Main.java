package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(2);
        ids.add(2);
        ids.add(2);
        ids.add(2);
        ids.add(2);
        ids.add(2);
        ids.add(2);
        ids.add(324);
        ids.add(123);
        ids.add(123);
//Создать лист чисел, после вывести через цикл фор только четные числа из листа
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 7, 9, 10, 12, 14, 16, 7);
//создать лист строк названия городов, после создать еще 1 лист с городами, заполнить оба, далее добавить 2 лист в 1
//после вывести
        List<String> list1 = List.of("Ростов-на-Дону", "Иваново", "Пенза", "Кемерово", "Томск", "Омск", "Новосибирск");
        List<String> list2 = List.of("Белгород", "Дагестан", "Махачкала", "Москва");

//создать лист логинов
        List<String> userList = new ArrayList<>();
        userList.add("fgfgfg");
        userList.add("Admin");
        userList.add("ewewewe");
        userList.add("bgbgbgb");

        String loginToRemove = "bgbgbgb";//логин который нужно удалить
        String login;

        removeUserFromList(loginToRemove, userList);

//класс Game - свойства название цена и дата выхода(объект типа LocalDate). Наполнить его объектами
        Game game1 = new Game("Counter-Strike", 29.99, LocalDate.of(2015, 5, 19));
        Game game2 = new Game("StandOff", 39.99, LocalDate.of(2020, 12, 10));
        Game game3 = new Game("Minecraft", 49.99, LocalDate.of(2018, 12, 10));

        // Создаем список игр и добавляем в него созданные объекты
        List<Game> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);



        System.out.println("Логины, прошедшие проверку: ");
        for (String user : userList) {
            System.out.println(user);
        }


// Объединение списков
        List<String> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);

        // Сортировка объединенного списка по алфавиту
        Collections.sort(combinedList);

        for (String city : combinedList) {
            System.out.println(city);
        }

        System.out.println("Четные числа: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Нечетные числа: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        System.out.println(ids);

        for (Integer id : ids) {
            if (id > 100) System.out.println(id);
        }

        System.out.println(ids.get(0));

        List<Integer> list = new ArrayList<>(Arrays.asList(6, 75, 67, 5, 674, 56, 36, 4, 56));
        List<String> listLogins = List.of("gerg", "ergerg", "ergerg");

        list.addAll(ids);
        System.out.println();
        System.out.println(list);

        //метод, который принимает лист и объект Game и проверяет есть ли там такой объект
        Game gameToFind = new Game("Counter-Strike", 29.99, LocalDate.of(2015, 5, 19));

// Проверяем наличие игры в списке
        if (containsGame(games, gameToFind)) {
            System.out.println("Игра найдена в списке.");
        } else {
            System.out.println("Игра не найдена в списке.");
        }


    }

    //метод который принимает логин и лист и если такой логин там есть и если логин не Admin то удаляет его
    public static void removeUserFromList(String login, List<String> userList) {
        // Используем Iterator для безопасного удаления элементов во время перебора
        Iterator<String> iterator = userList.iterator();
        while (iterator.hasNext()) {
            String user = iterator.next();
            if (user.equals(login) && !login.equals("Admin")) {
                iterator.remove();
            }
        }
    }

    // Метод, который проверяет наличие объекта Game в списке
    public static boolean containsGame(List<Game> games, Game game) {
        return games.contains(game);
    }


}

