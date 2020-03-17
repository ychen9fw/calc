package com.ychen9.calc;

public class History {
    private String ques;
    private String result;

    public History(String ques, String result) {
        this.ques = ques;
        this.result = result;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
