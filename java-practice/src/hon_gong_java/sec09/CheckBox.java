package hon_gong_java.sec09;

public class CheckBox {
    // 인터페이스 타입 필드
    OnSelectListener listener;
    
    void setListener(OnSelectListener listener){
        this.listener = listener;
    }

    void select(){
        listener.onSelect();
    }

    static interface  OnSelectListener{
        void onSelect();
    }

}
