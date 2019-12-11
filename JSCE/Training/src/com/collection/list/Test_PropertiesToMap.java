package com.collection.list;

import java.util.Properties;

public class Test_PropertiesToMap {
	public static void main(String[] args) {
		
		Properties properties = System.getProperties();
        
        properties.forEach((k, v) -> System.out.println(k + ":" + v));
      //  unmodifiableSortedMap(SortedMap<k,proprties v>m);

      
	}

}
