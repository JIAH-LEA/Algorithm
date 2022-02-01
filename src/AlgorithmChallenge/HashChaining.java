package AlgorithmChallenge;

public class HashChaining {

    public Slot[] hashTable2;

    public HashChaining(Integer size) {
        this.hashTable2 = new Slot[size];
    }
    public class Slot {

        String key;
        String value;
        Slot next;

        Slot(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // 해쉬 함수 : 데이터 저장 공간을 찾는 함수
    public int hashFunc(String key){

        // division 기법 사용해서 슬롯 개수 정하기
        return (int)(key.charAt(0) % 20);
    }

    // 데이터 저장
    public boolean saveData(String key, String value){

        Integer address = this.hashFunc(key);

        // 만약 해당 주소에 이미 데이터가 존재한다면,
        if(this.hashTable2[address] != null) {

            Slot findSlot = this.hashTable2[address];
            Slot prevSlot = this.hashTable2[address];

            while(findSlot != null){
                if(findSlot.key.equals(key)){
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        }else {
            this.hashTable2[address] = new Slot(key, value); // 슬롯 객체를 만들어 넣기
        }
        return true;
    }

    // 데이터 출력
    public String getData(String key){

        Integer address = hashFunc(key);
        // 해당 주소에 슬롯이 생성되어 있다면,
        if( this.hashTable2[address] != null ){
            Slot findSlot = this.hashTable2[address];

            while( findSlot != null ){
                if(findSlot.key == key)
                    return findSlot.value;
                else{
                    findSlot = findSlot.next;
                }
            }
            return null;

        }
        else {
            return null;
        }
    }

    public static void main(String[] args){

        HashChaining hashChaining = new HashChaining(20);

        hashChaining.saveData("BE.O", "counting star");
        hashChaining.saveData("AKMU", "dissonance");
        hashChaining.saveData("NCT127", "Favorite");
        hashChaining.saveData("NCTdream", "Boom");
        hashChaining.saveData("NCT127", "Dreams Come True");

        System.out.println( hashChaining.getData("NCTdream" ) ); // Boom

    }
}
