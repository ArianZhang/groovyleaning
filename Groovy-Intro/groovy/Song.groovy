
class Song {
	def title
	def String artist
	def genre
	def text
	def getText(){
		return text?.toUpperCase();
	}
	String toString(){
		return "${title}, ${artist}, ${genre?.toUpperCase()}";
	}
}
