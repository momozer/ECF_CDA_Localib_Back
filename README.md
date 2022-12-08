# Projet Gestion des Compétences

## Description:

Ce projet a pour but de gérer les locataires (clients), le parc de véhicules et les locations de véhicules d'une 
entreprise de location de véhicule. Cette application de gestion commerciale est à l'usage unique des employés 
de l'entreprise ***Localib***.
Ce projet est la partie Back-end de l'ensmeble du projet ***Localib***

## Prérequis:
* Java 11+
* docker
* docker-compose
* un IDE (Intellij)

## Installation

### Base de données
Pour lancer la base de donnée, il faut se placer dans le dossier docker et lancer la commande suivante:

```bash
docker-compose up -d
```
### Lancement de l'application

Si la mise à jour des images est nécessaire, lancer la commande suivante :

```bash
docker-compose up -d --build
```

Pour lancer l'application il suffit d'ouvrir ce projet dans un IDE comme IntelliJ et de lancer le main en appuyant sur 
le bouton play.
