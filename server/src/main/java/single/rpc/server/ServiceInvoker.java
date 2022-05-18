package single.rpc.server;

import single.rpc.Request;
import single.rpc.common.ReflectionUtils;

public class ServiceInvoker {
    public Object invoke(ServiceInstance instance, Request request) {
        return ReflectionUtils.invoke(
                instance.getTarget(),
                instance.getMethod(),
                request.getParameters()
        );
    }
}
