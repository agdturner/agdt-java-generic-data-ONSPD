/*
 * Copyright 2019 Centre for Computational Geography, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.data.ukp.data.onspd;

import uk.ac.leeds.ccg.data.id.Data_RecordID;
import uk.ac.leeds.ccg.data.ukp.core.UKP_Environment;

/**
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public abstract class ONSPD_Record2 extends ONSPD_Record0 {

    protected String genind;
    protected String pafind;
    protected String addrct;
    protected String dpct;
    protected String moct;
    protected String smlbusct;
    protected String soa1;
    protected String dzone1;
    protected String soa2;
    protected String urindew;
    protected String urindsc;
    protected String urindni;
    protected String dzone2;
    protected String soa1ni;
    protected String oac;
    protected String oldpct;
    
    // 2008_FEB  8 pcd,pcd2,pcds,dointr,doterm,{Join these for Ward Code OODAFA oscty,oslaua,osward}, 
    //          12 usertype,oseast1m,osnrth1m,osgrdind,oshlthau,hro,ctry,GENIND,pafind,gor,streg,pcon,eer,
    //           7 teclec,ttwa,pct,nuts,{1991 Enumeration District: psed,cened},edind,
    //           4 ADDRCT,DPCT,MOCT,SMLBUSCT,
    //           3 oshaprev,lea,oldha,
    //           1 1991 Census and electoral ward code: wardc91,
    //           1 wardo91,
    //           1 1998 Census and electoral ward code: ward98,
    //           1 2005 statistical Ward: statsward,
    //           1 2001 Output Area Code: oacode,
    //           1 oaind,
    //           1 2001 CAS Ward: casward,
    //           1 park,
    //           1 2001 Lower Layer Super Output Area: soa1,
    //           1 dzone1,
    //           1 2001 Middle Layer Super Output Area: soa2,
    //           3 urindew,urindsc,urindni,dzone2,soa1ni,oac,oldpct
    // 2008_FEB pcd,pcd2,pcds,dointr,doterm,oscty,oslaua,osward,usertype,oseast1m,osnrth1m,osgrdind,oshlthau,hro,ctry,GENIND,pafind,gor,streg,pcon,eer,teclec,ttwa,pct,nuts,psed,cened,edind,ADDRCT,DPCT,MOCT,SMLBUSCT,oshaprev,lea,oldha,wardc91,wardo91,ward98,statsward,oacode,oaind,casward,park,soa1,dzone1,soa2,urindew,urindsc,urindni,dzone2,soa1ni,oac,oldpct
    // 2008_AUG pcd,pcd2,pcds,dointr,doterm,oscty,oslaua,osward,usertype,oseast1m,osnrth1m,osgrdind,oshlthau,hro,ctry,GENIND,pafind,gor,streg,pcon,eer,teclec,ttwa,pct,nuts,psed,cened,edind,ADDRCT,DPCT,MOCT,SMLBUSCT,oshaprev,lea,oldha,wardc91,wardo91,ward98,statsward,oacode,oaind,casward,park,soa1,dzone1,soa2,urindew,urindsc,urindni,dzone2,soa1ni,oac,oldpct
    // 2011_MAY pcd,pcd2,pcds,dointr,doterm,oscty,oslaua,osward,usertype,oseast1m,osnrth1m,osgrdind,oshlthau,hro,ctry,pafind,gor,streg,pcon,eer,teclec,ttwa,pct,nuts,psed,cened,edind,oshaprev,lea,oldha,wardc91,wardo91,ward98,statsward,oacode,oaind,casward,park,soa1,dzone1,soa2,urindew,urindsc,urindni,dzone2,soa1ni,oac,oldpct
    // 2012_AUG pcd,pcd2,pcds,dointr,doterm,oscty,oslaua,osward,usertype,oseast1m,osnrth1m,osgrdind,oshlthau,hro,ctry,GENIND,PAFIND,gor,streg,pcon,eer,teclec,ttwa,pct,nuts,psed,cened,edind,ADDRCT,DPCT,MOCT,SMLBUSCT,oshaprev,lea,oldha,wardc91,wardo91,ward98,statsward,OACODE,OAIND,oa01,casward,park,soa1,dzone1,soa2,urindew,urindsc,urindni,dzone2,soa1ni,oac,oldpct
    
    public ONSPD_Record2(UKP_Environment e, Data_RecordID i) {
        super(e, i);
        genind = "";
        pafind = "";
        addrct = "";
        dpct = "";
        moct = "";
        smlbusct = "";
    }

    public String getGenind() {
        return genind;
    }

    public String getPafind() {
        return pafind;
    }

    public String getAddrct() {
        return addrct;
    }

    public String getDpct() {
        return dpct;
    }

    public String getMoct() {
        return moct;
    }

    public String getSmlbusct() {
        return smlbusct;
    }
    
    public String getSoa1() {
        return soa1;
    }

    public String getDzone1() {
        return dzone1;
    }

    public String getSoa2() {
        return soa2;
    }

    public String getUrindew() {
        return urindew;
    }

    public String getUrindsc() {
        return urindsc;
    }
    
    public String getUrindni() {
        return urindni;
    }

    public String getDzone2() {
        return dzone2;
    }

    public String getSoa1ni() {
        return soa1ni;
    }

    public String getOac() {
        return oac;
    }

    public String getOldpct() {
        return oldpct;
    }
}
