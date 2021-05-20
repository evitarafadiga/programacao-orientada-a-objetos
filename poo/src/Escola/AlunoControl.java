package Escola;

public class AlunoControl {

    private List<Aluno> lista = new ArrayList<>();

    public void adicionar(Aluno j) {
        lista.add(j);
    }

    public Aluno pesquisarPorTitulo(String titulo) {
        for (Aluno j : lista) {
            if (j.getTitulo().contains(titulo)) {
                return j;
            }
        }
        return null;
    }
}
}
