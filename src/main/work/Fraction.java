package main.work;
import java.util.Scanner;

public class Fraction {

        private int num;
        private int den;

        public Fraction(int n, int d) {
            if (d == 0) throw new IllegalArgumentException("den = 0 not allowed");
            num = n;
            den = d;
            simpl();
        }

        public Fraction() {
            this(0, 1);
        }

        public int getNum() { return num; }
        public int getDen() { return den; }
        public void setNum(int n) { num = n; simpl(); }
        public void setDen(int d) {
            if (d == 0) throw new IllegalArgumentException("den = 0 not allowed");
            den = d; simpl();
        }

        public void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("num: ");
            num = sc.nextInt();
            System.out.print("den: ");
            den = sc.nextInt();
            if (den == 0) throw new IllegalArgumentException("den = 0 not allowed");
            simpl();
        }

        public void print() {
            System.out.println(num + "/" + den);
        }

        private void simpl() {
            int g = gcd(num, den);
            num /= g;
            den /= g;
            if (den < 0) { num *= -1; den *= -1; }
        }

        private int gcd(int a, int b) {
            if (b == 0) return Math.abs(a);
            return gcd(b, a % b);
        }

        public Fraction inv() {
            if (num == 0) throw new IllegalArgumentException("cant inv if num=0");
            return new Fraction(den, num);
        }

        public Fraction add(Fraction o) {
            int n = num * o.den + o.num * den;
            int d = den * o.den;
            return new Fraction(n, d);
        }

        public Fraction sub(Fraction o) {
            int n = num * o.den - o.num * den;
            int d = den * o.den;
            return new Fraction(n, d);
        }

        public Fraction mul(Fraction o) {
            int n = num * o.num;
            int d = den * o.den;
            return new Fraction(n, d);
        }

        public Fraction div(Fraction o) {
            if (o.num == 0) throw new IllegalArgumentException("cant div by 0");
            int n = num * o.den;
            int d = den * o.num;
            return new Fraction(n, d);
        }

}
