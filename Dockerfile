FROM ubuntu:latest
LABEL authors="viett"

ENTRYPOINT ["top", "-b"]