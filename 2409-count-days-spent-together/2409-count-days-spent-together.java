class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int a = (arriveAlice.charAt(0)-'0')*10 + arriveAlice.charAt(1)-'0';
        int b = (arriveAlice.charAt(3)-'0')*10 + arriveAlice.charAt(4)-'0';
        a = (a == 1 ? 0 : a == 2 ? 31 : a == 3 ? 59 : a == 4 ? 90 : a == 5 ? 120 : a == 6 ? 151 : a == 7 ? 181 : a == 8 ? 212 : a == 9 ? 243 : a == 10 ? 273 : a == 11 ? 304 : 334) + b;

        int c = (leaveAlice.charAt(0)-'0')*10 + leaveAlice.charAt(1)-'0';
        int d = (leaveAlice.charAt(3)-'0')*10 + leaveAlice.charAt(4)-'0';
        c = (c == 1 ? 0 : c == 2 ? 31 : c == 3 ? 59 : c == 4 ? 90 : c == 5 ? 120 : c == 6 ? 151 : c == 7 ? 181 : c == 8 ? 212 : c == 9 ? 243 : c == 10 ? 273 : c == 11 ? 304 : 334) + d;

        int e = (arriveBob.charAt(0)-'0')*10 + arriveBob.charAt(1)-'0';
        int f = (arriveBob.charAt(3)-'0')*10 + arriveBob.charAt(4)-'0';
        e = (e == 1 ? 0 : e == 2 ? 31 : e == 3 ? 59 : e == 4 ? 90 : e == 5 ? 120 : e == 6 ? 151 : e == 7 ? 181 : e == 8 ? 212 : e == 9 ? 243 : e == 10 ? 273 : e == 11 ? 304 : 334) + f;

        int g = (leaveBob.charAt(0)-'0')*10 + leaveBob.charAt(1)-'0';
        int h = (leaveBob.charAt(3)-'0')*10 + leaveBob.charAt(4)-'0';
        g = (g == 1 ? 0 : g == 2 ? 31 : g == 3 ? 59 : g == 4 ? 90 : g == 5 ? 120 : g == 6 ? 151 : g == 7 ? 181 : g == 8 ? 212 : g == 9 ? 243 : g == 10 ? 273 : g == 11 ? 304 : 334) + h;

        int min1 = Math.max(a, e);
        int min2 = Math.min(c, g);

        return Math.max(0, min2 - min1 + 1);
    }
}
