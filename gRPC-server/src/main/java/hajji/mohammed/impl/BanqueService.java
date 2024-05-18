package hajji.mohammed.impl;

import hajji.mohammed.stubs.BanqueServiceGrpc;
import hajji.mohammed.stubs.Schema;
import io.grpc.stub.StreamObserver;

import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class BanqueService extends BanqueServiceGrpc.BanqueServiceImplBase {


    @Override
    public void unaryModel(Schema.ObjectRequest request, StreamObserver<Schema.ObjectResponse> responseObserver) {
        Schema.Currency from = request.getFrom();
        Schema.Currency to = request.getTo();
        double amount = request.getAmount();

        Schema.ObjectResponse response = Schema.ObjectResponse.newBuilder()
                .setFrom(from)
                .setTo(to)
                .setAmount(amount)
                .setResult(amount * 12.7)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void serverStreamModel(Schema.ObjectRequest request, StreamObserver<Schema.ObjectResponse> responseObserver) {

        Schema.Currency from = request.getFrom();
        Schema.Currency to = request.getTo();
        double amount = request.getAmount();

        Timer timer = new Timer();
        timer.schedule(
                new TimerTask() {
                    int counter = 0;
                    @Override
                    public void run() {
                        Schema.ObjectResponse response = Schema.ObjectResponse.newBuilder()
                                .setFrom(from)
                                .setTo(to)
                                .setAmount(amount)
                                .setResult(amount * Math.random() * 10)
                                .build();

                        responseObserver.onNext(response);

                        counter += 1;
                        if (counter == 10){
                            responseObserver.onCompleted();
                            timer.cancel();
                        }
                    }
                },
                1000,
                1000
        );

    }

    @Override
    public StreamObserver<Schema.ObjectRequest> clientStreamModel(StreamObserver<Schema.ObjectResponse> responseObserver) {

        return new StreamObserver<Schema.ObjectRequest>() {
            private final DoubleStream.Builder amountStreamBuilder = DoubleStream.builder();
            @Override
            public void onNext(Schema.ObjectRequest objectRequest) {
                //add new amount to amount stream:
                System.out.println(objectRequest.getAllFields());
                amountStreamBuilder.accept(objectRequest.getAmount());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

                double sum = amountStreamBuilder.build()
                        .sum();

                Schema.ObjectResponse response = Schema.ObjectResponse.newBuilder()
                        .setResult(sum * 12.7)
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    public StreamObserver<Schema.ObjectRequest> fullStreamModel(StreamObserver<Schema.ObjectResponse> responseObserver) {
        return new StreamObserver<Schema.ObjectRequest>() {
            private final DoubleStream.Builder amountStreamBuilder = DoubleStream.builder();
            @Override
            public void onNext(Schema.ObjectRequest objectRequest) {
                Schema.ObjectResponse response = Schema.ObjectResponse.newBuilder()
                        .setFrom(objectRequest.getFrom())
                        .setTo(objectRequest.getTo())
                        .setAmount(objectRequest.getAmount())
                        .setResult(objectRequest.getAmount() * 12.7)
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
