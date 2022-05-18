package single.rpc.transport;

import single.rpc.Peer;

import java.io.InputStream;

public interface TransportClient {
    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();
}
