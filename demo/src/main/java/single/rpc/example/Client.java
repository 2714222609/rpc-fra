package single.rpc.example;

import single.rpc.client.RpcClient;

public class Client {
    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int add = service.add(1, 2);
        int minus = service.minus(1, 2);
        System.out.println(add);
        System.out.println(minus);
    }
}
