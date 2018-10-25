FROM ubuntu:16.04

ADD ./src ./

RUN ./index.sh

WORKDIR /

ENTRYPOINT ENTRYPOINT ["ls", "/usr"]  
