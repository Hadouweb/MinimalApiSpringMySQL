# Minimal API with Spring Framework using MySQL

## Description
Il s'agit d'un petit projet pour apprendre à utiliser le framework Spring.
C'est une API simple qui utilise la base de données H2 pour le stockage des données.

L'API fournit des endpoints pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur une entité spécifique.

## Configuration
L'API utilise la base de données Mysql. La configuration de la base de données peut être modifiée dans le fichier `application.properties` situé dans le répertoire `src/main/resources`. Vous pouvez y configurer les propriétés de connexion à la base de données telles que l'URL, le nom d'utilisateur et le mot de passe.

## Données Initiales
Le projet est pré-configuré pour charger des données initiales dans la base de données H2 à partir du fichier `data.sql` situé dans le répertoire `src/main/resources`.

## Utilisation
Une fois l'application démarrée, vous pouvez accéder à l'API en utilisant l'URL suivante :
http://localhost:9000/messages

### Endpoints

L'API expose les endpoints suivants :

- `GET /messages` : Récupère toutes les entités.
- `GET /messages/{id}` : Récupère une entité spécifique en utilisant son ID.
- `POST /messages/create` : Crée une nouvelle entité.
- `PUT /messages/update/{id}` : Met à jour une entité existante en utilisant son ID.
- `DELETE /messages/{id}` : Supprime une entité existante en utilisant son ID.