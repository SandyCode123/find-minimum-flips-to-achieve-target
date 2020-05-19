# find-minimum-flips-to-achieve-target
Find a program to find minimum flips required to achieve a target binary string. When a digit is flipped, its value and those to the right switches a state between 0 and 1.

Asked in Morgan Stanley. I was first one to encounter. So i found a solution and posted. Also posted the solution to GeeksForGeeks at below link.

Sample Input Outputs:

input: 01011
output: 3

input: 01001
output: 3

input: 1111
output: 1

How does it works?

1. Start with an char array of 0s. You are going to modify this array to achieve target string.
2. Define variable flips to hold number of flips happened till now.
3. Iterate through the char array.
4. First check if flips count is even or odd.  
   If flips count is odd then actual current character in default array is reverse of what it is right now.
   If flips count is even then current character in default array is is correct.  
5. Now match character in target and default array. If both different then copy required character to default array from target array.
   Also increment the flip count.
6. Repeat 4 and 5 till the end of array.

Pick: Here we are not actually flipping right side characters in default array. But just keeping count of flips. Now if flips is odd while processing for a particular character, means there is change in character than what was present initially. So it saved O(n)
