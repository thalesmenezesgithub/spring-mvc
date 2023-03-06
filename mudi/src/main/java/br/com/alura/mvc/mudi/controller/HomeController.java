package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController
{
    @GetMapping("/home")
    public String home(Model model)
    {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Placa Mãe Gigabyte B550M AORUS ELITE");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/71OzO9TtYiL._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/PLACA-GIGABYTE-B550M-AORUS-ELITE/dp/B08BN8VD23?pf_rd_r=F5EE4XTPV3HP41YK01G5&pf_rd_t=Events&pf_rd_i=deals&pf" +
                             "_rd_p=98a9ca01-c397-47d3-a448-8353e326a348&pf_rd_s=slot-16&ref=dlx_deals_gd_dcl_img_17_3e34a325_dt_sl16_48");
        pedido.setDescricao("Uma descrição qualquer para o produto!");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos",pedidos);

        return "home";
    }
}
