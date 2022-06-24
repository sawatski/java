package lab5.p3;

import java.io.*;

public class DecryptingReader extends FilterReader {

    private final char encryptionKey;

    protected DecryptingReader(Reader in, char encryptionKey) {
        super(in);
        this.encryptionKey = encryptionKey;
    }

    @Override
    public int read() throws IOException {
        int offset = (int)encryptionKey;
        int readiedData = super.read();
        if (readiedData == -1) {
            return readiedData;
        } else {
            return (readiedData - offset);
        }
    }
}
