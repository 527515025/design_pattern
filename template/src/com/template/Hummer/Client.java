package com.template.Hummer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author yangyibo
 *
 */
public class Client {
	public static void main(String[] args) throws IOException {
		System.out.println("-------H1    --------");
		System.out.println("H1              0-    1-  ");
		String type="0";
//		String type = (new BufferedReader(new InputStreamReader(System.in))).toString();
		HummerH1Model h1 = new HummerH1Model();
		
		if (type.equals("0")) {
			h1.setAlarm(false);
		}
		h1.run();
		System.out.println("\n-------H2    --------");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}
}