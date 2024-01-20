package com.github.truejacobg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Problem:
// https://leetcode.com/problems/contains-duplicate/
// Solution:
// https://leetcode.com/problems/contains-duplicate/solutions/4597150/java-21-contains-duplicate-beats-52/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet();
        return Arrays.stream(nums).anyMatch(n -> !numbers.add(n));
    }
}
