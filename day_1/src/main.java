import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static double fuelCalc(double weight){
        int fuelNeeded = 5;
        int fuel = (int)weight;
        double total = weight;

        while(fuelNeeded > 0){
            fuelNeeded = (fuel / 3) - 2;
            if(fuelNeeded <= 0){
                break;
            }
            fuel = fuelNeeded;
            total += (double)fuel;
            System.out.println(fuelNeeded);
        }

        return total;
    }

    public static double calculateFuel(double weight){
        double calculatedFuel;

        calculatedFuel = weight / 3.0;
        calculatedFuel = Math.floor(calculatedFuel);
        calculatedFuel -= 2;

        return calculatedFuel;
    }

    public static void main(String[] args) {
        HashMap<Double, Double> weights = new HashMap<Double, Double>();
        Path dataFile  = Paths.get("problem.txt");

        double totalFuel = 0;

        try {

            FileInputStream fis = new FileInputStream(dataFile.toFile());
            Scanner scnr = new Scanner(fis);
            double currWeight;

            while(scnr.hasNext()){
                currWeight = scnr.nextDouble();
                if(weights.containsKey(currWeight)){
                    totalFuel += weights.get(currWeight);
                }else{
                    weights.put(currWeight, fuelCalc(calculateFuel(currWeight)));
                    totalFuel += weights.get(currWeight);
                }
            }

            fis.close();
            scnr.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(totalFuel);
    }
}
