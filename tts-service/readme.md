# Purpose: do some business logic
- start with the domain

## Scope:What we are trying to achieve are the following:
- UI - Done
- Controller - Done
- Validation - Done
- Caching
- JDBC - Done
- JPA
- Domain as Entities

## Deferred feature:
- Security

## What's next: another microservice related to:
- API Gateway
- Service Registry

## Current architecture
- Traditional

## Other module implementation
- Event sourcing

## Notes
- Removing spring security feature and exploring Keycloak for authentication (Dec. 9, 2021)

```bash
# build code
$ mvn clean package dockerfile:build

# to execute docker-compose.yml
$ docker-compose up

```

## Contact
- For any comments, please email delossantos.eugene@gmail.com

### Contributing
- Feel free to send a PR to improve or fix any issue

***