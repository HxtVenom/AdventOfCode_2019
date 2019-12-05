import java.util.ArrayList;
import java.util.Scanner;

public class day_4 {

    public static int[] splitRange(String r){
        String[] range = r.split("-");
        int[] nums = new int[2];
        for(int i =0; i < range.length; i++){
            nums[i] = Integer.parseInt(range[i]);
            //System.out.println(Integer.parseInt(range[i]));
        }

        return nums;
    }

    public static ArrayList<Integer> countPossible(int[] r){
        int num = r[0];
        int max = r[1];
        int[] splitNum = new int[6];
        ArrayList<Integer> result = new ArrayList<>();

        while(num <= max){
            //System.out.println(num);
            int temp = num;
            for(int i = 5; i > -1; i--){
                splitNum[i] = temp % 10;
                temp = temp / 10;
                //System.out.println( i  +" " + splitNum[i]);
            }

            if((splitNum[0] <= splitNum[1]) && (splitNum[1] <= splitNum[2])  && (splitNum[2] <= splitNum[3])  && (splitNum[3] <= splitNum[4]) && (splitNum[4] <= splitNum[5])) {
                if ((splitNum[0] == splitNum[1]) || (splitNum[1] == splitNum[2]) || (splitNum[2] == splitNum[3]) || (splitNum[3] == splitNum[4]) || (splitNum[4] == splitNum[5])){
                    result.add(num);
                }
            }
            num++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String range;

        System.out.println("Enter range:");
        range = scnr.next();

        int[] intRange = splitRange(range);

        ArrayList<Integer> numOfPass= new ArrayList<Integer>(countPossible(intRange));

        System.out.println("Possible passcodes: " + numOfPass.size());
    }
}
