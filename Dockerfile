FROM openjdk

WORKDIR /app

COPY utilityBills/Main.java /app/

CMD [ "java" , "Main" ]