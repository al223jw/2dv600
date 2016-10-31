package al223jw_assign1;

import java.util.stream.IntStream;

public class Arrays {

    static int sum(int[] arr)
    {
        return IntStream.of(arr).sum();
    }

    static String toString(int[] arr)
    {
        String result = "{ ";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + (i+1 == arr.length ? " " : ", ");
        }
        return result += "}";
    }

    static int[] addN(int[] arr, int n)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i] + n;
        }
        return arr;
    }

    static int[] reverse(int[] arr)
    {
        int[] newArr = arr;

        for(int i = 0; i < newArr.length / 2; i++)
        {
            int temp = newArr[i];
            newArr[i] = newArr[newArr.length - i - 1];
            newArr[newArr.length -i - 1] = temp;
        }
        return newArr;
    }

    static void replaceAll(int[] arr, int old, int nw)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == old)
            {
                arr[i] = nw;
            }
        }
    }

    static int[] sort(int[] arr)
    {
        int[] newArr = arr;

        for(int i = 0; i < newArr.length; i++)
        {
            for(int j = 0; j + 1 < newArr.length; j++)
            {
                int temp = 0;
                if(newArr[i] < newArr[j])
                {
                    temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    static boolean hasSubsequence(int[] arr, int[] sub)
    {
        int count = 0;
        boolean trueOrFalse = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == sub[0])
            {
                for(int j = 0; j < sub.length; j++)
                {
                    if(arr[i + j] == sub[j])
                    {
                        count++;
                        if(count == sub.length)
                        {
                            trueOrFalse = true;
                        }
                    }
                }
            }
        }
        return trueOrFalse;
    }

    static int[] absDif(int[] arr1, int[] arr2)
    {
        int[] newArr = arr1;

        if(arr1.length == arr2.length)
        {
                for (int j = 0; j < arr2.length; j++)
                {
                    newArr[j] = arr1[j] - arr2[j];
                }
            return newArr;
            }

        else
        {
            System.out.println("The arrays you entered do not have the same length");
        }
        return null;
    }
}
