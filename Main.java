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

    static int lowerInMatrix(char[][] m){
		int count = 0;
        for (int i = 0; i < m.length; i++)
				count += countLower(m[i]);
        return count;
    }

/*E. Defina uma função que dados um carácter e um vetor de caracteres, devolva
quantas vezes o carácter aparece no vector.*/

	static int charInVector(char c, char[] v){
		int count = 0;
        for (int i = 0; i < v.length; i++)
			if (v[i] == c)
				count ++;
        return count;
    }

/*F. Defina uma função que dado um vetor de caracteres, devolva se existe algum
carácter repetido. Faça de duas maneiras diferentes, uma delas usando a função
da alínea E.*/

	static boolean hasRepeat(char[] v){
		for (int i = 0; i < v.length; i++)
			for (int j = i + 1; j < v.length; j++)
				if (v[i] == v[j])
					return true;
		return false;
	}

	static boolean hasRepeat2(char[] v){
		for (int i = 0; i < v.length; i++)
			if (charInVector(v[i], v) != 1){
				return true;
			}
		return false;
	}

/*G. Defina uma função que dada uma letra minúscula, devolva a correspondente
maiúscula. Se a função receber um carácter que não é uma letra minúscula,
deve devolver o carácter recebido.*/

    static char toUpper(char c){
        if (isLower(c))
            c -= 32;
        return c;
    }

/*H. Defina um procedimento que receba um vetor de caracteres e converta
cada letra minúscula nesse vetor na maiúscula correspondente.*/

    static void vectorToUpper(char[] v){
        for (int i = 0; i < v.length; i++)
            v[i] = toUpper(v[i]);
    }

/*I. Defina um procedimento que recebe uma matriz de caracteres e converte
cada letra minúscula dessa matriz na correspondente maiúscula. Faça de duas maneiras
diferentes, uma delas usando o procedimento da alínea H.*/

    static void matrixToUpper(char[][] m){
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = toUpper(m[i][j]);
    }

    static void matrixToUpper2(char[][] m){
        for (int i = 0; i < m.length; i++)
            vectorToUpper(m[i]);
    }

/*J. Defina um procedimento que, dado um vetor de caracteres e dois índices, a e b,
coloque, caso ambas as posições contenham letras minúsculas, as duas letras
existentes por ordem alfabética.*/

    static void swapLowerAt(char[] v, int a, int b){
        if (isLower(v[a]) && isLower(v[b]) && v[b] < v[a]){
            char tmp = v[a];
            v[a] = v[b];
            v[b] = tmp;
        }
    }

/*K. Defina um procedimento que dado um vetor de caracteres coloque na primeira posição
a menor letra minúscula (por ordem alfabética). Faça pelos menos de duas maneiras
diferentes, uma delas usando a função da alínea J.*/

    static void lowerToIndex0(char[] v){
        for (int i = 1; i < v.length; i++)
            swapLowerAt(v, 0, i);
    }

    static void lowerToIndex0_V2(char[] v){
        char minor = 'z' + 1, tmp;
        int idx = v.length;
        for (int i = 0; i < v.length; i++)
            if (isLower(v[i]) && v[i] < minor){
                idx = i;
                minor = v[i];
            }
        if (idx < v.length){
            tmp = v[0];
            v[0] = minor;
            v[idx] = tmp;
        }
    }

/*L. Defina um procedimento que dado um vector de caracteres ordene o seu conteúdo.*/

    static char[] sortArray(char[] v){
        char[] res = new char[v.length];
        for (int i = 0; i < v.length - 1; i++)
            for (int j = i + 1; j < v.length; j++){
                if (v[i] > v[j]){
                    char tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        res = v;
        return res;
    }

/*auxiliary*/

    static void displayArray(char[] v){
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i]);
        System.out.println();
    }

    static void displayMatrix(char[][] m){
        for (int i = 0; i < m.length; i++)
            displayArray(m[i]);
    }

    public static void main(String[] args){
        Point myPoint = new Point(10, 15);
        System.out.println("getX: " + myPoint.getX());
        System.out.println("islower: " + isLower('y'));
        char[] array = {'x', 'B', 'z', 'D', 'e', 'b', 'F', 'g', 'b', 'Y', 'w'};
        System.out.println("countLower: " + countLower(array));
        System.out.print("onlyLower: ");
        displayArray(onlyLower(array));
        char[][] matrix = {{'X', 'B', 'c', 'a'},
			   			   {'D', 'e', 'X'},
						   {'F', 's', 'g', 'R', 'v',}};
        System.out.println("\nlowerInMatrix: " + lowerInMatrix(matrix));
        System.out.println("charInVector: " + charInVector('c', array));
        System.out.println("hasRepeat: " + hasRepeat(array));
        System.out.println("hasRepeat2: " + hasRepeat2(array));
        System.out.println("toUpper: " + toUpper('a') + toUpper('%')
        + toUpper('C') + toUpper('w') +toUpper('!'));
//        System.out.print("vecToUpper: ");
//        vectorToUpper(array);
//        displayArray(array);
        System.out.println("matrixToUpper: ");
        matrixToUpper(matrix);
        displayMatrix(matrix);
//        System.out.println("swapLowerAt: ");
//        displayArray(array);
//        swapLowerAt(array, 2, 8);
        displayArray(array);
        System.out.println("lowerToIndex0: ");
//        lowerToIndex0(array);
        lowerToIndex0_V2(array);
        displayArray(array);
        System.out.println("sortArray: ");
        displayArray(sortArray(array));


    }
}


