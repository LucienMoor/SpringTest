FROM java:8

ADD ./src ./

RUN apt update && apt upgrade -y
RUN apt install wget -y
RUN chmod +x ./index.sh
RUN chmod +x ./setup/katalon.sh
RUN ./index.sh

WORKDIR /

ENTRYPOINT ["/bin/sh"]  
