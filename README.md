# KeyCloak-SpringBoot
Un Systeme d'authentification avec keycloak pour acceder à l'api dans spring boot

# Requirement
installé Keycloak dans votre machine et configurer keycloak en suivant ce lien: https://www.keycloak.org/getting-started/getting-started-docker

Dans le pom.xml modifier la version de la dependance de keycloak avec votre version installée.

Dans application.properties, changer les attributs de keycloak realm, et ressource.

recuperez l'accès token.
Get Request: http://localhost:8080/realms/votre_realm/protocol/openid-connect/token
body {
client_id:<your_client_id>
username:<your_username>
password:<your_password>
grant_type:password
}

![image](https://github.com/Bouba-Barry/KeyCloak-SpringBoot/assets/96130733/6f12d516-23d2-4b81-8b2e-9962a4fe875b)


Lancer l'application spring boot et tester avec postman, en envoyant comme preuve l'accès token réçu dans la requeste précedente.

![image](https://github.com/Bouba-Barry/KeyCloak-SpringBoot/assets/96130733/57e0ae41-e238-4a16-9e8d-f5a181e95b1f)
