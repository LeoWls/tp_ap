package com.tpleo;

public class credentialsBdd {
    private static String ipBdd = "jdbc:mysql://127.0.0.1:3306/MonServeur";

    public static String getIpBdd() {
        return ipBdd;
    }

    private static String logBdd = "root";

    public static String getLogBdd() {
        return logBdd;
    }

    private static String pwdBdd = "";

    public static String getPwdBdd() {
        return pwdBdd;
    }
}
