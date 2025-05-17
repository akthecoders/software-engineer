public class bubblesort {
    public static void main(String argsp[]) {
        int [] inputData = new int[] {3,4,2,7,4,9,1};
        inputData = sort(inputData);
        for(int i: inputData) System.out.println(i);
    }

    private static int[] sort(int[] data) {
        for(int i = data.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for(int j = 0; j < i; j++) {
                if(data[j] > data[j+1]) {
                    swapped = true;
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            if(!swapped) return data;
        }
        return data;
    }
}
