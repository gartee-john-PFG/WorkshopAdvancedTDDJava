# WorkshopAdvancedTDDPython
## Review of TDD cycle
* Think
* Red
* Green
* Refactor
# The three rules of TDD
1. You are not allowed to write any production code unless it is to make a failing test pass
2. You are not allowed to write any more of a unit test than is sufficient to fail -- and compilation failures are failures.
3. You are not allowed to write any more production code than is sufficient to pass the one failing unit test

## Introduce the Transform Priority Premise 
The transformations list gives guidance on how to apply small transformations to the code under test in order to evolve it to a more generic implementation. We should try to avoid taking big leaps forward when a small transformation will do. Remember the third law of TDD: "You are not allowed to write any more production code than is sufficient to pass the one failing unit test." 

Transformations on the top of the list should be preferred to those that are lower. It is better (or simpler) to change a constant into a variable than it is to add an if statement. So when making a test pass, you try to do so with transformations that are simpler (higher on the list) than those that are more complex.

On the tables below you can find two different takes on transformation list.
### [Uncle Bob Martin's version](https://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)
|Transformation|Description|
|--------------|-----------|
|({}–>nil)|no code at all->code that employs nil
|(nil->constant)|hard-code a constant value
|(constant->constant+)|a simple constant to a more complex * constant
|(constant->scalar)|replacing a constant with a variable or * an argument
|(statement->statements)|adding more unconditional * statements.
|(unconditional->if)|splitting the execution path
|(scalar->array)|single variable value to an array of values
|(array->container)|array to generic collection
|(statement->recursion)|extract a method that calls itself until ending condition is true
|(if->while)|transform a single if to a while/for loop
|(expression->function)|replacing an expression with a * function or algorithm
|(variable->assignment)|replacing the value of a variable.
### [Micah Martin's version](https://8thlight.com/blog/micah-martin/2012/11/17/transformation-priority-premise-applied.html)...a different take on TPP
Rather than looking at transformations, think about the resulting code.
* constant : a value
* scalar : a local binding, or variable
* invocation : calling a function/method
* conditional : if/switch/case/cond
* while/for/foreach loops : apply iteration
* assignment : replacing the value of a variable

## Tips and Tricks
### Think before Red/Green/Refactor
Examine your code, think about TPP, and decide what transformation you want to force yourself to make.  THEN write the test.
### Naming of tests
Try to avoid using numeric digits in the test names if possible. Remove any 'eye-friction' of having to stop and re-read the test name.
### Assert-first
Write your assertion first, working backwards in the test until you get to a state where compilation is possible.  Then make it pass.
1. You don't generate any unnecessary code in your test...only that which is absolutely required.
2. It makes you think really hard about what you are testing and why
### Code Coverage
1. Make sure you run coverage periodically
2. All new code should be covered...if not, rethink
3. As you refactor, notice coverage gaps...perhaps you can delete unused code
### Mutation Testing
1. Use mutation testing to discover previously untested edge cases
2. Look carefully at which mutations you are going to implement...not all are created equally
### Testing Happy Path only
1. Make sure you test exceptions and failures
2. Make sure you exit as gracefully as your design permits
### Guard Clauses
1. Guard clauses occur first in a method
2. Guard clauses simplify the code that follows by eliminating unnecessary conditionals
3. Consider creating a Guard class with static methods for specific checks
  1. this keeps exception code confined to a single class
  2. this allows for a more readable and consistent code base
### Making your test pass
1. Don't be afraid to hard-code to move from red to green.  Refactoring comes later. 'Fake it until you make it'.
2. 'Make it work', 'Make it Right', 'Make it Fast'.  In THAT order.  Most of the time making code 'faster' or 'more efficient' is unnecessary...optimizing compilers do it better than we do.
### Test size
Keep your tests as short as possible.  Do not make your team read a ton of code in order to understand your test(s)
### Test formatting
Try to keep all three (sometimes four) sections of your test together with a blank line between each section (Arrange/Act/Assert/(optional Annihilate))
### Avoid unnecessary tests
If you have a test that passes when you write it, think about deleting it.  Having one additional test in the suite to 'make yourself feel better' is fine, but don't add very many.
### Refactoring
1. Remember to refactor your tests as well as your production code.
2. Remember that an 'if' is just a single-case 'while/for' loop.  Look for opportunities, if TPP permits, to introduce a loop.
3. Prefer 'larger' refactors to 'smaller' refactors.  Use to eliminate 'feature envy' in large blocks.
### Source Control
1. Commit on Green
2. Refactor and commit again.
3. Always leave yourself a 'good state' to return to if you find you've made an error and want to just 'start over' on the next transform.
### The value of software
1. Primary value - to be maintainable
2. Secondary value - provide value to the customer

If code is not maintainable, we _cannot_ provide value to the customer.  If we can change it/fix it, it really has no value to our organizaiton.  This is why clean code matters so much.

  ## Following the TDD Cycle with Source Control
  * Red
  * Green (make the test pass)
  * _commit here_
  * Refactor
  * _commit here_
  * Try to not make a habit of checking in broken code
    * there is an exception to this.  At the end of a day, to allow yourself to remember where to pick up the next day, you can do so by
      * checking in a broken test (flagging that fact in the commit message)
      * checking in the next test as an empty test
      * checking in the code with a comment in the next test's location of what you want to do next