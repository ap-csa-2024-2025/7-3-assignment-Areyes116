[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18335463)
# unit-7-3-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Problem 1
Write a public static void method named `shiftLeft` which takes a single parameter of an `ArrayList` of `String` objects. The method should shift every element of the parameter `ArrayList` one position to the left, and move the first element of the list into the last position.

For example, if the parameter list passed to the method initially prints as `[dogs, monkeys, cats]`, this would become `[monkey, cats, dogs]` after the method is executed.

**Hint:** think about which built in `ArrayList` methods can cause multiple elements to shift when they are called.

## Problem 2
Write a public static void method named `printStatistics` which takes a single parameter of an `ArrayList` of `Integer` objects. The method should print the `Sum`, `Average` and `Mode` of the integers in the parameter `ArrayList`. If there is more than one mode (i.e. two or more values appear equal numbers of times and no values appear more often), the method should print "no single mode".

For example, if the `ArrayList` parameter prints as `[2, 5, 7, 5]` the `printStatistics` method should produce the following output:
```
Sum: 19
Average: 4.75
Mode: 5
```
Alternatively if the ArrayList parameter prints as `[1, 5, 9, 5, 1]` the `printStatistics` method should produce the following output:
```
Sum: 21
Average: 4.2
Mode: no single mode
```

**Hint:** The way Mr. Vu would initially approach the mode portion of the problem, is to create a boolean variable, `uniqueMode`, and initialize it to false.  If a new mode is found (as in, you found a number that appears the most times), then `uniqueMode` is set to true.  If *another* mode is found (as in, you found a *different* number that appears the most number of times), then `uniqueMode` gets reset to false.
  
