package week6;

abstract class PairMap {
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap {
    private int length;
    public Dictionary(int size) {
        keyArray = new String[size];
        valueArray = new String[size];
        this.length = 0;
    }
    @Override
    public String get(String key) {
        for(int i=0; i<length; i++) {
            if(keyArray[i].equals(key)) return valueArray[i];
        }
        return null;
    }
    @Override
    public void put(String key, String value) {
        for(int i=0; i<length; i++) {
            if(keyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
            }
        }
        // 기존의 배열 크기를 넘어가는 경우
        if(length == keyArray.length) {
            String[] newKeyArray = new String[length*2];
            String[] newValueArray = new String[length*2];
            for(int i=0; i<length; i++) {
                newKeyArray[i] = keyArray[i];
                newValueArray[i] = valueArray[i];
            }
            keyArray = newKeyArray;
            valueArray = newValueArray;
        }
        keyArray[length] = key;
        valueArray[length] = value;
        length++;
    }
    @Override
    public String delete(String key) {
        String del_value;
        for(int i=0; i<length; i++) {
            if(keyArray[i].equals(key)) {
                del_value = valueArray[i];
                for(int j=i+1; j<length; j++) {
                    keyArray[j-1] = keyArray[j];
                    valueArray[j-1] = valueArray[j];
                }
                return del_value;
            }
        }
        return null;
    }
    @Override
    public int length() {
        return length;
    }
}

public class practice10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
