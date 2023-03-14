package com.atilsamancioglu.testintroduction

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {


    @Test
    fun `This Test will test the tax calc validity`(){
        val tax = Tax()

        assert(tax.calcTax(10.0, 0.1) == 10.0)
    }

    @Test
    fun `This test will test the Income calc validity`(){
        val tax = Tax()

        assert(tax.calculateIncome(10.0, 0.1) == 90.0)
    }
}