//import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    //private int points;
    //private ArrayList<Integer> pointsList;

    public UserInterface(){
        //this.pointsList = new ArrayList<>();
    }
    public void start(){
        Points coursePoints = new Points();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter point totals,-1 stops:");
            int points = Integer.valueOf(scanner.nextLine());
            if(points == -1){
                break;
            }
            coursePoints.add(points);
        }
        System.out.println("Point average (all): "+coursePoints.avg());
        System.out.println("Point average (passing): "+coursePoints.abovePassingPoint());
        System.out.println("Pass percentage: "+coursePoints.passPercentage());
        coursePoints.table();
    }

}
