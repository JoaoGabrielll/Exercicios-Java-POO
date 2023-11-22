import java.security.SecureRandom;

public class GeradorDeCodigos {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static String geradorDeCodigoAlfanumerico(int length){
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++){
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}
