# 🌀 Desafio Controle de Fluxo – Bootcamp Santander 2025 (DIO)

Projeto em **Java** desenvolvido como parte do **Bootcamp Santander 2025** oferecido pela **Digital Innovation One (DIO)**.

---

## 📚 Objetivo

Implementar um programa que:

- Receba dois números inteiros como parâmetros.
- Valide se o segundo parâmetro é maior que o primeiro.
- Realize a contagem incremental entre eles, exibindo os valores no console.
- Lança uma exceção personalizada (`ParametrosInvalidosException`) caso a regra não seja atendida.

---

## 🛠️ Estrutura do Projeto

```
DesafioControleFluxo/
├── pom.xml
├── src/
│   └── main/
│       └── java/com/giovannyenes/
│           ├── Main.java
│           ├── Contador.java
│           └── ParametrosInvalidosException.java
```

---

## ▶️ Como Executar o Projeto

### Pré-requisitos
- **Java 17** (ou superior) instalado.
- **Maven** instalado.

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/GiovannyEnes/DesafioControleFluxo.git
   cd DesafioControleFluxo
   ```

2. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```

3. Execute o programa informando os parâmetros:
   ```bash
   mvn exec:java -Dexec.mainClass="com.giovannyenes.Main" -Dexec.args="5 10"
   ```

---

## 💻 Exemplo de Execução

Entrada:
```bash
mvn exec:java -Dexec.mainClass="com.giovannyenes.Main" -Dexec.args="3 7"
```

Saída esperada:
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
```

Se o segundo parâmetro for menor que o primeiro:
```
O segundo parâmetro deve ser maior que o primeiro
```

---

## 📌 Conceitos Aplicados

- Estruturas de controle de fluxo (loops e condicionais).
- Criação e uso de exceção personalizada.
- Boas práticas com Maven e organização de pacotes.

---

## 👨‍💻 Autor
Projeto desenvolvido por **Giovanny Enes**  
🔗 [GitHub](https://github.com/GiovannyEnes)  
