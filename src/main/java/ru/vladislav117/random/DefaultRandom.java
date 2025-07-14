package ru.vladislav117.random;

/**
 * Реализация Random, использующая встроенный генератор псевдослучайных чисел.
 */
public class DefaultRandom implements Random {
    protected java.util.Random random;

    /**
     * Создание нового генератора.
     *
     * @param random Генератор псевдослучайных чисел
     */
    public DefaultRandom(java.util.Random random) {
        this.random = random;
    }

    /**
     * Создание нового генератора с заданным зерном.
     *
     * @param seed Зерно генератора псевдослучайных чисел
     */
    public DefaultRandom(long seed) {
        random = new java.util.Random(seed);
    }

    /**
     * Создание нового генератора со случайным зерном.
     */
    public DefaultRandom() {
        random = new java.util.Random();
    }

    @Override
    public boolean getBoolean() {
        return random.nextBoolean();
    }

    @Override
    public byte getByte(byte min, byte max) {
        return (byte) random.nextInt(min, max);
    }

    @Override
    public short getShort(short min, short max) {
        return (short) random.nextInt(min, max);
    }

    @Override
    public int getInteger(int min, int max) {
        return random.nextInt(min, max);
    }

    @Override
    public long getLong(long min, long max) {
        return random.nextLong(min, max);
    }

    @Override
    public float getFloat(float min, float max) {
        return random.nextFloat(min, max);
    }

    @Override
    public double getDouble(double min, double max) {
        return random.nextDouble(min, max);
    }
}
