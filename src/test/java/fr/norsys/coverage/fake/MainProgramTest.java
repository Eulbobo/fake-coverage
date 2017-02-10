package fr.norsys.coverage.fake;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MainProgramTest {

    @Test
    public void should_get_call_service_1000_times(){
        ServiceInterface service = mock(ServiceInterface.class);
        when(service.whatCanIdo(anyInt())).thenReturn("Nope");

        MainProgram main = new MainProgram(service);

        main.doTheMainThing();

        verify(service, times(1_000)).whatCanIdo(anyInt());
    }
}
