package fr.norsys.coverage.fake.impl;

import org.springframework.stereotype.Service;

import fr.norsys.coverage.fake.DelegatedFunction;

@Service
public class AnotherDelegatedFunction implements DelegatedFunction {

    @Override
    public String doStuff(final int i) {
        return String.valueOf(i - 5);
    }

    @Override
    public String doOtherStuff(final int i) {
        return String.valueOf(i + 12);
    }
}
