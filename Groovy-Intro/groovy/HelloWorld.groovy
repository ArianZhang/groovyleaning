
public class HelloWorld {

	def static repeat(val,repeat=5){
		for(i in 0..repeat){
			println val;
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello Groovy Java style");
		println "Hello Groovy";
		String str = "Hello Java style String";
		println str;
		def str1 = "hello groovy defination";
		println str1 + str1.class;
		repeat(this);
		repeat([val:"hello repeat 5 times",repeat:6]);
		def range = 0..5;
		assert range instanceof List;
		println range.class;
		def coll = ["Groovy", "Java", "Ruby"]
		assert  coll instanceof Collection
		assert coll instanceof ArrayList
		println coll.class;
		coll.push "python"
		coll << "SmallTalk"
		coll.add "Perl";
		println coll;
		assert coll[1]== "Java";
		assert coll[1].equals("Java");
		def numbers = [1, 2, 3, 4]
		println  "numbers : " + numbers.getClass();
		assert numbers + 5 == [1, 2, 3, 4, 5]
		assert numbers - [2, 3]== [1, 4]
		assert numbers.join(",") == "1,2,3,4"
		assert [1, 2, 3, 4, 3].count(3) == 2
		def chars = 1..< 6;
		println chars;
		assert ["JAVA", "GROOVY"]==
		["Java", "Groovy"]*.toUpperCase()
		def hash = [name:"Andy", "VPN-#":45]
		println hash;
		println hash.getClass();
		assert hash.getClass() == java.util.LinkedHashMap
		hash.put("id", 23);
		assert hash.get("name") == "Andy";
		hash.dob = "01/29/76"
		assert hash.dob == "01/29/76"
		assert hash["name"] == "Andy"
		hash["gender"] = "male"
		assert hash.gender == "male"
		assert hash["gender"] == "male"


		def acoll = ["Groovy", "Java", "Ruby"]

		//		for(Iterator iter = acoll.iterator(); iter.hasNext();){
		//			println iter.next()
		//		}
		acoll.each{ println it }
		hash.each{ key, value ->
			println "${key} : ${value}"
		}
		for(Iterator iter = hash.entrySet().iterator(); iter.hasNext();){
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		"ITERATION".each{ println it.toLowerCase() }
		def excite = { it ->
			def it2 = "";
			println "${it}:${it2}";
		};
		excite(["zhanghua","22"]);
	}
}
