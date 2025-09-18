package livro.produtos;

import livro.livraria.*;

public class Mini_Livro extends Livro {
    
    public Mini_Livro(Autor autor){
        super(autor); // Delegando para o construtor da classe pai usando o super()
    }

}
