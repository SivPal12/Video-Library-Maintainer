package no.nith.sivpal12.video.library.maintainer.controller.shows;

import no.nith.sivpal12.video.library.maintainer.constants.ControllerModel;
import no.nith.sivpal12.video.library.maintainer.constants.UriContext;
import no.nith.sivpal12.video.library.maintainer.constants.ViewName;
import no.nith.sivpal12.video.library.maintainer.controllers.ShowController;
import no.nith.sivpal12.video.library.maintainer.services.ShowService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(MockitoJUnitRunner.class)
public class ShowControllerTest {

    @Mock
    private ShowService showService;

    @InjectMocks
    private ShowController showController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(showController).build();
    }

    @Test
    public void viewAllTvShows_HasModelAndView() throws Exception {
        mockMvc.perform(get(UriContext.SHOWS_ROOT))
                .andExpect(model().attributeExists(ControllerModel.SHOWS))
                .andExpect(view().name(ViewName.SHOWS))
                .andExpect(status().isOk());
    }

    @Test
    public void viewAllTvShows_CallsService() throws Exception {
        mockMvc.perform(get(UriContext.SHOWS_ROOT));

        verify(showService).getAllShows();
    }

}
