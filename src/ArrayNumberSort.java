import java.util.Scanner;
import java.util.Arrays;

public class ArrayNumberSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Girmek İstediğiniz Dizinin Eleman Sayısını Giriniz: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 1 ; i <= n ; i++){
            System.out.print(i + ". Elemanı Giriniz: ");
            array[i-1] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Küçükten Büyüğe Sıralama: ");
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Büyükten Küçüğe Sıralama: ");
        for (int j = array.length - 1 ; j >= 0 ; j--){
            System.out.print(array[j] + " ");
        }
    }
}
