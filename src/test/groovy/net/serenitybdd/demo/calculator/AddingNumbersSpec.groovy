package net.serenitybdd.demo.calculator
import spock.lang.Specification

class AddingNumbersSpec extends Specification {

    def "should add some numbers"() {
        given:
            int a = 1
            int b = 2
        when:
            def result = a + b
        then:
            result == 3
    }
}
