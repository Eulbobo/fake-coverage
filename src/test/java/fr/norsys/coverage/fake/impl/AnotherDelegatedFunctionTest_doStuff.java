package fr.norsys.coverage.fake.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AnotherDelegatedFunctionTest_doStuff {

    @Test
    public void should_get_5_when_calling_doStuff_with_10() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doStuff(10);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(5));
    }

    @Test
    public void should_get_minus_5_when_calling_doStuff_with_0() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doStuff(0);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(-5));
    }

    @Test
    public void should_get_0_when_calling_doStuff_with_5() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doStuff(5);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(0));
    }

    @Test
    public void should_get_12_when_calling_doStuff_with_17() {
        AnotherDelegatedFunction func = new AnotherDelegatedFunction();

        String returnValue = func.doStuff(17);

        assertThat(returnValue)
            .isNotNull()
            .isEqualTo(String.valueOf(12));
    }
}
