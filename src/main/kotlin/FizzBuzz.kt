import java.util.function.IntPredicate

class FizzBuzz {
    private val fizz = Rule({ it % 3 == 0 }, "Fizz")
    private val buzz = Rule({ it % 5 == 0 }, "Buzz")

    private val ruleEngine = RuleEngine(listOf(fizz, buzz))
    fun get(number: Int): String {
        return ruleEngine.apply(number);
    }
}

class RuleEngine(private val rules: List<Rule>) {
    fun apply(number: Int): String {
        var result = rules
            .map { rule -> rule.apply(FizzNumber(number.toString())) }
            .filterNotNull()
            .map { fizzNumber -> fizzNumber.toString() }
        return if (result.isEmpty()) number.toString() else result.joinToString("")
    }
}

class Rule(private val condition: IntPredicate, private val value: String) {
    fun apply(num: FizzNumber): FizzNumber? {
        return if (num.get()?.let { condition.test(it) } == true) FizzNumber(value) else null
    }
}

class FizzNumber(private val value: String) {
    fun get(): Int? {
        return value.toIntOrNull()
    }

    override fun toString(): String {
        return value
    }
}
