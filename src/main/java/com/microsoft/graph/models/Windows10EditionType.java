package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum Windows10EditionType implements ValuedEnum {
    Windows10Enterprise("windows10Enterprise"),
    Windows10EnterpriseN("windows10EnterpriseN"),
    Windows10Education("windows10Education"),
    Windows10EducationN("windows10EducationN"),
    Windows10MobileEnterprise("windows10MobileEnterprise"),
    Windows10HolographicEnterprise("windows10HolographicEnterprise"),
    Windows10Professional("windows10Professional"),
    Windows10ProfessionalN("windows10ProfessionalN"),
    Windows10ProfessionalEducation("windows10ProfessionalEducation"),
    Windows10ProfessionalEducationN("windows10ProfessionalEducationN"),
    Windows10ProfessionalWorkstation("windows10ProfessionalWorkstation"),
    Windows10ProfessionalWorkstationN("windows10ProfessionalWorkstationN"),
    NotConfigured("notConfigured"),
    Windows10Home("windows10Home"),
    Windows10HomeChina("windows10HomeChina"),
    Windows10HomeN("windows10HomeN"),
    Windows10HomeSingleLanguage("windows10HomeSingleLanguage"),
    Windows10Mobile("windows10Mobile"),
    Windows10IoTCore("windows10IoTCore"),
    Windows10IoTCoreCommercial("windows10IoTCoreCommercial");
    public final String value;
    Windows10EditionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Windows10EditionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "windows10Enterprise": return Windows10Enterprise;
            case "windows10EnterpriseN": return Windows10EnterpriseN;
            case "windows10Education": return Windows10Education;
            case "windows10EducationN": return Windows10EducationN;
            case "windows10MobileEnterprise": return Windows10MobileEnterprise;
            case "windows10HolographicEnterprise": return Windows10HolographicEnterprise;
            case "windows10Professional": return Windows10Professional;
            case "windows10ProfessionalN": return Windows10ProfessionalN;
            case "windows10ProfessionalEducation": return Windows10ProfessionalEducation;
            case "windows10ProfessionalEducationN": return Windows10ProfessionalEducationN;
            case "windows10ProfessionalWorkstation": return Windows10ProfessionalWorkstation;
            case "windows10ProfessionalWorkstationN": return Windows10ProfessionalWorkstationN;
            case "notConfigured": return NotConfigured;
            case "windows10Home": return Windows10Home;
            case "windows10HomeChina": return Windows10HomeChina;
            case "windows10HomeN": return Windows10HomeN;
            case "windows10HomeSingleLanguage": return Windows10HomeSingleLanguage;
            case "windows10Mobile": return Windows10Mobile;
            case "windows10IoTCore": return Windows10IoTCore;
            case "windows10IoTCoreCommercial": return Windows10IoTCoreCommercial;
            default: return null;
        }
    }
}
