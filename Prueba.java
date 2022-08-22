public class Prueba {
    public static int distanciaEdicion(String s1, String s2, int cont) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.length() == 0 || s2.length() == 0)
              return cont + s1.length() + s2.length();
            if (s1.charAt(i) == s2.charAt(i)) {
              return edit(s1.substring(i, s2.substring(i)));
            }
            // tres posibles escenarios
            int sus = edit(s1.substring(i), s2.substring(i), cont+1);
            int ins = edit(s1.substring(i), s2, cont+1);
            int bor = edit(s1, s2.substring(i), cont+1);
            return min(sus, ins, bor);
        }
    }

    public static void main(String[] args) {

    }
}
