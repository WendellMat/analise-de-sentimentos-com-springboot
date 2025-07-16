package br.ufpb.dcx.projeto_analise_de_sentimento;

/**
 * Classe modelo que representa um comentário enviado pelo usuário.
 */
public class CommentDTO {

    // Atributo que armazena o conteúdo/texto do comentário
    private String content;

    // Getters e Setters
    public String getContent() { return content; }
    // Não utilizaremos o setter, o intuito foi apenas uma demonstração
    public void setContent(String content) { this.content = content; }
}

