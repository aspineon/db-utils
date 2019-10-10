package ru.spb.devclub.utils.db;

import org.junit.Test;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SimpleOptionalResultSetTest {
    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnIndex() throws SQLException {
        String expected = "forty thousand";
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public String getString(int columnIndex) {
                return expected;
            }
        });
        Optional<String> optionalString = resultSet.getOptionalString(0);
        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalStringByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<String> optionalString = resultSet.getOptionalString(0);
        assertFalse(optionalString.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnName() throws SQLException {
        String expected = "forty thousand";
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public String getString(String columnName) {
                return expected;
            }
        });
        Optional<String> optionalString = resultSet.getOptionalString("ignored");
        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean getBoolean(int columnIndex) {
                return true;
            }
        });
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(0);
        assertEquals(true, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBooleanByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(0);
        assertFalse(optionalBoolean.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean getBoolean(String columnName) {
                return true;
            }
        });
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean("ignored");
        assertEquals(true, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnIndex() throws SQLException {
        Byte expected = 40;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public byte getByte(int columnIndex) {
                return expected;
            }
        });
        Optional<Byte> optionalByte = resultSet.getOptionalByte(0);
        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalByteByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Byte> optionalByte = resultSet.getOptionalByte(0);
        assertFalse(optionalByte.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnName() throws SQLException {
        Byte expected = 40;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public byte getByte(String columnName) {
                return expected;
            }
        });
        Optional<Byte> optionalByte = resultSet.getOptionalByte("ignored");
        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnIndex() throws SQLException {
        Short expected = 4_000;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public short getShort(int columnIndex) {
                return expected;
            }
        });
        Optional<Short> optionalShort = resultSet.getOptionalShort(0);
        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalShortByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Short> optionalShort = resultSet.getOptionalShort(0);
        assertFalse(optionalShort.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnName() throws SQLException {
        Short expected = 4_000;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public short getShort(String columnName) {
                return expected;
            }
        });
        Optional<Short> optionalShort = resultSet.getOptionalShort("ignored");
        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int expected = 40_000;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public int getInt(int columnIndex) {
                return expected;
            }
        });
        OptionalInt optionalInteger = resultSet.getOptionalInt(0);
        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalIntegerByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        OptionalInt optionalInteger = resultSet.getOptionalInt(0);
        assertFalse(optionalInteger.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnName() throws SQLException {
        int expected = 40_000;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public int getInt(String columnName) {
                return expected;
            }
        });
        OptionalInt optionalInteger = resultSet.getOptionalInt("ignored");
        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnIndex() throws SQLException {
        long expected = 40_000L;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public long getLong(int columnIndex) {
                return expected;
            }
        });
        OptionalLong optionalLong = resultSet.getOptionalLong(0);
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalLongByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        OptionalLong optionalLong = resultSet.getOptionalLong(0);
        assertFalse(optionalLong.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnName() throws SQLException {
        long expected = 40_000L;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public long getLong(String columnName) {
                return expected;
            }
        });
        OptionalLong optionalLong = resultSet.getOptionalLong("ignored");
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnIndex() throws SQLException {
        Float expected = 40_000F;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public float getFloat(int columnIndex) {
                return expected;
            }
        });
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(0);
        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalFloatByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(0);
        assertFalse(optionalFloat.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnName() throws SQLException {
        Float expected = 40_000F;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public float getFloat(String columnName) {
                return expected;
            }
        });
        Optional<Float> optionalFloat = resultSet.getOptionalFloat("ignored");
        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnIndex() throws SQLException {
        double expected = 40_000D;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public double getDouble(int columnIndex) {
                return expected;
            }
        });
        OptionalDouble optionalDouble = resultSet.getOptionalDouble(0);
        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkNullFromGetOptionalDoubleByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        OptionalDouble optionalDouble = resultSet.getOptionalDouble(0);
        assertFalse(optionalDouble.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnName() throws SQLException {
        double expected = 40_000D;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public double getDouble(String columnName) {
                return expected;
            }
        });
        OptionalDouble optionalDouble = resultSet.getOptionalDouble("ignored");
        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnIndex() throws SQLException {
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public byte[] getBytes(int columnIndex) {
                return expected;
            }
        });
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(0);
        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBytesByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(0);
        assertFalse(optionalBytes.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnName() throws SQLException {
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public byte[] getBytes(String columnName) {
                return expected;
            }
        });
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes("ignored");
        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnIndex() throws SQLException {
        Date expected = Date.valueOf("2004-04-04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Date getDate(int columnIndex) {
                return expected;
            }
        });
        Optional<Date> optionalDate = resultSet.getOptionalDate(0);
        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalDateByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Date> optionalDate = resultSet.getOptionalDate(0);
        assertFalse(optionalDate.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnName() throws SQLException {
        Date expected = Date.valueOf("2004-04-04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Date getDate(String columnName) {
                return expected;
            }
        });
        Optional<Date> optionalDate = resultSet.getOptionalDate("ignored");
        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnIndex() throws SQLException {
        Time expected = Time.valueOf("04:04:04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Time getTime(int columnIndex) {
                return expected;
            }
        });
        Optional<Time> optionalTime = resultSet.getOptionalTime(0);
        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimeByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Time> optionalTime = resultSet.getOptionalTime(0);
        assertFalse(optionalTime.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnName() throws SQLException {
        Time expected = Time.valueOf("04:04:04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Time getTime(String columnName) {
                return expected;
            }
        });
        Optional<Time> optionalTime = resultSet.getOptionalTime("ignored");
        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnIndex() throws SQLException {
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Timestamp getTimestamp(int columnIndex) {
                return expected;
            }
        });
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(0);
        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimestampByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(0);
        assertFalse(optionalTimestamp.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnName() throws SQLException {
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Timestamp getTimestamp(String columnName) {
                return expected;
            }
        });
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp("ignored");
        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public BigDecimal getBigDecimal(int columnIndex) {
                return expected;
            }
        });
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(0);
        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(0);
        assertFalse(optionalBigDecimal.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnName() throws SQLException {
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public BigDecimal getBigDecimal(String columnName) {
                return expected;
            }
        });
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal("ignored");
        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }
}