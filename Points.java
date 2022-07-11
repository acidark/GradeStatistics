import java.util.ArrayList;
//import java.util.Collections;
public class Points {
    private ArrayList<Integer> points;
    private double abovePassing;
    private double numbers;
    private int above50;
    private int above60;
    private int above70;
    private int above80;
    private int above90;
    private int below50;

    public Points(){
        this.points = new ArrayList<>();
        this.numbers=0;
        this.abovePassing=0;
    }
    public void add(int points){
        if(points >= 0 && points <= 100){
            this.points.add(points);
        }
    }
    public double avg(){
        int sum =0;
        //int numbers =0;
        //System.out.println(points);
        for (int i : points){
            sum+=i;
            if(i >= 50){
                //this.abovePassing.add(i);
                this.abovePassing+=i;
                this.numbers+=1;
                //System.out.println(this.numbers);
                if(i>=60 && i<70){
                    above60++;
                }
                if(i>=70 && i<80){
                    above70++;
                }
                if(i>=80 && i<90){
                    above80++;
                }
                if(i>=90){
                    //above(5);
                    above90++;
                }
                if (i < 60) {
                    above50++;
                }
            } else {
                below50++;
            }
        }
        return sum/points.size();
        //return this.numbers;

    }
    public int above(int aboveWhat){
        if(aboveWhat==5){
            return this.above90;
        }
        if(aboveWhat==4){
            return this.above80;
        }
        if(aboveWhat==3){
            return this.above70;
        }
        if(aboveWhat==2){
            return this.above60;
        }
        if(aboveWhat==1){
            return this.above50;
        }
        return below50;
    }
    public String abovePassingPoint(){
        if (this.numbers > 0){
        //    return this.abovePassing/this.numbers;
            return ""+ (double) this.abovePassing/this.numbers;
        }
        //return this.abovePassing/this.numbers;
        return "-";
    }
    public double passPercentage(){
        if (this.numbers > 0){
            
           return 100 * this.numbers/this.points.size();
           //return this.numbers;
        }
        return 0.0;
    }
    /*public void gradeTable(){
        //for (int i = 5 ; i>-1;i--){
        String star = "*";
        System.out.println(5+":"+star.repeat(above90));
        System.out.println(4+":"+star.repeat(above80));
        System.out.println(3+":"+star.repeat(above70));
        System.out.println(2+":"+star.repeat(above60));
        System.out.println(1+":"+star.repeat(above50));
        System.out.println(0+":"+star.repeat(below50));
        //}
    }*/
    public void table(){
        for(int i=5;i>-1;i--){
            System.out.print(i+": ");
            for(int j=0;j<above(i);j++){
                //System.out.println("5: );
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
