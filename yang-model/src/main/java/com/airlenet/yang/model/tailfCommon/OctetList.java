/* 
 * @(#)OctetList.java        1.0 09/09/17
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "tailf-common", revision: "2017-01-26".
 */

package com.airlenet.yang.model.tailfCommon;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "/Users/lig/Documents/workspace/play-netconf/yang-model/src/main/java/com.airlenet.yang.model/tailfCommon/octet-list"
 * <p>
 * See line 469 in
 * /Users/lig/Documents/workspace/play-netconf/yang-model/src/main/yang/module/tailf/tailf-common.yang
 *
 * @version 1.0 2017-09-09
 * @author Auto Generated
 */
public class OctetList extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for OctetList object from a string.
     * @param value Value to construct the OctetList from.
     */
    public OctetList(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Sets the value using a string value.
     * @param value The value to set.
     */
    public void setValue(String value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
