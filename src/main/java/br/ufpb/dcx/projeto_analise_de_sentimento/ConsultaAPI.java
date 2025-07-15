package br.ufpb.dcx.projeto_analise_de_sentimento;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Classe responsável por interagir com a API do Gemini para análise de sentimento.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaAPI {

    // Chave de acesso à API do Gemini
    private final String GEMINI_API_KEY = "AIzaSyCE_5b04_XdVtxufirfJq17gMxI8ET2Cb4";

    // Cliente da API Gemini, criado usando a chave de acesso
    private Client client = Client.builder().apiKey(GEMINI_API_KEY).build();

    /**
    * Método que envia um comentário para a API do Gemini e retorna a análise de sentimento.
    */
    public String verificarSentimento(String comentarioASerAnalisado) {
        // Envia a requisição para o modelo "gemini-2.5-flash" solicitando a análise de sentimento
        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "Analise o sentimento/humor deste conteúdo em positivo, negativo ou neutro e dê uma breve " +
                                "descrição do motivo: " + comentarioASerAnalisado,
                        null);

        // Retorna o texto de resposta gerado pela API
        return response.text();
    }
}
