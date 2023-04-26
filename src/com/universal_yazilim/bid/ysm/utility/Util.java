package com.universal_yazilim.bid.ysm.utility;

import javax.swing.*;
import java.util.List;

public final class Util
{
    private Util() {}

    public static void showGeneralExceptionInfo(Exception e)
    {
        showWarningMessage(createGeneralExceptionInfo(e));
    }

    public static String createGeneralExceptionInfo(Exception e)
    {
        return e.getClass().getSimpleName() + " has been occured. Exception message: " + e.getMessage();
    }

    public static <E> void showList(List<E> list)
    {
        for (E element : list)
        {
            System.out.println(element);
        }
    }

    public static <E> void showArray(E[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void showAddressInfo(Object obj)
    {
        System.out.println("\n" + obj.getClass().getSimpleName() + " hashcode: " + obj.hashCode()
        + " address: " + Integer.toHexString(obj.hashCode()));
    }

    public static void showEqualsInfo(Object obj1, Object obj2)
    {
        String name1 = null;
        String name2 = null;

        if(obj1 != null)
        {
            name1 = obj1.getClass().getSimpleName();
        }
        if(obj2 != null)
        {
            name2 = obj2.getClass().getSimpleName();
        }

        if(obj1.equals(obj2))
        {
            System.out.println("\nFirst " + name1 + " equal to second " + name2);
        }
        else
        {
            System.out.println("\nFirst " + name1 + " NOT equal to second " + name2);
        }
    }

    public static void showErrorMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    public static void showWarningMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Warning Message", JOptionPane.WARNING_MESSAGE);
    }

    public static void showQuestionMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Question Message", JOptionPane.QUESTION_MESSAGE);
    }

    public static void showInfoMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Info Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
