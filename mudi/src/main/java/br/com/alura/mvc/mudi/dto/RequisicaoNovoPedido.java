package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RequisicaoNovoPedido
{
    @NotBlank
    @Size(min = 5, max = 80)
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String urlImagem;
    private String descricao;

    public String getNomeProduto()
    {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto)
    {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto()
    {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto)
    {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem()
    {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem)
    {
        this.urlImagem = urlImagem;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public Pedido toPedido()
    {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlProduto(urlProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setDescricao(descricao);
        pedido.setStatus(StatusPedido.AGUARDANDO);

        return pedido;
    }
}
