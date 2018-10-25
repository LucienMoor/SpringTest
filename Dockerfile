FROM ubuntu:16.04

ADD ./src ./

RUN apt update && apt upgrade -y
RUN apt install wget -y
RUN chmod +x ./index.sh
RUN chmod +x ./setup/katalon.sh
RUN ./index.sh

WORKDIR /

ENTRYPOINT ENTRYPOINT ["ls", "/usr"]  
