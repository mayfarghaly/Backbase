package Back.base;


import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest extends BaseTest

{
	SearchPage Page = new SearchPage(driver);
	
	@Test
	public void testSearchByPartialTitle()
	{
		String subString= "Java";
		Page.search(subString);
		assertTrue ("The Number of books didn't match", Page.doesAllVisibleBooksContainsTitle(subString));
	}
}
