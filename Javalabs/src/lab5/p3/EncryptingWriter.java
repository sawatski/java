package lab5.p3;

import java.io.*;

public class EncryptingWriter extends FilterWriter {

    private final char encryptionKey;

    protected EncryptingWriter(Writer in, char encryptionKey) {
        super(in);
        this.encryptionKey = encryptionKey;
    }

    @Override
    public void write(int c) throws IOException {
        int offset = (int)encryptionKey;
        super.write(c + offset);
        flush();
    }
}
