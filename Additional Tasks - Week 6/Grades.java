package com.AdditionalTasks;

    public class Grades {
        private double quiz1;
        private double quiz2;
        private double midtermex;
        private double finalex;
        private double final_grade;
        private double quizes;

        public Grades(int quiz1, int quiz2, int midtermEx, int finalEx){
            this.quiz1=quiz1;
            this.quiz2=quiz2;
            this.midtermex=midtermEx;
            this.finalex=finalEx;
            this.final_grade=0;
            this.quizes=0;
        }
        public int quizes(){
            this.quiz1=quiz1*10;
            this.quiz2=quiz2*10;
            this.quizes=this.quiz1+this.quiz2;
            this.quizes=(quizes/2)*0.25;
            return (int) this.quizes;
        }
        public void midtermGrade(){
            this.midtermex=this.midtermex*0.25;
        }
        public void finalGrade(){
            this.finalex=this.finalex*0.50;
        }
        public void totalGrade(){
            this.final_grade=this.finalex+this.midtermex+this.quizes;
        }
        public void printFinalGrade(){
            if(this.final_grade>=90){
                System.out.println('A');
            }
            else if(this.final_grade<90 && this.final_grade>=80){
                System.out.println('B');
            }else if(this.final_grade<80 && this.final_grade>=70){
                System.out.println('C');
            }else if(this.final_grade<70 && this.final_grade>=60){
                System.out.println('D');
            }else{
                System.out.println('F');
            }
            System.out.println(final_grade);
        }

    }

