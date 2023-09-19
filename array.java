public class array {
    public static void main(String[] args) {
      /*  int [] marks = new int[5];
        marks [0] = 98;
        marks [1] = 48;
        marks [2] = 38;
        marks [3] = 58;
        marks [4] = 88;
        System.out.println(marks [1]);

        int [] marks = {98,67,45,89,9};
        System.out.println(marks[1]);

        int [] marks = {12,34,54,57,78};
        System.out.println(marks [0]);
        System.out.println(marks [1]);
        System.out.println(marks [2]);
        System.out.println(marks [3]);
        System.out.println(marks [4]);
       */
        int [] marks = {12,34,54,57,78};
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        for(int i = marks.length -1;i>=0; i--){
//            System.out.println(marks[i]);
//        }
        for (int elements: marks){
            System.out.println(elements);
        }
    }
}
