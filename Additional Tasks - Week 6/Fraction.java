package com.AdditionalTasks;

public class Fraction {
        private int nom;
        private int denom;

        public Fraction(int nom, int denom){
            this.nom = nom;
            this.denom = denom;
        }

        public void setNom(int newNom){
            this.nom = newNom;
        }

        public void setDenom(int newDenom){
            this.denom = newDenom;
        }

        public double divide(){
            return (double) this.nom / this.denom;
        }

        public String toString(){
            return nom + "/" + denom;
        }

        public int gcd(int num1, int num2) {
            if (num2 != 0) {
                return gcd(num2, num1 % num2);
            } else {
                return num1;
            }
        }

        public void lowest() {
            int gcd = this.gcd(this.nom, this.denom);
            System.out.println(this.nom / gcd + "/" + this.denom / gcd);
        }
    }

