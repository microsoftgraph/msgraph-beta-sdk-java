package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesDirectorySynchronizationFeature implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The blockCloudObjectTakeoverThroughHardMatchEnabled property */
    private Boolean _blockCloudObjectTakeoverThroughHardMatchEnabled;
    /** The blockSoftMatchEnabled property */
    private Boolean _blockSoftMatchEnabled;
    /** The bypassDirSyncOverridesEnabled property */
    private Boolean _bypassDirSyncOverridesEnabled;
    /** The cloudPasswordPolicyForPasswordSyncedUsersEnabled property */
    private Boolean _cloudPasswordPolicyForPasswordSyncedUsersEnabled;
    /** The concurrentCredentialUpdateEnabled property */
    private Boolean _concurrentCredentialUpdateEnabled;
    /** The concurrentOrgIdProvisioningEnabled property */
    private Boolean _concurrentOrgIdProvisioningEnabled;
    /** The deviceWritebackEnabled property */
    private Boolean _deviceWritebackEnabled;
    /** The directoryExtensionsEnabled property */
    private Boolean _directoryExtensionsEnabled;
    /** The fopeConflictResolutionEnabled property */
    private Boolean _fopeConflictResolutionEnabled;
    /** The groupWriteBackEnabled property */
    private Boolean _groupWriteBackEnabled;
    /** The OdataType property */
    private String _odataType;
    /** The passwordSyncEnabled property */
    private Boolean _passwordSyncEnabled;
    /** The passwordWritebackEnabled property */
    private Boolean _passwordWritebackEnabled;
    /** The quarantineUponProxyAddressesConflictEnabled property */
    private Boolean _quarantineUponProxyAddressesConflictEnabled;
    /** The quarantineUponUpnConflictEnabled property */
    private Boolean _quarantineUponUpnConflictEnabled;
    /** The softMatchOnUpnEnabled property */
    private Boolean _softMatchOnUpnEnabled;
    /** The synchronizeUpnForManagedUsersEnabled property */
    private Boolean _synchronizeUpnForManagedUsersEnabled;
    /** The unifiedGroupWritebackEnabled property */
    private Boolean _unifiedGroupWritebackEnabled;
    /** The userForcePasswordChangeOnLogonEnabled property */
    private Boolean _userForcePasswordChangeOnLogonEnabled;
    /** The userWritebackEnabled property */
    private Boolean _userWritebackEnabled;
    /**
     * Instantiates a new onPremisesDirectorySynchronizationFeature and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronizationFeature() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.onPremisesDirectorySynchronizationFeature");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesDirectorySynchronizationFeature
     */
    @javax.annotation.Nonnull
    public static OnPremisesDirectorySynchronizationFeature createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronizationFeature();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the blockCloudObjectTakeoverThroughHardMatchEnabled property value. The blockCloudObjectTakeoverThroughHardMatchEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockCloudObjectTakeoverThroughHardMatchEnabled() {
        return this._blockCloudObjectTakeoverThroughHardMatchEnabled;
    }
    /**
     * Gets the blockSoftMatchEnabled property value. The blockSoftMatchEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockSoftMatchEnabled() {
        return this._blockSoftMatchEnabled;
    }
    /**
     * Gets the bypassDirSyncOverridesEnabled property value. The bypassDirSyncOverridesEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBypassDirSyncOverridesEnabled() {
        return this._bypassDirSyncOverridesEnabled;
    }
    /**
     * Gets the cloudPasswordPolicyForPasswordSyncedUsersEnabled property value. The cloudPasswordPolicyForPasswordSyncedUsersEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCloudPasswordPolicyForPasswordSyncedUsersEnabled() {
        return this._cloudPasswordPolicyForPasswordSyncedUsersEnabled;
    }
    /**
     * Gets the concurrentCredentialUpdateEnabled property value. The concurrentCredentialUpdateEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConcurrentCredentialUpdateEnabled() {
        return this._concurrentCredentialUpdateEnabled;
    }
    /**
     * Gets the concurrentOrgIdProvisioningEnabled property value. The concurrentOrgIdProvisioningEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConcurrentOrgIdProvisioningEnabled() {
        return this._concurrentOrgIdProvisioningEnabled;
    }
    /**
     * Gets the deviceWritebackEnabled property value. The deviceWritebackEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceWritebackEnabled() {
        return this._deviceWritebackEnabled;
    }
    /**
     * Gets the directoryExtensionsEnabled property value. The directoryExtensionsEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDirectoryExtensionsEnabled() {
        return this._directoryExtensionsEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesDirectorySynchronizationFeature currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(20);
        deserializerMap.put("blockCloudObjectTakeoverThroughHardMatchEnabled", (n) -> { currentObject.setBlockCloudObjectTakeoverThroughHardMatchEnabled(n.getBooleanValue()); });
        deserializerMap.put("blockSoftMatchEnabled", (n) -> { currentObject.setBlockSoftMatchEnabled(n.getBooleanValue()); });
        deserializerMap.put("bypassDirSyncOverridesEnabled", (n) -> { currentObject.setBypassDirSyncOverridesEnabled(n.getBooleanValue()); });
        deserializerMap.put("cloudPasswordPolicyForPasswordSyncedUsersEnabled", (n) -> { currentObject.setCloudPasswordPolicyForPasswordSyncedUsersEnabled(n.getBooleanValue()); });
        deserializerMap.put("concurrentCredentialUpdateEnabled", (n) -> { currentObject.setConcurrentCredentialUpdateEnabled(n.getBooleanValue()); });
        deserializerMap.put("concurrentOrgIdProvisioningEnabled", (n) -> { currentObject.setConcurrentOrgIdProvisioningEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceWritebackEnabled", (n) -> { currentObject.setDeviceWritebackEnabled(n.getBooleanValue()); });
        deserializerMap.put("directoryExtensionsEnabled", (n) -> { currentObject.setDirectoryExtensionsEnabled(n.getBooleanValue()); });
        deserializerMap.put("fopeConflictResolutionEnabled", (n) -> { currentObject.setFopeConflictResolutionEnabled(n.getBooleanValue()); });
        deserializerMap.put("groupWriteBackEnabled", (n) -> { currentObject.setGroupWriteBackEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("passwordSyncEnabled", (n) -> { currentObject.setPasswordSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("passwordWritebackEnabled", (n) -> { currentObject.setPasswordWritebackEnabled(n.getBooleanValue()); });
        deserializerMap.put("quarantineUponProxyAddressesConflictEnabled", (n) -> { currentObject.setQuarantineUponProxyAddressesConflictEnabled(n.getBooleanValue()); });
        deserializerMap.put("quarantineUponUpnConflictEnabled", (n) -> { currentObject.setQuarantineUponUpnConflictEnabled(n.getBooleanValue()); });
        deserializerMap.put("softMatchOnUpnEnabled", (n) -> { currentObject.setSoftMatchOnUpnEnabled(n.getBooleanValue()); });
        deserializerMap.put("synchronizeUpnForManagedUsersEnabled", (n) -> { currentObject.setSynchronizeUpnForManagedUsersEnabled(n.getBooleanValue()); });
        deserializerMap.put("unifiedGroupWritebackEnabled", (n) -> { currentObject.setUnifiedGroupWritebackEnabled(n.getBooleanValue()); });
        deserializerMap.put("userForcePasswordChangeOnLogonEnabled", (n) -> { currentObject.setUserForcePasswordChangeOnLogonEnabled(n.getBooleanValue()); });
        deserializerMap.put("userWritebackEnabled", (n) -> { currentObject.setUserWritebackEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fopeConflictResolutionEnabled property value. The fopeConflictResolutionEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFopeConflictResolutionEnabled() {
        return this._fopeConflictResolutionEnabled;
    }
    /**
     * Gets the groupWriteBackEnabled property value. The groupWriteBackEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGroupWriteBackEnabled() {
        return this._groupWriteBackEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the passwordSyncEnabled property value. The passwordSyncEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordSyncEnabled() {
        return this._passwordSyncEnabled;
    }
    /**
     * Gets the passwordWritebackEnabled property value. The passwordWritebackEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordWritebackEnabled() {
        return this._passwordWritebackEnabled;
    }
    /**
     * Gets the quarantineUponProxyAddressesConflictEnabled property value. The quarantineUponProxyAddressesConflictEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQuarantineUponProxyAddressesConflictEnabled() {
        return this._quarantineUponProxyAddressesConflictEnabled;
    }
    /**
     * Gets the quarantineUponUpnConflictEnabled property value. The quarantineUponUpnConflictEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQuarantineUponUpnConflictEnabled() {
        return this._quarantineUponUpnConflictEnabled;
    }
    /**
     * Gets the softMatchOnUpnEnabled property value. The softMatchOnUpnEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSoftMatchOnUpnEnabled() {
        return this._softMatchOnUpnEnabled;
    }
    /**
     * Gets the synchronizeUpnForManagedUsersEnabled property value. The synchronizeUpnForManagedUsersEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSynchronizeUpnForManagedUsersEnabled() {
        return this._synchronizeUpnForManagedUsersEnabled;
    }
    /**
     * Gets the unifiedGroupWritebackEnabled property value. The unifiedGroupWritebackEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUnifiedGroupWritebackEnabled() {
        return this._unifiedGroupWritebackEnabled;
    }
    /**
     * Gets the userForcePasswordChangeOnLogonEnabled property value. The userForcePasswordChangeOnLogonEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserForcePasswordChangeOnLogonEnabled() {
        return this._userForcePasswordChangeOnLogonEnabled;
    }
    /**
     * Gets the userWritebackEnabled property value. The userWritebackEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserWritebackEnabled() {
        return this._userWritebackEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockCloudObjectTakeoverThroughHardMatchEnabled", this.getBlockCloudObjectTakeoverThroughHardMatchEnabled());
        writer.writeBooleanValue("blockSoftMatchEnabled", this.getBlockSoftMatchEnabled());
        writer.writeBooleanValue("bypassDirSyncOverridesEnabled", this.getBypassDirSyncOverridesEnabled());
        writer.writeBooleanValue("cloudPasswordPolicyForPasswordSyncedUsersEnabled", this.getCloudPasswordPolicyForPasswordSyncedUsersEnabled());
        writer.writeBooleanValue("concurrentCredentialUpdateEnabled", this.getConcurrentCredentialUpdateEnabled());
        writer.writeBooleanValue("concurrentOrgIdProvisioningEnabled", this.getConcurrentOrgIdProvisioningEnabled());
        writer.writeBooleanValue("deviceWritebackEnabled", this.getDeviceWritebackEnabled());
        writer.writeBooleanValue("directoryExtensionsEnabled", this.getDirectoryExtensionsEnabled());
        writer.writeBooleanValue("fopeConflictResolutionEnabled", this.getFopeConflictResolutionEnabled());
        writer.writeBooleanValue("groupWriteBackEnabled", this.getGroupWriteBackEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("passwordSyncEnabled", this.getPasswordSyncEnabled());
        writer.writeBooleanValue("passwordWritebackEnabled", this.getPasswordWritebackEnabled());
        writer.writeBooleanValue("quarantineUponProxyAddressesConflictEnabled", this.getQuarantineUponProxyAddressesConflictEnabled());
        writer.writeBooleanValue("quarantineUponUpnConflictEnabled", this.getQuarantineUponUpnConflictEnabled());
        writer.writeBooleanValue("softMatchOnUpnEnabled", this.getSoftMatchOnUpnEnabled());
        writer.writeBooleanValue("synchronizeUpnForManagedUsersEnabled", this.getSynchronizeUpnForManagedUsersEnabled());
        writer.writeBooleanValue("unifiedGroupWritebackEnabled", this.getUnifiedGroupWritebackEnabled());
        writer.writeBooleanValue("userForcePasswordChangeOnLogonEnabled", this.getUserForcePasswordChangeOnLogonEnabled());
        writer.writeBooleanValue("userWritebackEnabled", this.getUserWritebackEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the blockCloudObjectTakeoverThroughHardMatchEnabled property value. The blockCloudObjectTakeoverThroughHardMatchEnabled property
     * @param value Value to set for the blockCloudObjectTakeoverThroughHardMatchEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockCloudObjectTakeoverThroughHardMatchEnabled(@javax.annotation.Nullable final Boolean value) {
        this._blockCloudObjectTakeoverThroughHardMatchEnabled = value;
    }
    /**
     * Sets the blockSoftMatchEnabled property value. The blockSoftMatchEnabled property
     * @param value Value to set for the blockSoftMatchEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockSoftMatchEnabled(@javax.annotation.Nullable final Boolean value) {
        this._blockSoftMatchEnabled = value;
    }
    /**
     * Sets the bypassDirSyncOverridesEnabled property value. The bypassDirSyncOverridesEnabled property
     * @param value Value to set for the bypassDirSyncOverridesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBypassDirSyncOverridesEnabled(@javax.annotation.Nullable final Boolean value) {
        this._bypassDirSyncOverridesEnabled = value;
    }
    /**
     * Sets the cloudPasswordPolicyForPasswordSyncedUsersEnabled property value. The cloudPasswordPolicyForPasswordSyncedUsersEnabled property
     * @param value Value to set for the cloudPasswordPolicyForPasswordSyncedUsersEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPasswordPolicyForPasswordSyncedUsersEnabled(@javax.annotation.Nullable final Boolean value) {
        this._cloudPasswordPolicyForPasswordSyncedUsersEnabled = value;
    }
    /**
     * Sets the concurrentCredentialUpdateEnabled property value. The concurrentCredentialUpdateEnabled property
     * @param value Value to set for the concurrentCredentialUpdateEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConcurrentCredentialUpdateEnabled(@javax.annotation.Nullable final Boolean value) {
        this._concurrentCredentialUpdateEnabled = value;
    }
    /**
     * Sets the concurrentOrgIdProvisioningEnabled property value. The concurrentOrgIdProvisioningEnabled property
     * @param value Value to set for the concurrentOrgIdProvisioningEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConcurrentOrgIdProvisioningEnabled(@javax.annotation.Nullable final Boolean value) {
        this._concurrentOrgIdProvisioningEnabled = value;
    }
    /**
     * Sets the deviceWritebackEnabled property value. The deviceWritebackEnabled property
     * @param value Value to set for the deviceWritebackEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceWritebackEnabled(@javax.annotation.Nullable final Boolean value) {
        this._deviceWritebackEnabled = value;
    }
    /**
     * Sets the directoryExtensionsEnabled property value. The directoryExtensionsEnabled property
     * @param value Value to set for the directoryExtensionsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryExtensionsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._directoryExtensionsEnabled = value;
    }
    /**
     * Sets the fopeConflictResolutionEnabled property value. The fopeConflictResolutionEnabled property
     * @param value Value to set for the fopeConflictResolutionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFopeConflictResolutionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._fopeConflictResolutionEnabled = value;
    }
    /**
     * Sets the groupWriteBackEnabled property value. The groupWriteBackEnabled property
     * @param value Value to set for the groupWriteBackEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupWriteBackEnabled(@javax.annotation.Nullable final Boolean value) {
        this._groupWriteBackEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the passwordSyncEnabled property value. The passwordSyncEnabled property
     * @param value Value to set for the passwordSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._passwordSyncEnabled = value;
    }
    /**
     * Sets the passwordWritebackEnabled property value. The passwordWritebackEnabled property
     * @param value Value to set for the passwordWritebackEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordWritebackEnabled(@javax.annotation.Nullable final Boolean value) {
        this._passwordWritebackEnabled = value;
    }
    /**
     * Sets the quarantineUponProxyAddressesConflictEnabled property value. The quarantineUponProxyAddressesConflictEnabled property
     * @param value Value to set for the quarantineUponProxyAddressesConflictEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuarantineUponProxyAddressesConflictEnabled(@javax.annotation.Nullable final Boolean value) {
        this._quarantineUponProxyAddressesConflictEnabled = value;
    }
    /**
     * Sets the quarantineUponUpnConflictEnabled property value. The quarantineUponUpnConflictEnabled property
     * @param value Value to set for the quarantineUponUpnConflictEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuarantineUponUpnConflictEnabled(@javax.annotation.Nullable final Boolean value) {
        this._quarantineUponUpnConflictEnabled = value;
    }
    /**
     * Sets the softMatchOnUpnEnabled property value. The softMatchOnUpnEnabled property
     * @param value Value to set for the softMatchOnUpnEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftMatchOnUpnEnabled(@javax.annotation.Nullable final Boolean value) {
        this._softMatchOnUpnEnabled = value;
    }
    /**
     * Sets the synchronizeUpnForManagedUsersEnabled property value. The synchronizeUpnForManagedUsersEnabled property
     * @param value Value to set for the synchronizeUpnForManagedUsersEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizeUpnForManagedUsersEnabled(@javax.annotation.Nullable final Boolean value) {
        this._synchronizeUpnForManagedUsersEnabled = value;
    }
    /**
     * Sets the unifiedGroupWritebackEnabled property value. The unifiedGroupWritebackEnabled property
     * @param value Value to set for the unifiedGroupWritebackEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnifiedGroupWritebackEnabled(@javax.annotation.Nullable final Boolean value) {
        this._unifiedGroupWritebackEnabled = value;
    }
    /**
     * Sets the userForcePasswordChangeOnLogonEnabled property value. The userForcePasswordChangeOnLogonEnabled property
     * @param value Value to set for the userForcePasswordChangeOnLogonEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserForcePasswordChangeOnLogonEnabled(@javax.annotation.Nullable final Boolean value) {
        this._userForcePasswordChangeOnLogonEnabled = value;
    }
    /**
     * Sets the userWritebackEnabled property value. The userWritebackEnabled property
     * @param value Value to set for the userWritebackEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserWritebackEnabled(@javax.annotation.Nullable final Boolean value) {
        this._userWritebackEnabled = value;
    }
}
