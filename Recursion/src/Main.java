import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How far do you want to walk?🚶");
        int distance = scanner.nextInt();
        takeAStep(0,distance);//start place and distance
    }
    static void takeAStep(int i,int distance){
        if(i<distance){
            i++;
            System.out.println("You take a step : "+i+" meter/s.🚶");
            takeAStep(i,distance);
        }
        else{
            System.out.println("You are done walking.🏅");
        }
    }

}