## StringCalc
String calculator in Python
Build a method
```add(string numbers)```
* an empty string will return 0
* a single number will return that number
* a comma-delimited pair of numbers returns the sum of those two numbers
* allow a list of comma-delimited values, returning the sum of all of the numbers
* allow newlines (\n) to be embedded in the input string ... they should be ignored
* allow a different single-character delimiter to be specified
  * delimiter appears as the beginning of the string in the form:

    "//[delimiter]\n[rest of input values with specified delimiter"
    e.g. "//[;]\n1;2;3;4"

* using a negative number in the input string throws the exception "negatives not allowed: [number]"], returning the negative number that was passed in [number]
* using multiple negative numbers in the input string will return all of them in the exception as a comma-separated list
    * e.g. throw "negative numbers not allowed: [num1], [num2], etc."
* input numbers greater than 1000 should be ignored.  Add() will return the sum of all non-ignored entries
* allow multi-character delimiters e.g. "//[***]```\``n1***2***3"
* allow multiple delimeters like this "//[delim1][delim2][delim3]" e.g. "//[\*][;][&&]``\``n1&&2*3;4"