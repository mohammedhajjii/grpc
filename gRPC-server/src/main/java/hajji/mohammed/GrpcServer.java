package hajji.mohammed;

import hajji.mohammed.impl.BanqueService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server grpcServer = ServerBuilder.forPort(7789)
                .addService(new BanqueService())
                .build();

        grpcServer.start();
        System.out.println("le serveur est démarré sur le port: 7789");
        grpcServer.awaitTermination();

    }
}