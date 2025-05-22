# Releases

Viene utilizzato direttamente il repository __spai-commons__ su GitHub come repository maven per fornire gli artefatti nelle varie versioni.

Allo scopo è stato creato un _branch_ denonimato __mvn-repo__ che conterrà gli artefatti per ogni release, e il `pom` è stato configurato con i plugin necessari per eseguire il deploy in modo opportuno.

## Configurazione di maven

Per eseguire una release, è necessario prima di tutto configurare la propria installazione di maven per indicare le credenziali di GitHub da utilizzare per la connessione al repository.

Nel file `settings.xml`, che si trova sotto la directory `conf` dell'installazione locale Maven, è necessario dichiarare tali credenziali tramite il tag `<server>` in questo modo:

```
<servers>
  <server>
    <id>git-scm-server</id>  
    <username>USERNAME_GITHUB</username>  
    <password>PASSWORD_GITHUB</password>  
  </server>  
</servers>
```

Ognuno inserirà le proprie credenziali GitHub.

## Esecuzione della release

A questo punto la release può essere effettuata con i comandi Maven di default, ovvero:

```
mvn release:clean release:prepare 
mvn release:perform
```

## Utilizzo degli artefatti

Nei progetti che necessitano della dipendenza a spai-commons, dovrà essere dichiarato il repository GitHub come repository maven, includendo nell'URL il branch __mvn-repo__:

```
<repositories>
  <repository>
    <id>spai-commons-mvn-repo</id>
    <url>https://raw.github.com/lombardisa/spai-commons/mvn-repo/</url>
  </repository>
</repositories>
```
