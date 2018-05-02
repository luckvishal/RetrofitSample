package com.example.ebsadmin.retrofitsample;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "GameId",
        "GameName",
        "GameNumber",
        "TotalNUmberOfTicketRun",
        "TicketPerPack",
        "StartDate",
        "EndDate",
        "CreatedDate",
        "UpdateDate",
        "CreatedBy",
        "UpdatedBy",
        "Denomination",
        "PackWeight",
        "GameCode"
})
public class Result implements Serializable {

    @JsonProperty("GameId")
    private Integer gameId;
    @JsonProperty("GameName")
    private String gameName;
    @JsonProperty("GameNumber")
    private String gameNumber;
    @JsonProperty("TotalNUmberOfTicketRun")
    private Object totalNUmberOfTicketRun;
    @JsonProperty("TicketPerPack")
    private Object ticketPerPack;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("CreatedDate")
    private String createdDate;
    @JsonProperty("UpdateDate")
    private Object updateDate;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("UpdatedBy")
    private Object updatedBy;
    @JsonProperty("Denomination")
    private Double denomination;
    @JsonProperty("PackWeight")
    private Double packWeight;
    @JsonProperty("GameCode")
    private String gameCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GameId")
    public Integer getGameId() {
        return gameId;
    }

    @JsonProperty("GameId")
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("GameName")
    public String getGameName() {
        return gameName;
    }

    @JsonProperty("GameName")
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @JsonProperty("GameNumber")
    public String getGameNumber() {
        return gameNumber;
    }

    @JsonProperty("GameNumber")
    public void setGameNumber(String gameNumber) {
        this.gameNumber = gameNumber;
    }

    @JsonProperty("TotalNUmberOfTicketRun")
    public Object getTotalNUmberOfTicketRun() {
        return totalNUmberOfTicketRun;
    }

    @JsonProperty("TotalNUmberOfTicketRun")
    public void setTotalNUmberOfTicketRun(Object totalNUmberOfTicketRun) {
        this.totalNUmberOfTicketRun = totalNUmberOfTicketRun;
    }

    @JsonProperty("TicketPerPack")
    public Object getTicketPerPack() {
        return ticketPerPack;
    }

    @JsonProperty("TicketPerPack")
    public void setTicketPerPack(Object ticketPerPack) {
        this.ticketPerPack = ticketPerPack;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("CreatedDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("CreatedDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("UpdateDate")
    public Object getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("UpdateDate")
    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

    @JsonProperty("CreatedBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("UpdatedBy")
    public Object getUpdatedBy() {
        return updatedBy;
    }

    @JsonProperty("UpdatedBy")
    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonProperty("Denomination")
    public Double getDenomination() {
        return denomination;
    }

    @JsonProperty("Denomination")
    public void setDenomination(Double denomination) {
        this.denomination = denomination;
    }

    @JsonProperty("PackWeight")
    public Double getPackWeight() {
        return packWeight;
    }

    @JsonProperty("PackWeight")
    public void setPackWeight(Double packWeight) {
        this.packWeight = packWeight;
    }

    @JsonProperty("GameCode")
    public String getGameCode() {
        return gameCode;
    }

    @JsonProperty("GameCode")
    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
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

