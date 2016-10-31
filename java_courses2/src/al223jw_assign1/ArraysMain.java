package al223jw_assign1;

public class ArraysMain {
    public static void main(String[] args) {

            int[] testingArray = {1, 2, 3, 4, 5};
            int[] testArray2 = {5, 7, 8, 1, 2};
            int testNumber = 5;
            int testNumber2 = 6;

            System.out.println("Testing sum:");
            System.out.println(Arrays.sum(testingArray));
            System.out.println("");

            System.out.println("Testing toString");
            System.out.println(Arrays.toString(testingArray));
            System.out.println("");

            System.out.println("Testing addN:");
            System.out.println(Arrays.toString(Arrays.addN(testingArray, testNumber)));
            System.out.println("");

            System.out.println("Testing reverse:");
            System.out.println(Arrays.toString(Arrays.reverse(testingArray)));
            System.out.println("");

            System.out.println("Printing Array:");
            System.out.println(Arrays.toString(testingArray));

            System.out.println("Testing replaceAll");
            Arrays.replaceAll(testingArray, testNumber2, testNumber);
            System.out.println(Arrays.toString(testingArray));
            System.out.println("");

            System.out.println("Testing sort:");
            System.out.println(Arrays.toString(Arrays.sort(testingArray)));
            System.out.println("");

            System.out.println("Testing hasSubsequence:");
            System.out.println(Arrays.hasSubsequence(testingArray, testArray2));
            System.out.println("");

            System.out.println("Printing arr1 and 2:");
            System.out.println(Arrays.toString(testingArray));
            System.out.println(Arrays.toString(testArray2));

            System.out.println("Testing asbDif:");
            System.out.println(Arrays.toString(Arrays.absDif(testingArray, testArray2)));
            System.out.println("");

        }
    }