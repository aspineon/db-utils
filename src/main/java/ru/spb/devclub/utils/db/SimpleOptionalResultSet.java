package ru.spb.devclub.utils.db;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * The simple implementation of {@link ru.spb.devclub.utils.db.OptionalResultSet}.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.OptionalResultSet
 * @see ru.spb.devclub.utils.db.ProxyResultSet
 * @since 0.1.0
 */
/* package */class SimpleOptionalResultSet extends ProxyResultSet implements OptionalResultSet {
    protected SimpleOptionalResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    @Override
    public Optional<String> getOptionalString(int columnIndex) throws SQLException {
        String value = resultSet.getString(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException {
        Boolean value = resultSet.getBoolean(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Byte> getOptionalByte(int columnIndex) throws SQLException {
        Byte value = resultSet.getByte(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Short> getOptionalShort(int columnIndex) throws SQLException {
        Short value = resultSet.getShort(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public OptionalInt getOptionalInt(int columnIndex) throws SQLException {
        int value = resultSet.getInt(columnIndex);
        return resultSet.wasNull() ? OptionalInt.empty() : OptionalInt.of(value);
    }

    @Override
    public OptionalLong getOptionalLong(String columnName) throws SQLException {
        long value = resultSet.getLong(columnName);
        return resultSet.wasNull() ? OptionalLong.empty() : OptionalLong.of(value);
    }

    @Override
    public OptionalLong getOptionalLong(int columnIndex) throws SQLException {
        long value = resultSet.getLong(columnIndex);
        return resultSet.wasNull() ? OptionalLong.empty() : OptionalLong.of(value);
    }

    @Override
    public Optional<Float> getOptionalFloat(int columnIndex) throws SQLException {
        Float value = resultSet.getFloat(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public OptionalDouble getOptionalDouble(int columnIndex) throws SQLException {
        double value = resultSet.getDouble(columnIndex);
        return resultSet.wasNull() ? OptionalDouble.empty() : OptionalDouble.of(value);
    }

    @Override
    public Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException {
        byte[] value = resultSet.getBytes(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Date> getOptionalDate(int columnIndex) throws SQLException {
        Date value = resultSet.getDate(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Time> getOptionalTime(int columnIndex) throws SQLException {
        Time value = resultSet.getTime(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException {
        Timestamp value = resultSet.getTimestamp(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException {
        BigDecimal value = resultSet.getBigDecimal(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Ref> getOptionalRef(int columnIndex) throws SQLException {
        Ref value = resultSet.getRef(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException {
        Blob value = resultSet.getBlob(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Clob> getOptionalClob(int columnIndex) throws SQLException {
        Clob value = resultSet.getClob(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Array> getOptionalArray(int columnIndex) throws SQLException {
        Array value = resultSet.getArray(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }
}
