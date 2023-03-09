# CPSC1150-Assignment9
Decimal to Roman numeral converter - Completed Nov 2022

For this assignment, the program takes in a positive integer from user input with Scanner and converts it to its Roman numeral equivalent. Input validation includes checking if the integer is positive, greater than 0 and no greater than 3999. In the algorithm I designed, I created 4 String arrays; `thousands[]` to represent  digits in the 'thousands' position, `hundreds[]` to represent digits in the 'hundreds' position, `tens[]` to represent digits in the 'tens' position and `ones[]` to represent the 'ones' digits. In each array, I also included an empty string in the [0] index of each array. For example, my hundreds array looked like this:

```java 
String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
```

This ensured that when using modulo to retrieve the digit in the ones/tens/hundreds/thousands slot, I could safely retrieve it's corresponding index in the array without having to consider whether the first digit in the array actually starts at index 0. 

Using these arrays I would simply convert the integer by building a String with

```java
thousands[number/1000] + hundreds[(number%100)/100] + tens[(number%100)/10] + ones[number%10]
```
