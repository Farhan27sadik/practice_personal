package org.example;

public class FindUniqueElement {
    public static int findUnique(int[] nums) {
        int unique = 0;
        
        // XOR all elements in the array
        // Duplicate elements will cancel out each other
        // The remaining XOR result will be the unique element
        for (int num : nums) {
            unique ^= num;
        }
        
        return unique;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        int unique = findUnique(nums);
        System.out.println("The unique element is: " + unique);
    }
}
