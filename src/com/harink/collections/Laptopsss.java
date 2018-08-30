package com.harink.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Laptopsss {
	
		   public static void main(String[] args) {
		      ArrayList<String> lst = new ArrayList<String>();  
		      lst.add("company--LG");   
		      lst.add("model--chromebook");
		      lst.add("operatingSystem--Windows10");
		      lst.add("processor-iCore10");
		      System.out.println("LAPTOP");    
		 
		      Iterator<String> iter = lst.iterator();
		      while
		    	  (iter.hasNext()) {     
		         String str = (String)iter.next();
		         System.out.println(str);
		      }
		   }
		}


