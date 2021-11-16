public class S2 {


        public static void main(String[] args) {

            int[] myArray = {1, 4, 7, 9};
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == 1) {
                    System.out.println("this is Number:One");
                } else if (myArray[i] == 4) {
                    System.out.println("this is Number:Four");
                } else if (myArray[i] == 7) {
                    System.out.println("this is Number:Seven");
                } else if(myArray[i]==9){
                    System.out.println("this is Number:Nine");
                }else {
                    System.out.println("null");
                }
            }
        }

    }



