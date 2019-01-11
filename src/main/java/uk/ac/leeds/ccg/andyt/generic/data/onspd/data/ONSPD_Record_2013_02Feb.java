/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.leeds.ccg.andyt.generic.data.onspd.data;

import uk.ac.leeds.ccg.andyt.generic.data.onspd.core.ONSPD_Environment;

/**
 *
 * @author geoagdt
 */
public class ONSPD_Record_2013_02Feb extends ONSPD_Record_2012_11Nov {

    protected final String parish;
    protected final String wz11;
    
    public ONSPD_Record_2013_02Feb(ONSPD_Environment env, String line) {
        super(env, line);
        String[] fields = line.split("\",\"");
        parish = fields[fields.length - 2];
        wz11 = fields[fields.length - 1];
    }

    public String getParish() {
        return parish;
    }
    
    public String getWz11() {
        return wz11;
    }
}