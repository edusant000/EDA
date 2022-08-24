public class Prueba {
    public static int edit(String s1, String s2, int cont) {
        if(s1.length()==0||s2.length()==0)
            return cont+s1.length()+s2.length();
        if(s1.charAt(0)==s2.charAt(0))
            return edit(s1.substring(1), s2.substring(1), cont);
        int sus=edit(s1.substring(1), s2.substring(1), cont+1);
        int ins=edit(s1.substring(1), s2, cont+1);
        int bor=edit(s1, s2.substring(1), cont+1);
        int aux=Math.min(sus, ins);
        return Math.min(aux, bor);
    }

    public static void main(String[] args) {

        String s1 = "xxxxxxx";
        String s2 = "Fernando";
        int cont = 0;
        System.out.println(Prueba.edit(s1, s2, cont));

    }
}
