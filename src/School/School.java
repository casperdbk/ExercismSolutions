package School;

import java.util.*;

public class School {
    private Map<Integer, List<String>> grades = new HashMap<>();

    public void add(String name, int grade) {
        grades.putIfAbsent(grade, new ArrayList<>());
        List<String> names = grades.get(grade);
        names.add(name);
        Collections.sort(names);
        grades.put(grade, names);
    }
    public List<String> grade(int grade) {
        List<String> names = new ArrayList<>();
        if (grades.get(grade) == null) {
            return names;
        }
        names.addAll(grades.get(grade));
        return names;
    }
    public List<String> roster() {
        List<String> names = new ArrayList<>();
        for (Integer val : grades.keySet()) {
            names.addAll(grades.get(val));
        }
        return names;
    }
}