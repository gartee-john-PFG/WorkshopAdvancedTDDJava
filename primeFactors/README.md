# Prime Factors Kata

Write an algorithm that breaks down any positive integer into a list of its prime factors in ascending order.

definition: A prime number is an integer greater than 1 that has exactly two prime factors: 1 and itself.

* 1 returns []
* 2 returns [2]
* 3 returns [3]
* 4 returns [2, 2]
* 5 returns [5]
* 6 returns [2, 3]
* 7 returns [7]
* 8 returns [2, 2, 2]
* 9 returns [3, 3]
* 10 returns [2, 5]
* .
* .
* .
* 210 returns [2, 3, 5, 7]
* etc.

Surprisingly, when refactored correctly, this algorighm consists of very few lines of code.

See if you can TDD your way to that result!