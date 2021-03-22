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

}
