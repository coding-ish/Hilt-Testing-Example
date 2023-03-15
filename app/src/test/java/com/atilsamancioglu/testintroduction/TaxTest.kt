package com.atilsamancioglu.testintroduction

import androidx.core.util.rangeTo
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax: Tax

    //Before tag can be used to create methods that can initialize, etc -> It runs before tests
    @Before
    fun beforeTestEx(){
        tax = Tax()
    }
    @Test
    fun `This Test will test the tax calc validity`(){
        val testTax = tax.calcTax(100.0, 0.1)
        assert(testTax == 10.0)
        //another way of writing a test (ex. uses assertThat but it is now deprecated)
        //assertTrue(testTax == 10.0)
    }

    @Test
    fun `This test will test the Income calc validity`(){
        val testIncome = tax.calculateIncome(100.0, 0.1)
        assert( testIncome == 90.0)
        //another similar test
        //assertTrue(testIncome>0 && testIncome<100)
    }

}