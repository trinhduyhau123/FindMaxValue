import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Số lượng số muốn so sánh");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập sô thứ " + i + " :");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int index=0;
        for(int i=1; i< size;i++){
            if(max < array[i]){
                max = array[i];
                index =i;
            }
        }
        System.out.println(max + "là số lớn nhất ở vị trí "+index);
    }
}
