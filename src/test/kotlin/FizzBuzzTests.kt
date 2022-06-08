import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzTests {

    @Test
    fun multipleOfThreeShouldBeFizz(){
        val fizzBuzz = FizzBuzz()

        assertEquals(fizzBuzz.get(3), "Fizz")
        assertEquals(fizzBuzz.get(9), "Fizz")
    }

    @Test
    fun multipleOfFiveShouldBeBuzz(){
        val fizzBuzz = FizzBuzz()

        assertEquals(fizzBuzz.get(5), "Buzz")
        assertEquals(fizzBuzz.get(10), "Buzz")
    }

    @Test
    fun multipleOfBothShouldBeFizzBuzz(){
        val fizzBuzz = FizzBuzz()

        assertEquals("FizzBuzz",fizzBuzz.get(15))
    }

    @Test
    fun noMultipleOfBothShouldBeNumber(){
        val fizzBuzz = FizzBuzz()

        assertEquals(fizzBuzz.get(4), "4")
    }
}