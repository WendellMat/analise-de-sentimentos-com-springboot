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
    private APIQuery query;


    /**
    * Endpoint POST que recebe um comentário, analisa seu sentimento e retorna o resultado.
    */
    @PostMapping("/comment")
    public String receiveComment(@RequestBody CommentDTO commentDTO) {
        this.query = new APIQuery(); // Cria uma nova instância de ConsultaAPI
        String commentContent = commentDTO.getContent(); // Obtém o texto do comentário
        String queryResult = query.verifySentiment(commentContent); // Analisa o sentimento
        return queryResult; // Retorna o resultado da análise
    }
}
