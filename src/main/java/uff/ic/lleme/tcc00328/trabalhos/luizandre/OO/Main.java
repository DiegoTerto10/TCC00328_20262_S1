package uff.ic.lleme.tcc00328.trabalhos.luizandre.OO;

import uff.ic.lleme.tcc00328.trabalhos.luizandre.OO.data.Cliente;
import uff.ic.lleme.tcc00328.trabalhos.luizandre.OO.data.Compra;
import uff.ic.lleme.tcc00328.trabalhos.luizandre.OO.data.ItemCompra;
import uff.ic.lleme.tcc00328.trabalhos.luizandre.OO.data.Produto;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente.setCpf(123456);
        cliente.setNome("Luiz");

        cliente2.setCpf(123456);
        cliente2.setNome("Luiz André");

        Produto arroz = new Produto();
        arroz.setNome("Arroz");
        arroz.setValor(12.0);

        ItemCompra item1 = new ItemCompra();
        item1.produto = arroz;
        item1.quantidade = 2;
        System.out.println(item1.getValor());

        Compra compra = new Compra();
        compra.itens[0] = item1;

    }
}
