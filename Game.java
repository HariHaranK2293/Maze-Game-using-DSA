import java.util.*;
public class Game {
    private static void d(int[][] arr, String a){
        if(a.equals("d")){
            e:
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr[0].length;j++){
                    if(arr[i][j] == 1){
                        if(j == arr[0].length - 1){
                            arr[i][0] = 1;
                            arr[i][j] = 0;
                            break e;
                        }
                        arr[i][j+1] = 1;
                        arr[i][j] = 0;
                        break e;
                    }
                }
            }
        }
        if(a.equals("s")){
            e:
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr[0].length;j++){
                    if(arr[i][j] == 1){
                        if(i == arr.length - 1){
                            arr[0][j] = 1;
                            arr[i][j] = 0;
                            break e;
                        }
                        arr[i+1][j] = 1;
                        arr[i][j] = 0;
                        break e;
                    }
                }
            }
        }
        if(a.equals("c")){
            e:
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr[0].length;j++){
                    if(arr[i][j] == 1){
                        if(j == arr[0].length - 1 || i == arr.length - 1){
                            System.out.println("Cannot Move!");
                            break e;
                        }
                        arr[i+1][j+1] = 1;
                        arr[i][j] = 0;
                        break e;
                    }
                }
            }
        }
    }
    private static void printarr(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        arr[0][0] = 1;
        int count = 0;
        System.out.println("Maze Game!");
        printarr(arr);
        while(arr[arr.length - 1][arr[0].length -1] != 1){
            System.out.print("Enter: ");
            String dir = sc.next();
            count++;
            dir = dir.toLowerCase();
            d(arr, dir);
            printarr(arr);
        }
        System.out.println("Game Completed! Total Moves: " + count);
    }
}