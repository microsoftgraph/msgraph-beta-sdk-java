package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for the deployment state of a WindowsDefenderApplicationControl supplemental policy for a device. */
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus extends Entity implements Parsable {
    /** Enum values for the various WindowsDefenderApplicationControl supplemental policy deployment statuses. */
    private WindowsDefenderApplicationControlSupplementalPolicyStatuses _deploymentStatus;
    /** Device ID. */
    private String _deviceId;
    /** Device name. */
    private String _deviceName;
    /** Last sync date time. */
    private OffsetDateTime _lastSyncDateTime;
    /** Windows OS Version Description. */
    private String _osDescription;
    /** Windows OS Version. */
    private String _osVersion;
    /** The navigation link to the WindowsDefenderApplicationControl supplemental policy. */
    private WindowsDefenderApplicationControlSupplementalPolicy _policy;
    /** Human readable version of the WindowsDefenderApplicationControl supplemental policy. */
    private String _policyVersion;
    /** The name of the user of this device. */
    private String _userName;
    /** User Principal Name. */
    private String _userPrincipalName;
    /**
     * Instantiates a new windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus() {
        super();
        this.setOdataType("#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus();
    }
    /**
     * Gets the deploymentStatus property value. Enum values for the various WindowsDefenderApplicationControl supplemental policy deployment statuses.
     * @return a windowsDefenderApplicationControlSupplementalPolicyStatuses
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyStatuses getDeploymentStatus() {
        return this._deploymentStatus;
    }
    /**
     * Gets the deviceId property value. Device ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("deploymentStatus", (n) -> { currentObject.setDeploymentStatus(n.getEnumValue(WindowsDefenderApplicationControlSupplementalPolicyStatuses.class)); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("osDescription", (n) -> { currentObject.setOsDescription(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("policy", (n) -> { currentObject.setPolicy(n.getObjectValue(WindowsDefenderApplicationControlSupplementalPolicy::createFromDiscriminatorValue)); });
            this.put("policyVersion", (n) -> { currentObject.setPolicyVersion(n.getStringValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the osDescription property value. Windows OS Version Description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this._osDescription;
    }
    /**
     * Gets the osVersion property value. Windows OS Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the policy property value. The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     * @return a windowsDefenderApplicationControlSupplementalPolicy
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicy getPolicy() {
        return this._policy;
    }
    /**
     * Gets the policyVersion property value. Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyVersion() {
        return this._policyVersion;
    }
    /**
     * Gets the userName property value. The name of the user of this device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
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
        writer.writeEnumValue("deploymentStatus", this.getDeploymentStatus());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("osDescription", this.getOsDescription());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeStringValue("policyVersion", this.getPolicyVersion());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the deploymentStatus property value. Enum values for the various WindowsDefenderApplicationControl supplemental policy deployment statuses.
     * @param value Value to set for the deploymentStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentStatus(@javax.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicyStatuses value) {
        this._deploymentStatus = value;
    }
    /**
     * Sets the deviceId property value. Device ID.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync date time.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the osDescription property value. Windows OS Version Description.
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this._osDescription = value;
    }
    /**
     * Sets the osVersion property value. Windows OS Version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the policy property value. The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the policy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicy(@javax.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicy value) {
        this._policy = value;
    }
    /**
     * Sets the policyVersion property value. Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the policyVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyVersion(@javax.annotation.Nullable final String value) {
        this._policyVersion = value;
    }
    /**
     * Sets the userName property value. The name of the user of this device.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
