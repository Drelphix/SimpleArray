package by.demeshko.array.entity;

/*
 *   Разработать entity-класс, например: «класс Массив»
 *      ➢ Entity-класс не следует наполнять методами, выполняющими функциональные действия
 *      (методами бизнес-логики, такими как вычисление, поиск и т.д.).
 *      ➢ Все классы приложения должны быть структурированы по пакетам (package).
 *      ➢ Оформление кода должно соответствовать Java Code Convention.
 *      ➢ Для записи логов использовать Log4J2
 *      ➢ Разработать тесты на TestNG.
 *      ➢ Решение задания хранить на Github.
 *      ➢ Методы класса Objects использовать запрещено.
 *      ➢ Создать класс Массив.
 *      ➢ Разработать service-классы реализующие функциональности:
 *          • поиск min\max значения массива,
 *          • замену элементов массива по условию,
 *          • определение среднего значения элементов массива,
 *          • определение суммы элементов массива,
 *          • определение числа положительных\отрицательных элементов массива.
 */
public class SimpleArray {
    private int length;
    private int[] array;

    public SimpleArray() {
    }

    public SimpleArray(int[] simpleArray) {
        this.array = simpleArray;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getItem(int position) {
        return array[position];
    }

    public void setItem(int item, int position) {
        this.array[position] = item;
    }

    public int getLength() {
        return this.array.length;
    }


}
