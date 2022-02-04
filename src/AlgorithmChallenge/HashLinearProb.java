package AlgorithmChallenge;

public class HashLinearProb {

    public Slot[] hashTable;

    public HashLinearProb(Integer size) {
        this.hashTable = new Slot[size];
    }
    public class Slot {
        String key;
        String value;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    // 데이터 저장
    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
                return true;
            } else {
                Integer currAddress = address + 1;
                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        this.hashTable[currAddress].value = value;
                        return true;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return false;
                        }
                    }
                }
                this.hashTable[currAddress] = new Slot(key, value);
                return true;
            }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }


    // 데이터 출력
    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                return this.hashTable[address].value;
            } else {
                Integer currAddress = address;
                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args){

        HashLinearProb hashChaining = new HashLinearProb(20);

        hashChaining.saveData("BE.O", "counting star");
        hashChaining.saveData("AKMU", "dissonance");
        hashChaining.saveData("NCT128", "Dreams Come True");
        hashChaining.saveData("NCT127", "Favorite");
        hashChaining.saveData("NCTdream", "Boom");


        System.out.println( hashChaining.getData("NCT128" ) ); // Dreams Come True

    }
}

