package com.atilsamancioglu.testintroduction

class Tax {

    fun calcTax(gIncome: Double, tax: Double): Double{
        return gIncome * tax
    }

    fun calculateIncome(gIncome: Double, tax: Double): Double{
        return gIncome - gIncome * tax
    }
}