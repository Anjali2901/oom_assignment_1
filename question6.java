6. Repeat question 5 with the difference that (i) The first line of output is the grand total marks of all
assignments combined. The next line prints the assignments in the same order as entered followed by the marks
obtained.
=============
Sample Output
==============
IIT2016001 Owais
144
A0 15
A1 75
A2 45
A3 6
A4 32
A5 53
A6 18
LIT2016001 Sahil
36
A0 5
A1 25
A2 6


=============
solution
==============
import java.util.*;
class TestClass {
    public static class assign{//assign class formed to so that array of type assign can be used to store sequence of assignments 
        
        //since only id of assignment and marks in it need to be printed so in this class only those values stored 
        private String ide;
        private int mark;
        public assign(String dd,int mx){// constructor for class assign
            ide=dd;
            mark=mx;
        }
        
        // get and set functions to acsess this private attribute of assign class
        public void setide(String ide){
            this.ide=ide;
        }
        public void setmark(int mark){
            this.mark=mark;
        }
        public String getide(){
            return ide;
        }
        public int getmark(){
            return mark;
        }
        
    }
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
 
public static class Batch{//batch class formed which contains student type attribute
    private Student std[]=new Student[1000];
     int i;
     public Batch(){
         ;
     }
    //set and get functions for batch class
    public void setstudent(Student st,int i){
       std[i]=st;
    }
    public Student getstudent(int i){
        return std[i];
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
       public void setpnl(int pen){//to set penalty
           penalty =pen;
       }
    public void setlang(String ll){//to set language
        lang=ll;
    }
    public void setscr(int scr){//to set score
        score=scr;
    }
    public int getime(){//to set time
        return time;
    }
    
    //corresponding get functions for above attributes
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
       
        for(int ai=0;ai<n;ai++){
            Batch b=new Batch();
           int l=s.nextInt();
           for(int v=0;v<l;v++){
            String rn=s.next();
            String nm=s.next();
          Student ss=new Student(rn,nm);
          b.setstudent(ss,v);//an array of batch type formed to store students 
           }
           
            for(int i=0;i<l;i++){
           int t=s.nextInt();
          int mm=0;//to find sum of marks of all assignments
          assign aaa[]=new assign[400];//to store the assignment sequence so that for printing we directly an access 
          int at=0;//index of aaa[] array
            for(int c=0;c<t;c++)
            {
               String as_id=s.next();
               int val=s.nextInt();
               if(val==0){
                   int sum0=0;
                   String id="";
                   id=id+as_id;
                   String checker=s.next();
                   String note=s.next();
                   int marks=s.nextInt();
                   Assign0 aa=new Assign0(id,checker,note,marks);
                   aaa[at]=new assign(aa.getid0(),aa.getmarks());
                   at=at+1;
                   sum0=sum0+aa.getmarks();
                     mm=mm+sum0;//mm addes upto sum of assignment type 0 marks 
               }
               if(val==1){
                   int sum1=0;
                   String id="";
                   id=id+as_id;
                   int crrt=s.nextInt();
                   int wrn=s.nextInt();
                  Assign1 bb=new Assign1(id,crrt,wrn);
                   sum1=sum1+bb.getcrrtmrk()+bb.getwrn();
                   aaa[at]=new assign(bb.getid1(),sum1);
                   at=at+1;
                        mm=mm+sum1;//mm addes upto sum of assignment type 1 marks 
              }
               if(val==2){
                   int sum2=0;
                    String id="";
                   id=id+as_id;
                   int time=s.nextInt();
                    int penalty=s.nextInt();
                   String lang=s.next();
                   int score=s.nextInt();
                    Assign2 cc=new Assign2(id,time,penalty,lang,score);
                   sum2=sum2+cc.getscr()-cc.getpnl();
                   aaa[at]=new assign(cc.getid2(),sum2);
                   at=at+1;
                     mm=mm+sum2;//mm addes upto sum of assignment type 2 marks 
               }
            }
           
            System.out.println(b.getstudent(i).getrn()+" "+b.getstudent(i).getname());
            
            //since the getrn() function is defined in student class and student is stored in Batch array
            //so access of getrn() or getname() function can be done in this way ,i.e by first accessing through getstudent() function
            
            System.out.println(mm);//total sum of marks of all assignments 
            
                
            for(int vt=0;vt<at;vt++){//to print assignment id and marks in the sequence in which they came
                System.out.println(aaa[vt].getide()+" "+aaa[vt].getmark());
            }
            
            }
        }
}
}
   
