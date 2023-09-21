public class pracitce_set_6 {
    public static void main(String[] args) {
   /*     float [] marks = {1.2f,2.3f,2.5f,4.5f,5.7f};
//        float sum = marks[0] + marks[1] + marks[2] + marks[3] + marks [4];
//        System.out.println(sum);
        float sum = 0;
        for (float elements: marks) {
            sum = sum + elements;
        }
            System.out.println("the total sum of marks is :" +sum);

        //question 2
//        int[] a = {1, 2, 3, 4, 5};
//        int num = 9;
//        for (int element: a)
//        if (num == element) {
//            System.out.println("yes num is present in array");
//            break;
//        }
//            else{
//            System.out.println("no num is not present in array");
//            break;
        int[] a = {1, 2, 3, 4, 5};
        int num = 3;
        boolean isInArray = false;
        for (int element: a) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("yes num is present in array");
        }
        else{
                System.out.println("no num is not present in array");
            }
//    Practice Problem 3
        int [] marks = {45,56,78,45,23};
        float sum = 0;
        for (int elements : marks){
            sum = sum + elements;
        }
        System.out.println(sum/marks.length);

//     Practice Problem 4
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{4, 5, 7},
                {3, 5, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }

//        practice problem 5
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i = 0; i<n;i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }

        //practice problem 6
        int [] arr = {1,2,4,6,7};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
               max = e;
            }
        }
        System.out.println(max);

//    practice problem 7
        //practice problem 6
        int [] arr = {1,2,4,6,7};
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println(min);
    */
        //    practice problem 8
        boolean isSorted = true;
        int [] arr = {1,2,41,6,7};
        for(int i = 0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("the array is sorted");
        }
            else{
                System.out.println("the array is not sorted");
        }
    }
}
