package com.kulsin.leetcode.problemset.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    public void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void maxAreaTest1() {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expectedResponse = 49;
        assertEquals(expectedResponse, containerWithMostWater.maxArea(input));
        assertEquals(expectedResponse, containerWithMostWater.maxAreaTwoPointerSolution(input));

    }

    @Test
    public void maxAreaTest2() {
        int[] input = {1, 1};
        int expectedResponse = 1;
        assertEquals(expectedResponse, containerWithMostWater.maxArea(input));
        assertEquals(expectedResponse, containerWithMostWater.maxAreaTwoPointerSolution(input));

    }

    @Test
    public void maxAreaTest3() {
        int[] input = {4, 3, 2, 1, 4};
        int expectedResponse = 16;
        assertEquals(expectedResponse, containerWithMostWater.maxArea(input));
        assertEquals(expectedResponse, containerWithMostWater.maxAreaTwoPointerSolution(input));

    }

    @Test
    public void maxAreaTest4() {
        int[] input = {1, 2, 1};
        int expectedResponse = 2;
        assertEquals(expectedResponse, containerWithMostWater.maxArea(input));
        assertEquals(expectedResponse, containerWithMostWater.maxAreaTwoPointerSolution(input));

    }

}