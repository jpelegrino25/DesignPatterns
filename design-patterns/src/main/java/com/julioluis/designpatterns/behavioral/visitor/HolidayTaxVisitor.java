package com.julioluis.designpatterns.behavioral.visitor;

import java.text.DecimalFormat;

public class HolidayTaxVisitor implements Visitor {
    DecimalFormat decimalFormat=new DecimalFormat("#.##");

    @Override
    public double visit(Liquor liquor) {
        return Double.parseDouble(decimalFormat.format(liquor.getPrice() * .12));
    }

    @Override
    public double visit(Tabacco tabacco) {
        return Double.parseDouble(decimalFormat.format(tabacco.getPrice() * .25));
    }

    @Override
    public double visit(Necessity necessity) {
        return Double.parseDouble(decimalFormat.format(necessity.getPrice()));
    }
}
