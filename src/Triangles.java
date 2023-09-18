// accesses the Java Library for this file so the scanner stuff actually works
import java.util.Scanner;




/*
Task
write a program that can print out equilateral triangles of different sizes.
You will print them out using a ASCII characters.

Details
    You should get two pieces of input from the user:
        the size of the triangle
        the character to use for drawing it (called the “fill” character).
    The Scanner has no “nextChar” function. Instead, you can just read a String, and use the first character of it:

    in.next( ).charAt(0);

    You should make sure that the size is in the range 1-50.
    If the user enters zero, a negative number, or one greater than 50, you should repeatedly ask them for a new size.
    To make the triangles look more balanced, you should put a space between each fill character.
    After running the program, it should ask the user if they want to run it again.
    If so, get input and draw a new triangle.
    If not, the program should exit.

Example Run

Here is an example run of this program. User input is shown in bold face:

Enter size: 7
Enter fill: #
      #
     # #
    # # #
   # # # #
  # # # # #
 # # # # # #
# # # # # # #
Would you like another triangle (Y/N)?
: y
Enter size: 15
Enter fill: +
              +
             + +
            + + +
           + + + +
          + + + + +
         + + + + + +
        + + + + + + +
       + + + + + + + +
      + + + + + + + + +
     + + + + + + + + + +
    + + + + + + + + + + +
   + + + + + + + + + + + +
  + + + + + + + + + + + + +
 + + + + + + + + + + + + + +
+ + + + + + + + + + + + + + +
Would you like another triangle (Y/N)?
: y
Enter size: -12
Size must be between 1-50!
Enter size: 88
Size must be between 1-50!
Enter size: 0
Size must be between 1-50!
Enter size: 3
Enter fill: ~
  ~
 ~ ~
~ ~ ~
Would you like another triangle (Y/N)?
: y
Enter size: 2
Enter fill: #
 #
# #
Would you like another triangle (Y/N)?
: y
Enter size: 1
Enter fill: Q
Q
Would you like another triangle (Y/N)?
: y
Enter size: 50
Enter fill: %
                                                 %
                                                % %
                                               % % %
                                              % % % %
                                             % % % % %
                                            % % % % % %
                                           % % % % % % %
                                          % % % % % % % %
                                         % % % % % % % % %
                                        % % % % % % % % % %
                                       % % % % % % % % % % %
                                      % % % % % % % % % % % %
                                     % % % % % % % % % % % % %
                                    % % % % % % % % % % % % % %
                                   % % % % % % % % % % % % % % %
                                  % % % % % % % % % % % % % % % %
                                 % % % % % % % % % % % % % % % % %
                                % % % % % % % % % % % % % % % % % %
                               % % % % % % % % % % % % % % % % % % %
                              % % % % % % % % % % % % % % % % % % % %
                             % % % % % % % % % % % % % % % % % % % % %
                            % % % % % % % % % % % % % % % % % % % % % %
                           % % % % % % % % % % % % % % % % % % % % % % %
                          % % % % % % % % % % % % % % % % % % % % % % % %
                         % % % % % % % % % % % % % % % % % % % % % % % % %
                        % % % % % % % % % % % % % % % % % % % % % % % % % %
                       % % % % % % % % % % % % % % % % % % % % % % % % % % %
                      % % % % % % % % % % % % % % % % % % % % % % % % % % % %
                     % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
                    % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
                   % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
                  % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
                 % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
                % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
               % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
              % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
             % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
            % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
           % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
          % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
         % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
        % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
       % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
      % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
     % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
    % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
   % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
  % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
 % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
% % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % % %
Would you like another triangle (Y/N)?
: N

 */

//first class in the file needs to be named for the file for anything to start
public class Triangles {

    //this line declares the main method which lets a computer access and use the file
    public static void main(String[] args) {

        //this block gets the number of bottles of beer input from the user
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input1.nextInt();
        System.out.println("Enter fill: ");

    }
}
