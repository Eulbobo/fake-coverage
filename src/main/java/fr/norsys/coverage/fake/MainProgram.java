package fr.norsys.coverage.fake;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainProgram {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainProgram.class);

    private final ServiceInterface service;

    @Autowired
    public MainProgram(final ServiceInterface service){
        this.service = service;
    }

    public void doTheMainThing(){
        Random rnd = new Random();

        for (int i = 0; i < 1000; i ++){
            String returnedValue = service.whatCanIdo(rnd.nextInt(100));
            LOGGER.info(returnedValue);
        }
    }
}
