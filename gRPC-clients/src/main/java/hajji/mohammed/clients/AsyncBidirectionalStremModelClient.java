package hajji.mohammed.clients;

import hajji.mohammed.stubs.BanqueServiceGrpc;
import hajji.mohammed.stubs.Schema;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class AsyncBidirectionalStremModelClient {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 7789)
                .usePlaintext()
                .build();


        BanqueServiceGrpc.BanqueServiceStub proxy = BanqueServiceGrpc.newStub(channel);




        StreamObserver<Schema.ObjectRequest> streamModel = proxy.fullStreamModel(new StreamObserver<Schema.ObjectResponse>() {
            @Override
            public void onNext(Schema.ObjectResponse objectResponse) {
                System.out.println("<---------------- Response received from server --------------->");
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


        Timer timer = new Timer();
        timer.schedule(
                new TimerTask() {
                    int counter = 0;
                    @Override
                    public void run() {
                        Schema.ObjectRequest request = Schema.ObjectRequest.newBuilder()
                                .setTo(Schema.Currency.DH)
                                .setFrom(Schema.Currency.USD)
                                .setAmount(1.0)
                                .build();

                        streamModel.onNext(request);
                        System.out.println("sent request: " + request);

                        counter += 1;

                        if (counter == 10){
                            streamModel.onCompleted();
                            timer.cancel();
                        }

                    }
                },
                2000,
                1500
        );

        System.in.read();


    }
}
