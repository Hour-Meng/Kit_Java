
import org.apache.commons.lang3.StringUtils;

public class CommonLang3 {
    public static void main(String[] args) {
        
        String str = "maybe I don't wanna know the truth, I ignore it when they told me all the shit you do. I always get my heart broke like I needed a practice, foot on my throat till my world is collapsing, distance I chose is the law of attraction yeah";

        String capStr = StringUtils.lowerCase(str);

        System.out.println("\n"+capStr);

        System.out.printf("\n\n%s\n", StringUtils.upperCase(str));

        
    }    
}
