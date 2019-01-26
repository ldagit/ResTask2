package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int numb[] = new int[10];
        int i;
        Scanner in = new Scanner(System.in);
        //Ввод массива
        System.out.println("Введите в массив 10 целых чисел: ");
        for (i=0; i<10; ++i){
            System.out.printf("numb[%d] = ", i);
            numb[i] = in.nextInt();
        }
        //Сортировка массива методом вставки
        int tmp_n, j;
        for(i = 0 ; i < numb.length - 1 ; i++){
            if (numb[i] > numb[i+1]){
                tmp_n = numb[i+1];
                numb[i+1] = numb[i];
                j = i;
                while (j>0 && tmp_n < numb[j-1]){
                    numb[j] = numb[j-1];
                    j--;
                }
                numb[j] = tmp_n;
            }
        }
        //Вывод отсортированного массива
        for (i=0; i<10; ++i){
            System.out.print(numb[i] + " ");
        }
    }
}
