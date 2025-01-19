package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	 HashMap<String, String> fruitMap = new HashMap<String, String>();{
	 
	 fruitMap.put("apple", "りんご");
	 fruitMap.put("peach","桃");
	 fruitMap.put("banana","バナナ");
	 fruitMap.put("lemon","レモン");
	 fruitMap.put("kiwi","梨");
	 fruitMap.put("strawberry","いちご");
	 fruitMap.put("grape","ぶどう");
	 fruitMap.put("muscat","マスカット");
	 fruitMap.put("cherry","さくらんぼ");
	 }

public void searchWords(String[] mapArray) {
	 for (int i = 0; i < mapArray.length; i++) {
		 String map2 = fruitMap.get(mapArray[i]);
		 if (map2== null) {
			 System.out.println(mapArray[i] +"は辞書に追加されていません");
			 
		 }else {
			 System.out.println(map2);
		 }
	 }
}}

