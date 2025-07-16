package br.ufpb.dcx.projeto_analise_de_sentimento;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST responsável por receber comentários e analisar o sentimento.
 */
@RestController
@RequestMapping("/api") // Define o caminho base da API como /api
public class PASController {

    // Objeto responsável por consultar a API de análise de sentimento
    private ConsultaAPI consulta;


    /**
    * Endpoint POST que recebe um comentário, analisa seu sentimento e retorna o resultado.
    */
    @PostMapping("/comentario")
    public String receberComentario(@RequestBody ComentarioDTO comentarioDTO) {
        this.consulta = new ConsultaAPI(); // Cria uma nova instância de ConsultaAPI
        String conteudoDoComentario = comentarioDTO.getConteudo(); // Obtém o texto do comentário
        String resultadoDaConsulta = consulta.verificarSentimento(conteudoDoComentario); // Analisa o sentimento
        return resultadoDaConsulta; // Retorna o resultado da análise
    }
}
