package com.enoca.employee_management.utility;

public final class Util {

    private Util() {
    }

    public static void showGeneralExceptionInfo(Exception e){
        System.err.println(e.getClass().getSimpleName()
                + " is occured. Exception message: " + e.getMessage());
    }
}
