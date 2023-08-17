package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS Education device configuration
 */
public class IosEduDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * The Trusted Root and PFX certificates for Device
     */
    private IosEduCertificateSettings deviceCertificateSettings;
    /**
     * The Trusted Root and PFX certificates for Student
     */
    private IosEduCertificateSettings studentCertificateSettings;
    /**
     * Trusted Root and PFX certificates for iOS EDU.
     */
    private IosEduCertificateSettings teacherCertificateSettings;
    /**
     * Instantiates a new iosEduDeviceConfiguration and sets the default values.
     */
    public IosEduDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosEduDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosEduDeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosEduDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosEduDeviceConfiguration();
    }
    /**
     * Gets the deviceCertificateSettings property value. The Trusted Root and PFX certificates for Device
     * @return a iosEduCertificateSettings
     */
    @jakarta.annotation.Nullable
    public IosEduCertificateSettings getDeviceCertificateSettings() {
        return this.deviceCertificateSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceCertificateSettings", (n) -> { this.setDeviceCertificateSettings(n.getObjectValue(IosEduCertificateSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("studentCertificateSettings", (n) -> { this.setStudentCertificateSettings(n.getObjectValue(IosEduCertificateSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("teacherCertificateSettings", (n) -> { this.setTeacherCertificateSettings(n.getObjectValue(IosEduCertificateSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the studentCertificateSettings property value. The Trusted Root and PFX certificates for Student
     * @return a iosEduCertificateSettings
     */
    @jakarta.annotation.Nullable
    public IosEduCertificateSettings getStudentCertificateSettings() {
        return this.studentCertificateSettings;
    }
    /**
     * Gets the teacherCertificateSettings property value. Trusted Root and PFX certificates for iOS EDU.
     * @return a iosEduCertificateSettings
     */
    @jakarta.annotation.Nullable
    public IosEduCertificateSettings getTeacherCertificateSettings() {
        return this.teacherCertificateSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("deviceCertificateSettings", this.getDeviceCertificateSettings());
        writer.writeObjectValue("studentCertificateSettings", this.getStudentCertificateSettings());
        writer.writeObjectValue("teacherCertificateSettings", this.getTeacherCertificateSettings());
    }
    /**
     * Sets the deviceCertificateSettings property value. The Trusted Root and PFX certificates for Device
     * @param value Value to set for the deviceCertificateSettings property.
     */
    public void setDeviceCertificateSettings(@jakarta.annotation.Nullable final IosEduCertificateSettings value) {
        this.deviceCertificateSettings = value;
    }
    /**
     * Sets the studentCertificateSettings property value. The Trusted Root and PFX certificates for Student
     * @param value Value to set for the studentCertificateSettings property.
     */
    public void setStudentCertificateSettings(@jakarta.annotation.Nullable final IosEduCertificateSettings value) {
        this.studentCertificateSettings = value;
    }
    /**
     * Sets the teacherCertificateSettings property value. Trusted Root and PFX certificates for iOS EDU.
     * @param value Value to set for the teacherCertificateSettings property.
     */
    public void setTeacherCertificateSettings(@jakarta.annotation.Nullable final IosEduCertificateSettings value) {
        this.teacherCertificateSettings = value;
    }
}
