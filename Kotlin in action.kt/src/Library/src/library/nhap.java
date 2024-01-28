package library;


import java.util.Scanner;

class MainJava {

    public static void hanoiTower(int n, int start, int end){
        if(n == 1){
            System.out.println(start + " -> " + end);
        }
        else{
            int otherRod = 6 - (start + end);
            hanoiTower(n - 1, start, otherRod);
            System.out.println(start + " -> " + end);
            hanoiTower(n - 1, otherRod, end);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoiTower(n, 1, 3);
    }
}
