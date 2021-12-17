import points.Point;

class Main{
/*A.Defina uma função que indica se o carácter é ou não uma letra minúscula. */

    static boolean isLower(char c){
        return c >= 'a' && c <= 'z';
    }

/*B.Defina uma função que dado um vetor de caracteres, devolva quantas letras
minúsculas contém o vector.*/

    static int countLower(char[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++)
            if (isLower(s[i]))
                count++;
        return  count;
    }

/*C.Defina uma função que dado um vector de caracteres, devolva um novo vector
apenas com as letras minúsculas.*/

    static char[] onlyLower(char[] s){
        char[] res = new char[countLower(s)];
        for (int i = 0, j = 0; i < s.length; i++)
            if (isLower(s[i]))
                res[j++] = s[i];
        return res;
    }

/*D.Defina uma função que dada uma matriz de caracteres, devolva quantas letras
minúsculas a matriz contém. De preferência use a função da alínea B.*/


/*E. Defina uma função que dados um carácter e um vetor de caracteres, devolva quantas
vezes o carcácter aparece no vector.

F. Defina uma função que dado um vetor de caracteres, devolva se existe algum carácter
repetido. Faça de duas maneiras diferentes, uma delas usando a função da alínea E. */

    static void displayArray(char[] v){
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i]);
    }

    public static void main(String[] args){
        Point myPoint = new Point(10, 15);
        System.out.println("getX: " + myPoint.getX());
        System.out.println("islower: " + isLower('y'));
        char[] array = {'a', 'B', 'c', 'D', 'e', 'F', 'g'};
        System.out.println("countLower: " + countLower(array));
        System.out.print("onlyLower: ");
        displayArray(onlyLower(array));

    }
}


