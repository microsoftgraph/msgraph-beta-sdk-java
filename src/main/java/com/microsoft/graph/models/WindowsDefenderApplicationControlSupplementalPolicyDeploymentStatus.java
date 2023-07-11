package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the deployment state of a WindowsDefenderApplicationControl supplemental policy for a device.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus extends Entity implements Parsable {
    /**
     * Enum values for the various WindowsDefenderApplicationControl supplemental policy deployment statuses.
     */
    private WindowsDefenderApplicationControlSupplementalPolicyStatuses deploymentStatus;
    /**
     * Device ID.
     */
    private String deviceId;
    /**
     * Device name.
     */
    private String deviceName;
    /**
     * Last sync date time.
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * Windows OS Version Description.
     */
    private String osDescription;
    /**
     * Windows OS Version.
     */
    private String osVersion;
    /**
     * The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     */
    private WindowsDefenderApplicationControlSupplementalPolicy policy;
    /**
     * Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     */
    private String policyVersion;
    /**
     * The name of the user of this device.
     */
    private String userName;
    /**
     * User Principal Name.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus() {
        super();
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
        return this.deploymentStatus;
    }
    /**
     * Gets the deviceId property value. Device ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deploymentStatus", (n) -> { this.setDeploymentStatus(n.getEnumValue(WindowsDefenderApplicationControlSupplementalPolicyStatuses.class)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("osDescription", (n) -> { this.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(WindowsDefenderApplicationControlSupplementalPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("policyVersion", (n) -> { this.setPolicyVersion(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the osDescription property value. Windows OS Version Description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this.osDescription;
    }
    /**
     * Gets the osVersion property value. Windows OS Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the policy property value. The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     * @return a windowsDefenderApplicationControlSupplementalPolicy
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicy getPolicy() {
        return this.policy;
    }
    /**
     * Gets the policyVersion property value. Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyVersion() {
        return this.policyVersion;
    }
    /**
     * Gets the userName property value. The name of the user of this device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
        this.deploymentStatus = value;
    }
    /**
     * Sets the deviceId property value. Device ID.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync date time.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the osDescription property value. Windows OS Version Description.
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this.osDescription = value;
    }
    /**
     * Sets the osVersion property value. Windows OS Version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the policy property value. The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the policy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicy(@javax.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicy value) {
        this.policy = value;
    }
    /**
     * Sets the policyVersion property value. Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the policyVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyVersion(@javax.annotation.Nullable final String value) {
        this.policyVersion = value;
    }
    /**
     * Sets the userName property value. The name of the user of this device.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
