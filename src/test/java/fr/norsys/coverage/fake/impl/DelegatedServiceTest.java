package fr.norsys.coverage.fake.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import fr.norsys.coverage.fake.DelegatedFunction;

public class DelegatedServiceTest {

    @Test
    public void should_return_doStuffX_1__when_below_10() {
        DelegatedFunction func = mock(DelegatedFunction.class);

        when(func.doStuff(anyInt())).then(i -> "doStuff" + i.getArgumentAt(0, Integer.class));

        DelegatedService delegated = new DelegatedService(func);

        String returnedValue = delegated.whatCanIdo(9);

        assertThat(returnedValue)
                .isNotNull()
                .isEqualTo("doStuff9 : 1");
    }

    @Test
    public void should_return_doOtherStuffXX_2_when_above_20() {
        DelegatedFunction func = mock(DelegatedFunction.class);

        when(func.doOtherStuff(anyInt())).then(i -> "doOtherStuff" + i.getArgumentAt(0, Integer.class));

        DelegatedService delegated = new DelegatedService(func);

        String returnedValue = delegated.whatCanIdo(21);

        assertThat(returnedValue)
                .isNotNull()
                .isEqualTo("doOtherStuff21 : 2");
    }

    @Test
    public void should_return_nope_3_when_equals_to_10() {
        DelegatedFunction func = mock(DelegatedFunction.class);

        DelegatedService delegated = new DelegatedService(func);

        String returnedValue = delegated.whatCanIdo(10);

        assertThat(returnedValue)
                .isNotNull()
                .isEqualTo("nope : 3");
    }

    @Test
    public void should_return_nope_3_when_equals_to_20() {
        DelegatedFunction func = mock(DelegatedFunction.class);

        DelegatedService delegated = new DelegatedService(func);

        String returnedValue = delegated.whatCanIdo(20);

        assertThat(returnedValue)
                .isNotNull()
                .isEqualTo("nope : 3");
    }

    @Test
    public void should_return_nope_3_when_between_10_and_20() {
        DelegatedFunction func = mock(DelegatedFunction.class);

        DelegatedService delegated = new DelegatedService(func);

        String returnedValue = delegated.whatCanIdo(15);

        assertThat(returnedValue)
                .isNotNull()
                .isEqualTo("nope : 3");
    }
}
