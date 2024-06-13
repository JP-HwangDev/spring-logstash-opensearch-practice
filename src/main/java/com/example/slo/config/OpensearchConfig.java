package com.example.slo.config;

import org.apache.hc.client5.http.auth.CredentialsProvider;
import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;
import org.apache.hc.client5.http.impl.auth.BasicCredentialsProvider;
import org.apache.hc.core5.http.HttpHost;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.transport.httpclient5.ApacheHttpClient5TransportBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.core5.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Configuration

public class OpensearchConfig {

    final String index_name = "slo";
    final HttpHost host = new HttpHost("https", "localhost", 9200);
    final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
    @Bean
    public OpenSearchClient OpensearchInit() throws Exception {
        try {
            // Create SSLContext
            return new OpenSearchClient(ApacheHttpClient5TransportBuilder.builder(host)
            .build());

        } catch (Exception e){
            System.out.println(e.getMessage());
            return  null;
        }
    }

}
