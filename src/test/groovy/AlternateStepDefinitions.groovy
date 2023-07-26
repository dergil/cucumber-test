import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import static org.junit.Assert.assertEquals

class AlternateStepDefinitions {
    private int result
    private Calculator calculator = new Calculator()

    @Given("I have a calculator")
    def givenIHaveACalculator() {
        // Optionally initialize the calculator or any setup
    }

    @When("I subtract {int} from {int}")
    def whenISubtractTwoNumbers(int num1, int num2) {
        result = calculator.subtract(num2, num1)
        println ("Executing subtraction")
    }

    @When("I multiply {int} by {int}")
    def whenIMultiplyTwoNumbers(int num1, int num2) {
        result = calculator.multiply(num1, num2)
        println ("Executing multiplication")
    }

    @When("I divide {int} by {int}")
    def whenIDivideTwoNumbers(int num1, int num2) {
        result = calculator.divide(num1, num2)
        println ("Executing division")

    }

    @Then("the result should be {int}")
    def thenTheResultShouldBe(int expected) {
        assertEquals(expected, result)
    }
}
