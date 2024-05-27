package com.example.slo.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@lombok.Data
public class Data {

    @JsonProperty("@timestamp")
    private String timestamp;

    @JsonProperty("@version")
    private String version;

    @JsonProperty("message")
    private String message;

    @JsonProperty("tags")
    private List<String> tags;

    // toString method for debugging

    @Override
    public String toString() {
        return "IndexData{" +
                "timestamp='" + timestamp + '\'' +
                ", version='" + version + '\'' +
                ", message='" + message + '\'' +
                ", tags=" + tags +
                '}';
    }


}