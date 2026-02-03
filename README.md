# AI Forge - Microservice Prompts 🚀

**AI Forge** est un projet développé en suivant un projet fil rouge de **Chillo Tech** (chaine Youtube). Ce microservice constitue la brique de base pour l'interaction avec l'intelligence artificielle via **Spring AI**.

## 🛠 Technologies
* **Java 21**
* **Spring Boot 3.5.10**
* **Spring AI** (OpenAI Starter)
* **Maven**

## ⚙️ Configuration
Le projet est configuré pour interagir avec l'API d'OpenAI. Pour sécuriser l'accès, la clé API est gérée via une variable d'environnement.

### Variable d'environnement requise
Avant de lancer l'application, vous devez générer votre clé sur **https://platform.openai.com/docs/overview** et définir la variable suivante sur votre machine :
```bash
OPENAI_API_KEY=votre_cle_api_ici
```

### Paramètres du serveur
* **Port :** 8081
* **Context Path :** /api

## 🚀 Installation et Lancement
1. **Cloner le projet** :
   ```bash
   git clone https://github.com/Diallodev01/ms-prompts.git
   ```
2. **Compiler et lancer** :
    ```bash
       mvn spring-boot:run
    ```