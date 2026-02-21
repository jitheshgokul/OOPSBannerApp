public class OOPSBannerApp{
    public static String[] getOPattern(){
        return new String[]{
            "  ***** ",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            "  ***** "
        };
    }
    public static String[] getPPattern(){
        return new String[]{
            " *****  ",
            " *    * ",
            " *    * ",
            " *****  ",
            " *      ",
            " *      ",
            " *      "
        };
    }
    public static String[] getSPattern(){
        return new String[]{
            " *****  ",
            "*       ",
            "*       ",
            " *****  ",
            "      * ",
            "      * ",
            " *****  "
        };
    }
    public static void main(String[] args){
        String[] Opattern = getOPattern();
        String[] Ppattern = getPPattern();
        String[] Spattern = getSPattern();
        for (int i=0;i<Opattern.length;i++){
            System.out.println(" "+Opattern[i]+" "+Opattern[i]+" "+Ppattern[i]+" "+Spattern[i]);
        }
    }

    
    
}

