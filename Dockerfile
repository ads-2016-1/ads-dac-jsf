FROM payara/sever-web
ENV DOMAIN

COPY target/ads-dac-jsf.war {