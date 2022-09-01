package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationProfile extends Entity implements Parsable {
    /** The dataProvider property */
    private EducationSynchronizationDataProvider _dataProvider;
    /** Name of the configuration profile for syncing identities. */
    private String _displayName;
    /** All errors associated with this synchronization profile. */
    private java.util.List<EducationSynchronizationError> _errors;
    /** The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional) */
    private LocalDate _expirationDate;
    /** Determines if School Data Sync should automatically replace unsupported special characters while syncing from source. */
    private Boolean _handleSpecialCharacterConstraint;
    /** The identitySynchronizationConfiguration property */
    private EducationIdentitySynchronizationConfiguration _identitySynchronizationConfiguration;
    /** License setup configuration. */
    private java.util.List<EducationSynchronizationLicenseAssignment> _licensesToAssign;
    /** The synchronization status. */
    private EducationSynchronizationProfileStatus _profileStatus;
    /** The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed. */
    private EducationSynchronizationProfileState _state;
    /**
     * Instantiates a new EducationSynchronizationProfile and sets the default values.
     * @return a void
     */
    public EducationSynchronizationProfile() {
        super();
        this.setOdataType("#microsoft.graph.educationSynchronizationProfile");
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
        return this._dataProvider;
    }
    /**
     * Gets the displayName property value. Name of the configuration profile for syncing identities.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the errors property value. All errors associated with this synchronization profile.
     * @return a educationSynchronizationError
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSynchronizationError> getErrors() {
        return this._errors;
    }
    /**
     * Gets the expirationDate property value. The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional)
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this._expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("dataProvider", (n) -> { currentObject.setDataProvider(n.getObjectValue(EducationSynchronizationDataProvider::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("errors", (n) -> { currentObject.setErrors(n.getCollectionOfObjectValues(EducationSynchronizationError::createFromDiscriminatorValue)); });
            this.put("expirationDate", (n) -> { currentObject.setExpirationDate(n.getLocalDateValue()); });
            this.put("handleSpecialCharacterConstraint", (n) -> { currentObject.setHandleSpecialCharacterConstraint(n.getBooleanValue()); });
            this.put("identitySynchronizationConfiguration", (n) -> { currentObject.setIdentitySynchronizationConfiguration(n.getObjectValue(EducationIdentitySynchronizationConfiguration::createFromDiscriminatorValue)); });
            this.put("licensesToAssign", (n) -> { currentObject.setLicensesToAssign(n.getCollectionOfObjectValues(EducationSynchronizationLicenseAssignment::createFromDiscriminatorValue)); });
            this.put("profileStatus", (n) -> { currentObject.setProfileStatus(n.getObjectValue(EducationSynchronizationProfileStatus::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(EducationSynchronizationProfileState.class)); });
        }};
    }
    /**
     * Gets the handleSpecialCharacterConstraint property value. Determines if School Data Sync should automatically replace unsupported special characters while syncing from source.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHandleSpecialCharacterConstraint() {
        return this._handleSpecialCharacterConstraint;
    }
    /**
     * Gets the identitySynchronizationConfiguration property value. The identitySynchronizationConfiguration property
     * @return a educationIdentitySynchronizationConfiguration
     */
    @javax.annotation.Nullable
    public EducationIdentitySynchronizationConfiguration getIdentitySynchronizationConfiguration() {
        return this._identitySynchronizationConfiguration;
    }
    /**
     * Gets the licensesToAssign property value. License setup configuration.
     * @return a educationSynchronizationLicenseAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSynchronizationLicenseAssignment> getLicensesToAssign() {
        return this._licensesToAssign;
    }
    /**
     * Gets the profileStatus property value. The synchronization status.
     * @return a educationSynchronizationProfileStatus
     */
    @javax.annotation.Nullable
    public EducationSynchronizationProfileStatus getProfileStatus() {
        return this._profileStatus;
    }
    /**
     * Gets the state property value. The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     * @return a educationSynchronizationProfileState
     */
    @javax.annotation.Nullable
    public EducationSynchronizationProfileState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDataProvider(@javax.annotation.Nullable final EducationSynchronizationDataProvider value) {
        this._dataProvider = value;
    }
    /**
     * Sets the displayName property value. Name of the configuration profile for syncing identities.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the errors property value. All errors associated with this synchronization profile.
     * @param value Value to set for the errors property.
     * @return a void
     */
    public void setErrors(@javax.annotation.Nullable final java.util.List<EducationSynchronizationError> value) {
        this._errors = value;
    }
    /**
     * Sets the expirationDate property value. The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional)
     * @param value Value to set for the expirationDate property.
     * @return a void
     */
    public void setExpirationDate(@javax.annotation.Nullable final LocalDate value) {
        this._expirationDate = value;
    }
    /**
     * Sets the handleSpecialCharacterConstraint property value. Determines if School Data Sync should automatically replace unsupported special characters while syncing from source.
     * @param value Value to set for the handleSpecialCharacterConstraint property.
     * @return a void
     */
    public void setHandleSpecialCharacterConstraint(@javax.annotation.Nullable final Boolean value) {
        this._handleSpecialCharacterConstraint = value;
    }
    /**
     * Sets the identitySynchronizationConfiguration property value. The identitySynchronizationConfiguration property
     * @param value Value to set for the identitySynchronizationConfiguration property.
     * @return a void
     */
    public void setIdentitySynchronizationConfiguration(@javax.annotation.Nullable final EducationIdentitySynchronizationConfiguration value) {
        this._identitySynchronizationConfiguration = value;
    }
    /**
     * Sets the licensesToAssign property value. License setup configuration.
     * @param value Value to set for the licensesToAssign property.
     * @return a void
     */
    public void setLicensesToAssign(@javax.annotation.Nullable final java.util.List<EducationSynchronizationLicenseAssignment> value) {
        this._licensesToAssign = value;
    }
    /**
     * Sets the profileStatus property value. The synchronization status.
     * @param value Value to set for the profileStatus property.
     * @return a void
     */
    public void setProfileStatus(@javax.annotation.Nullable final EducationSynchronizationProfileStatus value) {
        this._profileStatus = value;
    }
    /**
     * Sets the state property value. The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final EducationSynchronizationProfileState value) {
        this._state = value;
    }
}
