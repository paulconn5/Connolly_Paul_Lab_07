public class Main {
    public static void main(String[] args) {

        for (int x=0; x<=30; x++) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int x=30; x>=0; x--) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int x=0; x<=18; x+=3) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int x=10; x>=0; x-=2) {
            System.out.print(x + " ");
        }
        for (int x=1; x<=5; x++) {
            System.out.println("");
            for (int y=1; y<=x; y++) {
                System.out.print("*");
            }
        }
        for (int x=1; x<=5; x++) {
            System.out.println("");
            for (int y=5; y>=x; y--) {
                System.out.print("*");
            }
        }
        System.out.println("");

        for (int x=1; x<=5; x++) {
            System.out.println("*****");
        }
    }
}