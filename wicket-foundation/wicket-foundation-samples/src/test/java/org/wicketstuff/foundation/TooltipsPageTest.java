package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.TooltipsPage;

public class TooltipsPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(TooltipsPage.class);
		tester.assertRenderedPage(TooltipsPage.class);
	}

}
