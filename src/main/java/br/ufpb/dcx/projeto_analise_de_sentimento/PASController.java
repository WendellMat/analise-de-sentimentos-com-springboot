package br.ufpb.dcx.projeto_analise_de_sentimento;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Controlador REST responsável por receber comentários e analisar o sentimento.
 */
@RestController
@RequestMapping("/api") // Define o caminho base da API como /api
public class PASController {

    // Objeto responsável por consultar a API de análise de sentimento
    private APIQuery query;

    private List<CommentDTO> comments = new ArrayList<>();


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
        commentDTO.setId(UUID.randomUUID().toString());

        comments.add(commentDTO);

        return queryResult; // Retorna o resultado da análise
    }

    /**
     * Endpoint para listar todos os comentários analisados.
     */

    @GetMapping("/get/comments")
    public List<CommentDTO> listComments() {
       return comments;
    }

    // Fiz como GET para que seja possível o teste via navegador, mas encare como se fosse um
    // @DeleteMapping
    @GetMapping("/delete/comment/{id}")
    public String removeComment(@PathVariable String id) {
        // Tenta remover o comentário cujo ID corresponda ao informado na URL
        // Ex.: isEven = number -> number % 2 == 0;
        boolean removed = comments.removeIf(c -> c.getId().equals(id));

        if (removed) {
            return "Comentário removido com sucesso.";
        } else {
            return "Comentário não encontrado.";
        }
    }
}
