package TestController;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import starting.controller.SelectNodeController;
import starting.controller.UnselectAllController;
import starting.model.Model;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

class UnselectAllControllerTest {

	@Test
	void test() {
		Model model = new Model();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		UnselectAllController usnc = new UnselectAllController(model, app);
		usnc.process();
	}

}
