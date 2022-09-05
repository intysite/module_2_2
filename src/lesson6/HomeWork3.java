package lesson6;

import java.util.HashSet;

public class HomeWork3 {
    public static void main(String[] args) {

        //Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера

        User vasya = new User(20, "Vasya");
        User vanya = new User(25, "Vanya");
        User petya = new User(25, "Petya");
        User vanya1 = new User(25, "Vanya");

        HashSet<User> hashUser = new HashSet<User>();
        hashUser.add(vasya);
        hashUser.add(vanya);
        hashUser.add(petya);
        hashUser.add(vanya1);
        for (User user : hashUser) {
            System.out.println(user);
        }

        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер




        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.

    }
}
