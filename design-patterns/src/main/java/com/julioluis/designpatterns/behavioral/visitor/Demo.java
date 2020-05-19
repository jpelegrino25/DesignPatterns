package com.julioluis.designpatterns.behavioral.visitor;

public class Demo {

    public static void main(String[] args) {
        Liquor vodka=new Liquor(19.23);
        Necessity milk=new Necessity(6.15);
        Tabacco cigar=new Tabacco(20.30);

        TaxVisitor taxVisitor=new TaxVisitor();
        HolidayTaxVisitor holidayTaxVisitor=new HolidayTaxVisitor();

        System.out.println("**********Regular Tax************");
        System.out.println("vodka:: "+ vodka.accept(taxVisitor));
        System.out.println("Milk:: "+ milk.accept(taxVisitor));
        System.out.println("Cigar:: "+ cigar.accept(taxVisitor));
        System.out.println();

        System.out.println("**********Holiday Tax************");
        System.out.println("vodka:: "+ vodka.accept(holidayTaxVisitor));
        System.out.println("Milk:: "+ milk.accept(holidayTaxVisitor));
        System.out.println("Cigar:: "+ cigar.accept(holidayTaxVisitor));
        System.out.println();

    }
}
