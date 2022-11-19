package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** You purchase multiple licenses for iOS apps through the Apple Volume Purchase Program for Business or Education. This involves setting up an Apple VPP account from the Apple website and uploading the Apple VPP Business or Education token to Intune. You can then synchronize your volume purchase information with Intune and track your volume-purchased app use. You can upload multiple Apple VPP Business or Education tokens. */
public class VppToken extends Entity implements Parsable {
    /** The apple Id associated with the given Apple Volume Purchase Program Token. */
    private String _appleId;
    /** Whether or not apps for the VPP token will be automatically updated. */
    private Boolean _automaticallyUpdateApps;
    /** Admin consent to allow claiming token management from external MDM. */
    private Boolean _claimTokenManagementFromExternalMdm;
    /** Whether or not apps for the VPP token will be automatically updated. */
    private String _countryOrRegion;
    /** Consent granted for data sharing with the Apple Volume Purchase Program. */
    private Boolean _dataSharingConsentGranted;
    /** An admin specified token friendly name. */
    private String _displayName;
    /** The expiration date time of the Apple Volume Purchase Program Token. */
    private OffsetDateTime _expirationDateTime;
    /** Last modification date time associated with the Apple Volume Purchase Program Token. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token. */
    private OffsetDateTime _lastSyncDateTime;
    /** Possible sync statuses associated with an Apple Volume Purchase Program token. */
    private VppTokenSyncStatus _lastSyncStatus;
    /** Token location returned from Apple VPP. */
    private String _locationName;
    /** The organization associated with the Apple Volume Purchase Program Token */
    private String _organizationName;
    /** Role Scope Tags IDs assigned to this entity. */
    private java.util.List<String> _roleScopeTagIds;
    /** Possible states associated with an Apple Volume Purchase Program token. */
    private VppTokenState _state;
    /** The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program. */
    private String _token;
    /** The collection of statuses of the actions performed on the Apple Volume Purchase Program Token. */
    private java.util.List<VppTokenActionResult> _tokenActionResults;
    /** Possible types of an Apple Volume Purchase Program token. */
    private VppTokenAccountType _vppTokenAccountType;
    /**
     * Instantiates a new vppToken and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VppToken() {
        super();
        this.setOdataType("#microsoft.graph.vppToken");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vppToken
     */
    @javax.annotation.Nonnull
    public static VppToken createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppToken();
    }
    /**
     * Gets the appleId property value. The apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppleId() {
        return this._appleId;
    }
    /**
     * Gets the automaticallyUpdateApps property value. Whether or not apps for the VPP token will be automatically updated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutomaticallyUpdateApps() {
        return this._automaticallyUpdateApps;
    }
    /**
     * Gets the claimTokenManagementFromExternalMdm property value. Admin consent to allow claiming token management from external MDM.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClaimTokenManagementFromExternalMdm() {
        return this._claimTokenManagementFromExternalMdm;
    }
    /**
     * Gets the countryOrRegion property value. Whether or not apps for the VPP token will be automatically updated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegion() {
        return this._countryOrRegion;
    }
    /**
     * Gets the dataSharingConsentGranted property value. Consent granted for data sharing with the Apple Volume Purchase Program.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataSharingConsentGranted() {
        return this._dataSharingConsentGranted;
    }
    /**
     * Gets the displayName property value. An admin specified token friendly name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the expirationDateTime property value. The expiration date time of the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VppToken currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleId", (n) -> { currentObject.setAppleId(n.getStringValue()); });
        deserializerMap.put("automaticallyUpdateApps", (n) -> { currentObject.setAutomaticallyUpdateApps(n.getBooleanValue()); });
        deserializerMap.put("claimTokenManagementFromExternalMdm", (n) -> { currentObject.setClaimTokenManagementFromExternalMdm(n.getBooleanValue()); });
        deserializerMap.put("countryOrRegion", (n) -> { currentObject.setCountryOrRegion(n.getStringValue()); });
        deserializerMap.put("dataSharingConsentGranted", (n) -> { currentObject.setDataSharingConsentGranted(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncStatus", (n) -> { currentObject.setLastSyncStatus(n.getEnumValue(VppTokenSyncStatus.class)); });
        deserializerMap.put("locationName", (n) -> { currentObject.setLocationName(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { currentObject.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("state", (n) -> { currentObject.setState(n.getEnumValue(VppTokenState.class)); });
        deserializerMap.put("token", (n) -> { currentObject.setToken(n.getStringValue()); });
        deserializerMap.put("tokenActionResults", (n) -> { currentObject.setTokenActionResults(n.getCollectionOfObjectValues(VppTokenActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("vppTokenAccountType", (n) -> { currentObject.setVppTokenAccountType(n.getEnumValue(VppTokenAccountType.class)); });
        return deserializerMap
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification date time associated with the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the lastSyncStatus property value. Possible sync statuses associated with an Apple Volume Purchase Program token.
     * @return a vppTokenSyncStatus
     */
    @javax.annotation.Nullable
    public VppTokenSyncStatus getLastSyncStatus() {
        return this._lastSyncStatus;
    }
    /**
     * Gets the locationName property value. Token location returned from Apple VPP.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocationName() {
        return this._locationName;
    }
    /**
     * Gets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationName() {
        return this._organizationName;
    }
    /**
     * Gets the roleScopeTagIds property value. Role Scope Tags IDs assigned to this entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the state property value. Possible states associated with an Apple Volume Purchase Program token.
     * @return a vppTokenState
     */
    @javax.annotation.Nullable
    public VppTokenState getState() {
        return this._state;
    }
    /**
     * Gets the token property value. The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getToken() {
        return this._token;
    }
    /**
     * Gets the tokenActionResults property value. The collection of statuses of the actions performed on the Apple Volume Purchase Program Token.
     * @return a vppTokenActionResult
     */
    @javax.annotation.Nullable
    public java.util.List<VppTokenActionResult> getTokenActionResults() {
        return this._tokenActionResults;
    }
    /**
     * Gets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @return a vppTokenAccountType
     */
    @javax.annotation.Nullable
    public VppTokenAccountType getVppTokenAccountType() {
        return this._vppTokenAccountType;
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
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeBooleanValue("automaticallyUpdateApps", this.getAutomaticallyUpdateApps());
        writer.writeBooleanValue("claimTokenManagementFromExternalMdm", this.getClaimTokenManagementFromExternalMdm());
        writer.writeStringValue("countryOrRegion", this.getCountryOrRegion());
        writer.writeBooleanValue("dataSharingConsentGranted", this.getDataSharingConsentGranted());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeEnumValue("lastSyncStatus", this.getLastSyncStatus());
        writer.writeStringValue("locationName", this.getLocationName());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("token", this.getToken());
        writer.writeCollectionOfObjectValues("tokenActionResults", this.getTokenActionResults());
        writer.writeEnumValue("vppTokenAccountType", this.getVppTokenAccountType());
    }
    /**
     * Sets the appleId property value. The apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the appleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleId(@javax.annotation.Nullable final String value) {
        this._appleId = value;
    }
    /**
     * Sets the automaticallyUpdateApps property value. Whether or not apps for the VPP token will be automatically updated.
     * @param value Value to set for the automaticallyUpdateApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticallyUpdateApps(@javax.annotation.Nullable final Boolean value) {
        this._automaticallyUpdateApps = value;
    }
    /**
     * Sets the claimTokenManagementFromExternalMdm property value. Admin consent to allow claiming token management from external MDM.
     * @param value Value to set for the claimTokenManagementFromExternalMdm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClaimTokenManagementFromExternalMdm(@javax.annotation.Nullable final Boolean value) {
        this._claimTokenManagementFromExternalMdm = value;
    }
    /**
     * Sets the countryOrRegion property value. Whether or not apps for the VPP token will be automatically updated.
     * @param value Value to set for the countryOrRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryOrRegion(@javax.annotation.Nullable final String value) {
        this._countryOrRegion = value;
    }
    /**
     * Sets the dataSharingConsentGranted property value. Consent granted for data sharing with the Apple Volume Purchase Program.
     * @param value Value to set for the dataSharingConsentGranted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSharingConsentGranted(@javax.annotation.Nullable final Boolean value) {
        this._dataSharingConsentGranted = value;
    }
    /**
     * Sets the displayName property value. An admin specified token friendly name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date time of the Apple Volume Purchase Program Token.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification date time associated with the Apple Volume Purchase Program Token.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the lastSyncStatus property value. Possible sync statuses associated with an Apple Volume Purchase Program token.
     * @param value Value to set for the lastSyncStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncStatus(@javax.annotation.Nullable final VppTokenSyncStatus value) {
        this._lastSyncStatus = value;
    }
    /**
     * Sets the locationName property value. Token location returned from Apple VPP.
     * @param value Value to set for the locationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationName(@javax.annotation.Nullable final String value) {
        this._locationName = value;
    }
    /**
     * Sets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @param value Value to set for the organizationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationName(@javax.annotation.Nullable final String value) {
        this._organizationName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. Role Scope Tags IDs assigned to this entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the state property value. Possible states associated with an Apple Volume Purchase Program token.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final VppTokenState value) {
        this._state = value;
    }
    /**
     * Sets the token property value. The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     * @param value Value to set for the token property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToken(@javax.annotation.Nullable final String value) {
        this._token = value;
    }
    /**
     * Sets the tokenActionResults property value. The collection of statuses of the actions performed on the Apple Volume Purchase Program Token.
     * @param value Value to set for the tokenActionResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenActionResults(@javax.annotation.Nullable final java.util.List<VppTokenActionResult> value) {
        this._tokenActionResults = value;
    }
    /**
     * Sets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @param value Value to set for the vppTokenAccountType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVppTokenAccountType(@javax.annotation.Nullable final VppTokenAccountType value) {
        this._vppTokenAccountType = value;
    }
}
