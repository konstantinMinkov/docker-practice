# Steps to run application

### Required tools

* maven 3.3.9
* docker

### Build project

Run `mvn clean install` in the root folder of the project

### Build Docker image 

`docker build -t restaurant .`

### Run image 

`docker run -p 8080:8080 -it restaurant`

### See your Docker machine IP 

`docker-machine ip default`

### Open app in browser 

Simply type 

> YOUR_DOCKER_MACHINE_IP:8080/

or

> YOUR_DOCKER_MACHINE_IP:8080/api/greeting

in your browser address line. Voi la!
