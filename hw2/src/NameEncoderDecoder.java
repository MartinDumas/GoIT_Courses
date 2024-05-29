public class NameEncoderDecoder {

    public String encode(String name) {
        String encodedName = name.toLowerCase()
                .replace('e', '1')
                .replace('u', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('a', '5');

        return "NOTFORYOU" + encodedName + "YESNOTFORYOU";
    }

    public String decode(String name) {
        String decodedName = name.substring(9, name.length() - 12)
                .replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a');

        return decodedName;
    }
}