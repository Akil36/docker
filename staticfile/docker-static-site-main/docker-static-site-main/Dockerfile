
# Use the official NGINX image as base
FROM nginx:alpine

# Remove the default nginx website
RUN rm -rf /usr/share/nginx/html/*

# Copy your static files
COPY index.html /usr/share/nginx/html/

# Expose port 80
EXPOSE 80
