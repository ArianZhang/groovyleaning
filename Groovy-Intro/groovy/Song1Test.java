import org.junit.Assert;
import org.junit.Test;

public class Song1Test {

	@Test
	public void testToString() {
		Song sng = new Song();
		sng.setTitle("Y.M.C.A");
		sng.setArtist("Village People");
		sng.setGenre("Disco");

		Assert.assertEquals("Y.M.C.A, Village People, DISCO", sng.toString());
	}

}
