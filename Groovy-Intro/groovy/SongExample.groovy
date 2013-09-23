
class SongExample1 {
	static main(args) {
		def song = new Song(title:"hello world",artist:"arian zhang",genre:"Disco");
		println(song);
		song.setArtist("Lipps Inc.");
		assert song.getArtist() == "Lipps Inc."
		song.text?.toUpperCase();
		String example1 = 
		"""This is a multiline
		string which is going to
		cover a few lines then
		end with a period."""
		println example1;
		println example1.getClass();
	}
}
