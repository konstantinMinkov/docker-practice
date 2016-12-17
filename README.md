# Steps to run application

## Build Docker image 

> docker build -t restaurant .

## Run image 

> docker run -p 8080:8080 -it restaurant mvn jetty:run

## See your Docker machine IP 

> docker-machine ip default

## Open app in browser 

Simply type 

> YOUR_DOCKER_MACHINE_IP:8080/

or

> YOUR_DOCKER_MACHINE_IP:8080/api/greeting

in your browser address line. Voi la!
