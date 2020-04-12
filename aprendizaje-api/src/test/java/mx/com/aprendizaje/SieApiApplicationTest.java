package mx.com.aprendizaje;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { SieApiApplication.class })
public class SieApiApplicationTest {

	@Test
	public void contextLoads() { 
		System.out.println("Todo cooools!"); 
	}
	
}
