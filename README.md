# programacao-paralela-distribuida
exercício pratique em java

## Programação paralela:
- PedidoProcessor está implementando um exemplo simples de programação paralela em java usando o threads por meio da API java.util.concurrent
- no código, é criado um pool com 5 threads simultâneas, em seguida, pra cada um dos 10 pedidos, cria uma nova instância da classe PedidoProcessor (implementando Runnable) e  coloca na fila de tarefas do executor.
- na classe PedidoProcessor, o pedido é processado simulando um atraso de 3 segundos usando Thread.sleep(3000). Isso simula uma tarefa que leva tempo para ser processada. (APENAS SIMULAÇÃO)

### o paralelismo é observado na saída e no gerenciador de tarefas onde está o intellij
o gerenciador de tarefas apresenta o aumento do uso de CPU enquanto o código está rodando.
e os pedidos são processados em ordem, só que o tempo de espera é simulado para ser executado em paralelo, permitindo que vários pedidos sejam processados ao mesmo tempo.

## Programação distribuída
o LogCounter define o fluxo de trabalho usando o MapReduce para contar a ocorrência de alguns tipos de eventos em registros de log (logs.txt). ele faz uso das classes Mapper e Reducer do Hadoop para dividir o trabalho em partes mapeadas e reduzidas, aproveitando a distribuição de processamento em um ambiente de cluster.
obs. tambem foi usado o hdfs para o hadoop encontrar o arquivo de texto log.

### esse foi mais difícil de configurar e ajustar para que a compilação desse certo. o intellij precisa estar com o run configurado especificamente com os arquivos do hadoop e do mapreduce





