public class Strings {
    public static void main(String[] args){
        String str = "Day, is, empty, url, applicaton";
        String str1 = "Day ";
        String str2 = "is ";
        String str3 = "fine.";

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str1+str2+str3);

        StringBuilder st = new StringBuilder();
        st.append("My ");
        st.append("name ");
        st.append("is day");
        System.out.println(st.toString());

        System.out.printf("Number: %-10d, String: %7s", 1000, "Upper");
    }
}
