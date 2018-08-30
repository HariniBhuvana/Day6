package com.harink.collections.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;



class CollectionQuestion6Test {
	@Test
	void testStudentFruit() {
	HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
	String[] favorites = new String[] {"GreenApple","mango"};
	map.put("Sri", new ArrayList<>(Arrays.asList(favorites)));
	favorites = new String[] {"banana","kiwi","orange"};
	map.put("Sudarshan", new ArrayList<>(Arrays.asList(favorites)));
	favorites = new String[] {"badam","Strawberry"};
	map.put("Harini", new ArrayList<>(Arrays.asList(favorites)));
	favorites = new String[] {"peru","papaya","apple"};
	map.put("Sharad", new ArrayList<>(Arrays.asList(favorites)));
	
	assertEquals(4, map.size());
	for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) 
        System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
	
	}

}
