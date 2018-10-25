FROM ubuntu:16.04

ADD ./src ./

RUN [“chmod”, “+x”, "./index.sh”]
RUN ./index.sh

WORKDIR /

ENTRYPOINT ENTRYPOINT ["ls", "/usr"]  
