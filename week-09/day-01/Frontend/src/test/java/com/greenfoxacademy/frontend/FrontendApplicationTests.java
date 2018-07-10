package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.models.Log;
import com.greenfoxacademy.frontend.repositories.LogRepo;

import com.greenfoxacademy.frontend.controllers.RestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(RestController.class)
public class FrontendApplicationTests {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  LogRepo logRepo;

  @Test
  public void doubling_without_Data() throws Exception {
    when(logRepo.save(new Log("/doubling", "FIX_INPUT_FOR_TEST"))).thenReturn(null);
    mockMvc.perform(get("/doubling"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void doubling_with_Input() throws Exception {
    when(logRepo.save(new Log("/doubling", "FIX_INPUT_FOR_TEST"))).thenReturn(null);
    mockMvc.perform(get("/doubling")
            .param("input", "5"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.received", is(5)))
            .andExpect(jsonPath("$.result", is(10)));
  }

  @Test
  public void greeter_without_nameInput() throws Exception {
    when(logRepo.save(new Log("/greeter", "FIX_INPUT_FOR_TEST"))).thenReturn(null);
    mockMvc.perform(get("/greeter")
            .param("title", "student"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void greeter_with_properInput() throws Exception {
    when(logRepo.save(new Log("/greeter", "FIX_INPUT_FOR_TEST"))).thenReturn(null);
    mockMvc.perform(get("/greeter")
            .param("name", "Petya")
            .param("title", "student"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petya, my dear student!")));
  }

  @Test
  public void appenda_withAppendable() throws Exception {
    when(logRepo.save(new Log("/appenda", "FIX_INPUT_FOR_TEST"))).thenReturn(null);
    mockMvc.perform(get("/appenda/{appendable}", "kuty"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.appended", is("kutya")));
  }

  @Test
  public void appenda_withoutAppendable() throws Exception {
    when(logRepo.save(new Log("/appenda", "FIX_INPUT_FOR_TEST"))).thenReturn(null);
    mockMvc.perform(get("/appenda"))
            .andExpect(status().is4xxClientError());
  }

}
