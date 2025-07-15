function enviarComentario() {
    const comentario = document.getElementById('comentario').value;
    const tituloResultado = document.getElementById('titulo-resultado');
    const resultado = document.getElementById('resultado');

    // Mostra mensagem de carregamento
    tituloResultado.style.display = 'block';
    tituloResultado.textContent = 'Analisando...';
    resultado.innerHTML = '<div class="loader"></div>';

    // Realiza a comunicação com a API através do requisição "POST"
    fetch('http://localhost:8080/api/comentario', {
       method: 'POST',
       headers: { 'Content-Type': 'application/json' },
       body: JSON.stringify({ conteudo: comentario })
    })
    .then(response => response.text())
    .then(data =>{
        document.getElementById('titulo-resultado').style.display = 'block';
        document.getElementById('titulo-resultado').textContent = 'Resultado da Análise';
        document.getElementById('resultado').textContent = data;
    })
    .catch(error => console.error('Erro:', error));
}