package org.example;

/*
binary operations are operations that are performed on binary values, which are sequences of bits (0s and 1s) representing integer values or other data types. Java provides several bitwise operators that allow you to perform various binary operations on integers at the bit level. These operators can be used to manipulate individual bits in an integer, perform bitwise logical operations, and perform bitwise shift operations.

Here are some commonly used bitwise operators in Java:

Bitwise AND (&): Performs a bitwise AND operation on each pair of corresponding bits in two integers. The result is 1 only if both bits are 1, otherwise, the result is 0.

Bitwise OR (|): Performs a bitwise OR operation on each pair of corresponding bits in two integers. The result is 1 if at least one of the bits is 1, otherwise, the result is 0.

Bitwise XOR (^): Performs a bitwise XOR (exclusive OR) operation on each pair of corresponding bits in two integers. The result is 1 only if the two bits are different (i.e., one is 0 and the other is 1), otherwise, the result is 0.

Bitwise NOT (~): Performs a bitwise NOT operation on an integer, inverting all the bits. The result is the bitwise complement of the integer.

Left shift (<<): Shifts the bits of an integer to the left by a specified number of positions. The leftmost bits are filled with zeros, and the rightmost bits are lost.

Right shift (>>): Shifts the bits of an integer to the right by a specified number of positions. The sign bit (the leftmost bit) is replicated to fill the vacated positions on the left.

Unsigned right shift (>>>): Shifts the bits of an integer to the right by a specified number of positions. The leftmost bits are filled with zeros, and the sign bit is not replicated.
*/


public class BinaryOperationsExample {
    public static void main(String[] args) {
        int a = 5; // binary: 101
        int b = 3; // binary: 011

        // Bitwise AND
        int resultAnd = a & b; // binary: 001
        System.out.println("Bitwise AND: " + resultAnd); // Output: 1

        // Bitwise OR
        int resultOr = a | b; // binary: 111
        System.out.println("Bitwise OR: " + resultOr); // Output: 7

        // Bitwise XOR
        int resultXor = a ^ b; // binary: 110
        System.out.println("Bitwise XOR: " + resultXor); // Output: 6

        // Bitwise NOT
        int resultNotA = ~a; // binary: 11111010
        System.out.println("Bitwise NOT of a: " + resultNotA); // Output: -6

        // Left shift
        int resultLeftShift = a << 2; // binary: 10100
        System.out.println("Left shift of a: " + resultLeftShift); // Output: 20

        // Right shift
        int resultRightShift = a >> 1; // binary: 10
        System.out.println("Right shift of a: " + resultRightShift); // Output: 2

        // Unsigned right shift
        int resultUnsignedRightShift = a >>> 1; // binary: 10
        System.out.println("Unsigned right shift of a: " + resultUnsignedRightShift);
    }
}
