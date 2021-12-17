import points.Point;

class Main{

    static boolean isLower(char c){
        return c >= 'a' && c <= 'z';
    }

    static int countLower(String s) {
        int count = 0, i = 0;
        while (i < s.length())
            if (isLower(s.charAt(i++)))
                count++;
        return  count;
    }

    public static void main(String[] args){
        Point myPoint = new Point(10, 15);
        System.out.println(myPoint.getX());
        System.out.println(isLower('y'));
        System.out.println(countLower("a"));

    }
}
