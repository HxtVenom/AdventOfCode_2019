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
        int[] arr = new int[]{};

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
}
