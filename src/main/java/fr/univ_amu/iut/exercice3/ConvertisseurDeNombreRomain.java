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
            char lettre = i.charAt(c);

            char lettresuiv;

            if (c+1 < i.length())
                lettresuiv = i.charAt(c + 1);

            else
                lettresuiv = '0';

            if (enChiffreArabe(lettresuiv) > enChiffreArabe(lettre)) {
                if (enChiffreArabe(lettre) * 10 < enChiffreArabe(lettresuiv))
                    throw new IllegalArgumentException("That is impossible");
                solution -= enChiffreArabe(lettre);


            } else
                solution += enChiffreArabe(lettre);
        }
        return solution;
    }
}


