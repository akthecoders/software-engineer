public class insertionsort {
    public static void main(String argsp[]) {
        int [] inputData = new int[] {3,4,2,7,4,9,1};
        inputData = sort(inputData);
        for(int i: inputData) System.out.println(i);
    }

    private static int[] sort(int[] input) {
        for(int i = 0; i < input.length; i++) {
            int current = i;
            while(current > 0 && input[current] < input[current - 1]) {
                int temp = input[current];
                input[current] = input[current - 1];
                input[current - 1] = temp;
                current--;
            }
        }
        return input;
    }
}