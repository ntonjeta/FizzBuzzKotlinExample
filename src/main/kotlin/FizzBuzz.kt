import java.util.function.IntPredicate

class FizzBuzz {
    fun get(number: Int): String {
        val fizz = Rule({ number % 3 == 0 }, "Fizz");
        val buzz = Rule({ number % 5 == 0 }, "Buzz");
        val fizzBuzz = Rule({ number % 3 == 0 && number % 5 == 0 }, "FizzBuzz");

        return fizz.apply(buzz.apply(fizzBuzz.apply(FizzNumber(number.toString())))).toString();
    }
}

class Rule(private val condition: IntPredicate, private val value: String) {
    fun apply(num: FizzNumber): FizzNumber {
        return if (num.get()?.let { condition.test(it) } == true) FizzNumber(value) else FizzNumber(num.toString())
    }
}

class FizzNumber(private val value: String) {
    fun get(): Int? {
        return value.toIntOrNull();
    }

    override fun toString(): String {
        return value;
    }
}
