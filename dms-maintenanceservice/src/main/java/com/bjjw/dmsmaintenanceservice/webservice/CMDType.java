
package com.bjjw.dmsmaintenanceservice.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CMDType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CMDType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unkown"/>
 *     &lt;enumeration value="UpTemporaryDriveCMD"/>
 *     &lt;enumeration value="DownTemporaryDriveCMD"/>
 *     &lt;enumeration value="ForeignMatterControlResumeCMD"/>
 *     &lt;enumeration value="ForeginMatterElectricGrid1RemoteTestCMD"/>
 *     &lt;enumeration value="ForeginMatterElectricGrid1RemoteResumeCMD"/>
 *     &lt;enumeration value="ForeginMatterElectricGrid2RemoteTestCMD"/>
 *     &lt;enumeration value="ForeginMatterElectricGrid2RemoteResumeCMD"/>
 *     &lt;enumeration value="ForeignMatterRemoteResumeCMD"/>
 *     &lt;enumeration value="EarthQuakeTrainControlControlCMD"/>
 *     &lt;enumeration value="EarthQuakeTtrainControlResumeCMD"/>
 *     &lt;enumeration value="EarthQuakeTractionSubstationControlCMD"/>
 *     &lt;enumeration value="EarthQuakeTractionSubstationResumeCMD"/>
 *     &lt;enumeration value="EarthQuake1LevelAlarmTest"/>
 *     &lt;enumeration value="EarthQuake2LevelAlarmTest"/>
 *     &lt;enumeration value="EarthQuake3LevelAlarmTest"/>
 *     &lt;enumeration value="SnowDepthImageAchievce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CMDType", namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core")
@XmlEnum
public enum CMDType {

    @XmlEnumValue("Unkown")
    UNKOWN("Unkown"),
    @XmlEnumValue("UpTemporaryDriveCMD")
    UP_TEMPORARY_DRIVE_CMD("UpTemporaryDriveCMD"),
    @XmlEnumValue("DownTemporaryDriveCMD")
    DOWN_TEMPORARY_DRIVE_CMD("DownTemporaryDriveCMD"),
    @XmlEnumValue("ForeignMatterControlResumeCMD")
    FOREIGN_MATTER_CONTROL_RESUME_CMD("ForeignMatterControlResumeCMD"),
    @XmlEnumValue("ForeginMatterElectricGrid1RemoteTestCMD")
    FOREGIN_MATTER_ELECTRIC_GRID_1_REMOTE_TEST_CMD("ForeginMatterElectricGrid1RemoteTestCMD"),
    @XmlEnumValue("ForeginMatterElectricGrid1RemoteResumeCMD")
    FOREGIN_MATTER_ELECTRIC_GRID_1_REMOTE_RESUME_CMD("ForeginMatterElectricGrid1RemoteResumeCMD"),
    @XmlEnumValue("ForeginMatterElectricGrid2RemoteTestCMD")
    FOREGIN_MATTER_ELECTRIC_GRID_2_REMOTE_TEST_CMD("ForeginMatterElectricGrid2RemoteTestCMD"),
    @XmlEnumValue("ForeginMatterElectricGrid2RemoteResumeCMD")
    FOREGIN_MATTER_ELECTRIC_GRID_2_REMOTE_RESUME_CMD("ForeginMatterElectricGrid2RemoteResumeCMD"),
    @XmlEnumValue("ForeignMatterRemoteResumeCMD")
    FOREIGN_MATTER_REMOTE_RESUME_CMD("ForeignMatterRemoteResumeCMD"),
    @XmlEnumValue("EarthQuakeTrainControlControlCMD")
    EARTH_QUAKE_TRAIN_CONTROL_CONTROL_CMD("EarthQuakeTrainControlControlCMD"),
    @XmlEnumValue("EarthQuakeTtrainControlResumeCMD")
    EARTH_QUAKE_TTRAIN_CONTROL_RESUME_CMD("EarthQuakeTtrainControlResumeCMD"),
    @XmlEnumValue("EarthQuakeTractionSubstationControlCMD")
    EARTH_QUAKE_TRACTION_SUBSTATION_CONTROL_CMD("EarthQuakeTractionSubstationControlCMD"),
    @XmlEnumValue("EarthQuakeTractionSubstationResumeCMD")
    EARTH_QUAKE_TRACTION_SUBSTATION_RESUME_CMD("EarthQuakeTractionSubstationResumeCMD"),
    @XmlEnumValue("EarthQuake1LevelAlarmTest")
    EARTH_QUAKE_1_LEVEL_ALARM_TEST("EarthQuake1LevelAlarmTest"),
    @XmlEnumValue("EarthQuake2LevelAlarmTest")
    EARTH_QUAKE_2_LEVEL_ALARM_TEST("EarthQuake2LevelAlarmTest"),
    @XmlEnumValue("EarthQuake3LevelAlarmTest")
    EARTH_QUAKE_3_LEVEL_ALARM_TEST("EarthQuake3LevelAlarmTest"),
    @XmlEnumValue("SnowDepthImageAchievce")
    SNOW_DEPTH_IMAGE_ACHIEVCE("SnowDepthImageAchievce");
    private final String value;

    CMDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CMDType fromValue(String v) {
        for (CMDType c: CMDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
