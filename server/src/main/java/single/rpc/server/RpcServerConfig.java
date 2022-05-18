package single.rpc.server;

import lombok.Data;
import single.rpc.serialize.Decoder;
import single.rpc.serialize.Encoder;
import single.rpc.serialize.JSONDecoder;
import single.rpc.serialize.JSONEncoder;
import single.rpc.transport.HttpTransportServer;
import single.rpc.transport.TransportServer;

@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;


}
