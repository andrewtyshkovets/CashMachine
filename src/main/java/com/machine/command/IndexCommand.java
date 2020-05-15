package com.machine.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return request.getServletPath();
    }
}
