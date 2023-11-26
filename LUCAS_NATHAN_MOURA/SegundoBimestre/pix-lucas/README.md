#### Lucas Nathan Olivwira de Moura
Este projeto utiliza o Quarkus, o Framework Java Supersônico Subatômico.


```shell script
./mvnw compile quarkus:dev
```

## Empacotando e executando a aplicação

A aplicação pode ser empacotada usando:

```shell script
./mvnw package
```

Isso produz o arquivo `quarkus-run.jar` no diretório `target/quarkus-app/`.
Esteja ciente de que não é um _über-jar_ já que as dependências são copiadas para o diretório `target/quarkus-app/lib/`.

A aplicação agora pode ser executada usando `java -jar target/quarkus-app/quarkus-run.jar`.

Se desejar construir um _über-jar_, execute o seguinte comando:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

A aplicação, empacotada como um _über-jar_, pode ser executada usando `java -jar target/*-runner.jar`.

## Criando um executável nativo

Você pode criar um executável nativo usando:

```shell script
./mvnw package -Dnative
```

Ou, se não tiver o GraalVM instalado, pode executar a construção do executável nativo em um contêiner usando:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

Em seguida, você pode executar seu executável nativo com: `./target/lucas-nathanj-oliveira-de-moura-1.0.0-SNAPSHOT-runner`


