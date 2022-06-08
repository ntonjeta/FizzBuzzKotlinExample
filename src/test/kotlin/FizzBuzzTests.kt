import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzTests {

    @Test
    fun multipleOfThreeShouldBeFizz() {
        val fizzBuzz = FizzBuzz()

        assertEquals("Fizz", fizzBuzz.get(3))
        assertEquals("Fizz", fizzBuzz.get(9))
    }

    @Test
    fun multipleOfFiveShouldBeBuzz() {
        val fizzBuzz = FizzBuzz()

        assertEquals("Buzz", fizzBuzz.get(5))
        assertEquals("Buzz", fizzBuzz.get(10))
    }

    @Test
    fun multipleOfBothShouldBeFizzBuzz() {
        val fizzBuzz = FizzBuzz()

        assertEquals("FizzBuzz", fizzBuzz.get(15))
    }

    @Test
    fun noMultipleOfBothShouldBeNumber() {
        val fizzBuzz = FizzBuzz()

        assertEquals("4", fizzBuzz.get(4))
    }
}