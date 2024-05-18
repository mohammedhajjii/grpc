package hajji.mohammed.clients;

import hajji.mohammed.stubs.BanqueServiceGrpc;
import hajji.mohammed.stubs.Schema;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class UnaryModelClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 7789)
                .usePlaintext()
                .build();


        BanqueServiceGrpc.BanqueServiceBlockingStub banqueServiceBlockingStub = BanqueServiceGrpc.newBlockingStub(channel);

        Schema.ObjectRequest request = Schema.ObjectRequest.newBuilder()
                .setTo(Schema.Currency.DH)
                .setFrom(Schema.Currency.USD)
                .setAmount(78.0)
                .build();


        Schema.ObjectResponse response = banqueServiceBlockingStub.unaryModel(request);

        System.out.println(response);

    }
}
