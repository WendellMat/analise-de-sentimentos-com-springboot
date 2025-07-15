package br.ufpb.dcx.projeto_analise_de_sentimento;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaAPI {
    private Client client = Client.builder().apiKey("GEMINI_API_KEY").build();

    public String verificarSentimento(String comentarioASerAnalisado) {
        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "Analise o sentimento/humor deste conteúdo em positivo, negativo ou neutro e dê uma breve " +
                                "descrição do motivo: " + comentarioASerAnalisado,
                        null);

        return response.text();
    }
}
