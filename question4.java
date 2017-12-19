4. A course has three types of assignments possible.
 Type 0: A subjective assignment contains the name of the checker, the notes of the checker and total marks.
 Type 1: An objective assignment is characterized by the total number of correct and wrong answers. A
correct answer gives a +4 and an incorrect answer gives a -1. Hence the total marks may be calculated.
 Type 2: A lab assignment is characterized by total time taken by the student, total penalty accumulated,
language used, total correct marks. The marks given is the correct marks minus the penalty. 
No other details related to any assignment are entered in the system. Print the total marks obtained by the student in
each type of assignment. Minimally implement three types of assignment classes and a student class.
------------
Input Format:
-----------
First line is the number of test cases
Next line is m, the number of students
Next m lines have the roll number and name of the student (single string
without spaces) separated by a space
Next line is the total number of assignments, N
Each subsequent line gives the assignment type and assignment ID
(string) followed by extra information as per assignment.
For type 0, next 3 inputs are name of checker, notes and total marks
(each single string/integer)
For type 1, next 2 inputs are number of correct and incorrect questions
For type 2, next inputs are total time, total penalty, language used, total
correct marks
============
Output format
=============
The first line prints the roll number
and student’s name
The second line onwards prints all
type 0 assignments and their marks, at
the end followed by total marks
The next line onwards prints all type 1
assignments and their marks, at the
end followed by total marks
The next line onwards prints all type 2
assignments and their marks, at the
end followed by total marks
-----------------
Sample Input
--------------
1
IIT2016001 Owais
7
A0 0 Utkarsh Good 15
A1 1 20 5
A2 2 120 5 Java 50
A3 0 Shubham Average 6
A4 2 150 3 Java 35
A5 1 15 7
A6 2 110 2 Java 20
===============
Sample Output
=============
IIT2016001 Owais
A0 15
A3 6
21
A1 75
A5 53
128
A2 45
A4 32
A6 18
95


==========================
solution
==========================

import java.util.*;
class TestClass {
public static class Student{//student class containg roll and name is formed
    private String rollNo;
    private String name;
    public Student(String rollNo,String name){//constructor of student class
        this.rollNo=rollNo;
        this.name=name;
    }
    public void setrn(String roll){//to set roll no.
        rollNo=roll;
    }
    public void setname(String n){//to set name
      name=n;
    }
    public String getrn(){//to get roll no.
        return rollNo;
    }
    public String getname(){//to get name
        return name;
    }
}
public static class Assign0{//class for assignment Type 0
    private String id;
    private String checker;
    private String note;
    private int marks;
   public Assign0(String id,String checker,String note,int marks){//constructor of assignment type 0
        this.id=id;
        this.checker=checker;
        this.note=note;
        this.marks=marks;
    }
    public void setid0(String i_d){//set id of assignment class
        id=i_d;
    }
    public String getid0(){//public class to access id 
        return id;
    }
    public void setcheck(String chk){//class to set name of checker
        checker=chk;
    }
    public String getcheck(){//class to access name of checker 
        return checker;
    }
    public void setnote(String nn){//to set the note given by checker
        note=nn;
    }
    public String getnote(){//to get the note/remarks of chcker
        return note;
    }
    public void setmarks(int m){//to set marks obtained 
        marks=m;
    }
    public int getmarks(){//to get the marks obtained
        return marks;
    }
   
}
public static class Assign1{//class for assignment of type 2
    private String id;
    private int crrt;
    private int wrn;
    public Assign1(String id,int crrt,int wrn){//constructor of assignment class
        this.id=id;
        this.crrt=crrt;
        this.wrn=wrn;
    }
    //the below written is set and get functions for accessing the private elements of this class and setting their value
    public void setcrrtmrk(int ct){//ct is multiplied by 4 since correct answer offers +4
        crrt= 4*ct;
    }
    public int getcrrtmrk(){
        return 4*crrt;
    }
    public void setwrn(int wr){//wrong offers -1 so multiplication by -1 is done in number of wrong questions  
        wrn=-1*wr;
    }
    public int getwrn(){
        return -1*wrn;
    }
     public void setid1(String i_d){
        id=i_d;
    }
    public String getid1(){
        return id;
    }
}
public static  class Assign2{//class for assignment of type 2
    private String id;
    private int time;
    private int penalty;
    private String lang;
    private int score;
    public Assign2(String id,int time,int penalty,String lang,int score){
        //constructor of Assignment of type 2
        this.id=id;
        this.time=time;
        this.penalty=penalty;
        this.lang=lang;
        this.score=score;
    }
    
    //the below written is set and get functions for accessing the private elements of this class and setting their value
    public void setime(int t){
        time=t;
    }
       public void setpnl(int pen){
           penalty =pen;
       }
    public void setlang(String ll){
        lang=ll;
    }
    public void setscr(int scr){
        score=scr;
    }
    public int getime(){
        return time;
    }
    public String getlng(){
        return lang;
    }
    public int getscr(){
        return score;
    }
    public int getpnl(){
        return penalty;
    }
    public void setid2(String i_d){
        id=i_d;
    }
    public String getid2(){
        return id;
    }
}
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int i=0;i<n;i++){//loop runs for the number of times of testcases i.e. n
           String rn=s.next();
           String nm=s.next();
           Student ss=new Student(rn,nm);//an oblect of student class is created 
           System.out.println(ss.getrn()+" "+ss.getname());//prints roll and name of students 
           
           int t=s.nextInt();
           int c0=0,c1=0,c2=0,sum0=0,sum1=0,sum2=0;
           
            Assign0 aa[]=new Assign0[20000];//as we don't know the number of elements so this much large size array i declared
            Assign1 bb[]=new Assign1[20000];
            Assign2 cc[]=new Assign2[20000];
            
           for(int j=0;j<t;j++){//this loop runs for the number of assignments given in question
               String as_id=s.next();
               int val=s.nextInt();
               if(val==0){
                   String id="";
                   id=id+as_id;
                   String checker=s.next();
                   String note=s.next();
                   int marks=s.nextInt();
                
                   aa[c0]=new Assign0(id,checker,note,marks);//in the array each element is stored 
                         sum0=sum0+aa[c0].getmarks();//cumulative sum of all correct marks sum0
                         c0=c0+1;//incrementing array index
               }
              if(val==1){
                   int sum=0;
                   String id="";
                   id=id+as_id;
                   int crrt=s.nextInt();
                   int wrn=s.nextInt();
                   bb[c1]=new Assign1(id,crrt,wrn);//in the array each element is stored 
                  //cumulative sum of all correct marks sum1
                   sum1=sum1+bb[c1].getcrrtmrk()+bb[c1].getwrn();//since i already multiplied -1 in wrong answer so here add is done 
                   c1=c1+1;//incrementing array index
                   
               }
               if(val==2){
                   int sc=0;
                    String id="";
                   id=id+as_id;
                   int time=s.nextInt();
                   int penalty=s.nextInt();
                   String lang=s.next();
                   int score=s.nextInt();
                  
                   cc[c2]=new Assign2(id,time,penalty,lang,score);
                   sc=sc+cc[c2].getscr()-cc[c2].getpnl(); 
                   c2=c2+1;
                   sum2=sum2+sc;//cumulative sum of all correct marks 
               }
               
           }
           for(int r=0;r<c0;r++) {
            System.out.println(aa[r].getid0()+" "+aa[r].getmarks());//print id and marks of assignment of type 0
           }
           System.out.println(sum0);//print cumulative sum of assignment of type 0
           for(int j=0;j<c1;j++) {
            System.out.println(bb[j].getid1()+" "+(bb[j].getcrrtmrk()+bb[j].getwrn()));//print id and marks of assignment of type 1
           }
            System.out.println(sum1);//print cumulative sum of assignment of type 1
            for(int k=0;k<c2;k++) {
            System.out.println(cc[k].getid2()+" "+(cc[k].getscr()-cc[k].getpnl()));//print id and marks of assignment of type 2
           }
            System.out.println(sum2);//print cumulative sum of assignment of type 2
       }
    }
}
