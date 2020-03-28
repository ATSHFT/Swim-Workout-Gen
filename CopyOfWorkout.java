/**
 * Random Swim CopyOfWorkout.
 *
 * @author (Joshua)
 * @version (Feb. 26, 2020)
 */
import java.util.Random;
import java.util.Scanner;
public class CopyOfWorkout
{
      public static void main(String[] args)
    {
        while(true){
        Scanner input = new Scanner(System.in);
        int x = 3000;
        
        // Warmup
        int WU = 200;

        // Distance Set
            
        // Randomize reps    
        int[] setDist = {2,3,4,5,6,8}; 
        Random r = new Random();
        int randomNumber=r.nextInt(setDist.length);
       
        // Randomize distance
        int[] lapDist = { 50, 100, 150, 200, 250, 300, 400 };
        Random s = new Random();
        int randomNumbers=s.nextInt(lapDist.length);
    
        // Calculate  total distance
        int totalDistance;
        totalDistance = (setDist[randomNumber] * lapDist[randomNumbers]);
       
        // Pull Set
        
        // Randomize reps    
        int[] setDist2 = {2,3,4,5,6,8}; 
        Random r2 = new Random();
        int randomNumber2=r2.nextInt(setDist2.length);
        
        // Randomize distance 
        int[] lapDist2 = { 50, 100, 150, 200, 250, 300, 400 };
        Random s2 = new Random();
        int randomNumbers2=s2.nextInt(lapDist2.length);
        
        // Calculate total distance
        int totalDistance2;
        totalDistance2 = (setDist2[randomNumber2] * lapDist2[randomNumbers2]);
        
        // Kick Set
        
        // Randomize reps
        int[] setDist3 = {2,3,4,5,6,8}; 
        Random r3 = new Random();
        int randomNumber3=r3.nextInt(setDist3.length);
        
        // Randomize distance
        int[] lapDist3 = { 50, 100, 150, 200, 250, 300, 400 };
        Random s3 = new Random();
        int randomNumbers3=s3.nextInt(lapDist3.length);
        
        // Calculate total distance
        int totalDistance3;
        totalDistance3 = (setDist3[randomNumber3] * lapDist3[randomNumbers3]);
        
        // Sprint Set
        
        // Randomize reps
        int[] setDist4 = {2,3,4,5,6,8}; 
        Random r4 = new Random();
        int randomNumber4=r4.nextInt(setDist4.length);
        
        // Randomize distance
        int[] lapDist4 = {25,50,75,100, 150};
        Random s4 = new Random();
        int randomNumbers4=s4.nextInt(lapDist4.length);
        
        // Calculate total distance
        int totalDistance4;
        totalDistance4 = (setDist4[randomNumber4] * lapDist4[randomNumbers4]);
        
        // Cooldown
        int CD = 200;

        // Maintaining Parameters and Calculations within perdefinied inputs
        int y = WU + totalDistance + totalDistance2 + totalDistance3 + totalDistance4 + CD;
    
            if (y == x){
            
            // Print the Workout Information
            System.out.println("Warmup:" + WU);
            System.out.println("Distance Set:" + setDist[randomNumber] + "x" + lapDist[randomNumbers]);
            System.out.println("Pull Set:" + setDist2[randomNumber2] + "x" + lapDist2[randomNumbers2]);
            System.out.println("Kick Set:" + setDist3[randomNumber3] + "x" + lapDist3[randomNumbers3]);
            System.out.println("Sprint Set:" + setDist4[randomNumber4] + "x" + lapDist4[randomNumbers4]);
            System.out.println("Cooldown:" + CD);
            System.out.println("Overall Distance:" + y);
        
            break;
           }
       }
    }
}
