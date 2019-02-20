package nihon.newtype.com.nihon;

public class Word {

    private String ko;
    private String jp;
    private String num;


    public Word(String ko,String jp,String num) {
        this.ko = ko;
        this.jp = jp;
        this.num = num;
    }

    public String getKo() {
        return ko;
    }

    public String getJp() {
        return jp;
    }

    public String getNum() {
        return num;
    }


}
