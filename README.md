# Projeto Análise de Sentimento

Este projeto é uma aplicação simples que analisa o sentimento de um comentário utilizando a **API do Gemini** (Google AI), um backend em **Spring Boot** e um frontend em **HTML, CSS e JavaScript**.

---

## 📋 Requisitos

### Para o Backend (Java + Spring Boot)
- JDK 17+
- Maven 3.8+
- IDE (ex: IntelliJ IDEA, Eclipse ou VS Code)
- Dependências:
  - Spring Web
  - Lombok
  - Biblioteca oficial do Gemini (Google AI SDK)
  
### Para o Frontend (HTML/JS)
- Navegador Web moderno (Google Chrome, Firefox)

---

## 🚀 Passo a Passo para Executar

### 1️⃣ Clone o Repositório

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

### 2️⃣ Configure sua API KEY do Gemini

#### 1️. Acesse o site oficial do Google AI Studio:
> [https://aistudio.google.com/usage](https://aistudio.google.com/usage)

---

#### 2️. Faça login com sua Conta Google
- Utilize uma conta válida e ativa
- Caso seja sua primeira vez, aceite os **Termos de Uso** 
- Selecione "Get API key"

---

#### 3. Copie sua API Key

---

#### 4. Abra o projeto clonado pelo IntelliJ

---

#### 5. Com o projeto aberto, abra a Classe ConsultaAPI

---

#### 6. Dentro da classe, na linha 20, substitua o texto "YOUR API KEY HERE" pela sua API Key, lembrando de manter a mesma entre aspas

---

### 3️⃣ Feito isso, o projeto está pronto para ser executado. Abra a classe ProjetoAnaliseDeSentimentoApplication e execute-o

---

### 4️⃣ Abra o navegador da sua preferência e cole o seguinte link: http://localhost:8080/index.html

---

#### 1. Caso o link acima não funcione, altere a porta do link.

---

#### 2. Para alterar a porta, abra o arquivo "application.properties"

---

#### 3. Com o arquivo aberto insira a seguinte configuração: server.port = 8090; Ou substitua o valor 8090 pelo valor de alguma porta disponível.

---

#### 4. Após isso, substitua o valor que que você configurou no link(http://localhost:'valor da porta'/index.html) e acesse-o novamente

---

### 5️⃣ Após isso, entre com seu comentário e aguarde alguns segundos enquanto o Gemini analisa
