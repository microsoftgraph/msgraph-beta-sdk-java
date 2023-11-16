package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDefenderApplicationControlSupplementalPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsDefenderApplicationControlSupplementalPolicy and sets the default values.
     */
    public WindowsDefenderApplicationControlSupplementalPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDefenderApplicationControlSupplementalPolicy
     */
    @jakarta.annotation.Nonnull
    public static WindowsDefenderApplicationControlSupplementalPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderApplicationControlSupplementalPolicy();
    }
    /**
     * Gets the assignments property value. The associated group assignments for the Windows Defender Application Control Supplemental Policy.
     * @return a java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> getAssignments() {
        return this.BackingStore.get("assignments");
    }
    /**
     * Gets the content property value. Indicates the content of the Windows Defender Application Control Supplemental Policy in byte array format.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.BackingStore.get("content");
    }
    /**
     * Gets the contentFileName property value. Indicates the file name associated with the content of the Windows Defender Application Control Supplemental Policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentFileName() {
        return this.BackingStore.get("contentFileName");
    }
    /**
     * Gets the creationDateTime property value. Indicates the created date and time when the Windows Defender Application Control Supplemental Policy was uploaded.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.BackingStore.get("creationDateTime");
    }
    /**
     * Gets the deploySummary property value. WindowsDefenderApplicationControl supplemental policy deployment summary.
     * @return a WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary
     */
    @jakarta.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary getDeploySummary() {
        return this.BackingStore.get("deploySummary");
    }
    /**
     * Gets the description property value. The description of the Windows Defender Application Control Supplemental Policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the deviceStatuses property value. The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy.
     * @return a java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> getDeviceStatuses() {
        return this.BackingStore.get("deviceStatuses");
    }
    /**
     * Gets the displayName property value. The display name of the Windows Defender Application Control Supplemental Policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(WindowsDefenderApplicationControlSupplementalPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("contentFileName", (n) -> { this.setContentFileName(n.getStringValue()); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploySummary", (n) -> { this.setDeploySummary(n.getObjectValue(WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Indicates the last modified date and time of the Windows Defender Application Control Supplemental Policy.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for the Windows Defender Application Control Supplemental Policy entity.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.BackingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the version property value. Indicates the Windows Defender Application Control Supplemental Policy's version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.BackingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("contentFileName", this.getContentFileName());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeObjectValue("deploySummary", this.getDeploySummary());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The associated group assignments for the Windows Defender Application Control Supplemental Policy.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> value) {
        this.BackingStore.set("assignments", value);
    }
    /**
     * Sets the content property value. Indicates the content of the Windows Defender Application Control Supplemental Policy in byte array format.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("content", value);
    }
    /**
     * Sets the contentFileName property value. Indicates the file name associated with the content of the Windows Defender Application Control Supplemental Policy.
     * @param value Value to set for the contentFileName property.
     */
    public void setContentFileName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contentFileName", value);
    }
    /**
     * Sets the creationDateTime property value. Indicates the created date and time when the Windows Defender Application Control Supplemental Policy was uploaded.
     * @param value Value to set for the creationDateTime property.
     */
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("creationDateTime", value);
    }
    /**
     * Sets the deploySummary property value. WindowsDefenderApplicationControl supplemental policy deployment summary.
     * @param value Value to set for the deploySummary property.
     */
    public void setDeploySummary(@jakarta.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary value) {
        this.BackingStore.set("deploySummary", value);
    }
    /**
     * Sets the description property value. The description of the Windows Defender Application Control Supplemental Policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the deviceStatuses property value. The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the deviceStatuses property.
     */
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> value) {
        this.BackingStore.set("deviceStatuses", value);
    }
    /**
     * Sets the displayName property value. The display name of the Windows Defender Application Control Supplemental Policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Indicates the last modified date and time of the Windows Defender Application Control Supplemental Policy.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for the Windows Defender Application Control Supplemental Policy entity.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the version property value. Indicates the Windows Defender Application Control Supplemental Policy's version.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("version", value);
    }
}
