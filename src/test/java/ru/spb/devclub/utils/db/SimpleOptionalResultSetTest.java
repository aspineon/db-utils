package ru.spb.devclub.utils.db;

import com.mockrunner.mock.jdbc.MockArray;
import com.mockrunner.mock.jdbc.MockBlob;
import com.mockrunner.mock.jdbc.MockClob;
import com.mockrunner.mock.jdbc.MockRef;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SimpleOptionalResultSetTest {
    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnIndex() throws SQLException {
        int columnIndex = 0;
        String expected = "forty thousand";
        Mockito.when(mockResultSet.getString(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnIndex);
        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalStringByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnIndex);
        assertFalse(optionalString.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnName() throws SQLException {
        String columnName = "ignored";
        String expected = "forty thousand";
        Mockito.when(mockResultSet.getString(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnName);
        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalStringByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnName);
        assertFalse(optionalString.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnIndex() throws SQLException {
        int columnIndex = 0;
        boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnIndex)).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnIndex);
        assertEquals(expected, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBooleanByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnIndex);
        assertFalse(optionalBoolean.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnName() throws SQLException {
        String columnName = "ignored";
        boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnName);
        assertEquals(expected, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBooleanByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnName);
        assertFalse(optionalBoolean.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Byte expected = 40;
        Mockito.when(mockResultSet.getByte(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnIndex);
        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalByteByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnIndex);
        assertFalse(optionalByte.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnName() throws SQLException {
        String columnName = "ignored";
        Byte expected = 40;
        Mockito.when(mockResultSet.getByte(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnName);
        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalByteByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnName);
        assertFalse(optionalByte.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Short expected = 4_000;
        Mockito.when(mockResultSet.getShort(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnIndex);
        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalShortByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnIndex);
        assertFalse(optionalShort.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnName() throws SQLException {
        String columnName = "ignored";
        Short expected = 4_000;
        Mockito.when(mockResultSet.getShort(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnName);
        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalShortByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnName);
        assertFalse(optionalShort.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Integer expected = 40_000;
        Mockito.when(mockResultSet.getInt(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Integer> optionalInteger = resultSet.getOptionalInt(columnIndex);
        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Integer> optionalInteger = resultSet.getOptionalInt(columnIndex);
        assertFalse(optionalInteger.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnName() throws SQLException {
        String columnName = "ignored";
        Integer expected = 40_000;
        Mockito.when(mockResultSet.getInt(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Integer> optionalInteger = resultSet.getOptionalInt(columnName);
        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalIntegerByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Integer> optionalInteger = resultSet.getOptionalInt(columnName);
        assertFalse(optionalInteger.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Long expected = 40_000L;
        Mockito.when(mockResultSet.getLong(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Long> optionalLong = resultSet.getOptionalLong(columnIndex);
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalLongByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Long> optionalLong = resultSet.getOptionalLong(columnIndex);
        assertFalse(optionalLong.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnName() throws SQLException {
        String columnName = "ignored";
        Long expected = 40_000L;
        Mockito.when(mockResultSet.getLong(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Long> optionalLong = resultSet.getOptionalLong(columnName);
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalLongByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Long> optionalLong = resultSet.getOptionalLong(columnName);
        assertFalse(optionalLong.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Float expected = 40_000F;
        Mockito.when(mockResultSet.getFloat(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnIndex);
        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalFloatByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnIndex);
        assertFalse(optionalFloat.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnName() throws SQLException {
        String columnName = "ignored";
        Float expected = 40_000F;
        Mockito.when(mockResultSet.getFloat(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnName);
        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalFloatByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnName);
        assertFalse(optionalFloat.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Double expected = 40_000D;
        Mockito.when(mockResultSet.getDouble(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Double> optionalDouble = resultSet.getOptionalDouble(columnIndex);
        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkNullFromGetOptionalDoubleByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Double> optionalDouble = resultSet.getOptionalDouble(columnIndex);
        assertFalse(optionalDouble.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnName() throws SQLException {
        String columnName = "ignored";
        Double expected = 40_000D;
        Mockito.when(mockResultSet.getDouble(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Double> optionalDouble = resultSet.getOptionalDouble(columnName);
        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkNullFromGetOptionalDoubleByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Double> optionalDouble = resultSet.getOptionalDouble(columnName);
        assertFalse(optionalDouble.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnIndex() throws SQLException {
        int columnIndex = 0;
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        Mockito.when(mockResultSet.getBytes(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(columnIndex);
        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBytesByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(columnIndex);
        assertFalse(optionalBytes.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnName() throws SQLException {
        String columnName = "ignored";
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        Mockito.when(mockResultSet.getBytes(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(columnName);
        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBytesByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(columnName);
        assertFalse(optionalBytes.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Date expected = Date.valueOf("2004-04-04");
        Mockito.when(mockResultSet.getDate(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Date> optionalDate = resultSet.getOptionalDate(columnIndex);
        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalDateByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Date> optionalDate = resultSet.getOptionalDate(columnIndex);
        assertFalse(optionalDate.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnName() throws SQLException {
        String columnName = "ignored";
        Date expected = Date.valueOf("2004-04-04");
        Mockito.when(mockResultSet.getDate(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Date> optionalDate = resultSet.getOptionalDate(columnName);
        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalDateByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Date> optionalDate = resultSet.getOptionalDate(columnName);
        assertFalse(optionalDate.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Time expected = Time.valueOf("04:04:04");
        Mockito.when(mockResultSet.getTime(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Time> optionalTime = resultSet.getOptionalTime(columnIndex);
        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Time> optionalTime = resultSet.getOptionalTime(columnIndex);
        assertFalse(optionalTime.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        Time expected = Time.valueOf("04:04:04");
        Mockito.when(mockResultSet.getTime(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Time> optionalTime = resultSet.getOptionalTime(columnName);
        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Time> optionalTime = resultSet.getOptionalTime(columnName);
        assertFalse(optionalTime.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        Mockito.when(mockResultSet.getTimestamp(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(columnIndex);
        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimestampByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(columnIndex);
        assertFalse(optionalTimestamp.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnName() throws SQLException {
        String columnName = "ignored";
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        Mockito.when(mockResultSet.getTimestamp(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(columnName);
        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimestampByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(columnName);
        assertFalse(optionalTimestamp.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        int columnIndex = 0;
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        Mockito.when(mockResultSet.getBigDecimal(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(columnIndex);
        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(columnIndex);
        assertFalse(optionalBigDecimal.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnName() throws SQLException {
        String columnName = "ignored";
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        Mockito.when(mockResultSet.getBigDecimal(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(columnName);
        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBigDecimalByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(columnName);
        assertFalse(optionalBigDecimal.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalRefByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Ref expected = new MockRef(40_000);
        Mockito.when(mockResultSet.getRef(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Ref> optionalRef = resultSet.getOptionalRef(columnIndex);
        assertEquals(expected, optionalRef.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalRefByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Ref> optionalRef = resultSet.getOptionalRef(columnIndex);
        assertFalse(optionalRef.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalRefByColumnName() throws SQLException {
        String columnName = "ignored";
        Ref expected = new MockRef(40_000);
        Mockito.when(mockResultSet.getRef(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Ref> optionalRef = resultSet.getOptionalRef(columnName);
        assertEquals(expected, optionalRef.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalRefByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Ref> optionalRef = resultSet.getOptionalRef(columnName);
        assertFalse(optionalRef.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBlobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Blob expected = new MockBlob(new byte[]{4, 0, 0, 0, 0});
        Mockito.when(mockResultSet.getBlob(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob(columnIndex);
        assertEquals(expected, optionalBlob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBlobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob(columnIndex);
        assertFalse(optionalBlob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBlobByColumnName() throws SQLException {
        String columnName = "ignored";
        Blob expected = new MockBlob(new byte[]{4, 0, 0, 0, 0});
        Mockito.when(mockResultSet.getBlob(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob(columnName);
        assertEquals(expected, optionalBlob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBlobByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob(columnName);
        assertFalse(optionalBlob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalClobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Clob expected = new MockClob("forty thousand");
        Mockito.when(mockResultSet.getClob(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Clob> optionalClob = resultSet.getOptionalClob(columnIndex);
        assertEquals(expected, optionalClob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalClobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Clob> optionalClob = resultSet.getOptionalClob(columnIndex);
        assertFalse(optionalClob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalClobByColumnName() throws SQLException {
        String columnName = "ignored";
        Clob expected = new MockClob("forty thousand");
        Mockito.when(mockResultSet.getClob(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Clob> optionalClob = resultSet.getOptionalClob(columnName);
        assertEquals(expected, optionalClob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalClobByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Clob> optionalClob = resultSet.getOptionalClob(columnName);
        assertFalse(optionalClob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalArrayByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Array expected = new MockArray("forty thousand");
        Mockito.when(mockResultSet.getArray(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Array> optionalArray = resultSet.getOptionalArray(columnIndex);
        assertEquals(expected, optionalArray.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalArrayByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Array> optionalArray = resultSet.getOptionalArray(columnIndex);
        assertFalse(optionalArray.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalArrayByColumnName() throws SQLException {
        String columnName = "ignored";
        Array expected = new MockArray("forty thousand");
        Mockito.when(mockResultSet.getArray(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Array> optionalArray = resultSet.getOptionalArray(columnName);
        assertEquals(expected, optionalArray.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalArrayByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Array> optionalArray = resultSet.getOptionalArray(columnName);
        assertFalse(optionalArray.isPresent());
    }
}