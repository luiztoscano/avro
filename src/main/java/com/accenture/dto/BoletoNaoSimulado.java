package com.accenture.dto;

public class BoletoNaoSimulado {
    private String specversion;
    private String type;
    private String source;
    private String id;
    private String time;
    private String eventversion;
    private String transactionid;
    private String datacontenttype;
    private BoletoCobranca data;

    public String getSpecversion() {
        return this.specversion;
    }

    public void setSpecversion(String specversion) {
        this.specversion = specversion;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEventversion() {
        return this.eventversion;
    }

    public void setEventversion(String eventversion) {
        this.eventversion = eventversion;
    }

    public String getTransactionid() {
        return this.transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getDatacontenttype() {
        return this.datacontenttype;
    }

    public void setDatacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
    }

    public BoletoCobranca getData() {
        return this.data;
    }

    public void setData(BoletoCobranca data) {
        this.data = data;
    }
}

