package fr.norsys.coverage.fake;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class MainProgramIT {

    /**
     * Définition du cadre de test
     */
    @Configuration
    @ComponentScan("fr.norsys.coverage.fake")
    static class ContextConfiguration {
        // config de base : on récupére donc aussi la config présente dans les sources
    }

    @Autowired
    private MainProgram main;

    @Test
    public void should_get_100_percent_coverage_without_testing_anything(){
        main.doTheMainThing();
    }
}
