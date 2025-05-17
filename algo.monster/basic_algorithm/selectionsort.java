public class selectionsort {
    public static void main(String[] args) {
        int [] inputData = new int[] {3,4,2,7,4,9,1};
        inputData = sort(inputData);
        for(int i: inputData) System.out.println(i);
    }

    private static int[] sort(int[] data) {
        for(int i = 0; i < data.length; i++) {
            int smallestIndex = i;
            for(int j = i; j < data.length; j++) {
                if(data[smallestIndex] > data[j]) {
                    smallestIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[smallestIndex];
            data[smallestIndex] = temp;
        }
        return data;
    }
}
