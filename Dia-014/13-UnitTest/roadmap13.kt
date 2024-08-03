package `100-Dias-de-Kotlin`.Dia_014.`13_Pruebas_Unitarias`

import org.junit.Test
import junit.framework.TestCase.assertEquals
import junit.framework.Assert

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

class CalculatorTest {
    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }
}

class Extra {
    val map = mapOf(
        "name" to "Peque",
        "age" to "20",
        "birthDate" to "2004-06-29",
        "programmingLanguages" to listOf("Kotlin", "Lua")
    )
}

class ExtraTest {
    private val testMap = mapOf(
        "name" to "Peque",
        "age" to "20",
        "birthDate" to "2004-06-29",
        "programmingLanguages" to listOf("Kotlin", "Lua")
    )
    private val extraMap = Extra()
    @Test
    fun testExist(){
        val actualKeys = extraMap.map.keys
        val expectedKeys = testMap.keys
        Assert.assertEquals(expectedKeys, actualKeys)
    }
    @Test
    fun testContent(){
        val actualValues = extraMap.map.values
        val expectedValues = testMap.values
        val actualValueTypes = actualValues.map { it::class }
        val expectedValueTypes = expectedValues.map { it::class }
        Assert.assertEquals(expectedValueTypes, actualValueTypes)
    }
}