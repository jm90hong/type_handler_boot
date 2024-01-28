package com.my.type_handler_boot.type_handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.my.type_handler_boot.util.AESUtil;

public class AesTypeHandler extends BaseTypeHandler<String> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String parameter, JdbcType jdbcType) throws SQLException {
        try {
            String encryptedValue = AESUtil.encrypt(parameter);
            preparedStatement.setString(i, encryptedValue);
        } catch (Exception e) {
            throw new SQLException("Error encrypting parameter", e);
        }
    }

    @Override
    public String getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return decrypt(resultSet.getString(columnName));
    }

    @Override
    public String getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return decrypt(resultSet.getString(columnIndex));
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return decrypt(callableStatement.getString(columnIndex));
    }

    private String decrypt(String encryptedValue) throws SQLException {
        try {
            return AESUtil.decrypt(encryptedValue);
        } catch (Exception e) {
            throw new SQLException("Error decrypting value from database", e);
        }
    }
}
