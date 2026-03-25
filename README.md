# 📮 BuscaCep

Aplicação Java para consulta de endereços a partir de CEPs brasileiros, utilizando a API [ViaCEP](https://viacep.com.br/).

## 📋 Sobre o projeto

O BuscaCep permite que o usuário digite um CEP e receba as informações do endereço correspondente. Também é possível salvar o endereço encontrado em um arquivo `.json` localmente.

## ⚙️ Como instalar e rodar

### Pré-requisitos

- Java 11 ou superior
- [Gson](https://github.com/google/gson) no classpath do projeto

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/buscacep.git
```

2. Abra o projeto no IntelliJ IDEA

3. Adicione a dependência do Gson ao projeto

4. Execute a classe `Main.java`

### Exemplo de uso

```
Digite o CEP (ou 0 para sair):
01001000

CEP: 01001-000
Logradouro: Praça da Sé
Complemento: lado ímpar
Bairro: Sé
Cidade: São Paulo
UF: SP

Adicionar esse endereço a um arquivo? 1(Sim) 2(Não)
1
Arquivo salvo com sucesso!
```

## 🛠️ Tecnologias utilizadas

- Java 11
- HttpClient (requisições HTTP)
- Gson (serialização/desserialização JSON)
- API ViaCEP
