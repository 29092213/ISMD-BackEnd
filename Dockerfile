# Usa uma imagem oficial do Java como base
FROM openjdk:17-jdk-slim

# Define o volume para a aplicação
VOLUME /tmp

# Adiciona o arquivo .jar da sua aplicação ao contêiner
COPY target/avaliacao-0.0.1-SNAPSHOT.jar app.jar

# Define o comando que será executado quando o contêiner iniciar
ENTRYPOINT ["java","-jar","/app.jar"]