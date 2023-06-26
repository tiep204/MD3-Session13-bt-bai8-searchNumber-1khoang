import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập min : ");
        int min = sc.nextInt();
        System.out.println("Mời bạn nhập max : ");
        int max = sc.nextInt();
        while (max<=min){
            System.err.println("min phải nhỏ hơn max vui lòng nhập lại min: ");
            min = sc.nextInt();
            System.out.println("Nhập max ");
            max = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>=min&&arr[i]<=max){
               list.add(arr[i]);
           }
        }
        System.out.println("các số trong khoảng từ "+min + " đến "+ max +" là "+list);
    }
}