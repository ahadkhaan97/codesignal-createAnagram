You are given two strings s and t of the same length, consisting of uppercase English letters. Your task is to find the minimum number of "replacement operations" needed to get some anagram of the string t from the string s. A replacement operation is performed by picking exactly one character from the string s and replacing it by some other character.

Example

For s = "AABAA" and t = "BBAAA", the output should be
solution(s, t) = 1;
For s = "OVGHK" and t = "RPGUC", the output should be
solution(s, t) = 4.
Input/Output

[execution time limit] 3 seconds (kt)

[input] string s

Guaranteed constraints:
5 ≤ s.length ≤ 35.

[input] string t

Guaranteed constraints:
t.length = s.length.

[output] integer

The minimum number of replacement operations needed to get an anagram of the string t from the string s.