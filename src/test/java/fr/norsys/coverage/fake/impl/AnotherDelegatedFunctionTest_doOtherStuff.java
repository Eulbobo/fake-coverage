package fr.norsys.coverage.fake.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AnotherDelegatedFunctionTest_doOtherStuff {

    @Test
    public void should_get_12_when_calling_doOtherStuff_with_0() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doOtherStuff(0);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(12));
    }

    @Test
    public void should_get_minus_1_when_calling_doOtherStuff_with_minus_13() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doOtherStuff(-13);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(-1));
    }

    @Test
    public void should_get_0_when_calling_doOtherStuff_with_minus_12() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doOtherStuff(-12);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(0));
    }

    @Test
    public void should_get_17_when_calling_doOtherStuff_with_5() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doOtherStuff(5);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(17));
    }
}
