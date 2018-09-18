package com.neet.managers;

public class GameKeys {

	private static boolean [] keys;
	private static boolean [] pkeys;
	
	private static final int NKeys= 4;
	public static final int right=0;
	public static final int left=1;
	public static final int space=2;
	public static final int escape=3;

	static {
		keys= new boolean[NKeys];
		pkeys= new boolean[NKeys];
	}
	
	public static void update() {
		for(int i=0;i<NKeys; i++) {
			pkeys[i]=keys[i];
		}
	}
	
	public static void setKey(int k, boolean b) {
		keys[k]=b;
	}
	
	public static boolean isDown(int k) {
		return keys[k];
	}
	
	public static boolean isPressed(int k) {
		return keys[k] && !pkeys[k];
	}
}
