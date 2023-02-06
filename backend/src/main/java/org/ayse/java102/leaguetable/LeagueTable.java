package org.ayse.java102.leaguetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Java ile girilen takımlar için rastgele maç fikstürü oluşturan bir sınıf yazılmalı.
 * Çift Devreli Lig usülü uygulanacaktır. Her takım diğer takımlarla kendi evinde ve deplasmanda olmak üzere iki maç yapacaktır.
 * Listenin sol tarafı ev sahibini sağ tarafı deplasman takımını gösterir.
 * Eğer tek sayıda takım listesi girilirse, çift sayıya tamamlanacak şekilde "Bay" adında bir takım daha eklenmeli.
 * Bay ile eşleşen takımlar o hafta maç yapmayacağı anlamına gelir.
 *
 * @author aysedemireldeniz
 */
public class LeagueTable {
    private final Scanner scanner;
    private final List<String> teams;
    private final List<String> leagueTable;

    public LeagueTable() {
        scanner = new Scanner(System.in);
        teams = new ArrayList<>();
        leagueTable = new ArrayList<>();
        // selectTeam();
        setDefaultTeam();
        printTeam();
        createLeague();
        printLeague();
    }

    public static void main(String[] args) {
        new LeagueTable();
    }

    private void selectTeam() {
        int teamCount = scanner.nextInt();
        System.out.println("Enter teams: ");
        for (int i = 0; i < teamCount; i++) {
            teams.add(scanner.next());
        }
        if (teamCount % 2 != 0) {
            teams.add("Bay");
        }
    }

    private void setDefaultTeam() {
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        teams.add("Ispartaspor");
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
    }

    private void createLeague() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = 0; j < teams.size(); j++) {
                if (!teams.get(i).equals(teams.get(j))) {
                    leagueTable.add(teams.get(i) + "-" + teams.get(j));
                }
            }
        }
        Collections.shuffle(leagueTable);
    }

    private void printLeague() {
        int oneLeague = teams.size() / 2;
        int week = 1;
        for (int i = 0; i < leagueTable.size(); i++) {
            if (i % oneLeague == 0) {
                System.out.println("Week " + week + ":");
                week++;
            }
            System.out.println(leagueTable.get(i));
        }
    }

    private void printTeam() {
        teams.forEach(i -> System.out.println(i));
    }
}
