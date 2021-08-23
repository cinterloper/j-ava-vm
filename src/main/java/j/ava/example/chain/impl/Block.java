package j.ava.example.chain.impl;

import j.ava.example.chain.types.Metadata;
import j.ava.example.db.Database;

import java.util.Date;

public class Block extends Metadata {

    public long ID;
    public Block parent;
    public long height;
    public Database db;

    public Block(long ID, Block parent) {
        this.ID = ID;
        this.parent = parent;
    }

    public boolean Verify() {
        return true;
    }
}
