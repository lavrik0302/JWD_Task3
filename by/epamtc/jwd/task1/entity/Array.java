package by.epamtc.jwd.task1.entity;

import java.util.Arrays;

public class Array {
    private int[] value;

    public Array(int... value) {
        this.value = value;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        if (value != null) {
            // исключение
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return "Array{" +
                "value=" + Arrays.toString(value) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(value, array.value);
    }

    @Override
    public int hashCode() {
        if (value == null)
            return 0;

        int result = 1;
        for (int element : value)
            result = 17 * result + element;

        return result;
    }
}
