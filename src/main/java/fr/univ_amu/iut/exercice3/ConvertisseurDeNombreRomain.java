package fr.univ_amu.iut.exercice3;

public class ConvertisseurDeNombreRomain {

    public int enChiffreArabe(char i) {
        if (i == 'I') {
            return 1;
        }
        if (i == 'V') {
            return 5;
        }
        if (i == 'X') {
            return 10;
        }
        if (i == 'L') {
            return 50;
        }
        if (i == 'C') {
            return 100;
        }
        if (i == 'D') {
            return 500;
        }
        if (i == 'M') {
            return 1000;
        } else
            return 0;
    }

    public int enNombreArabe(String i) {

        int solution = 0;
        for (int c = 0; c < i.length(); ++c) {
            int d=1;
            if (enChiffreArabe(i.charAt(d)) > enChiffreArabe(i.charAt(c))) {
                solution = enChiffreArabe(i.charAt(d)) - enChiffreArabe(i.charAt(c));
                ++c;
            }
            else
                if (enChiffreArabe(i.charAt(d)) <= enChiffreArabe(i.charAt(c)))
                solution = enChiffreArabe(i.charAt(c)) + solution;
        }
        return solution;
    }
}
