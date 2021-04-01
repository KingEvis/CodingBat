public class CodingBatMain {
    //        psvm shortcut
    public static void main(String[] args) {
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !(weekday&&!vacation);
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile&&bSmile)||(!aSmile&&!bSmile);
    }
    public int sumDouble(int a, int b) {
        if(a==b){
            return (a+b)*2;
        }else{
            return a+b;
        }
    }
    public int diff21(int n) {
        int difference = 21-n;
        if (difference<0){
            difference=difference*-1;
        }
        if (n >21){
            return difference*2;
        } else {
            return difference;
        }
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking&&(hour<7||hour>20);
    }
    public boolean makes10(int a, int b) {
        return (a==10||b==10||a+b==10);
    }
    public boolean nearHundred(int n) {
        return (Math.abs(100-n)<=10||Math.abs(200-n)<=10);
    }
    public boolean posNeg(int a, int b, boolean negative) {
        return ((a<0&&b<0&&negative)||(a>0&&b<0&&!negative)||(a<0&&b>0&&!negative));
    }
    public String notString(String str) {
        if(str.length()<3){
            return "not "+str;
        }
        if ((str.substring(0, 3)).equals("not")){
            return str;
        }else{
            return "not "+str;
        }
    }
    public String missingChar(String str, int n) {
        return (str.substring(0,n)+str.substring(n+1));
    }
    public String frontBack(String str) {
        if(str.length()<=1){
            return str;
        }
        return str.substring(str.length()-1) + str.substring(1,str.length()-1) +
                str.substring(0,1) ;
    }
    public String front3(String str) {
        if(str.length()<=3){
            return str+str+str;
        }
        str = str.substring(0,3);
        return str+str+str;
    }
    public String backAround(String str) {
        char lastLetter = str.charAt(str.length()-1);
        return lastLetter+str+lastLetter;
    }
    public boolean or35(int n) {
        return (n%3==0||n%5==0);
    }
    public String front22(String str) {
        if (str.length()<=1){
            return str+str+str;
        }
        return (str.substring(0,2)+str+str.substring(0,2));
    }
    public boolean startHi(String str) {
        if (str.length()<2){
            return false;
        }
        return(str.substring(0,2).equals("hi"));
    }
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1<0&&temp2>100)||(temp1>100&&temp2<0));
    }
    public boolean in1020(int a, int b) {
        return ((a>=10 && a<=20)||(b>=10 && b<=20));
    }
    public boolean hasTeen(int a, int b, int c) {
        return ((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19));
    }
    public boolean loneTeen(int a, int b) {
        return ((!(b>=13 && b<=19)&&(a>=13 && a<=19))||((b>=13 && b<=19))&&!(a>=13 && a<=19));
    }
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4);
        }
        return str;
    }
    public boolean mixStart(String str) {
        return str.length()>=3&&str.substring(1,3).equals("ix");
    }
    public String startOz(String str) {

        str=str+"bb";
        String firstLetter = str.substring(0,1);
        String secondLetter = str.substring(1,2);
        if (firstLetter.equals("o")&&secondLetter.equals("z")){
            return firstLetter+secondLetter;
        }
        if (firstLetter.equals("o")){
            return firstLetter;
        }
        if (secondLetter.equals("z")){
            return secondLetter;
        }
        return "";
    }
    public int intMax(int a, int b, int c) {
        if (a>b&&a>c){
            return a;
        }
        if (b>c&&b>a){
            return b;
        }
        if (c>b&&c>a){
            return c;
        }
        return -1;
    }
    public boolean in3050(int a, int b) {
        return (a>=40&&a<=50&&b>=40&&b<=50)||(a>=30&&a<=40&&b>=30&&b<=40);
    }
    public int max1020(int a, int b) {
        if ((a>20||a<10)&&(b>20||b<10)){
            return 0;
        }
        if (a>b&&a<=20&&a>=10){
            return a;
        }
        if (a>b&&b<=20&&b>=10&&a>20){
            return b;
        }
        if (b>a&&b<=20&&b>=10){
            return b;
        }
        if (b>a&&a<=20&&a>=10&&b>20){
            return a;
        }
        return -1;
    }
    public boolean lastDigit(int a, int b) {
        return (a%10==b%10);
    }
    public String endUp(String str) {
        if(str.length()<=3){
            return str.toUpperCase();
        }
        String lastThree = str.substring(str.length()-3);
        return (str.substring(0,str.length()-3)+lastThree.toUpperCase());
    }
    public int close10(int a, int b) {
        int aDiff;
        int bDiff;
        if(a<0){
            aDiff = -1*a+10;
        }else{
            aDiff = Math.abs(10-a);
        }
        if(b<0){
            bDiff = -1*b+10;
        }else{
            bDiff = Math.abs(10-b);
        }
        if (aDiff==bDiff){
            return 0;
        }
        if (aDiff>bDiff){
            return b;
        }
        return a;
    }
    public boolean stringE(String str) {
        int eCount=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='e'){
                eCount=eCount+1;
            }
        }
        return eCount==1||eCount==2||eCount==3;
    }
    public String stringTimes(String str, int n) {
        String result="";
        for (int i = 0; i <n; i++){
            result=result+str;
        }
        return result;
    }
}
