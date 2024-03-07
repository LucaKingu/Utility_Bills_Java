FROM openjdk

WORKDIR /app

COPY Utility_Bills_Java/Utility\ Bills/src/ /app/

#For this project,I have to compile java code 
RUN javac Main.java

CMD [ "java" , "Main.java" ]