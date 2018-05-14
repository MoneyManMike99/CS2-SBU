# Program 2

## Description
HTML (Hypertext Markup Language) is a series of "embedded" tags inserted into a text file so a browser can display the file in a formatted fashion (colors, text, etc. are all controlled by html). Like many things, however, HTML—and other embedded things like javascript—can also cause problems like popup windows or non-compliance with a particular browser.

Given an HTML file with HTML tags, your program should filter out the tags and produce a file with nothing but the text.

Your program should use a linked queue data structure to store the words which are not HTML tags.  When you finish, your program should display the file without the HTML tags.

## Input
Your program should read in any legitimate HTML file provided. Three samples are given in the assignment.

## Output
Your program should display the filtered text file on the screen AND write it out to a second file.  In both cases the output should be with one word per line.

## Turn In
A printed UML class diagram of all classes with accurate relationships represented.

Use the three test pages as your test suite.  Note that most filters do not achieve 100% accuracy.  Success will be judged by a 90-95% ability to strip out HTML tags and codes, particularly on test case 3

- Test Case 1:	simple.html
- Test Case 2:	medium.html
- Test Case 3:	challenge.html
