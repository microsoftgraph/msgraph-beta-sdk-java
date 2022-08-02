package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosEduDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** The Trusted Root and PFX certificates for Device */
    private IosEduCertificateSettings _deviceCertificateSettings;
    /** The Trusted Root and PFX certificates for Student */
    private IosEduCertificateSettings _studentCertificateSettings;
    /** Trusted Root and PFX certificates for iOS EDU. */
    private IosEduCertificateSettings _teacherCertificateSettings;
    /**
     * Instantiates a new IosEduDeviceConfiguration and sets the default values.
     * @return a void
     */
    public IosEduDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosEduDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosEduDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static IosEduDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosEduDeviceConfiguration();
    }
    /**
     * Gets the deviceCertificateSettings property value. The Trusted Root and PFX certificates for Device
     * @return a iosEduCertificateSettings
     */
    @javax.annotation.Nullable
    public IosEduCertificateSettings getDeviceCertificateSettings() {
        return this._deviceCertificateSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosEduDeviceConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceCertificateSettings", (n) -> { currentObject.setDeviceCertificateSettings(n.getObjectValue(IosEduCertificateSettings::createFromDiscriminatorValue)); });
            this.put("studentCertificateSettings", (n) -> { currentObject.setStudentCertificateSettings(n.getObjectValue(IosEduCertificateSettings::createFromDiscriminatorValue)); });
            this.put("teacherCertificateSettings", (n) -> { currentObject.setTeacherCertificateSettings(n.getObjectValue(IosEduCertificateSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the studentCertificateSettings property value. The Trusted Root and PFX certificates for Student
     * @return a iosEduCertificateSettings
     */
    @javax.annotation.Nullable
    public IosEduCertificateSettings getStudentCertificateSettings() {
        return this._studentCertificateSettings;
    }
    /**
     * Gets the teacherCertificateSettings property value. Trusted Root and PFX certificates for iOS EDU.
     * @return a iosEduCertificateSettings
     */
    @javax.annotation.Nullable
    public IosEduCertificateSettings getTeacherCertificateSettings() {
        return this._teacherCertificateSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("deviceCertificateSettings", this.getDeviceCertificateSettings());
        writer.writeObjectValue("studentCertificateSettings", this.getStudentCertificateSettings());
        writer.writeObjectValue("teacherCertificateSettings", this.getTeacherCertificateSettings());
    }
    /**
     * Sets the deviceCertificateSettings property value. The Trusted Root and PFX certificates for Device
     * @param value Value to set for the deviceCertificateSettings property.
     * @return a void
     */
    public void setDeviceCertificateSettings(@javax.annotation.Nullable final IosEduCertificateSettings value) {
        this._deviceCertificateSettings = value;
    }
    /**
     * Sets the studentCertificateSettings property value. The Trusted Root and PFX certificates for Student
     * @param value Value to set for the studentCertificateSettings property.
     * @return a void
     */
    public void setStudentCertificateSettings(@javax.annotation.Nullable final IosEduCertificateSettings value) {
        this._studentCertificateSettings = value;
    }
    /**
     * Sets the teacherCertificateSettings property value. Trusted Root and PFX certificates for iOS EDU.
     * @param value Value to set for the teacherCertificateSettings property.
     * @return a void
     */
    public void setTeacherCertificateSettings(@javax.annotation.Nullable final IosEduCertificateSettings value) {
        this._teacherCertificateSettings = value;
    }
}
