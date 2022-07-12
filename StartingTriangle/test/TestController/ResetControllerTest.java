package TestController;


import java.awt.Color;

import starting.controller.ResetController;
import starting.model.Model;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResetControllerTest {

	@Test
	void test() {
		Model model = new Model();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		ResetController rc = new ResetController(model, app);
		rc.process();
	

}
}
