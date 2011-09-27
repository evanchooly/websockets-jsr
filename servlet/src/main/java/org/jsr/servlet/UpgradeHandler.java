package org.jsr.servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface UpgradeHandler {
    public void doUpgrade(ServletRequest request, ServletResponse response) throws UpgradeException;
}
