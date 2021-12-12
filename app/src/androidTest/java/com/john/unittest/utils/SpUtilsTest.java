package com.john.unittest.utils;

import com.john.unittest.MyApp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * author ZhaoWei
 * created 2021/9/21 5:30 下午
 */
public class SpUtilsTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getString() {
        Assert.assertEquals("", SpUtils.getString(MyApp.getGlobalContext(), "aaaaaaaa"));
    }
}