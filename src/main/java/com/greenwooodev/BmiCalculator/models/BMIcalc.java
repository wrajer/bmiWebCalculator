package com.greenwooodev.BmiCalculator.models;

public class BMIcalc {

    private int weight;
    private int height;

    public BMIcalc(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public BMIcalc() {
    }

    public String getBmiKgCm(int weight, int height, String unitweight,String unitheight) {
        if (height == 0 || weight == 0) {
            return "Wrong input";
        }

        double factor1 = unitheight.equals("cm") ? 1 : 2.54 ;
        double factor2 = unitweight.equals("kg") ? 1 : 2.20462262 ;

        Double bmi = (weight/factor2) / (height * height * 0.0001 *factor1*factor1);

        return String.format("%.1f", bmi);
    }


}
