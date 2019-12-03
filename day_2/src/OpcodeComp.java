public class OpcodeComp {

    public static int runOp(int[] arr){
        int first, second, third;
        for(int i = 0; i < arr.length; i += 4){
            System.out.println(i);
            if(arr[i] == 99){
                System.out.println("Finished Processing. HALT!");
                break;
            }else if(arr[i] == 1){
                first = arr[i+1];
                second = arr[i + 2];
                third = arr[i + 3];

                arr[third] = arr[first] + arr[second];
            }else if(arr[i] == 2){
                first = arr[i+1];
                second = arr[i + 2];
                third = arr[i + 3];

                arr[third] = arr[first] * arr[second];
            }else{
                System.out.println("Error, invalid code! BROKEN!");
                break;
            }
        }

        return arr[0];
    }

    public static void main(String[] args) {
        boolean solved = false;
            for(int noun = 0; noun <= 100; noun++){
                for(int verb = 0; verb <= 100; verb++){
                    int[] arr = new int[]{1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,1,19,5,23,2,9,23,27,1,5,27,31,1,5,31,35,1,35,13,39,1,39,9,43,1,5,43,47,1,47,6,51,1,51,13,55,1,55,9,59,1,59,13,63,2,63,13,67,1,67,10,71,1,71,6,75,2,10,75,79,2,10,79,83,1,5,83,87,2,6,87,91,1,91,6,95,1,95,13,99,2,99,13,103,1,103,9,107,1,10,107,111,2,111,13,115,1,10,115,119,1,10,119,123,2,13,123,127,2,6,127,131,1,13,131,135,1,135,2,139,1,139,6,0,99,2,0,14,0};
                    arr[1] = noun;
                    arr[2] = verb;
                    int solution = runOp(arr);
                    if(solution == 19690720){
                        solved = true;
                        System.out.println("Noun: " + noun);
                        System.out.println("Verb: " + verb);
                        break;
                    }
                }
                if(solved){
                    break;
                }
            }
    }
    /*---PART1
    public static void main(String[] args) {
        int[] arr = new int[]{1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,1,19,5,23,2,9,23,27,1,5,27,31,1,5,31,35,1,35,13,39,1,39,9,43,1,5,43,47,1,47,6,51,1,51,13,55,1,55,9,59,1,59,13,63,2,63,13,67,1,67,10,71,1,71,6,75,2,10,75,79,2,10,79,83,1,5,83,87,2,6,87,91,1,91,6,95,1,95,13,99,2,99,13,103,1,103,9,107,1,10,107,111,2,111,13,115,1,10,115,119,1,10,119,123,2,13,123,127,2,6,127,131,1,13,131,135,1,135,2,139,1,139,6,0,99,2,0,14,0};

        int first, second, third;
        for(int i = 0; i < arr.length; i += 4){
            System.out.println(i);
            if(arr[i] == 99){
                System.out.println("Finished Processing. HALT!");
                break;
            }else if(arr[i] == 1){
                first = arr[i+1];
                second = arr[i + 2];
                third = arr[i + 3];

                arr[third] = arr[first] + arr[second];
            }else if(arr[i] == 2){
                first = arr[i+1];
                second = arr[i + 2];
                third = arr[i + 3];

                arr[third] = arr[first] * arr[second];
            }else{
                System.out.println("Error, invalid code! BROKEN!");
                break;
            }
        }

        System.out.println(arr[0]);
    }
    */
}
