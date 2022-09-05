public class Main
{
    public static void main(String[] args) {
        // Testes
        /* System.out.println("Negativo -21 :" + OperacoesRecursivas.ehNegativo(-21));
        System.out.println("Positivo 21 :" + OperacoesRecursivas.ehNegativo(21)+ "\n");

        System.out.println("10 é diferente de 10: "+ OperacoesRecursivas.saoDiferentes(10,10));
        System.out.println("10 é diferende de 20: "+ OperacoesRecursivas.saoDiferentes(10,20)+ "\n");

        System.out.println("10 < -10: " + OperacoesRecursivas.menor(10, -10));
        System.out.println("-10 < 10: " + OperacoesRecursivas.menor(-10, 10));
        System.out.println("20 < 20: " + OperacoesRecursivas.menor(20, 20));
        System.out.println("-20 < -5: " + OperacoesRecursivas.menor(-20, -5)+ "\n");

        System.out.println("10 < 10: " + OperacoesRecursivas.menor(10,10));
        System.out.println("-10 < -10: " + OperacoesRecursivas.menor(-10,-10)+ "\n");

        System.out.println("10 <= -10: " + OperacoesRecursivas.menorIgual(10, -10));
        System.out.println("-10 <= 10: " + OperacoesRecursivas.menorIgual(-10, 10));
        System.out.println("10 <= 10: " + OperacoesRecursivas.menorIgual(10,10));
        System.out.println("-10 <= -10: " + OperacoesRecursivas.menorIgual(-10,-10)+ "\n");

        System.out.println("10 > -10: " + OperacoesRecursivas.maior(10, -10));
        System.out.println("-10 > 10: " + OperacoesRecursivas.maior(-10, 10));

        System.out.println("10 > 10: " + OperacoesRecursivas.maior(10,10));
        System.out.println("-10 > -10: " + OperacoesRecursivas.maior(-10,-10)+ "\n");

        System.out.println("10 >= -10: " + OperacoesRecursivas.maiorIgual(10, -10));
        System.out.println("-10 >= 10: " + OperacoesRecursivas.maiorIgual(-10, 10));

        System.out.println("10 >= 10: " + OperacoesRecursivas.maiorIgual(10,10));
        System.out.println("-10 >= -10: " + OperacoesRecursivas.maiorIgual(-10,-10)+ "\n");
        System.out.println("Soma: 20 + 10 = " + OperacoesRecursivas.soma(20, 10));
        System.out.println("Soma: 10 + 20 = " + OperacoesRecursivas.soma(10, 20));
        System.out.println("Soma: 10 + 10 = " + OperacoesRecursivas.soma(10, 10));
        System.out.println("Soma: 0 + 0 = " + OperacoesRecursivas.soma(0, 0));

        System.out.println("Soma: 10 + (-20) = " + OperacoesRecursivas.soma(10, -20));
        System.out.println("Soma: (-20) + 10 = " + OperacoesRecursivas.soma(-20, 10));
        System.out.println("Soma: (-20) + (-20) = " + OperacoesRecursivas.soma(-20, -20) + "\n");

        System.out.println("Subt: 20 - 10 = " + OperacoesRecursivas.subtracao(20, 10));
        System.out.println("Subt: 10 - 20 = " + OperacoesRecursivas.subtracao(10, 20));
        System.out.println("Subt: 10 - 10 = " + OperacoesRecursivas. subtracao(10, 10));
        System.out.println("Subt: 0 - 0 = " + OperacoesRecursivas.subtracao(0, 0));

        System.out.println("Subt: 10 - (-20) = " + OperacoesRecursivas.subtracao(10, -20));
        System.out.println("Subt: (-20) - 10 = " + OperacoesRecursivas.subtracao(-20, 10));
        System.out.println("Subt: (-20) - (-20) = " + OperacoesRecursivas.subtracao(-20, -20) + "\n");

        System.out.println("Modulo de | 2 | = " + OperacoesRecursivas.modulo(2));
        System.out.println("Modulo de | 25 | = " + OperacoesRecursivas.modulo(25));
        System.out.println("Modulo de | -2 | = " + OperacoesRecursivas.modulo(-2));
        System.out.println("Modulo de | -30 | = " + OperacoesRecursivas.modulo(-30));
        System.out.println("Modulo de | 0 | = " + OperacoesRecursivas.modulo(0)+ "\n");

        System.out.println("Multiplicação: 20 * 0 = " + OperacoesRecursivas.multiplica(20,0));
        System.out.println("Multiplicação: 20 * 2 = " + OperacoesRecursivas.multiplica(20,2));
        System.out.println("Multiplicação: 10 * 200 = " + OperacoesRecursivas.multiplica(10,200));

        System.out.println("Multiplicação: -300 * 5 = " + OperacoesRecursivas.multiplica(-300,5));
        System.out.println("Multiplicação: 300 * -5 = " + OperacoesRecursivas.multiplica(300,-5));

        System.out.println("Multiplicação: -2 * -200 = " + OperacoesRecursivas.multiplica(-2,-200));
        System.out.println("Multiplicação: -200 * -2 = " + OperacoesRecursivas.multiplica(-200,-2)+ "\n");

        System.out.println("DivisãoInteira: 0/2= " + OperacoesRecursivas.divisaoInteira(0,2));
        System.out.println("DivisãoInteira: 10/2= " + OperacoesRecursivas.divisaoInteira(10,2));

        System.out.println("DivisãoInteira: 20/10= " + OperacoesRecursivas.divisaoInteira(20,10));

        System.out.println("DivisãoInteira: 10/-2= " + OperacoesRecursivas.divisaoInteira(10,-2));
        System.out.println("DivisãoInteira: -10/2= " + OperacoesRecursivas.divisaoInteira(-10,2));
        System.out.println("DivisãoInteira: -10/-2= " + OperacoesRecursivas.divisaoInteira(-10,-2)+ "\n");


        System.out.println("RestoDivisão: 26/5= " + OperacoesRecursivas.restoDivisao(26,5));
        System.out.println("RestoDivisão: 0/2= " + OperacoesRecursivas.restoDivisao(0,2));
        System.out.println("RestoDivisão: 10/2= " + OperacoesRecursivas.restoDivisao(10,2)+ "\n");

        System.out.println("RestoDivisão: 243/5= " + OperacoesRecursivas.restoDivisao(243,5));
        System.out.println("RestoDivisão: 243/-5= " + OperacoesRecursivas.restoDivisao(243,-5));
        System.out.println("RestoDivisão: -243/5= " + OperacoesRecursivas.restoDivisao(-243,5));
        System.out.println("RestoDivisão: -243/-5= " + OperacoesRecursivas.restoDivisao(-243,-5)+ "\n");
        */
    }
}