
Run rabbitmq locally  

`docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management
`

![main](https://github.com/svenkatareddy/spring-rabbitmq/actions/workflows/main-push.yaml/badge.svg)

on release it pushes artifacts. 
on push to release branch it creates docker image. 
