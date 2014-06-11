package no.nith.sivpal12.video.library.maintainer.services.impl;

import no.nith.sivpal12.video.library.maintainer.services.impl.ShowServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class ShowServiceImplTest {

    @InjectMocks
    private ShowServiceImpl showServiceImpl;

    @Test
    public void getAllShows_NotNull() throws Exception {
        assertNotNull(showServiceImpl.getAllShows());
    }

}
