package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEnrollmentNotificationConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /** Branding Options for the Message Template. Branding is defined in the Intune Admin Console. */
    private EnrollmentNotificationBrandingOptions _brandingOptions;
    /** DefaultLocale for the Enrollment Notification */
    private String _defaultLocale;
    /** Notification Message Template Id */
    private String _notificationMessageTemplateId;
    /** This enum indicates the platform type for which the enrollment restriction applies. */
    private EnrollmentRestrictionPlatformType _platformType;
    /** This enum indicates the Template type for which the enrollment notification applies. */
    private EnrollmentNotificationTemplateType _templateType;
    /**
     * Instantiates a new DeviceEnrollmentNotificationConfiguration and sets the default values.
     * @return a void
     */
    public DeviceEnrollmentNotificationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentNotificationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentNotificationConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentNotificationConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentNotificationConfiguration();
    }
    /**
     * Gets the brandingOptions property value. Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
     * @return a enrollmentNotificationBrandingOptions
     */
    @javax.annotation.Nullable
    public EnrollmentNotificationBrandingOptions getBrandingOptions() {
        return this._brandingOptions;
    }
    /**
     * Gets the defaultLocale property value. DefaultLocale for the Enrollment Notification
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLocale() {
        return this._defaultLocale;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceEnrollmentNotificationConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("brandingOptions", (n) -> { currentObject.setBrandingOptions(n.getEnumValue(EnrollmentNotificationBrandingOptions.class)); });
            this.put("defaultLocale", (n) -> { currentObject.setDefaultLocale(n.getStringValue()); });
            this.put("notificationMessageTemplateId", (n) -> { currentObject.setNotificationMessageTemplateId(n.getStringValue()); });
            this.put("platformType", (n) -> { currentObject.setPlatformType(n.getEnumValue(EnrollmentRestrictionPlatformType.class)); });
            this.put("templateType", (n) -> { currentObject.setTemplateType(n.getEnumValue(EnrollmentNotificationTemplateType.class)); });
        }};
    }
    /**
     * Gets the notificationMessageTemplateId property value. Notification Message Template Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationMessageTemplateId() {
        return this._notificationMessageTemplateId;
    }
    /**
     * Gets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @return a enrollmentRestrictionPlatformType
     */
    @javax.annotation.Nullable
    public EnrollmentRestrictionPlatformType getPlatformType() {
        return this._platformType;
    }
    /**
     * Gets the templateType property value. This enum indicates the Template type for which the enrollment notification applies.
     * @return a enrollmentNotificationTemplateType
     */
    @javax.annotation.Nullable
    public EnrollmentNotificationTemplateType getTemplateType() {
        return this._templateType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("brandingOptions", this.getBrandingOptions());
        writer.writeStringValue("defaultLocale", this.getDefaultLocale());
        writer.writeStringValue("notificationMessageTemplateId", this.getNotificationMessageTemplateId());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeEnumValue("templateType", this.getTemplateType());
    }
    /**
     * Sets the brandingOptions property value. Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
     * @param value Value to set for the brandingOptions property.
     * @return a void
     */
    public void setBrandingOptions(@javax.annotation.Nullable final EnrollmentNotificationBrandingOptions value) {
        this._brandingOptions = value;
    }
    /**
     * Sets the defaultLocale property value. DefaultLocale for the Enrollment Notification
     * @param value Value to set for the defaultLocale property.
     * @return a void
     */
    public void setDefaultLocale(@javax.annotation.Nullable final String value) {
        this._defaultLocale = value;
    }
    /**
     * Sets the notificationMessageTemplateId property value. Notification Message Template Id
     * @param value Value to set for the notificationMessageTemplateId property.
     * @return a void
     */
    public void setNotificationMessageTemplateId(@javax.annotation.Nullable final String value) {
        this._notificationMessageTemplateId = value;
    }
    /**
     * Sets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    public void setPlatformType(@javax.annotation.Nullable final EnrollmentRestrictionPlatformType value) {
        this._platformType = value;
    }
    /**
     * Sets the templateType property value. This enum indicates the Template type for which the enrollment notification applies.
     * @param value Value to set for the templateType property.
     * @return a void
     */
    public void setTemplateType(@javax.annotation.Nullable final EnrollmentNotificationTemplateType value) {
        this._templateType = value;
    }
}
