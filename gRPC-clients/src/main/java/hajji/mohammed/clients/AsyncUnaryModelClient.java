package hajji.mohammed.clients;

import hajji.mohammed.stubs.BanqueServiceGrpc;
import hajji.mohammed.stubs.Schema;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class AsyncUnaryModelClient {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 7789)
                .usePlaintext()
                .build();


        BanqueServiceGrpc.BanqueServiceStub proxy = BanqueServiceGrpc.newStub(channel);

        Schema.ObjectRequest request = Schema.ObjectRequest.newBuilder()
                .setTo(Schema.Currency.DH)
                .setFrom(Schema.Currency.USD)
                .setAmount(78.0)
                .build();


        proxy.unaryModel(request, new StreamObserver<Schema.ObjectResponse>() {
            @Override
            public void onNext(Schema.ObjectResponse objectResponse) {
                System.out.println("-------------------");
                System.out.println(objectResponse);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("<------------- completed ----------------->");
            }
        });

        System.in.read();


    }
}
