package com.javacodejunkie;

import ch.qos.logback.core.spi.ScanException;

public interface EmployeeDAO {

    Employee get(int id) throws ScanException;

}
