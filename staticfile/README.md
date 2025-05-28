# Dockerized Static Website with NGINX

A simple static site served using Docker and NGINX.

## How to Run

```bash
docker build -t my-site .
docker run -d -p 8080:80 my-site

