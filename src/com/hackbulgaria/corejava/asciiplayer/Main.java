package com.hackbulgaria.corejava.asciiplayer;

public class Main {
	public static void main(String[] args) {
		String path;
		if(args.length > 0){
			path = args[0];
			System.out.println(new AsciiPlayer(path).getAsciiArt());
        }else{
        	System.out.println("Please add arguments");
        }
	    
	    
	}
	
}
