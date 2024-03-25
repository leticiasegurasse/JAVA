public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(); // Criação de um novo objeto Lista chamado lista

				// Adiciona os nomes "Thiago", "Leticia", "Gabriel" e "Samuel" no início da lista, respectivamente.
        lista.adicionarInicio("Thiago");
        lista.adicionarInicio("Leticia");
        lista.adicionarInicio("Gabriel");
        lista.adicionarInicio("Samuel");
				
				// Remove o primeiro elemento da lista.
        lista.removerPrimeiro();
        
        // Busca o nome "Lucas" na lista.
        lista.buscar("Lucas");

			// Imprime os elementos da lista após as operações anteriores.
        lista.imprimirLista();
        
        //Esvazia a lista, removendo todos os elementos.
        lista.esvaziarLista();
        
        // Imprime os elementos da lista após as operações anteriores.
        lista.imprimirLista();
        
 				// Adiciona os nomes "Thiago", "Leticia", "Gabriel" e "Samuel" no início da lista, respectivamente.
        lista.adicionarInicio("Thiago");
        lista.adicionarInicio("Leticia");
        lista.adicionarInicio("Gabriel");
        lista.adicionarInicio("Samuel");
        
        // Insere o nome "Joao" após o nome "Thiago" na lista.
        lista.inserirApos("Thiago", "Joao");
        
        // Adiciona o nome "Mateus" no final da lista.
        lista.adicionarUltimo("Mateus");
        
        // Imprime os elementos da lista após as operações anteriores.
        lista.imprimirLista();

				// Remove o último elemento da lista.
        lista.removerUltimo();
        
        // Imprime os elementos da lista após as operações anteriores.
        lista.imprimirLista();

				// Adiciona o nome "Flavio" no final da lista.
        lista.adicionarUltimo("Flavio");

				// Imprime os elementos da lista após as operações anteriores.
        lista.imprimirLista();
        
        // Percorre a lista para saber o tamanho
        lista.obterTamanho(); 
        //Pega o valor da variavel tamanho na classe LISTA
        lista.getTamanho(); 


    }
}
