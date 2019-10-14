package ru.spb.devclub.utils.db;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;

/**
 * Extends {@link ru.spb.devclub.utils.db.BoxedResultSet} interface, adds {@link java.util.Optional} usage methods.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.BoxedResultSet
 * @see java.util.Optional
 * @since 0.1.0
 */
public interface OptionalResultSet extends BoxedResultSet {
    Optional<String> getOptionalString(int columnIndex) throws SQLException;

    Optional<String> getOptionalString(String columnName) throws SQLException;

    Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException;

    Optional<Boolean> getOptionalBoolean(String columnName) throws SQLException;

    Optional<Byte> getOptionalByte(int columnIndex) throws SQLException;

    Optional<Byte> getOptionalByte(String columnName) throws SQLException;

    Optional<Short> getOptionalShort(int columnIndex) throws SQLException;

    Optional<Short> getOptionalShort(String columnName) throws SQLException;

    Optional<Integer> getOptionalInt(int columnIndex) throws SQLException;

    Optional<Integer> getOptionalInt(String columnName) throws SQLException;

    Optional<Long> getOptionalLong(int columnIndex) throws SQLException;

    Optional<Long> getOptionalLong(String columnName) throws SQLException;

    Optional<Float> getOptionalFloat(int columnIndex) throws SQLException;

    Optional<Float> getOptionalFloat(String columnName) throws SQLException;

    Optional<Double> getOptionalDouble(int columnIndex) throws SQLException;

    Optional<Double> getOptionalDouble(String columnName) throws SQLException;

    Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException;

    Optional<byte[]> getOptionalBytes(String columnName) throws SQLException;

    Optional<Date> getOptionalDate(int columnIndex) throws SQLException;

    Optional<Date> getOptionalDate(String columnName) throws SQLException;

    Optional<Time> getOptionalTime(int columnIndex) throws SQLException;

    Optional<Time> getOptionalTime(String columnName) throws SQLException;

    Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException;

    Optional<Timestamp> getOptionalTimestamp(String columnName) throws SQLException;

    Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException;

    Optional<BigDecimal> getOptionalBigDecimal(String columnName) throws SQLException;

    Optional<Ref> getOptionalRef(int columnIndex) throws SQLException;

    Optional<Ref> getOptionalRef(String columnName) throws SQLException;

    Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException;

    Optional<Blob> getOptionalBlob(String columnName) throws SQLException;

    Optional<Clob> getOptionalClob(int columnIndex) throws SQLException;

    Optional<Clob> getOptionalClob(String columnName) throws SQLException;

    Optional<Array> getOptionalArray(int columnIndex) throws SQLException;

    Optional<Array> getOptionalArray(String columnName) throws SQLException;
}
