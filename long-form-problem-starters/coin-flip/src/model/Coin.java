package model;

import java.util.Random;

public class Coin {

    private String status = "heads";
    private String[] options = {"heads", "tails"};

    public String checkStatus() { return this.status; }
    public void setStatus(String status) {this.status = status;}

    public void flip() {
        Random rand = new Random();
        Integer nextInd = rand.nextInt(this.options.length);
        this.setStatus(this.options[nextInd]);
    };

}
