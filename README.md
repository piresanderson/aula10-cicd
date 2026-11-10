# Aula 10 - Pipeline de Integração Contínua

Projeto da disciplina de IQS (Aula 10 - Integração Contínua (CI/CD) com Automação de Qualidade).

## Objetivo
Configurar uma pipeline no GitHub Actions que faz o build, roda os testes unitários
e verifica a qualidade do código automaticamente a cada push e pull request.

## Tecnologias
- Java 17
- Maven
- JUnit 5
- Checkstyle
- GitHub Actions

## Estrutura
- `src/main/java/br/faculdade/Calculadora.java` — classe de exemplo
- `src/test/java/br/faculdade/CalculadoraTest.java` — testes unitários da Calculadora
- `.github/workflows/ci.yml` — pipeline de CI (build, testes e checkstyle)
- `pom.xml` — configuração do Maven

## Etapas da pipeline
1. **Build** — `mvn clean package` compila o código
2. **Testes** — `mvn test` executa os testes unitários
3. **Qualidade** — `mvn checkstyle:check` verifica o estilo do código

## Como ver a pipeline
1. Acesse a aba **Actions** do repositório
2. Abra a execução mais recente do workflow **Java CI Pipeline**
3. Clique no job **build-and-test**
4. Abra a etapa **Run Unit Tests** e confira o resultado (`Tests run: 3, Failures: 0`)

## Validação
- Pipeline executada com sucesso com os 3 testes passando
- Teste alterado de propósito para falhar, e a pipeline barrou o código (`BUILD FAILURE`)
- Teste corrigido, e a pipeline voltou a passar
- Pull Request aberto a partir da branch `docs/readme`, com a pipeline rodando antes do merge

## Padrão de commits
Este projeto segue o padrão [Conventional Commits](https://www.conventionalcommits.org/pt-br/).

## Autores
- Aline Souza da Silva
- Anderson Pires do Nascimento
- David da Silva Feitosa
- Gabriel da Silva Rossi
- Rafaela Dias Gregorio
