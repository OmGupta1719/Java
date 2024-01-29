// Positive, Negative or Zero
// Write a method called checkNumber with an int parameter named number.
// The method should not return any value, and it needs to print out:
//     - "positive" if the parameter number is > 0
//     - "negative" if the parameter number is < 0
//     - "zero" if the parameter number is equal to 0
// NOTE:  The checkNumber method needs to be defined as public static
// NOTE:  Do not add a main method to your solution code!


//MAIN METHOD FOR TEST CASES:

public static void main(String[] args) {
      //test case for number being zero
      int zero = 0;
      checkNumber(zero);
      //test case for number being positive
      int positive = 25;
      checkNumber(positive);
      //test case for number being negative
      int negative = -25;
      checkNumber(negative);
}
