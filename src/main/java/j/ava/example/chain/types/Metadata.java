package j.ava.example.chain.types;

import j.ava.example.chain.service.impl.VMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class Metadata {
    enum Status {
        Unknown,
        Processing,
        Rejected,
        Accepted
    }

    Logger logger = LoggerFactory.getLogger(Metadata.class);
    public byte[] bytes;
    public byte[] ID;
    public Status status;

    public void setStatus(Status s) {
        this.status = s;
    }

    public void Initalize(byte[] bytes) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            this.bytes = bytes;
            this.ID = digest.digest(bytes);
        } catch (NoSuchAlgorithmException nsae) {
            this.logger.error(nsae.getMessage());
            System.exit(-1); //program cannot continue without sha-256 support
        }
    }


}
