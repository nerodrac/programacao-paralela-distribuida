class PedidoProcessor implements Runnable {
    private int pedidoId;

    public PedidoProcessor(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    @Override
    public void run() {
        System.out.println("Processando pedido" + pedidoId);

        // simulando processamento do pedido, tipo atualização no banco de dados
        try {
            Thread.sleep(3000); // finge que o processo leva 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pedido " + pedidoId + " processado com sucesso");

    }
}
