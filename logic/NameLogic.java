package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NameLogic {

    private String[] syllablesFirst;
    private ArrayList<String> syllables;
    private ArrayList<String> names;
    private Random random;

    public NameLogic() {

        this.syllablesFirst = new String[]{"a", "ack", "ae", "ah", "ai", "al", "ala", "alo", "am", "an", "ar", "ara", "ari", "as",
            "ase", "au", "ba", "be", "bea", "ber", "bi", "bia", "bie", "bio", "bis", "bo", "cae", "ce", "cea", "cer", "cha", "che", "chi", "cho", "ci", "cia",
            "cie", "cil", "cin", "cio", "con", "cos", "cre", "cri", "cro", "cse", "csi", "cso", "da", "dai", "dar", "de", "dea",
            "di", "do", "do", "dor", "dra", "dre", "du", "e", "eck", "eh", "ei", "el", "ela", "elo", "em", "ema", "en", "en", "ena",
            "ene", "er", "era", "ero", "es", "ese", "fi", "fia", "fio", "fir", "fre", "ga", "gae", "gar", "gi", "go", "gon", "gu",
            "ha", "he", "hen", "her", "hes", "hev", "hex", "hi", "hia", "hie", "hin", "his", "hil", "hir", "him", "hya", "i", "ia", "ian", "ica", "ice", "ich", "ico", "ide", "ien", "ine",
            "ini", "ino", "ion", "ise", "iya", "jo", "joe", "ju", "jue", "jul", "jun", "kar", "ke", "kea", "kel", "ken", "ker", "khi", "ki", "kia", "kie", "kio", "kil", "kir",
            "kis", "ko", "ku", "la", "lau", "le", "ler", "li", "lia", "lie", "lin", "lio", "lo", "lu", "lum", "lya", "ma", "mae",
            "mai", "mar", "me", "mea", "mio", "mir", "mis", "mo", "mu", "mya", "na", "nae", "ne", "nea", "nel", "nen", "ner", "nfi",
            "nie", "nis", "nis", "no", "nox", "nu", "num", "ny", "nya", "o", "oe", "oi", "on", "ox", "pa", "pe", "pi", "pia", "pin",
            "pir", "phe", "phi", "pho", "po", "psi", "pu", "pya", "pyr", "ra", "re", "rea", "rei", "rho", "ri", "ria", "ro", "ron", "sa", "san", "se", "sea",
            "sei", "sel", "ser", "ses", "sfi", "sha", "shi", "si", "sia", "sin", "sis", "so", "sos", "spi", "sta", "ste", "sto", "su", "sua", "sul", "sun", "sum",
            "sya", "ta", "tai", "tal", "tan", "tao", "tar", "te", "tea", "tel", "ten", "thi", "tic", "tie", "tio", "tir", "ton", "tua", "tur", "tus", "tyr",
            "tys", "u", "uch", "us", "vai", "var", "ve", "ven", "vi", "vie", "vin", "vir", "voi", "vra", "vre", "xa", "xe", "xel",
            "xer", "xia", "xie", "xon", "ya", "yan", "yal", "yar", "yas", "ye", "yei", "yel", "yen", "yeo", "yes", "yev", "yn", "yna", "yne", "yno", "yni", "yra", "yre", "yro", "yru", "yu", "yua", "yue", "yul", "yun", "yur", "yus", "yz", "za", "zae", "zai", "zan", "zao", "zar", "zau", "ze", "zel", "zen", "zoe", "zon"};
        
        this.syllables = new ArrayList<>();
        syllables.addAll(Arrays.asList(syllablesFirst));
        this.names = new ArrayList<>();
        this.random = new Random();
    }

    public ArrayList<String> createNames() {

        this.names.clear();

        for (int x = 0;
                x < 5; x++) {
            int i = random.nextInt(2) + 2;
            String name = "";
            for (int y = 1; y <= i; y++) {
                name += syllables.get(random.nextInt(syllables.size()));
            }
            this.names.add(name);
        }

        return this.names;

    }
}
