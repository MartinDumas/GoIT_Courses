package phrase;

import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text){
        int digitCount = 0;

        for (char c : text.toCharArray()){
            if (Character.isDigit(c)){
                digitCount++;
            }
        }
        int index = 0;

        int[] resultArray = new  int[digitCount];
        for (char s : text.toCharArray()){
            if (Character.isDigit(s)){
                resultArray[index++] = Character.getNumericValue(s);

            }
        }
        return resultArray;

    }

    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
    }

