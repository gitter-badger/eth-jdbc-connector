package com.impetus.eth.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.impetus.blkch.sql.AggregationFunctions;
import com.impetus.test.catagory.UnitTest;

@Category(UnitTest.class)
public class TestAggregationFunctions extends TestCase {
    private List<Object> data = new ArrayList<Object>();

    @Override
    protected void setUp() {
        data.add(1234);
        data.add(12);
        data.add(1);
        data.add(232);
        data.add(433);
        data.add(242);
        data.add(234);
    }

    @Test
    public void testSumFunc() {

        Object sum = AggregationFunctions.sum(data);
        assertEquals(2388, sum);
    }
    
    @Test
    public void testCountFunc() {

        Object count = AggregationFunctions.count(data);
        assertEquals(7, count);
    }
}