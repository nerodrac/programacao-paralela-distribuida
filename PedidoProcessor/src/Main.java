import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


    public class Main {
        public static void main(String[] args) {
            int numeroPedidos = 10;

            ExecutorService executor = Executors.newFixedThreadPool(5); // Número de threads simultâneas

            for (int i = 1; i <= numeroPedidos; i++) {
                PedidoProcessor pedidoProcessor = new PedidoProcessor(i);
                executor.execute(pedidoProcessor);
            }

            executor.shutdown(); // Encerrar as threads após a conclusão

        }
    }