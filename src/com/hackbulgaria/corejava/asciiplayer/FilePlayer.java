package com.hackbulgaria.corejava.asciiplayer;

import java.io.File;

public abstract class FilePlayer implements IPlayer {
    private File file;

    public FilePlayer(String path) {
        this.file = new File(path);
        
    }
    
    public void play(){
       
    }
}
