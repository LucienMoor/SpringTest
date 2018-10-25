FROM ubuntu:16.04

ADD ./src ./

RUN apt update && apt upgrade
RUN apt install wget
RUN chmod +x ./index.sh
RUN chmod +x ./setup/katalon.sh
RUN ./index.sh

WORKDIR /

ENTRYPOINT ENTRYPOINT ["ls", "/usr"]  
