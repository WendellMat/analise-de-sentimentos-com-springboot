package br.ufpb.dcx.projeto_analise_de_sentimento;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador REST responsável por receber comentários e analisar o sentimento.
 */
@RestController
@RequestMapping("/api") // Define o caminho base da API como /api
public class PASController {

    // Objeto responsável por consultar a API de análise de sentimento
    private APIQuery query;

    private List<CommentDTO> comentarios = new ArrayList<>();


    /**
    * Endpoint POST que recebe um comentário, analisa seu sentimento, insere na lista de comentários recebidos
     * e retorna o resultado.
    */
    @PostMapping("/comment")
    public String receiveComment(@RequestBody CommentDTO commentDTO) {
        this.query = new APIQuery();
        String commentContent = commentDTO.getContent(); // Obtém o texto do comentário
        String queryResult = query.verifySentiment(commentContent); // Analisa o sentimento

        commentDTO.setQueryResult(queryResult);

        comentarios.add(commentDTO);

        return queryResult; // Retorna o resultado da análise
    }

    /**
     * Endpoint para listar todos os comentários analisados.
     */

    @GetMapping("/get/comments")
    public List<CommentDTO> listComments() {
       return comentarios;
    }
}
