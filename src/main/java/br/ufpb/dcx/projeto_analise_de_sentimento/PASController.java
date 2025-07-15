package br.ufpb.dcx.projeto_analise_de_sentimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PASController {
    private ConsultaAPI consulta;

    @PostMapping("/comentario")
    public String receberComentario(@RequestBody Comentario comentario) {
        this.consulta = new ConsultaAPI();
        String conteudoDoComentario = comentario.getConteudo();
        String resultadoDaConsulta = consulta.verificarSentimento(conteudoDoComentario);
        return resultadoDaConsulta;
    }
}
