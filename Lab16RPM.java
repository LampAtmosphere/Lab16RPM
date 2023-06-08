import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab16RPM<T> {
    
    public void sort(T[] arr, Comparator<T> comparator) {
        Arrays.sort(arr, comparator);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Запрашиваем длину массива
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
    
        // Создаем массив нужного размера и заполняем его элементами, введенными пользователем
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = scanner.nextInt();
        }
    
        Lab16RPM<Integer> sorter = new Lab16RPM<>();
    
        // Сортировка по возрастанию
        sorter.sort(array, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(array));
    
        // Сортировка по убыванию
        sorter.sort(array, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(array));
    
        scanner.close();
    }
    }