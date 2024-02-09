package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus} and sets the default values.
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus}
     */
    @jakarta.annotation.Nonnull
    public static WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus();
    }
    /**
     * Gets the deploymentStatus property value. Enum values for the various WindowsDefenderApplicationControl supplemental policy deployment statuses.
     * @return a {@link WindowsDefenderApplicationControlSupplementalPolicyStatuses}
     */
    @jakarta.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyStatuses getDeploymentStatus() {
        return this.backingStore.get("deploymentStatus");
    }
    /**
     * Gets the deviceId property value. Device ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deploymentStatus", (n) -> { this.setDeploymentStatus(n.getEnumValue(WindowsDefenderApplicationControlSupplementalPolicyStatuses::forValue)); });
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
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the osDescription property value. Windows OS Version Description.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsDescription() {
        return this.backingStore.get("osDescription");
    }
    /**
     * Gets the osVersion property value. Windows OS Version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the policy property value. The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     * @return a {@link WindowsDefenderApplicationControlSupplementalPolicy}
     */
    @jakarta.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicy getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Gets the policyVersion property value. Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyVersion() {
        return this.backingStore.get("policyVersion");
    }
    /**
     * Gets the userName property value. The name of the user of this device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDeploymentStatus(@jakarta.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicyStatuses value) {
        this.backingStore.set("deploymentStatus", value);
    }
    /**
     * Sets the deviceId property value. Device ID.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync date time.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the osDescription property value. Windows OS Version Description.
     * @param value Value to set for the osDescription property.
     */
    public void setOsDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osDescription", value);
    }
    /**
     * Sets the osVersion property value. Windows OS Version.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the policy property value. The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicy value) {
        this.backingStore.set("policy", value);
    }
    /**
     * Sets the policyVersion property value. Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the policyVersion property.
     */
    public void setPolicyVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyVersion", value);
    }
    /**
     * Sets the userName property value. The name of the user of this device.
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
