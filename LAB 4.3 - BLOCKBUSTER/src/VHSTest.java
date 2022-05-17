import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class VHSTest {

	@Test
	void testVHS1() {
		ArrayList<String> sceneSet1 = new ArrayList<String>(Arrays.asList("Group of reporters", " Charles Foster Kane"));
		VHS movie1 = new VHS("To Kill A Mockingbird", 129, sceneSet1); //Arrange, Act
		
		assertNotNull(movie1.getScenes());
	}
	@Test
	void testVHS2() {
		ArrayList<String> sceneSet2 = new ArrayList<String>(Arrays.asList("Group of reporters", " Charles Foster Kane"));
		VHS movie1 = new VHS("To Kill A Mockingbird", 129, sceneSet2); //Arrange, Act
		
		assertEquals(2, movie1.getScenes().size());
	}

}
