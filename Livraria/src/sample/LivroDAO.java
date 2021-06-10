package sample;

import java.util.List;

public interface LivroDAO {

    void adicionar(Livro p);
    List<Livro> pesquisarPorNome(String nome);
    void remover(long id);

}