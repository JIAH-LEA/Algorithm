package AlgorithmChallenge;

public class HashTableEx1 {

    public Slot[] hashTable; // 주소값 저장을 위한 공간

    //생성자로 미리 배열의 크기 할당
    public HashTableEx1(Integer size){
        this.hashTable = new Slot[size];
    }

    // 해당 Value를 저장하는 공간
    public class Slot {

        String value;

        Slot(String value){
            this.value = value;
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

        if(this.hashTable[address] != null)
            this.hashTable[address].value = value;

        else
            this.hashTable[address] = new Slot(value); // 슬롯 객체를 만들어 넣기

        return true;

    }

    // 데이터 출력
    public String getData(String key){

        Integer address = hashFunc(key);

        if( this.hashTable[address] != null)
            return this.hashTable[address].value;
        else
            return null;

    }

    public static void main(String[] args){
        
        HashTableEx1 myHash = new HashTableEx1(20);

        myHash.saveData("BE.O", "counting star");
        myHash.saveData("AKMU", "dissonance");
        myHash.saveData("NCT127", "Favorite");

        System.out.println( myHash.getData("NCT127" ) );

    }


}
