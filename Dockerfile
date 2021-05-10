FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/app
ENV BOT_NAME=name_bot
ENV BOT_TOKEN=token_bot
COPY japp.jar /opt/app
CMD ["java", "-jar", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "/opt/app/japp.jar"]