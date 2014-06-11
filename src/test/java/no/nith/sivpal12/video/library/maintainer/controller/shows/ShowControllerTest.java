package no.nith.sivpal12.video.library.maintainer.controller.shows;

import no.nith.sivpal12.video.library.maintainer.constants.ControllerModel;
import no.nith.sivpal12.video.library.maintainer.constants.UriContext;
import no.nith.sivpal12.video.library.maintainer.constants.ViewName;
import no.nith.sivpal12.video.library.maintainer.controllers.ShowController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(MockitoJUnitRunner.class)
public class ShowControllerTest {

    @InjectMocks
    private ShowController showController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(showController).build();
    }

    @Test
    public void viewAllTvShows_HasModelAndView() throws Exception {
        mockMvc
                .perform(get(UriContext.SHOWS_ROOT))
                .andExpect(model().attributeExists(ControllerModel.SHOWS))
                .andExpect(view().name(ViewName.SHOWS))
                .andExpect(status().isOk());
    }

}
