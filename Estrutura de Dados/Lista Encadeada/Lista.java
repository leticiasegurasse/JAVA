public class Lista {
    public No cabeca; //Representa a cabeça da lista encadeada, ou seja, o primeiro nó.
    public No cauda; //Representa a cauda da lista encadeada, ou seja, o último nó.
    public int tamanho; //Armazena o número de elementos presentes na lista.

		//O construtor da classe Lista é responsável por inicializar a lista. Ele cria nós para a cabeça e a cauda e define o tamanho como 0.
    public Lista() {
        cabeca = new No(); // Fornecendo um nome arbitrário para o nó da cabeça
        cauda = new No(); // Fornecendo um nome arbitrário para o nó da cauda
        tamanho = 0;
    }
    

    //Adicionar elemento no inicio da lista
    public void adicionarInicio(String nome){
        No novo = new No(nome); //Cria um novo nó com o nome fornecido.
        
        //Verifica se a lista está vazia
        if(tamanho == 0){ 
            novo.proximo = cauda;
            cabeca.proximo = novo;
        }else{
            novo.proximo = cabeca.proximo;
            cabeca.proximo = novo;
        }
        tamanho++;
    }
    

    //Remover primerio elemento
    public void removerPrimeiro(){
        if(tamanho == 0){
            System.out.println("Lista Vazia!!");
            return;
        }else{
            cabeca.proximo = cabeca.proximo.proximo;
        }
        tamanho--;
    }

    //Adicionar ao final da lista
    public void adicionarUltimo(String nome){
        No novo = new No(nome);
        No cursor = cabeca;
 
        if(tamanho == 0){ //Se o tamanho for 0, ele chama o método adicionarInicio()
            adicionarInicio(nome);

            return; //Usado para interromper a continuação da função
        }

        //percorre a lista até achar o ultimo elemento
        while(cursor.proximo != cauda){
            cursor = cursor.proximo;
        }
        novo.proximo = cauda;
        cursor.proximo = novo;
        tamanho++;
    }

    //Remove ulimo elemento da lista
    public void removerUltimo(){
        if(tamanho == 0){
            System.out.println("Lista Vazia!!");
        }else if(tamanho == 1){
            cabeca.proximo = cauda;
            tamanho--;
        }else{
            No encontrarPenultimo = cabeca.proximo;
            while (encontrarPenultimo.proximo.proximo != cauda) {
                encontrarPenultimo = encontrarPenultimo.proximo;
            }
            encontrarPenultimo.proximo = cauda;
            tamanho--;
        }
    }

    public void buscar(String nome) {
        No atual = cabeca;
        int i = 0;
    
        while (atual != null && atual.nome != nome) {
            atual = atual.proximo;
            i++;
        }
    
        if (atual != null) {
            System.out.println("---------------------------" + 
                        "\n" + "Encontrei!" + 
                        "\n" + "Nome: " + nome +
                        "\n" + "Posicao: " + i +
                        "\n" + "---------------------------");
        } else {
            System.out.println("---------------------------" + 
                        "\n" + "Elemento nao encontrado!!" +
                        "\n" + "---------------------------");
            
        }
    }

    //Inserir um novo nome após o escolhido
    public void inserirApos(String nome, String novoNome) {
        No atual = cabeca;
        while (atual != null && atual.nome != nome) {  //Percorre a lista para encontrar o nome
            atual = atual.proximo;
        }
        if (atual != null) {   //Se o nome estiver na lista, ele o adiciona
            No novoNodo = new No(novoNome);
            novoNodo.proximo = atual.proximo;
            atual.proximo = novoNodo;
            if (atual == cauda) {
                cauda = novoNodo;
            }
            tamanho++;
        } else {  //Caso contraio ele imprime que não encontrou
            System.out.println("Nome: " + nome + " não encontrado.");
        }
    }

    //Esvaziar a lista
    public void esvaziarLista(){
        cabeca.proximo = cauda;
        tamanho = 0;
    }

    //obter tamanho da lista percorrendo a lista inteira
    public void obterTamanho(){
        if(tamanho == 0){
            System.out.println("Lista Vazia!!");
        }else{
            No cursor = cabeca.proximo;
            int tamanho = 0;
        
            while(cursor != cauda){
                cursor = cursor.proximo;
                tamanho++;
            }
            System.out.println("Tamanho da lista: " + tamanho);
        }
    }
    
    //obter tamanho da lista atraves da variavel
    public void getTamanho(){
        System.out.println("Tamanho da lista: " + tamanho);
    }    

    public void imprimirLista(){
        if(tamanho == 0){
            System.out.println("Lista Vazia");
         }else{
            System.out.println("\n" + "------------------------");
            No cursor = cabeca.proximo;
            //percorre a lista e imprime enquanto o cursor for diferente da cauda
            while(cursor != cauda){
               System.out.print(cursor.nome + "-> ");
               cursor = cursor.proximo;
            }
            System.out.println("\n" + "------------------------");;
         }      
    }
}
