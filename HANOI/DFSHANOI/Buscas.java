package DFSHANOI;
public class Buscas {   
    public static void main(String[] args) {

        No no0 = new No("111");
        No no1 = new No("211");
        No no2 = new No("311");
        No no3 = new No("231");
        No no4 = new No("321");
        No no5 = new No("131");
        No no6 = new No("121");
        No no7 = new No("331");
        No no8 = new No("221");
        No no9 = new No("332");
        No no10 = new No("223");
        No no11 = new No("232");
        No no12 = new No("323");
        No no13 = new No("132");   
        No no14 = new No("123");
        No no15 = new No("122");
        No no16 = new No("133");
        No no17 = new No("222");
        No no18 = new No("333");
        No no19 = new No("322");
        No no20 = new No("233");
        No no21 = new No("312");
        No no22 = new No("213");
        No no23 = new No("212");
        No no24 = new No("313");
        No no25 = new No("133");
        No no26 = new No("112");


        no0.setNoEsquerda(no1);
        no0.setNoDireita(no2);
        no1.setNoEsquerda(no3);
        no2.setNoDireita(no4);
        no3.setNoDireita(no5);
        no4.setNoEsquerda(no6);
        no5.setNoEsquerda(no7);
        no6.setNoDireita(no8);
        no7.setNoEsquerda(no9);
        no8.setNoDireita(no10);
        no9.setNoDireita(no11);
        no10.setNoEsquerda(no12);
        no11.setNoEsquerda(no13);
        no12.setNoDireita(no14);
        no13.setNoEsquerda(no15);
        no14.setNoDireita(no16);
        no15.setNoEsquerda(no17);
        no16.setNoDireita(no18);
        no17.setNoDireita(no19);
        no18.setNoEsquerda(no20);
        no19.setNoDireita(no21);
        no20.setNoEsquerda(no22);
        no21.setNoDireita(no23);
        no22.setNoEsquerda(no24);
        no23.setNoDireita(no26);
        no24.setNoEsquerda(no25);
        no25.setNoDireita(no26);

        
        ;
        DFS bep = new DFS("333");

        bep.buscarResultado(no0);
        bep.exibirTextoResposta();
    }

}
