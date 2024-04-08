class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaCircular {
    private No inicio;
    private int tamanho;

    // Construtor para inicializar a lista
    public ListaCircular() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // Método para inserir um elemento no final da lista
    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            inicio.proximo = inicio; // Lista circular, o próximo do último aponta para o primeiro
        } else {
            No temp = inicio;
            while (temp.proximo != inicio) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.proximo = inicio;
        }
        tamanho++;
    }

    // Método para remover o primeiro elemento da lista
    public int remover() {
        if (inicio == null) {
            System.out.println("Erro: Lista vazia. Não é possível remover elementos.");
            return -1; // Valor de retorno padrão para indicar erro
        }
        int valorRemovido = inicio.valor;
        if (inicio.proximo == inicio) {
            inicio = null;
        } else {
            No temp = inicio;
            while (temp.proximo != inicio) {
                temp = temp.proximo;
            }
            temp.proximo = inicio.proximo;
            inicio = inicio.proximo;
        }
        tamanho--;
        return valorRemovido;
    }

    // Método para dividir a lista em duas listas de tamanhos iguais ou quase iguais
    public void splitHalf() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        
        // Encontrar o meio da lista
        No rapido = inicio;
        No lento = inicio;
        while (rapido.proximo != inicio && rapido.proximo.proximo != inicio) {
            rapido = rapido.proximo.proximo;
            lento = lento.proximo;
        }
        
        // Se a lista tiver um número par de elementos, o lento apontará para o nó anterior ao meio
        // Se a lista tiver um número ímpar de elementos, o lento apontará para o nó do meio
        No inicioSegundaMetade = lento.proximo;
        
        // Dividir a lista
        lento.proximo = inicio;
        rapido.proximo = inicioSegundaMetade;
        
        // Imprimir as duas listas
        System.out.println("Primeira metade:");
        imprimirLista(inicio);
        System.out.println("Segunda metade:");
        imprimirLista(inicioSegundaMetade);
    }

    // Método para imprimir os elementos da lista
    public void imprimirLista(No inicioLista) {
        if (inicioLista == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        No temp = inicioLista;
        do {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        } while (temp != inicioLista);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        // Inserindo elementos na lista
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        lista.inserir(6);
        lista.inserir(7);
        lista.inserir(8);
        lista.inserir(9);
        lista.inserir(10);
        lista.inserir(11);
        lista.inserir(12);

        // Dividindo a lista em duas e imprimindo ambas
        lista.splitHalf();
    }
}
