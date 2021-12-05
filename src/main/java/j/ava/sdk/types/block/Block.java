package j.ava.sdk.types.block;


import j.ava.sdk.types.Metadata;

public class Block extends Metadata {
    public static Block fromBytes(byte[] inputBytes){
        return new Block("0",null);
    }

    public String ID;
    public Block parent;

    public Block(String ID, Block parent) {
        this.ID = ID;
        this.parent = parent;
    }

    public void Verify() {

    }
}
