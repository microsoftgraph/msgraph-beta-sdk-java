package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationProfile extends Entity implements Parsable {
    /**
     * Instantiates a new EducationSynchronizationProfile and sets the default values.
     */
    public EducationSynchronizationProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSynchronizationProfile
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationProfile();
    }
    /**
     * Gets the dataProvider property value. The dataProvider property
     * @return a EducationSynchronizationDataProvider
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationDataProvider getDataProvider() {
        return this.BackingStore.get("dataProvider");
    }
    /**
     * Gets the displayName property value. Name of the configuration profile for syncing identities.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the errors property value. All errors associated with this synchronization profile.
     * @return a java.util.List<EducationSynchronizationError>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSynchronizationError> getErrors() {
        return this.BackingStore.get("errors");
    }
    /**
     * Gets the expirationDate property value. The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional)
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this.BackingStore.get("expirationDate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataProvider", (n) -> { this.setDataProvider(n.getObjectValue(EducationSynchronizationDataProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(EducationSynchronizationError::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getLocalDateValue()); });
        deserializerMap.put("handleSpecialCharacterConstraint", (n) -> { this.setHandleSpecialCharacterConstraint(n.getBooleanValue()); });
        deserializerMap.put("identitySynchronizationConfiguration", (n) -> { this.setIdentitySynchronizationConfiguration(n.getObjectValue(EducationIdentitySynchronizationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("licensesToAssign", (n) -> { this.setLicensesToAssign(n.getCollectionOfObjectValues(EducationSynchronizationLicenseAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("profileStatus", (n) -> { this.setProfileStatus(n.getObjectValue(EducationSynchronizationProfileStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(EducationSynchronizationProfileState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the handleSpecialCharacterConstraint property value. Determines if School Data Sync should automatically replace unsupported special characters while syncing from source.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHandleSpecialCharacterConstraint() {
        return this.BackingStore.get("handleSpecialCharacterConstraint");
    }
    /**
     * Gets the identitySynchronizationConfiguration property value. The identitySynchronizationConfiguration property
     * @return a EducationIdentitySynchronizationConfiguration
     */
    @jakarta.annotation.Nullable
    public EducationIdentitySynchronizationConfiguration getIdentitySynchronizationConfiguration() {
        return this.BackingStore.get("identitySynchronizationConfiguration");
    }
    /**
     * Gets the licensesToAssign property value. License setup configuration.
     * @return a java.util.List<EducationSynchronizationLicenseAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSynchronizationLicenseAssignment> getLicensesToAssign() {
        return this.BackingStore.get("licensesToAssign");
    }
    /**
     * Gets the profileStatus property value. The synchronization status.
     * @return a EducationSynchronizationProfileStatus
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationProfileStatus getProfileStatus() {
        return this.BackingStore.get("profileStatus");
    }
    /**
     * Gets the state property value. The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     * @return a EducationSynchronizationProfileState
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationProfileState getState() {
        return this.BackingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("dataProvider", this.getDataProvider());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeLocalDateValue("expirationDate", this.getExpirationDate());
        writer.writeBooleanValue("handleSpecialCharacterConstraint", this.getHandleSpecialCharacterConstraint());
        writer.writeObjectValue("identitySynchronizationConfiguration", this.getIdentitySynchronizationConfiguration());
        writer.writeCollectionOfObjectValues("licensesToAssign", this.getLicensesToAssign());
        writer.writeObjectValue("profileStatus", this.getProfileStatus());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the dataProvider property value. The dataProvider property
     * @param value Value to set for the dataProvider property.
     */
    public void setDataProvider(@jakarta.annotation.Nullable final EducationSynchronizationDataProvider value) {
        this.BackingStore.set("dataProvider", value);
    }
    /**
     * Sets the displayName property value. Name of the configuration profile for syncing identities.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the errors property value. All errors associated with this synchronization profile.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<EducationSynchronizationError> value) {
        this.BackingStore.set("errors", value);
    }
    /**
     * Sets the expirationDate property value. The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional)
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("expirationDate", value);
    }
    /**
     * Sets the handleSpecialCharacterConstraint property value. Determines if School Data Sync should automatically replace unsupported special characters while syncing from source.
     * @param value Value to set for the handleSpecialCharacterConstraint property.
     */
    public void setHandleSpecialCharacterConstraint(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("handleSpecialCharacterConstraint", value);
    }
    /**
     * Sets the identitySynchronizationConfiguration property value. The identitySynchronizationConfiguration property
     * @param value Value to set for the identitySynchronizationConfiguration property.
     */
    public void setIdentitySynchronizationConfiguration(@jakarta.annotation.Nullable final EducationIdentitySynchronizationConfiguration value) {
        this.BackingStore.set("identitySynchronizationConfiguration", value);
    }
    /**
     * Sets the licensesToAssign property value. License setup configuration.
     * @param value Value to set for the licensesToAssign property.
     */
    public void setLicensesToAssign(@jakarta.annotation.Nullable final java.util.List<EducationSynchronizationLicenseAssignment> value) {
        this.BackingStore.set("licensesToAssign", value);
    }
    /**
     * Sets the profileStatus property value. The synchronization status.
     * @param value Value to set for the profileStatus property.
     */
    public void setProfileStatus(@jakarta.annotation.Nullable final EducationSynchronizationProfileStatus value) {
        this.BackingStore.set("profileStatus", value);
    }
    /**
     * Sets the state property value. The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final EducationSynchronizationProfileState value) {
        this.BackingStore.set("state", value);
    }
}
