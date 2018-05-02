package com.example.ebsadmin.retrofitsample;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Status",
        "MessageCode",
        "Message",
        "Result",
        "Description"
})


public class GameListPojo {

    @JsonProperty("Status")
    private Integer status;
    @JsonProperty("MessageCode")
    private Integer messageCode;
    @JsonProperty("Message")
    private Object message;
    @JsonProperty("Result")
    private ArrayList<Result> result = null;
    @JsonProperty("Description")
    private Object description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("MessageCode")
    public Integer getMessageCode() {
        return messageCode;
    }

    @JsonProperty("MessageCode")
    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    @JsonProperty("Message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(Object message) {
        this.message = message;
    }

    @JsonProperty("Result")
    public ArrayList<Result> getResult() {
        return result;
    }

    @JsonProperty("Result")
    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }

    @JsonProperty("Description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}