public class OperacoesRecursivas
{
    /* Para a realização destes exercícios, fica proibido:
    (a) declarar variáveis,
    (b) fazer uso de operadores aritméticos (+, -, *, / e %),
    (c) fazer uso dos operadores relacionais (!=, <, <=, > e >=),
    (d) fazer uso de operadores lógicos (!, && e ||),
    (e) fazer uso dos comandos de seleção (if com else e switch),
    (f) fazer uso de comandos repetitivos (while, do-while e for),
    (g) fazer uso de qualquer função de biblioteca.
    Importante lembrar que os números com os quais vocês trabalharão são inteiros, logo,
    podem ser positivos ou negativos.
    Dica: use ==, ++, --, if sem else, return, recursão e as funções feitas a partir dos exercícios
    de número de ordem anterior. */
    /* Faça uma função de nome saoDiferentes que, recebendo como parâmetro dois números
    inteiros, resulta true, caso o primeiro deles seja diferente do segundo, ou false, caso
    contrário. Esta função não será recursiva, porém pode ser útil para os exercícios abaixo.*/
    public static boolean saoDiferentes(int A, int B){
        return A != B;
    } // Finalizado

    /* Faça uma função de nome ehNegativo que, recebendo como parâmetro um único número
    inteiro, resulta true, caso o mesmo seja negativo, ou false, caso contrário.*/
    public static boolean ehNegativo(int N){ // Finalizado
        if (N == 0) return false;

        return neg(N,N);
    }

    private static boolean neg(int A, int B){ // Finalizado
        if (A == 0) return true;
        if (B == 0) return false;

        return neg(++A, --B);
    }

    /* Faça uma função de nome menor que, recebendo como parâmetro dois números inteiros,
    resulta true, caso o primeiro deles seja menor que o segundo, ou false, caso contrário.*/
    public static boolean menor(int A, int B){ // Finalizado
        if (A == B) return false;

        if(ehNegativo(A)){
            if(ehNegativo(B))
                return menorNegativo(++A,++B);

            return true;
        }

        if (ehNegativo(B))
            return false;

        return menorPositivo(--A,--B);
    }

    private static boolean menorPositivo(int A, int B){ // Finalizado
        if (A == 0) return true;
        if (B == 0) return false;

        return menorPositivo(--A,--B);
    }

    private static boolean menorNegativo(int A, int B){ // Finalizado
        if (A == 0) return false;
        if (B == 0) return true;

        return menorNegativo(++A,++B);
    }

    /* Faça uma função de nome menorIgual que, recebendo como parâmetro dois números
    inteiros, resulta true, caso o primeiro deles seja menor ou igual o segundo, ou false, caso
    contrário.*/
    public static boolean menorIgual(int A, int B){ // Finalizado
        if (A == B) return true;

        return menor(A,B);
    }

    /* Faça uma função de nome maior que, recebendo como parâmetro dois números inteiros,
    resulta true, caso o primeiro deles seja maior que o segundo, ou false, caso contrário.*/
    public static boolean maior(int A, int B){ // Finalizado
        if (A == B) return false;

        if(ehNegativo(A)){
            if(ehNegativo(B))
                return !menor(A, B);

            return false;
        }

        if (ehNegativo(B))
            return true;

        return !menor(A, B);
    }

    /* Faça uma função de nome maiorIgual que, recebendo como parâmetro dois números
    inteiros, resulta true, caso o primeiro deles seja maior ou igual o segundo, ou false, caso
    contrário.*/
    public static boolean maiorIgual(int A, int B) { // Finalizado
        if (A == B) return true;

        return maior(A,B);
    }

    /* Faça uma função de nome soma que, recebendo como parâmetro dois números inteiros,
    resulta a soma deles.*/
    public static int soma(int A, int B){ // Finalizado
        if (B == 0) return A;

        if (ehNegativo(B))
            return soma(--A, ++B);

        return soma(++A, --B);
    }

    /* Faça uma função de nome subtracao que, recebendo como parâmetro dois números
    inteiros, resulta a subtração deles (o primeiro menos o segundo).*/
    public static int subtracao(int A, int B){ // Finalizado
        if (B == 0) return A;

        if (ehNegativo(B)) return subtracao(++A, ++B);

        return subtracao(--A, --B);
    }

    /* Faça uma função de nome modulo que, recebendo como parâmetro um único número
    inteiro, resulta o módulo (valor absoluto) do mesmo.*/
    public static int modulo(int A){
        return mod(A, 0);
    } // Finalizado

    private static int mod(int A, int cont){ // Finalizado
        if (ehNegativo(A))
            return mod(++A, ++cont);

        if (cont == 0)
            return A;

        return cont;
    }

    /* Faça uma função de nome multiplica que, recebendo como parâmetro dois números
    inteiros, resulta a multiplicação deles.*/
    public static int multiplica(int A, int B){ // Finalizado
        if(A == 0) return A;
        if(B == 0) return B;
        if(ehNegativo(B)){
            if (ehNegativo(A)) return multi(modulo(A),modulo(B));
            return multi(B, A);
        }
        return multi(A,B);
    }

    private static int multi(int A, int B){ // Finalizado
        if(B == 1) return A;
        return soma(A, multi(A,--B));
    }
    /* Faça uma função de nome divisaoInteira que, recebendo como parâmetro dois números
    inteiros, resulta a divisão inteira deles (o primeiro dividido pelo segundo).*/
    public static int divisaoInteira(int A, int B){  // Finalizado
        return divi(A,B, 0);
    }

    private static int divi(int A, int B,int C){  // Finalizado
        if(A == 0) return C;
        if(ehNegativo(B)){
            if (ehNegativo(A)) return divi(modulo(A),modulo(B),0);
            if(menor(A,B)) return 0;

            return divi(soma(A,B),B, --C);
        }

        if (ehNegativo(A))
            return divi(soma(A,B),B, --C);

        return divi(subtracao(A,B),B, ++C);
    }

    /* Faça uma função de nome restoDivisao que, recebendo como parâmetro dois números
    inteiros, resulta o resto da divisão inteira deles (o resto da divisão inteira do primeiro deles
    pelo segundo).*/
    public static int restoDivisao(int A, int B){
        if (A == B) return 0;
        if (A == 0) return 0;

        if (ehNegativo(A)){
            if (ehNegativo(B))
                return restDiv(modulo(A),modulo(B), modulo(A));

            return restDivNegativoA(A,B);
        }

        if(ehNegativo(B))
            return restDivNegativoB(A,B);

        return restDiv(A,B,A);
    }

    private static int restDiv(int A, int B, int soma) {
        if(A == 0) return 0;

        if (menor(A,B))
            return A;

        return restDiv(subtracao(A,B),B, 0);
    }

    private static int restDivNegativoA(int A, int B) {
        if(A == 0) return 0; // Um comentario qualquer

        if (ehNegativo(A))
            return restDivNegativoA(soma(B,A),B);

        return subtracao(A, B);
    }

    private static int restDivNegativoB(int A, int B) {
        if(A == 0) return 0; // Um comentario qualquer

        if (ehNegativo(A))
            return subtracao(B,A);

        return restDivNegativoB(soma(B, A), B);
    }
}