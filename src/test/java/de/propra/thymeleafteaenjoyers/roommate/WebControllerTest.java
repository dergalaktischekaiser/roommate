package de.propra.thymeleafteaenjoyers.roommate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.access.SecurityConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.thymeleaf.spring6.expression.Mvc;
import security_intro.helper.WithMockOAuth2User;
import security_intro.helper.WithOAuth2UserSecurityContextFactory;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
@Import({SecurityConfiguration.class})
public class WebControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    @WithMockOAuth2User(login = "AnakinSkywalker")
    @DisplayName("Wenn die URL / aufgerufen wird, soll der User auf die Homepage geleitet werden")
    public void test_1() throws Exception {
        MvcResult result = mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("Homepage"))
                .andReturn();

    }

    @Test
    @WithMockOAuth2User(login = "Nick Fury")
    @DisplayName("Wenn die URL /Catalog aufgerufen wird, soll der User zum Catalog geleitet werden")
    public void test_2() throws Exception {
        MvcResult result = mockMvc.perform(get("/Catalog"))
                .andExpect(status().isOk())
                .andExpect(view().name("Catalog"))
                .andReturn();
    }

    @Test
    @WithMockOAuth2User(login = "dergalaktischekaiser", roles = {"ADMIN"})
    @DisplayName("Rustam kann als ADMIN auf 'ne Ressource zugreifen.")
    public void test_42069() throws Exception {
        mockMvc.perform(get("/rick_astley"))
                .andExpect(status().isOk());
    }
}