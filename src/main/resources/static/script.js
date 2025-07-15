function enviarComentario() {
    const comentario = document.getElementById('comentario').value;
    const tituloResultado = document.getElementById('titulo-resultado');
    const resultado = document.getElementById('resultado');

    // Exibe o título "Analisando..." enquanto a requisição é processada
    tituloResultado.style.display = 'block';
    tituloResultado.textContent = 'Analisando...';

    // Insere um loader animado para indicar que a análise está em andamento
    resultado.innerHTML = '<div class="loader"></div>';

    // Realiza a comunicação com a API através do requisição "POST"
    fetch('http://localhost:8080/api/comentario', {
       method: 'POST',
       headers: { 'Content-Type': 'application/json' }, // Define o tipo de conteúdo da requisição
       body: JSON.stringify({ conteudo: comentario }) // Converte o objeto JS em JSON para envio
    })
    .then(response => response.text()) // Converte a resposta para texto
    .then(data =>{
        // Exibe o resultado recebido da API na tela
        document.getElementById('titulo-resultado').style.display = 'block';
        document.getElementById('titulo-resultado').textContent = 'Resultado da Análise';
        document.getElementById('resultado').textContent = data;
    })
    .catch(error => console.error('Erro:', error)); // Trata erros na requisição
}