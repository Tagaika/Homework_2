package com.company;
/*Создать возвращаемый метод который будет принимать 2 входящих параметра
 возраст человека и температуру на улице, и возвращать результат в виде строки.
Алгоритм метода должен работать следующим образом:
если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;
если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;
а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.
ДЗ на сообразительность:
Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge” test(23, 10); test(generateRandomAge(), 23);
Дэдлайн 30.01.2022 23 59*/
public class Main {

    public static void main(String[] args) {
        System.out.println(myHandsAreDirty(19,27));

        System.out.println(myHandsAreDirty(17,27));
        System.out.println(myHandsAreDirty(67,47));
        System.out.println(myHandsAreDirty(25,89));
        System.out.println(myHandsAreDirty(65,16));
        System.out.println(myHandsAreDirty(89,1));
         }
    public static String myHandsAreDirty(int age, int temperature){
        String boss = age + " YEARS. " + "TODAY IS " + temperature;

        if (age > 20 && age < 45 && temperature > - 20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28){
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature > - 10 && temperature < 25){
            System.out.println("Еще можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }

        return boss;



    }
}
