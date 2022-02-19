package CodingTestSKP;

import java.util.*;

public class Hobbies {

        private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

        public void add(String hobbyist, String... hobbies) {
            this.hobbies.put(hobbyist, hobbies);
        }

        public List<String> findAllHobbyists(String hobby) {

            List<String> findName = new ArrayList<String>();
            for( String key : this.hobbies.keySet() ) {
                for (String[] values : this.hobbies.values()) {
                    if (this.hobbies.values().equals(hobby)) {
                        System.out.println(String.format("키 -> %s, 값 -> %s", key, this.hobbies.get(key)));
                        findName.add(key);
                    }
                }
            }

            return findName;
        }

        public static void main(String[] args) {
            Hobbies hobbies = new Hobbies();
            hobbies.add("Steve", "Fashion", "Piano", "Reading");
            hobbies.add("Patty", "Drama", "Magic", "Pets");
            hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

            System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
        }
    }

