# Exercise 1 : Mars Rover
 
A robot lands on Mars, which happens to be a cartesian grid; assuming that we hand the robot these instructions, such as LFFFRFFFRRFFF, where "L" is a "turn 90 degrees left", "R" is a "turn 90 degrees right", and "F" is "go forward one space, please write control code for the robot such that it ends up at the appropriate-and-correct destination, and include unit tests.

Here is an example output with command `"FF"`:

`[0, 2]`

## Initial Thoughts : 

Since we have been given with L, R and F as the valid command, we will keep updating direction and co-ordinates throughout the application.

## Design Pattern : 

Command Design Pattern.
 
Reference URL: https://www.tutorialspoint.com/design_pattern/command_pattern.htm

# Exercise 2 : Count numbers without loops

Part 1:

Write a program that counts in sequential order when given a start and end value - without using any iterative programming loops, i.e. while, for, do, for-each, etc. You can assume that both the start and end values will always be positive and that the start value will always be less then the end value. There should only be one method with the following signature:

```
void countUp(int start, int end) {
 // All code exercise code should go here
}
```
Here is example output with start=0 and end=5:

`0 1 2 3 4 5`
 
Part 2:

Continuing with part 1 change the output of the test, so that it now prints out in sequential order to the end value (only once), but then also counts down to the start value. Again, using no iterative loops, and assuming that both the start and end values will always be positive and that start value will always be less than the end value. There should only be one method with the following signature:

```
void countUpAndDown(int start, int end) {
// All code exercise code should go here
}
```
Here is example output with start=0 and end=4:

`0 1 2 3 4 3 2 1 0`

# How to build?
`mvn clean install`

# How to run?
`java -jar target/kayak-exercise-1-jar-with-dependencies.jar`
`java -jar target/kayak-exercise-2-jar-with-dependencies.jar`

# To Do: 
1. Add exception handling
2. Handle edge cases


