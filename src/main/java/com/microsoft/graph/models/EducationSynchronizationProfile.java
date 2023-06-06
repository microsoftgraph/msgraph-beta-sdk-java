package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationProfile extends Entity implements Parsable {
    /** The dataProvider property */
    private EducationSynchronizationDataProvider dataProvider;
    /** Name of the configuration profile for syncing identities. */
    private String displayName;
    /** All errors associated with this synchronization profile. */
    private java.util.List<EducationSynchronizationError> errors;
    /** The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional) */
    private LocalDate expirationDate;
    /** Determines if School Data Sync should automatically replace unsupported special characters while syncing from source. */
    private Boolean handleSpecialCharacterConstraint;
    /** The identitySynchronizationConfiguration property */
    private EducationIdentitySynchronizationConfiguration identitySynchronizationConfiguration;
    /** License setup configuration. */
    private java.util.List<EducationSynchronizationLicenseAssignment> licensesToAssign;
    /** The synchronization status. */
    private EducationSynchronizationProfileStatus profileStatus;
    /** The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed. */
    private EducationSynchronizationProfileState state;
    /**
     * Instantiates a new EducationSynchronizationProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationSynchronizationProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSynchronizationProfile
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationProfile();
    }
    /**
     * Gets the dataProvider property value. The dataProvider property
     * @return a educationSynchronizationDataProvider
     */
    @javax.annotation.Nullable
    public EducationSynchronizationDataProvider getDataProvider() {
        return this.dataProvider;
    }
    /**
     * Gets the displayName property value. Name of the configuration profile for syncing identities.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the errors property value. All errors associated with this synchronization profile.
     * @return a educationSynchronizationError
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSynchronizationError> getErrors() {
        return this.errors;
    }
    /**
     * Gets the expirationDate property value. The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional)
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHandleSpecialCharacterConstraint() {
        return this.handleSpecialCharacterConstraint;
    }
    /**
     * Gets the identitySynchronizationConfiguration property value. The identitySynchronizationConfiguration property
     * @return a educationIdentitySynchronizationConfiguration
     */
    @javax.annotation.Nullable
    public EducationIdentitySynchronizationConfiguration getIdentitySynchronizationConfiguration() {
        return this.identitySynchronizationConfiguration;
    }
    /**
     * Gets the licensesToAssign property value. License setup configuration.
     * @return a educationSynchronizationLicenseAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSynchronizationLicenseAssignment> getLicensesToAssign() {
        return this.licensesToAssign;
    }
    /**
     * Gets the profileStatus property value. The synchronization status.
     * @return a educationSynchronizationProfileStatus
     */
    @javax.annotation.Nullable
    public EducationSynchronizationProfileStatus getProfileStatus() {
        return this.profileStatus;
    }
    /**
     * Gets the state property value. The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     * @return a educationSynchronizationProfileState
     */
    @javax.annotation.Nullable
    public EducationSynchronizationProfileState getState() {
        return this.state;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataProvider(@javax.annotation.Nullable final EducationSynchronizationDataProvider value) {
        this.dataProvider = value;
    }
    /**
     * Sets the displayName property value. Name of the configuration profile for syncing identities.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the errors property value. All errors associated with this synchronization profile.
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<EducationSynchronizationError> value) {
        this.errors = value;
    }
    /**
     * Sets the expirationDate property value. The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional)
     * @param value Value to set for the expirationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDate(@javax.annotation.Nullable final LocalDate value) {
        this.expirationDate = value;
    }
    /**
     * Sets the handleSpecialCharacterConstraint property value. Determines if School Data Sync should automatically replace unsupported special characters while syncing from source.
     * @param value Value to set for the handleSpecialCharacterConstraint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHandleSpecialCharacterConstraint(@javax.annotation.Nullable final Boolean value) {
        this.handleSpecialCharacterConstraint = value;
    }
    /**
     * Sets the identitySynchronizationConfiguration property value. The identitySynchronizationConfiguration property
     * @param value Value to set for the identitySynchronizationConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentitySynchronizationConfiguration(@javax.annotation.Nullable final EducationIdentitySynchronizationConfiguration value) {
        this.identitySynchronizationConfiguration = value;
    }
    /**
     * Sets the licensesToAssign property value. License setup configuration.
     * @param value Value to set for the licensesToAssign property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicensesToAssign(@javax.annotation.Nullable final java.util.List<EducationSynchronizationLicenseAssignment> value) {
        this.licensesToAssign = value;
    }
    /**
     * Sets the profileStatus property value. The synchronization status.
     * @param value Value to set for the profileStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileStatus(@javax.annotation.Nullable final EducationSynchronizationProfileStatus value) {
        this.profileStatus = value;
    }
    /**
     * Sets the state property value. The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final EducationSynchronizationProfileState value) {
        this.state = value;
    }
}
