package com.seenu.FunctionalInterface;

public interface AnnonymousInnerClass {
void a1();
void b1();

    public static void main(String[] args) {
        AnnonymousInnerClass in = new AnnonymousInnerClass() {
            @Override
            public void a1() {
                System.out.println("A1");
            }
            @Override
            public void b1() {
                System.out.println("B1");
            }
        };
        in.a1();
        in.b1();

    }
}
