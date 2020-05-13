package org.graalvm.demos;

import java.io.IOException;
import java.util.Properties;

import org.springframework.util.StringUtils;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
    private static final String DELIMITER = "=";

	public static void main( String[] args )
    {
    	
		//Save user input in a Properties Object
		
    	Properties commandOptions = StringUtils.splitArrayElementsIntoProperties(args, DELIMITER);
    	
        try {
        	
			commandOptions.storeToXML(System.out, "User input parameters");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
}
