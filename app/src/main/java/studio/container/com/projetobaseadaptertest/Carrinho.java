package studio.container.com.projetobaseadaptertest;

/**
 * Created by Eric on 28/02/2017.
 */

public class Carrinho {


    private int imageProduto;
    private String descricao;
    private String valor;

    public Carrinho(int imageProduto, String descricao, String valor) {
        this.setImageProduto(imageProduto);
        this.setDescricao(descricao);
        this.setValor(valor);
    }


    public int getImageProduto() {
        return imageProduto;
    }

    public void setImageProduto(int imageProduto) {
        this.imageProduto = imageProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }



}
