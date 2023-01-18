
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        //The idea is to have a new array, then to add both elements from array1 and array2 to that new array and return the new array
        int lengthTotal = arr1.length + arr2.length;
        int arrCombination[] = new int[lengthTotal];
        int arrFinal[] = new int[arrCombination.length];

        for (int i = 0; i < arr1.length; i++) {
            arrCombination[i] = arr1[i]; //Setting values of arrayCombination equal to values inside of array1 (essentially adding elements from array1)
        }

        for (int j = 0; j < arr2.length; j++) {
            arrCombination[arr1.length + j] = arr2[j]; //We must continue from the length of array 1 which is why we add arr1Length + j
        }

        for (int k = 0; k < arrCombination.length; k++) {
           arrFinal[k] = arrCombination[k];
        }

        return arrFinal;
    }
}
