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


At what value for n did Algorithm MB become faster than Algorithm MA?
By taking a look at the data that was collected we can see that the MB algorithm surpasses MA in speed at around 50 n. However, on the other hand the MB algorithm seems to stay consistent with its speed only gradually becoming slower due to datasets reaching >1000. This is due to linear search being more effective against arrays that are smaller while binary search is more efficient in larger datasets.

What did you notice about the runtimes when n was smaller or larger than your answer to question 1?
From looking at the data, we can see that linear search is best suited for datasets less than 50. However, it seems that binary search is consistently better in datasets larger than 50.

Explain how your observation in question 2 could make sense, based on what you know about algorithms.
Binary search, which is used in Algorithm MB, has a time complexity of O(log n), making it more efficient than linear search (used in Algorithm MA) with a time complexity of O(n) for larger datasets. This is why Algorithm MB becomes faster than Algorithm MA as (n) increases.

What if you change the size of T, your target search values? How would you expect n to change?

If the size of T, the number of target values, increases, this means more searches are being performed. In this case, the value of n (the size of the set S) at which Algorithm MB becomes faster than Algorithm MA would likely decrease. This is because the cost of sorting S once in Algorithm MB can be spread over more searches, making the overall time for multiple searches potentially less than that of Algorithm MA.

On the other hand, if the size of T decreases (fewer searches), the value of n at which Algorithm MB becomes faster than Algorithm MA would likely increase. This is because the benefit of the faster binary search in Algorithm MB is less pronounced when fewer searches are being performed, and the initial cost of sorting S becomes more significant.

So, the size of T can significantly impact the value of n at which Algorithm MB becomes more efficient than Algorithm MA. The larger T is, the smaller n can be for MB to outperform MA, and vice versa.

It was suggested that when coding Algorithm MB, you use Arrays.sort(). Why would Algorithm MB never be more efficient than Algorithm MA if you were asked to code Bubble sort, Selection sort, or Insertion sort in Algorithm MB? Answer with reference to complexity and Big O.
	
	Bubble sort, Selection sort, or Insertion sort in Algorithm MB, it would never be more efficient than Algorithm MA. This is because these sorting algorithms have a time complexity of O(n^2) in the average and worst cases, which is significantly less efficient than the binary search used in Algorithm MB with a time complexity of O(log n). Therefore, regardless of the dataset size, Algorithm MB would have a higher overall complexity compared to Algorithm MA, making it less efficient.
