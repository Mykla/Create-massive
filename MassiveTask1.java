/**
 * 1. Задать массив целых чисел длинной 10 эл.
 * 2. Отсортировать числа в массиве
 * 3. Вывести на экран результат.
 * 4. Сделать возможность наполнения массива с клавиатуры*.
 *    Created by user on 15.03.2015.
 */

import java.util.Scanner;
import java.util.Arrays;

public class MassiveTask1 {

    public static void main(String[] args) {
        int[] arr = new int[10]; // Инициализация массива из 10ти целых элементов

        System.out.println("Новый массив (без присвоения значений): " + Arrays.toString(arr));

        // Присвоение случайных значений элементам массива

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) Math.floor(Math.random() * 10);

        }

        System.out.println("Массив заполнен случайными числами: " + Arrays.toString(arr));

        // Сортировка массива
        Arrays.sort(arr);
        System.out.println("Массив после сортировки: " + Arrays.toString(arr));

        // Введение элементов массива с консоли
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + i + "-(ы)ий элемент массива: ");
            arr[i] = scan.nextInt();
        }
        System.out.println(" ");

        // Вывод массива после ручного ввода

        System.out.println("Введенный массив:  " + Arrays.toString(arr));

        // Сортировка и вывод вновь введенного массива
        Arrays.sort(arr);
        System.out.println("Массив, введнный вручную, после сортировки: "+ Arrays.toString(arr));

    }
}
