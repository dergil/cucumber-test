
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import static org.junit.Assert.assertEquals

class SampleStepDefinitions {
    private int result
    private Calculator calculator = new Calculator()

    @Given("I have a calculator")
    def givenIHaveACalculator() {
        // Optionally initialize the calculator or any setup
    }

    @When("I add {int} and {int}")
    def whenIAddTwoNumbers(int num1, int num2) {
        result = calculator.add(num1, num2)
        println ("Executing addition")

    }

    @Then("the result should be {int}")
    def thenTheResultShouldBe(int expected) {
        assertEquals(expected, result)
    }
}

