package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("asdf", "asdf");
		map.put("asdf123", "asdfaaa");
		map.put("asdf123", "123");
		map.put("asdf123", "345");
		System.out.println(map.toString());
		List<String> asdf = new ArrayList();
		asdf.add("asdf");
		asdf.add("ddd");
		System.out.println(asdf.toString());
	}
}
