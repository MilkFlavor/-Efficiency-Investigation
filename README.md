# -Efficiency-Investigation
“When is linear search more efficient than binary search”... Time to find out!


This is an individual project. Note that your results can be affected by factors other than the code itself. (Such as how fast your computer is). So your solutions may be somewhat different from another person’s in the class. Therefore, avoid comparisons to also avoid self-doubt 👍
What you’ll be handing in…
Your code - zip your IntelliJ project folder and rename with your first and last name; your IntelliJ project folder should have…
Main.java
RandomList.java
A short written analysis
The Membership Problem
Given a set S of n numbers and a target value x, the membership problem is to answer the question, “Is x in S?”
There are numerous ways to answer this question – some are quite sophisticated, but in this assignment we will consider the two simplest:
Algorithm A: Store the set S in an array, in whatever order the values are given. Without sorting, use linear/sequential search to determine if x is in S. Return “Yes” or “No” as appropriate.
Algorithm B: Store the set S in an array. Sort the set using a sorting algorithm, then use binary search to determine if x is in S. Return “Yes” or “No” as appropriate.
Now suppose we are making multiple searches…
We have S, which is our set of numbers
We also have another array of “target” values, T, and we want to determine if each of them are in our set S
Then our algorithms can be:
Algorithm MA: Store the set S in an array, in whatever order the values are given. For every number in T, use linear/sequential search.
Algorithm MB: Store the set S in an array. Sort the set using a sorting algorithm. Then, for every number in T, use binary search.

When does Algorithm MB become faster than Algorithm MA?

Or, when does it become worth it to sort before searching? 
If we are doing a very small number of searches, Algorithm MA is preferable. However if we are doing many searches of the same set, Algorithm B is preferable since the time required to sort the set once is more than offset by the reduced time for the searches. That’s the theory.
Your task is to conduct experiments to explore the relationship between the size of the set and the number of searches required to make Algorithm MB preferable to Algorithm MA.
