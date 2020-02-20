# Basic dockerised Spring Boot demo

### Build and run container

* Build the app jar `mvn clean package`
* Build the docker container `docker build -t docker-demo .`
* Run the container `docker run -d -p 8080:8080 docker-demo`
* Go to [http://localhost:8080/](http://localhost:8080/)

### Stop and delete container

* List running containers `docker ps`
* Stop container `docker stop <container-name>`
* Delete container `docker rm <container-name>`
