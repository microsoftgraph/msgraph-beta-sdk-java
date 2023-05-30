package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents a Chromebook tenant settings
 */
public class ChromeOSOnboardingSettings extends Entity implements Parsable {
    /** The ChromebookTenant's LastDirectorySyncDateTime */
    private OffsetDateTime lastDirectorySyncDateTime;
    /** The ChromebookTenant's LastModifiedDateTime */
    private OffsetDateTime lastModifiedDateTime;
    /** The onboarding status of the tenant. */
    private OnboardingStatus onboardingStatus;
    /** The ChromebookTenant's OwnerUserPrincipalName */
    private String ownerUserPrincipalName;
    /**
     * Instantiates a new chromeOSOnboardingSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChromeOSOnboardingSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chromeOSOnboardingSettings
     */
    @javax.annotation.Nonnull
    public static ChromeOSOnboardingSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChromeOSOnboardingSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastDirectorySyncDateTime", (n) -> { this.setLastDirectorySyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(OnboardingStatus.class)); });
        deserializerMap.put("ownerUserPrincipalName", (n) -> { this.setOwnerUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastDirectorySyncDateTime property value. The ChromebookTenant's LastDirectorySyncDateTime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastDirectorySyncDateTime() {
        return this.lastDirectorySyncDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. The ChromebookTenant's LastModifiedDateTime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The onboarding status of the tenant.
     * @return a onboardingStatus
     */
    @javax.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the ownerUserPrincipalName property value. The ChromebookTenant's OwnerUserPrincipalName
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this.ownerUserPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastDirectorySyncDateTime", this.getLastDirectorySyncDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeStringValue("ownerUserPrincipalName", this.getOwnerUserPrincipalName());
    }
    /**
     * Sets the lastDirectorySyncDateTime property value. The ChromebookTenant's LastDirectorySyncDateTime
     * @param value Value to set for the lastDirectorySyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastDirectorySyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastDirectorySyncDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The ChromebookTenant's LastModifiedDateTime
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboarding status of the tenant.
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardingStatus(@javax.annotation.Nullable final OnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the ownerUserPrincipalName property value. The ChromebookTenant's OwnerUserPrincipalName
     * @param value Value to set for the ownerUserPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.ownerUserPrincipalName = value;
    }
}
