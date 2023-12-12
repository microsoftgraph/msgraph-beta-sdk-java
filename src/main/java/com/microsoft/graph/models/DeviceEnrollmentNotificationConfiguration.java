package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Enrollment Notification Configuration which is used to send notification
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceEnrollmentNotificationConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new DeviceEnrollmentNotificationConfiguration and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static DeviceEnrollmentNotificationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentNotificationConfiguration();
    }
    /**
     * Gets the brandingOptions property value. Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
     * @return a EnumSet<EnrollmentNotificationBrandingOptions>
     */
    @jakarta.annotation.Nullable
    public EnumSet<EnrollmentNotificationBrandingOptions> getBrandingOptions() {
        return this.backingStore.get("brandingOptions");
    }
    /**
     * Gets the defaultLocale property value. DefaultLocale for the Enrollment Notification
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultLocale() {
        return this.backingStore.get("defaultLocale");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("brandingOptions", (n) -> { this.setBrandingOptions(n.getEnumSetValue(EnrollmentNotificationBrandingOptions::forValue)); });
        deserializerMap.put("defaultLocale", (n) -> { this.setDefaultLocale(n.getStringValue()); });
        deserializerMap.put("notificationMessageTemplateId", (n) -> { this.setNotificationMessageTemplateId(n.getUUIDValue()); });
        deserializerMap.put("notificationTemplates", (n) -> { this.setNotificationTemplates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(EnrollmentRestrictionPlatformType::forValue)); });
        deserializerMap.put("templateType", (n) -> { this.setTemplateType(n.getEnumValue(EnrollmentNotificationTemplateType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notificationMessageTemplateId property value. Notification Message Template Id
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getNotificationMessageTemplateId() {
        return this.backingStore.get("notificationMessageTemplateId");
    }
    /**
     * Gets the notificationTemplates property value. The list of notification data -
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotificationTemplates() {
        return this.backingStore.get("notificationTemplates");
    }
    /**
     * Gets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @return a EnrollmentRestrictionPlatformType
     */
    @jakarta.annotation.Nullable
    public EnrollmentRestrictionPlatformType getPlatformType() {
        return this.backingStore.get("platformType");
    }
    /**
     * Gets the templateType property value. This enum indicates the Template type for which the enrollment notification applies.
     * @return a EnrollmentNotificationTemplateType
     */
    @jakarta.annotation.Nullable
    public EnrollmentNotificationTemplateType getTemplateType() {
        return this.backingStore.get("templateType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("brandingOptions", this.getBrandingOptions());
        writer.writeStringValue("defaultLocale", this.getDefaultLocale());
        writer.writeUUIDValue("notificationMessageTemplateId", this.getNotificationMessageTemplateId());
        writer.writeCollectionOfPrimitiveValues("notificationTemplates", this.getNotificationTemplates());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeEnumValue("templateType", this.getTemplateType());
    }
    /**
     * Sets the brandingOptions property value. Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
     * @param value Value to set for the brandingOptions property.
     */
    public void setBrandingOptions(@jakarta.annotation.Nullable final EnumSet<EnrollmentNotificationBrandingOptions> value) {
        this.backingStore.set("brandingOptions", value);
    }
    /**
     * Sets the defaultLocale property value. DefaultLocale for the Enrollment Notification
     * @param value Value to set for the defaultLocale property.
     */
    public void setDefaultLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultLocale", value);
    }
    /**
     * Sets the notificationMessageTemplateId property value. Notification Message Template Id
     * @param value Value to set for the notificationMessageTemplateId property.
     */
    public void setNotificationMessageTemplateId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("notificationMessageTemplateId", value);
    }
    /**
     * Sets the notificationTemplates property value. The list of notification data -
     * @param value Value to set for the notificationTemplates property.
     */
    public void setNotificationTemplates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("notificationTemplates", value);
    }
    /**
     * Sets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @param value Value to set for the platformType property.
     */
    public void setPlatformType(@jakarta.annotation.Nullable final EnrollmentRestrictionPlatformType value) {
        this.backingStore.set("platformType", value);
    }
    /**
     * Sets the templateType property value. This enum indicates the Template type for which the enrollment notification applies.
     * @param value Value to set for the templateType property.
     */
    public void setTemplateType(@jakarta.annotation.Nullable final EnrollmentNotificationTemplateType value) {
        this.backingStore.set("templateType", value);
    }
}
