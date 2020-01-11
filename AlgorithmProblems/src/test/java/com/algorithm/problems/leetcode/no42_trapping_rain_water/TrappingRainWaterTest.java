package com.algorithm.problems.leetcode.no42_trapping_rain_water;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {

    private int[] input  = {0,1,0,2,1,0,1,3,2,1,2,1};
    @Test
    public void testTrap_1() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        Assert.assertEquals(6, trappingRainWater.trap_1(input));
    }

    @Test
    public void testTrap_2() {
        int[] input  = {2,0,2};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        Assert.assertEquals(2, trappingRainWater.trap_2(input));
    }
}