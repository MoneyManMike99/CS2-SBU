# Maze Solver
This assignment is based on
[Don Blaheta's nifty assignment](http://nifty.stanford.edu/2008/blaheta-maze/cs2/index.html).

Consider a basic maze. It has walls and pathways, and it has one
starting point and one finish point. Furthermore, one wall is
just like another, and any open spaces (not including start and finish) are also
identical. That sounds like a job for enumerated types:
* [Java tutorial on enum types](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)
* [more examples](https://www.mkyong.com/java/java-enum-example)

The ```SquareType.java``` defines an enumerated type that can represent those
six values. Each one has an associated one-character representation:
* walls ```#``` (hash mark)
* open spaces ```.``` (period)
* start ```o``` (lowercase 'O')
* finish ```*``` (asterisk)
* tried ```x``` (lowercase 'X')
* path ``` ``` (space)

The ```toString``` method returns a one-character long string containing
only the character corresponding to this ```SquareType```. The static method
```fromChar``` returns the ```SquareType``` associated with the given ```char```.
When provided with one of the four legal characters, ```fromChar``` returns one
of the ```SquareType``` values and any other input will generate an
```IllegalArgumentException```.) Check out ```tests/SquareTypeTest.java``` for
concrete examples on how the ```SquareType``` class can be used.

## Task 1

We will use a five-operation agenda ADT for navigating the maze. This is an
important idea but not quite present in the Java libraries. In this
problem, you’ll adapt existing library code into a more abstract framework.
First, we write the ```Agenda<T>``` interface. It should require five methods:
```isEmpty```, ```size```, ```add```, ```remove```, and ```peek```.

Then, we write two classes ```MyStack<T>``` and ```MyQueue<T>``` that implement
the ```Agenda``` interface using, respectively, a LIFO policy and a FIFO policy.
Code re-use is key here; all the real algorithm work is already done, and your
only job is to adapt it for use in this framework. Remember,
you’re using the implementations of Stack and Queue from Java libraries:
use [java.util.Stack](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html)
to implement ```MyStack<T>``` and use
[java.util.LinkedList](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)
to implement ```MyQueue<T>```.

You will need to finish implementing ```MyStack.java``` and ```MyStackTest.java```
using ```MyQueue.java``` and ```MyQueueTest.java``` as examples.

### check point
Run both test classes and ensure the output is expected before you move on:
```
javac tests/MyQueueTest.java
java tests.MyQueueTest
javac tests/MyStackTest.java
java tests.MyStackTest
```

## Task 2
Finish the implementation of the ```Maze``` class. An object of this class can
store a maze as a 2D array of ```Square```s (Remember, a 2D array is just like a 1D
array, except that you always provide two indices.)
Maze should have a constructor that takes the maze configuration file name
and reads the file using a ```Scanner```. The first line of the configuration
file contains the dimensions of the maze (columns and rows) and subsequent lines
each contains one row of the maze, with each character representing one square
of the maze.

The ```Square``` class is provided. An object of this class stores the
```SquareType``` and the row and the column indices of the square.
The ```toString``` method returns the char that corresponds to the
```SquareType```. Check out ```tests/SquareTest.java``` to see how this
class can be used.

The ```toString``` method of ```Maze`` class returns a ```String```representation
of this Maze in the same format as the input. (This will be handy in testing your
code...)

A simple example of the input/output format:
```
7 4
#######
#...#o#
#*#...#
#######
```

A more complex example:
```
12 10
############
#.#........#
#.#.######.#
#.#....#...#
#.###.*#.#.#
#...####.#.#
#.#.#..#.#.#
#.#.#.##.#.#
#o#......#.#
############
```

### check point
Run the following test and ensure the output is expected before you move on:
```
javac tests/MazeTest.java
java tests.MazeTest
```
## Task 3
Finish implementing the ```solve``` method in ```MazeSolver.java``` using the
following algorithm:

At the start:
1. Create an (empty) agenda of locations to explore.
1. Add the neighbors of the starting square to it.

Repeat the following steps:
1. Is the agenda empty? If so, the finishing square is unreachable; return
   false (unsolvable).
2. Grab a square from the agenda.
3. Is the square the finishing square? If so, the finish was reachable; return true
   (solved).
4. Is the square a "SPACE" square? If so, explore it as follows:
   1. get all the adjacent/neighbor squares that are inside the maze and
   aren’t walls, and
   1. add them to the agenda for later exploration.
   1. record the fact that you’ve tried this square so you won’t
   ever have to explore it again (avoid circles).

Note that this pseudocode is entirely agnostic as to what kind of agenda you
use. You’ll need to pick one when you create the agenda, but subsequently
everything should work more abstractly in terms of the Agenda operations.

### check point
Test your ```MazeSolver``` thoroughly using the provided maze files. You can also
create your own maze files for testing.

For example, test using MyStack as the agenda:
```
javac maze/MazeSolver.java
java maze.MazeSolver maze2.txt
This maze is solved:
############
#x#xxxxxxxx#
#x#x######x#
#x#xxx.#xxx#
#x###x*#x#.#
#xxx####x#.#
#x#x#..#x#.#
#x#x#.##x#.#
#o#xxxxxx#.#
############
```

For example, test using MyQueue as the agenda:
```
javac maze/MazeSolver.java
java maze.MazeSolver maze2.txt
This maze is solved:
############
#.#xxxxxxxx#
#.#x######x#
#x#xxxx#xxx#
#x###x*#x#x#
#xxx####x#x#
#x#x#xx#x#x#
#x#x#x##x#x#
#o#xxxxxx#x#
############
```

