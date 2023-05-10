package ll.level2.p72412;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
}
//정확성 테스트는 통과했으나 효율성 테스트 실패
class Solution {
    public int[] solution(String[] info, String[] query) {
        List<Applicant> infoList = new ArrayList<>();
        int[] answer = new int[query.length];

        for(String p : info) {
            infoList.add(new Applicant(p));
        }

        for(int i = 0; i < query.length; i++) {
            answer[i] = search(query[i], infoList);
        }

        return answer;
    }

    public int search(String query, List<Applicant> infoList) {
        int count = 0;

        query = query.replace(" and", "");
        String[] q = query.split(" ");

        Stream<Applicant> infoStream = infoList.stream();

        if(!q[0].equals("-")) {
            infoStream = infoStream.filter(e -> e.getLanguage().equals(q[0]));
        }

        if(!q[1].equals("-")) {
            infoStream = infoStream.filter(e -> e.getOccupation().equals(q[1]));
        }

        if(!q[2].equals("-")) {
            infoStream = infoStream.filter(e -> e.getCareer().equals(q[2]));
        }

        if(!q[3].equals("-")) {
            infoStream = infoStream.filter(e -> e.getSoulFood().equals(q[3]));
        }

        infoStream = infoStream.filter(e -> e.getScore() >= Integer.parseInt(q[4]));

        count = (int) infoStream.count();

        return count;
    }
}

class Applicant {
    String language;
    String occupation;
    String career;
    String soulFood;
    int score;

    Applicant(String person) {
        String[] p = person.split(" ");
        this.language = p[0];
        this.occupation = p[1];
        this.career = p[2];
        this.soulFood = p[3];
        this.score = Integer.parseInt(p[4]);
    }

    public String getLanguage() {
        return language;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getCareer() {
        return career;
    }

    public String getSoulFood() {
        return soulFood;
    }

    public int getScore() {
        return score;
    }
}