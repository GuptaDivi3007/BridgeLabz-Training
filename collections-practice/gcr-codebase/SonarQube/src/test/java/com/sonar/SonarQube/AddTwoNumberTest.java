package com.sonar.SonarQube;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTwoNumberTest {
	@Test
    void testAdd() {
    	AddTwoNumber num=new AddTwoNumber();
    	int result = num.add(10, 20);

        assertEquals(30, result);
    }
}
