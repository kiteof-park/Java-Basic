package javajungsuk.ch09;

class Value{
    int value;

    Value(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
      if(obj instanceof Value){
          Value v = (Value)obj;
          return this.value == v.value;
      }
      else{
          return false;
      }
    }

//    // 또는
//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Valus)) return false;
//        Value v = (Value)obj;
//        return this.value == v.value;
//    }
}

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}
