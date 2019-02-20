package nihon.newtype.com.nihon;

public class Hiragana {
    private String[] hiragana;
    private String[] romaji;
    private String tempNum;


    public Hiragana() {

        makeHiragana();
        makeRomaji();
    }

    private void makeHiragana(){
        hiragana = new String[72];
        hiragana[0] = "あ";
        hiragana[1] = "い";
        hiragana[2] = "う";
        hiragana[3] = "え";
        hiragana[4] = "お";

        hiragana[5] = "か";
        hiragana[6] = "き";
        hiragana[7] = "く";
        hiragana[8] = "け";
        hiragana[9] = "こ";

        hiragana[10] = "さ";
        hiragana[11] = "し";
        hiragana[12] = "す";
        hiragana[13] = "せ";
        hiragana[14] = "そ";

        hiragana[15] = "た";
        hiragana[16] = "ち";
        hiragana[17] = "つ";
        hiragana[18] = "て";
        hiragana[19] = "と";

        hiragana[20] = "な";
        hiragana[21] = "に";
        hiragana[22] = "ぬ";
        hiragana[23] = "ね";
        hiragana[24] = "の";

        hiragana[25] = "は";
        hiragana[26] = "ひ";
        hiragana[27] = "ふ";
        hiragana[28] = "へ";
        hiragana[29] = "ほ";

        hiragana[30] = "ま";
        hiragana[31] = "み";
        hiragana[32] = "む";
        hiragana[33] = "め";
        hiragana[34] = "も";

        hiragana[35] = "や";
        hiragana[36] = "ゆ";
        hiragana[37] = "よ";

        hiragana[38] = "ら";
        hiragana[39] = "り";
        hiragana[40] = "る";
        hiragana[41] = "れ";
        hiragana[42] = "ろ";

        hiragana[43] = "わ";
        hiragana[44] = "を";

        hiragana[45] = "ん";

        hiragana[46] = "が";
        hiragana[47] = "ぎ";
        hiragana[48] = "ぐ";
        hiragana[49] = "げ";
        hiragana[50] = "ご";

        hiragana[51] = "ざ";
        hiragana[52] = "じ";
        hiragana[53] = "ず";
        hiragana[54] = "ぜ";
        hiragana[55] = "ぞ";

        hiragana[56] = "だ";
        hiragana[57] = "ぢ";
        hiragana[58] = "づ";
        hiragana[59] = "で";
        hiragana[60] = "ど";

        hiragana[61] = "ば";
        hiragana[62] = "び";
        hiragana[63] = "ぶ";
        hiragana[64] = "べ";
        hiragana[65] = "ぼ";

        hiragana[66] = "ぱ";
        hiragana[67] = "ぴ";
        hiragana[68] = "ぷ";
        hiragana[69] = "ぺ";
        hiragana[70] = "ぽ";

        hiragana[71] = "-";
    }

    private void makeRomaji(){


        romaji = new String[72];
        romaji[0] = "a";
        romaji[1] = "i";
        romaji[2] = "u";
        romaji[3] = "e";
        romaji[4] = "o";

        romaji[5] = "ka";
        romaji[6] = "ki";
        romaji[7] = "ku";
        romaji[8] = "ke";
        romaji[9] = "ko";

        romaji[10] = "sa";
        romaji[11] = "si";
        romaji[12] = "su";
        romaji[13] = "se";
        romaji[14] = "so";

        romaji[15] = "ta";
        romaji[16] = "ti";
        romaji[17] = "tu";
        romaji[18] = "te";
        romaji[19] = "to";

        romaji[20] = "na";
        romaji[21] = "ni";
        romaji[22] = "nu";
        romaji[23] = "ne";
        romaji[24] = "no";

        romaji[25] = "ha";
        romaji[26] = "hi";
        romaji[27] = "hu";
        romaji[28] = "he";
        romaji[29] = "ho";

        romaji[30] = "ma";
        romaji[31] = "mi";
        romaji[32] = "mu";
        romaji[33] = "me";
        romaji[34] = "mo";

        romaji[35] = "ya";
        romaji[36] = "yu";
        romaji[37] = "yo";

        romaji[38] = "ra";
        romaji[39] = "ri";
        romaji[40] = "ru";
        romaji[41] = "re";
        romaji[42] = "ro";

        romaji[43] = "wa";
        romaji[44] = "wo";

        romaji[45] = "n";

        romaji[46] = "ga";
        romaji[47] = "gi";
        romaji[48] = "gu";
        romaji[49] = "ge";
        romaji[50] = "go";

        romaji[51] = "za";
        romaji[52] = "zi";
        romaji[53] = "zu";
        romaji[54] = "ze";
        romaji[55] = "zo";

        romaji[56] = "da";
        romaji[57] = "di";
        romaji[58] = "du";
        romaji[59] = "de";
        romaji[60] = "do";

        romaji[61] = "ba";
        romaji[62] = "bi";
        romaji[63] = "bu";
        romaji[64] = "be";
        romaji[65] = "bo";

        romaji[66] = "pa";
        romaji[67] = "pi";
        romaji[68] = "pu";
        romaji[69] = "pe";
        romaji[70] = "po";

        romaji[71] = "-";

    }
    private int findCode(String s){

        for(int i=0;i<71;i++){
            if(hiragana[i].equals(s)){
                return i;
            }

        }
        return 0;
    }

    public String getCode(String s){

        String result="";

        for(int i=0; i<s.length();i++){

            result += findCode(s.charAt(i)+"")+",";

        }

        return result;
    }

    private int romaToNum(String s){

        for(int i=0;i<71;i++){
            if(romaji[i].equals(s)){
                return i;
            }

        }
        return 0;
    }

    public String romaToJp(String s){

        tempNum ="";
        String[] temp = s.split(",");
        String result="";
        int index=0;

        for(int i=0; i<temp.length;i++){

            index = romaToNum(temp[i]);
            tempNum += index+",";
            result += hiragana[index];

        }

        return result;


    }
    public String getNumber(){
        return tempNum;
    }

}
