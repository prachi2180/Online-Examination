import java.util.*;

class reg{
    Scanner sc = new Scanner (System.in);
    menu mm = new menu();
    void r1(){
        System.out.println("ENTER YOUR name :");
        String name = sc.nextLine();
        System.out.println("ENTER YOUR mail :");
        String mail = sc.nextLine();
        System.out.println("ENTER YOUR Password:");
        int pp = sc.nextInt();
        System.out.println("\n  Registration Successful !! ");
        System.out.println("\n ---------- Login ------------");
        while (true){
            System.out.println("ENTER YOUR MAIL ");
            String s = sc.next();
            System.out.println("ENTER YOUR PASSWORD ");
            int p = sc.nextInt();
            if(s.equals(mail) && p == pp){
                mm.m2();
                break;
            }
            else{
                System.out.println("You entered Mail or password are incorrect");
            }
        }
    }
}
class abt{
    void display(){
        System.out.println("Name : Prachiti kishor kolhe");
        System.out.println("Mail : prachitikolhe@gmail.com");
    }
}
class menu{
    sci scn = new sci();
    eng e = new eng();
    mat m = new mat();
    abt a = new abt();
    Scanner sc = new Scanner (System.in);
    public void m2 (){
        System.out.println("\n login successful : ");
        while(true){
            System.out.println("\n 1.My Account \n 2.Exam \n 3.About \n 4. Exit");
            System.out.println("\n Enter your option :");
            int o = sc.nextInt();
            if(o==1){
                a.display();
                System.out.println("\n 1.Back       2.Exit");
                int g1 = sc.nextInt();
                if(g1==1){
                    System.out.println("\n");
                }else{
                    break;
                }
            }
            else if(o == 2){
                System.out.println("\n1.Science\n2.English\n3.Maths");
                System.out.println("Select the subjcts");
                int su = sc.nextInt();
                if(su ==1){
                    scn.s1();
                }else if(su == 2){
                    e.e1();
                }else if(su == 3){
                    m.mat1();
                }else{
                    System.out.println("Choose the correct one :");
                }
                System.out.println("\n1.Back        2.Exit");
                int g2 =sc.nextInt();
                if(g2 == 1){
                    System.out.println("\n");
                }else{
                    break;
                }
            }else if (o == 3){
                System.out.println("\n Online Examination Portal -----------");
                System.out.println("\n Designed by :\n Prachiti kishor kolhe \n Intern At\n Oasis Infobyte");
                System.out.println("\n1.Back            2.Exit");
                int g3 = sc.nextInt();
                if(g3 == 1){
                    System.out.println("\n");
                }else{
                    break;
                }

            }else if (o == 4){
                break;
            }else{
                System.out.println("Choose the correct one");
            }
        }
    }
}
class logA{
    Scanner sc = new Scanner (System.in);
    public void m1(){
        menu m = new menu();
        int pswd = 1234;
        System.out.println("Enter your mail");
        String s = sc.next();
        while(true){
            System.out.println("Enter your password");
            int p = sc.nextInt();
            if(p == pswd){
                m.m2();
                break;
            }else{
                System.out.println("You Entered Mail or Password are Incorrect");
            }
        }
    }
}
class sci{
    Scanner sc = new Scanner (System.in);
    void s1(){
        int count = 0;
        System.out.println("\n There are 10 questions each questions carries 10 marks");
        System.out.println("\n Question no 1    :");
        System.out.println("\n What is male cow called ?");
        System.out.println("\n1.Dog");
        System.out.println("2.Ox");
        System.out.println("3.Monkey");
        System.out.println("4.Sheep\n");
        int u1 = sc.nextInt();
        if(u1 == 2){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 2    :");
        System.out.println("\n Which of the following animal lay eggs ?");
        System.out.println("\n1.hen");
        System.out.println("2.cat");
        System.out.println("3.Duck");
        System.out.println("4.Sheep\n");
        int u2 = sc.nextInt();
        if(u2 == 1){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 3    :");
        System.out.println("\n What  do animals requires besides air food to survive?");
        System.out.println("\n1.Water");
        System.out.println("2.House");
        System.out.println("3.Fruites");
        System.out.println("4.Chocolates\n");
        int u3 = sc.nextInt();
        if(u3 == 1){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 4    :");
        System.out.println("\n A Branch of trees can have green?");
        System.out.println("\n1.Root");
        System.out.println("2.Hairs");
        System.out.println("3.Trunk");
        System.out.println("4.Leaves\n");
        int u4 = sc.nextInt();
        if(u4 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 5    :");
        System.out.println("\n What do you call two nose holes?");
        System.out.println("\n1.nostriles");
        System.out.println("2.eyelieds");
        System.out.println("3.Hairs");
        System.out.println("4.Nails\n");
        int u5 = sc.nextInt();
        if(u5 == 1){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 6    :");
        System.out.println("\n Which shapes look round ?");
        System.out.println("\n1.square");
        System.out.println("2.Circle");
        System.out.println("3.Rectangle");
        System.out.println("4.Triangle\n");
        int u6 = sc.nextInt();
        if(u6 == 2){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 7    :");
        System.out.println("\n Which is the largest animal on land ?");
        System.out.println("\n1.Tiger");
        System.out.println("2.Lion");
        System.out.println("3.Monkey");
        System.out.println("4.Elephant\n");
        int u7 = sc.nextInt();
        if(u7 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 8    :");
        System.out.println("\n Which organ pumps blood in our body ?");
        System.out.println("\n1.Kidney");
        System.out.println("2.lungs");
        System.out.println("3.brain");
        System.out.println("4.Heart\n");
        int u8 = sc.nextInt();
        if(u8 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 9    :");
        System.out.println("\n Which nutrients is essentil to build muscles?");
        System.out.println("\n1.Carbohydrates");
        System.out.println("2.Iron");
        System.out.println("3.Protiens");
        System.out.println("4.Fats\n");
        int u9 = sc.nextInt();
        if(u9 == 3){
            count++;
        }else{
            count = count;
        }
        System.out.println("\n Question no 10    :");
        System.out.println("\n Which planet is close from the sun?");
        System.out.println("\n1.Mara");
        System.out.println("2.Venus");
        System.out.println("3.Earth");
        System.out.println("4.Mercury\n");
        int u10 = sc.nextInt();
        if(u10 == 4){
            count++;
        }else{
            count = count;
        }
        if( count > 8){
            System.out.println("\n YOUR PERFORMANCE IS TOO GOOD !!!!!!!!!!");
        }
        else if(count >4 && count<9){
            System.out.println("/nYour performance is not bad, ALL THE BEST for next time!");
        }else{
            System.out.println("\n YOUR PERFORMANCE IS TOO BAD !!!");
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Your total score is:" +count);
        System.out.println("\n---------------------------------------");
        System.out.println("\n No.of questions you solve correct are :"+count);
        System.out.println("\nSummary of your exam :");
        System.out.println("\nQ1. Your option :"    +u1 + "\n    Actual option :2\nQ2.Your option:"     +u2+ "\n    Actual option :1\nQ3.Your option:"     +u3+ "\n Actual option:1\nQ4.Your option:"     +u4+ "\n Actual option:4\nQ5.Your option:"     +u5+ "\n Actual option:1\nQ6.Your option:"     +u6+ "\n Actual option:2\nQ7.Your option:"     +u7+ "\n Actual option:4\nQ8.Your option:"     +u8+ "\n Actual option:4\nQ9.Your option:"     +u9+ "\n Actual option:3\nQ10.Your option:"     +u10+ "\n Actual option:4");

    }
}
class eng
{
    Scanner sc = new Scanner (System.in);
    void e1()
    {
        int count = 0;
        System.out.println("\n There are 10 Questions each questions carries 2 marks .");
    

System.out.println("\n Qeustion No.1    :");
System.out.println("\n The weather has been ..............");
System.out.println("\n1.a lovely");
System.out.println("2.the lovely");
System.out.println("3.lovely");
int u1 = sc.nextInt();
if(u1 == 3){
    count++;
}else{
    count = count;
}
System.out.println("\nQuestion No.2     :");
System.out.println("\n How is the ................in delhi?");
System.out.println("\n 1.whether");
System.out.println("2.weather");
int u2 = sc.nextInt();
if(u2 == 2){
    count++;
}else{
    count = count;
}
System.out.println("\nQuestion No.3     :");
System.out.println("\n Can you ................. me?");
System.out.println("\n1.here");
System.out.println("2.hear");
int u3 = sc.nextInt();
if(u3 == 2){
    count++;
}else{
    count = count;
}
System.out.println("\nQuestion No.4     :");
System.out.println("\n paromita has no siblings she is ....................child ?");
System.out.println("\n1.a lonely");
System.out.println("2.an only");
System.out.println("3.only one");
int u4 = sc.nextInt();
if(u4 == 2){
    count++;
}else{
    count = count;
}
System.out.println("\nQuestion No.5     ");
System.out.println("\nThe teacher and student share...............mutual trust ?");
System.out.println("\n1. a deep");
System.out.println("2.deep");
System.out.println("3.deeply");
int u5 = sc.nextInt();
if(u5 == 1){
    count ++;
}else{
    count=count;
}
System.out.println("\n Question No.6       ");
System.out.println("\nShe has.................to start her driving lessons ?");
System.out.println("\n 1.yet");
System.out.println("2.already");
int u6 =sc.nextInt();
if(u6 == 2){
    count++;
}else{
    count=count;
}
System.out.println("\nQuestion No.7     ");
System.out.println("\nWhen tharun reached the auditorium they had ..............left ?");
System.out.println("\n1.already");
System.out.println("2.yet");
int u7 = sc.nextInt();
if(u7 == 1){
    count++;
}else{
    count=count;
}
System.out.println("\nQestion No.8");
System.out.println("\n The company needs someone with ............... knowledge of the indian market ?");
System.out.println("\n1.good");
System.out.println("2.a good");
System.out.println("3.the good");
System.out.println("4.Heart\n");
int u8 = sc.nextInt();
if(u8 == 2){
    count++;
}
else{
    count=count;
}
System.out.println("\nQuestion No.9     :");
System.out.println("\n You Know someone is pretending to be sad if they shed ................tears ?");
System.out.println("\n1.Baby");
System.out.println("2.Cat");
System.out.println("3.Crocodile");
int u9 = sc.nextInt();
if(u9 == 3){
    count++;
}else{
    count=count;
}
System.out.println("\nQuestion No.10    :");
System.out.println("\nif you are very busy , you are as busy as a..............?");
System.out.println("\n1.bat");
System.out.println("2.bee");
System.out.println("3.beaver");
System.out.println("4.butterfly\n");
int u10 =sc.nextInt();
if(u10 == 3){
    count++;
}else{
    count=count;
}


if( count > 8){
    System.out.println("\n YOUR PERFORMANCE IS TOO GOOD !!!!!!!!!!");
}
else if(count >4 && count<9){
    System.out.println("/nYour performance is not bad, ALL THE BEST for next time!");
}else{
    System.out.println("\n YOUR PERFORMANCE IS TOO BAD !!!");
}
System.out.println("\n---------------------------------------");
System.out.println("Your total score is:" +count);
System.out.println("\n---------------------------------------");
System.out.println("\n No.of questions you solve correct are :"+count);
System.out.println("\nSummary of your exam :");
System.out.println("\nQ1. Your option :"    +u1 + "\n    Actual option :3\nQ2.Your option:"     +u2+ "\n    Actual option :2\nQ3.Your option:"     +u3+ "\n Actual option:2\nQ4.Your option:"     +u4+ "\n Actual option:2\nQ5.Your option:"     +u5+ "\n Actual option:1\nQ6.Your option:"     +u6+ "\n Actual option:2\nQ7.Your option:"     +u7+ "\n Actual option:1\nQ8.Your option:"     +u8+ "\n Actual option:2\nQ9.Your option:"     +u9+ "\n Actual option:3\nQ10.Your option:"     +u10+ "\n Actual option:3");

}
}
class mat{
    Scanner sc = new Scanner(System.in);
    void mat1()
    {
        int count = 0;
        System.out.println("\n There are 10 Questions each question carries 2 marks  ");

        System.out.println("\nQuestion No.1     :");
        System.out.println("\n What is the next prime number after 3 ?");
        System.out.println("\n1.6");
        System.out.println("2.5");
        System.out.println("3.9");
        System.out.println("4.7\n");
        int u1 = sc.nextInt();
        if(u1 == 2){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.2     :");
        System.out.println("\n What is 15-7 ?");
        System.out.println("\n1.10");
        System.out.println("2.2");
        System.out.println("3.12");
        System.out.println("4.8\n");
        int u2 = sc.nextInt();
        if(u2 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.3     :");
        System.out.println("\n What is the square root of 81 ?");
        System.out.println("\n1.9");
        System.out.println("2.10");
        System.out.println("3.7");
        System.out.println("4.6\n");
        int u3 = sc.nextInt();
        if(u3 == 1){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.4     :");
        System.out.println("\n What does the roman numeriacl (C) represents?");
        System.out.println("\n1.one");
        System.out.println("2.one lakh ");
        System.out.println("3.one thousand");
        System.out.println("4.one hundred\n");
        int u4 = sc.nextInt();
        if(u4 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.5     :");
        System.out.println("\n What does centure reprsents ?");
        System.out.println("\n1.100");
        System.out.println("2.200");
        System.out.println("3.300");
        System.out.println("4.400\n");
        int u5 = sc.nextInt();
        if(u5 == 1){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.6     :");
        System.out.println("\n What is 25+24-10?");
        System.out.println("\n1.20");
        System.out.println("2.16");
        System.out.println("3.39");
        System.out.println("4.49\n");
        int u6 = sc.nextInt();
        if(u6 == 3){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.7     :");
        System.out.println("\n What comes next in fibonacci sequence : 0,1,2,3,5,8,13,......?");
        System.out.println("\n1.15");
        System.out.println("2.23");
        System.out.println("3.17");
        System.out.println("4.21\n");
        int u7 = sc.nextInt();
        if(u7 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.8     :");
        System.out.println("\n Whice is greater -50 or 2 ?");
        System.out.println("\n1.both");
        System.out.println("2.none");
        System.out.println("3.-50");
        System.out.println("4.2\n");
        int u8 = sc.nextInt();
        if(u8 == 4){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.9     :");
        System.out.println("\n What is greater -50 or -25 ?");
        System.out.println("\n1.none");
        System.out.println("2.-50");
        System.out.println("3.-25");
        System.out.println("4.both\n");
        int u9 = sc.nextInt();
        if(u9 == 3){
            count++;
        }else{
            count = count;
        }
        System.out.println("\nQuestion No.10     :");
        System.out.println("\n Simplify 20+2+4-1+28 ?");
        System.out.println("\n1.16");
        System.out.println("2.324");
        System.out.println("3.28");
        System.out.println("4.0\n");
        int u10 = sc.nextInt();
        if(u10 == 4){
            count++;
        }else{
            count = count;
        }
        if( count > 8){
            System.out.println("\n YOUR PERFORMANCE IS TOO GOOD !!!!!!!!!!");
        }
        else if(count >4 && count<9){
            System.out.println("/nYour performance is not bad, ALL THE BEST for next time!");
        }else{
            System.out.println("\n YOUR PERFORMANCE IS TOO BAD !!!");
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Your total score is:" +count);
        System.out.println("\n---------------------------------------");
        System.out.println("\n No.of questions you solve correct are :"+count);
        System.out.println("\nSummary of your exam :");
        System.out.println("\nQ1. Your option :"    +u1 + "\n    Actual option :2\nQ2.Your option:"     +u2+ "\n    Actual option :4\nQ3.Your option:"     +u3+ "\n Actual option:1\nQ4.Your option:"     +u4+ "\n Actual option:4\nQ5.Your option:"     +u5+ "\n Actual option:3\nQ6.Your option:"     +u6+ "\n Actual option:3\nQ7.Your option:"     +u7+ "\n Actual option:4\nQ8.Your option:"     +u8+ "\n Actual option:4\nQ9.Your option:"     +u9+ "\n Actual option:3\nQ10.Your option:"     +u10+ "\n Actual option:4");
        
    }
}

public class online_examination
{
    public static void main(String args[])
    {
        logA l1 = new logA();
        reg rr = new reg();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Welcome to Online Examination portal  !! ");
        System.out.println("\n1.Login\n2.SignUp");
        System.out.println("\nEnter your option");
        int r = sc.nextInt();
        if(r == 1){
            System.out.println("\nWelcome Back");
            System.out.println("\n ---------- Login ---------- ");
            l1.m1();
        }else{
            System.out.println(" -----------SignUp-----------");
            rr.r1();
        }
    }
}












    







































    













