import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void shouldBeFalseIfBracketsPresentButInvalid() {
        assertFalse(Calc.isBracketsValid(")("));
        assertFalse(Calc.isBracketsValid(")2("));
        assertFalse(Calc.isBracketsValid(")23("));
        assertFalse(Calc.isBracketsValid(")233("));
    }

    @Test
    void shouldBeFalse() {
        assertFalse(Calc.isBracketsValid("("));
        assertFalse(Calc.isBracketsValid("(("));
        assertFalse(Calc.isBracketsValid("(()"));
        assertFalse(Calc.isBracketsValid("(())"));
        assertFalse(Calc.isBracketsValid("())"));
        assertFalse(Calc.isBracketsValid("((1))"));
        assertFalse(Calc.isBracketsValid("((12))"));
        assertFalse(Calc.isBracketsValid("((123)))"));
    }

    @Test
    void shouldBeTrue() {
        assertTrue(Calc.isBracketsValid("((123))"));
    }

    @Test
    void shouldBeTrueIfBracketsArePresentAndValid() {
        assertFalse(Calc.isBracketsValid("()"));
        assertFalse(Calc.isBracketsValid("(1)"));
        assertFalse(Calc.isBracketsValid("(12)"));
        assertTrue(Calc.isBracketsValid("(123)"));
    }

    @Test
    void shouldBeFalseIfPresentOneOpenAndOneCloseBracketsInRightOrderButTooClose() {
        assertFalse(Calc.isBracketsValid("1(1+)2"));
    }

    @Test
    void shouldBeFalseIfPresentOneOpenAndOneCloseBracketsInWrongOrder() {
        assertFalse(Calc.isBracketsValid("1)1(2"));
    }

    @Test
    void shouldBeTrueIfBracketsAreAbsent() {
        assertFalse(Calc.isBracketsPresent("11"));
    }

    @Test
    void shouldBeFalseIfPresentOneOpenBracket() {
        assertFalse(Calc.isBracketsPresent("(11"));
    }

    @Test
    void shouldBeFalseIfPresentTwoOpenBrackets() {
        assertFalse(Calc.isBracketsPresent("(1(1"));
    }

    @Test
    void shouldBeTrueIfOneOpenAndOneCloseBrackets() {
        assertTrue(Calc.isBracketsPresent("(1)1"));
    }

    @Test
    void shouldBeFalseIfPresentTwoCloseBrackets() {
        assertFalse(Calc.isBracketsPresent(")1)1"));
    }


}