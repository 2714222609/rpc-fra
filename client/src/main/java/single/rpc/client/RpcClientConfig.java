package single.rpc.client;

import lombok.Data;
import single.rpc.Peer;
import single.rpc.serialize.Decoder;
import single.rpc.serialize.Encoder;
import single.rpc.serialize.JSONDecoder;
import single.rpc.serialize.JSONEncoder;
import single.rpc.transport.HTTPTransportClient;
import single.rpc.transport.TransportClient;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass =
            HTTPTransportClient.class;

    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1",3000)
    );


}
