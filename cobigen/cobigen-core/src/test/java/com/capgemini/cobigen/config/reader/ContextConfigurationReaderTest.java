/*******************************************************************************
 * Copyright © Capgemini 2013. All rights reserved.
 ******************************************************************************/
package com.capgemini.cobigen.config.reader;

import java.io.File;

import junit.framework.TestCase;

import org.junit.Test;

import com.capgemini.cobigen.exceptions.InvalidConfigurationException;

/**
 * This {@link TestCase} tests the {@link ContextConfigurationReader}
 * 
 * @author mbrunnli (18.06.2013)
 */
public class ContextConfigurationReaderTest {

    /**
     * Root path to all resources used in this test case
     */
    private static String testFileRootPath = "src/test/resources/ContextConfigurationReaderTest/";

    /**
     * Tests whether an invalid configuration results in an {@link InvalidConfigurationException}
     * 
     * @throws InvalidConfigurationException
     */
    @Test(expected = InvalidConfigurationException.class)
    public void testErrorOnInvalidConfiguration() throws InvalidConfigurationException {

        new ContextConfigurationReader(new File(testFileRootPath + "context_faulty.xml"));
    }

}
