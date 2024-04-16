package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The listing service profile entity contains the meta data of an Intune configuration profile 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfigurationProfile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceConfigurationProfile} and sets the default values.
     */
    public DeviceConfigurationProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceConfigurationProfile}
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfigurationProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationProfile();
    }
    /**
     * Gets the accountId property value. Account Id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.backingStore.get("accountId");
    }
    /**
     * Gets the configurationTechnologies property value. Configuration Technologies for Settins Catalog Policies
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConfigurationTechnologies() {
        return this.backingStore.get("configurationTechnologies");
    }
    /**
     * Gets the createdDateTime property value. The date and time the object was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("configurationTechnologies", (n) -> { this.setConfigurationTechnologies(n.getIntegerValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PlatformType::forValue)); });
        deserializerMap.put("profileName", (n) -> { this.setProfileName(n.getStringValue()); });
        deserializerMap.put("profileType", (n) -> { this.setProfileType(n.getEnumValue(ProfileType::forValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the platformType property value. Platform Type
     * @return a {@link PlatformType}
     */
    @jakarta.annotation.Nullable
    public PlatformType getPlatformType() {
        return this.backingStore.get("platformType");
    }
    /**
     * Gets the profileName property value. Profile name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileName() {
        return this.backingStore.get("profileName");
    }
    /**
     * Gets the profileType property value. Profile Type
     * @return a {@link ProfileType}
     */
    @jakarta.annotation.Nullable
    public ProfileType getProfileType() {
        return this.backingStore.get("profileType");
    }
    /**
     * Gets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the templateId property value. TemplateId for Settings Catalog Policies
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeIntegerValue("configurationTechnologies", this.getConfigurationTechnologies());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeStringValue("profileName", this.getProfileName());
        writer.writeEnumValue("profileType", this.getProfileType());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the accountId property value. Account Id.
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountId", value);
    }
    /**
     * Sets the configurationTechnologies property value. Configuration Technologies for Settins Catalog Policies
     * @param value Value to set for the configurationTechnologies property.
     */
    public void setConfigurationTechnologies(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("configurationTechnologies", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the platformType property value. Platform Type
     * @param value Value to set for the platformType property.
     */
    public void setPlatformType(@jakarta.annotation.Nullable final PlatformType value) {
        this.backingStore.set("platformType", value);
    }
    /**
     * Sets the profileName property value. Profile name
     * @param value Value to set for the profileName property.
     */
    public void setProfileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileName", value);
    }
    /**
     * Sets the profileType property value. Profile Type
     * @param value Value to set for the profileType property.
     */
    public void setProfileType(@jakarta.annotation.Nullable final ProfileType value) {
        this.backingStore.set("profileType", value);
    }
    /**
     * Sets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the templateId property value. TemplateId for Settings Catalog Policies
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
}
