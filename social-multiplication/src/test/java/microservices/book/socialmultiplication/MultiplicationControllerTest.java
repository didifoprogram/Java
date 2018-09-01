package microservices.book.socialmultiplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import javax.print.attribute.standard.Media;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest // Only load controllers, where @SpringBootTest load the entire configuration. Also load MockMvc bean.
public class MultiplicationControllerTest {

    @MockBean
    MultiplicationService multiplicationService;

    @Autowired
    MockMvc mvc;

    // This object will be magically initialized by the initFields method below.
    private JacksonTester<Multiplication> json; // Provides useful methods to check JSON contents.

    @Before
    public void setUp() {
        JacksonTester.initFields(this, ObjectMapper::new);
    }

    @Test
    public void getRandomMultiplicationTest() throws Exception {
        given(multiplicationService.createRandomMultiplication()).willReturn(new Multiplication(70, 30));

        //when
        MockHttpServletResponse response = mvc.perform(get("/multiplication/random")
        .accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();

        //then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo(json.write(new Multiplication(70,30)).getJson());

    }
}
