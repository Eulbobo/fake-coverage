package fr.norsys.coverage.fake.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.coverage.fake.DelegatedFunction;
import fr.norsys.coverage.fake.ServiceInterface;

@Service
public class DelegatedService implements ServiceInterface {

    private final DelegatedFunction function;

    @Autowired
    public DelegatedService(final DelegatedFunction function) {
        this.function = function;
    }

    @Override
    public String whatCanIdo(final int i) {

        int returnValue = 0;
        String functionReturn = "";

        if (i < 10) {
            functionReturn = function.doStuff(i);
            returnValue = 1;
        }

        if (i > 20) {
            functionReturn = function.doOtherStuff(i);
            returnValue = 2;
        }

        if (i >= 10 && i <= 20) {
            functionReturn = "nope";
            returnValue = 3;
        }

        return functionReturn + " : " + returnValue;
    }
}
