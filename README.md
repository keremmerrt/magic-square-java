# Magic Square (Java)

This is a simple Java program that creates a magic square for an odd number n.

A magic square is a square where all rows and columns have the same sum.

## How it works

- The program takes an odd number between 3 and 200
- It starts from the middle of the first row
- Then it moves up and to the right
- If it goes out of bounds, it wraps around
- If the next cell is already filled, it moves one step down instead

## Example

Input:
5

Output:
17 24 1 8 15  
23 5 7 14 16  
4 6 13 20 22  
10 12 19 21 3  
11 18 25 2 9  

## What I practiced

- basic Java syntax  
- loops and conditions  
- 2D arrays  
- thinking about algorithms  

## References

The algorithm is based on the classical Siamese method for constructing odd-order magic squares.