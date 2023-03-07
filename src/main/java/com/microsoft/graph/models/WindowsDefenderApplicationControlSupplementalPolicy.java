package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDefenderApplicationControlSupplementalPolicy extends Entity implements Parsable {
    /** The associated group assignments for this WindowsDefenderApplicationControl supplemental policy. */
    private java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> assignments;
    /** The WindowsDefenderApplicationControl supplemental policy content in byte array format. */
    private byte[] content;
    /** The WindowsDefenderApplicationControl supplemental policy content's file name. */
    private String contentFileName;
    /** The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded. */
    private OffsetDateTime creationDateTime;
    /** WindowsDefenderApplicationControl supplemental policy deployment summary. */
    private WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary deploySummary;
    /** The description of WindowsDefenderApplicationControl supplemental policy. */
    private String description;
    /** The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy. */
    private java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> deviceStatuses;
    /** The display name of WindowsDefenderApplicationControl supplemental policy. */
    private String displayName;
    /** The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity. */
    private java.util.List<String> roleScopeTagIds;
    /** The WindowsDefenderApplicationControl supplemental policy's version. */
    private String version;
    /**
     * Instantiates a new windowsDefenderApplicationControlSupplementalPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDefenderApplicationControlSupplementalPolicy
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderApplicationControlSupplementalPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderApplicationControlSupplementalPolicy();
    }
    /**
     * Gets the assignments property value. The associated group assignments for this WindowsDefenderApplicationControl supplemental policy.
     * @return a windowsDefenderApplicationControlSupplementalPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the content property value. The WindowsDefenderApplicationControl supplemental policy content in byte array format.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the contentFileName property value. The WindowsDefenderApplicationControl supplemental policy content's file name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentFileName() {
        return this.contentFileName;
    }
    /**
     * Gets the creationDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * Gets the deploySummary property value. WindowsDefenderApplicationControl supplemental policy deployment summary.
     * @return a windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary getDeploySummary() {
        return this.deploySummary;
    }
    /**
     * Gets the description property value. The description of WindowsDefenderApplicationControl supplemental policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceStatuses property value. The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy.
     * @return a windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> getDeviceStatuses() {
        return this.deviceStatuses;
    }
    /**
     * Gets the displayName property value. The display name of WindowsDefenderApplicationControl supplemental policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the lastModifiedDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the version property value. The WindowsDefenderApplicationControl supplemental policy's version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
     * Sets the assignments property value. The associated group assignments for this WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the content property value. The WindowsDefenderApplicationControl supplemental policy content in byte array format.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the contentFileName property value. The WindowsDefenderApplicationControl supplemental policy content's file name.
     * @param value Value to set for the contentFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentFileName(@javax.annotation.Nullable final String value) {
        this.contentFileName = value;
    }
    /**
     * Sets the creationDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded.
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.creationDateTime = value;
    }
    /**
     * Sets the deploySummary property value. WindowsDefenderApplicationControl supplemental policy deployment summary.
     * @param value Value to set for the deploySummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploySummary(@javax.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary value) {
        this.deploySummary = value;
    }
    /**
     * Sets the description property value. The description of WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceStatuses property value. The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> value) {
        this.deviceStatuses = value;
    }
    /**
     * Sets the displayName property value. The display name of WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the version property value. The WindowsDefenderApplicationControl supplemental policy's version.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
