/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 3/20/12
 * Time: 10:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Converter {

    public int convert(String binaryString) {
        int[] intArry = parseStringToIntArray(binaryString);
        int arrayLength = intArry.length - 1;
        int returnValue = 0;
        for (int i = 0; i < intArry.length; i++) {
            if (intArry[arrayLength-i] == 1) {
                returnValue +=  Math.pow(2,i);

            }
        }
        return returnValue;
    }

    public int[] parseStringToIntArray(String binaryString) {
        char[] charArray = binaryString.toCharArray();
        int charArrayLength = charArray.length;
        int[] intArray = new int[charArrayLength];
        for (int i = 0; i < charArrayLength; i++) {
            intArray[i] = Integer.parseInt(String.valueOf(charArray[i]));    
        }

        return intArray;
    }

}
