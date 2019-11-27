package com.askfortricks.retrofitdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MatchModel {
    @SerializedName("succcess")
    @Expose
    private Integer succcess;
    @SerializedName("suggestion1")
    @Expose
    private String suggestion1;
    @SerializedName("suggestion2")
    @Expose
    private String suggestion2;
    @SerializedName("suggestion3")
    @Expose
    private String suggestion3;
    @SerializedName("suggestion4")
    @Expose
    private String suggestion4;
    @SerializedName("suggestion5")
    @Expose
    private String suggestion5;

    public Integer getSucccess() {
        return succcess;
    }

    public void setSucccess(Integer succcess) {
        this.succcess = succcess;
    }

    public String getSuggestion1() {
        return suggestion1;
    }

    public void setSuggestion1(String suggestion1) {
        this.suggestion1 = suggestion1;
    }

    public String getSuggestion2() {
        return suggestion2;
    }

    public void setSuggestion2(String suggestion2) {
        this.suggestion2 = suggestion2;
    }

    public String getSuggestion3() {
        return suggestion3;
    }

    public void setSuggestion3(String suggestion3) {
        this.suggestion3 = suggestion3;
    }

    public String getSuggestion4() {
        return suggestion4;
    }

    public void setSuggestion4(String suggestion4) {
        this.suggestion4 = suggestion4;
    }

    public String getSuggestion5() {
        return suggestion5;
    }

    public void setSuggestion5(String suggestion5) {
        this.suggestion5 = suggestion5;
    }
}
