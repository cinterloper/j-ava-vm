package j.ava.example.db;

import org.mapdb.DB;
import org.mapdb.DBMaker;

import java.util.concurrent.ConcurrentMap;

public class Database {
    DB db;
    Database(){
        db = DBMaker.fileDB("./j-ava.db").make();
    }
    public String read(String namespace, String key){
        ConcurrentMap map = db.hashMap(namespace).createOrOpen();
        return (String) map.get(key);
    }
    public void write(String namespace, String key, String value){
        ConcurrentMap map = db.hashMap(namespace).createOrOpen();
        map.put(key,value);
    }

}
