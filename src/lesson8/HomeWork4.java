package lesson8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork4 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData так, чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем

        UserMeta aleshka = new UserMeta("Aleshka", 48);

        for (Method declaredMethod : aleshka.getClass().getDeclaredMethods()) {
            if(declaredMethod.isAnnotationPresent(GetMetaData.class)) {
                long start = System.currentTimeMillis();
                declaredMethod.invoke(aleshka, "Mr");
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }

    }
}
