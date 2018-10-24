package com.example.demo;


import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;


import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;*/

import com.example.demo.models.User;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)//use random port to test
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
//@AutoConfigureWebTestClient
//@AutoConfigureMockMvc
public class SpringTestDemoApplicationTests {

	/*@Autowired
	private WebTestClient webClient;
	

    @Autowired
    private MockMvc mockMvc;
    */
    @Test
    public void contextLoads() throws Exception {
    }
	
	@Test
	public void homeTest() throws Exception {
		//this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Get your greeting")));
		
		
	}
	
	@Test
	public void addUserTest() throws Exception {
		String name = "toto";
		/*this.webClient.get().uri("/add?name="+name).exchange().expectStatus().isOk();
		List<User> users = this.webClient.get().uri("/all").exchange().expectBodyList(User.class).returnResult().getResponseBody();
		Assert.assertTrue(users.stream().anyMatch(elem -> elem.getName().equals(name)));*/
		
	}

}
