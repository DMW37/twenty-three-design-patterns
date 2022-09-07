package com.dmw.functional.responsibilitychain.simulation;

public interface Filter {
 	public void doFilter(Request req,Response res,FilterChain c);
 }