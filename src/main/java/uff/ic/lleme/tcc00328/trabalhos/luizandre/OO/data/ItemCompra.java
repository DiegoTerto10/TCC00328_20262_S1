package uff.ic.lleme.tcc00328.trabalhos.luizandre.OO.data;

public class ItemCompra {

    public int quantidade;
    public Produto produto;

    public double getValor() {
        return quantidade * produto.getValor();
    }

}
