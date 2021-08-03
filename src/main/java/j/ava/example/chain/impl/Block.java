package j.ava.example.chain.impl;

import j.ava.example.chain.types.Metadata;

public class Block extends Metadata {

    String ID;
    public Block parent;

    public Block(String ID, Block parent) {
        this.ID = ID;
        this.parent = parent;
    }

    public void Verify() {

    }
}
