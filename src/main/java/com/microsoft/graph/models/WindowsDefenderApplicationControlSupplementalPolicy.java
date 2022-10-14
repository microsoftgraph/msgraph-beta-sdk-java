package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDefenderApplicationControlSupplementalPolicy extends Entity implements Parsable {
    /** The associated group assignments for this WindowsDefenderApplicationControl supplemental policy. */
    private java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> _assignments;
    /** The WindowsDefenderApplicationControl supplemental policy content in byte array format. */
    private byte[] _content;
    /** The WindowsDefenderApplicationControl supplemental policy content's file name. */
    private String _contentFileName;
    /** The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded. */
    private OffsetDateTime _creationDateTime;
    /** WindowsDefenderApplicationControl supplemental policy deployment summary. */
    private WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary _deploySummary;
    /** The description of WindowsDefenderApplicationControl supplemental policy. */
    private String _description;
    /** The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy. */
    private java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> _deviceStatuses;
    /** The display name of WindowsDefenderApplicationControl supplemental policy. */
    private String _displayName;
    /** The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity. */
    private java.util.List<String> _roleScopeTagIds;
    /** The WindowsDefenderApplicationControl supplemental policy's version. */
    private String _version;
    /**
     * Instantiates a new windowsDefenderApplicationControlSupplementalPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicy() {
        super();
        this.setOdataType("#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy");
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
        return this._assignments;
    }
    /**
     * Gets the content property value. The WindowsDefenderApplicationControl supplemental policy content in byte array format.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the contentFileName property value. The WindowsDefenderApplicationControl supplemental policy content's file name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentFileName() {
        return this._contentFileName;
    }
    /**
     * Gets the creationDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this._creationDateTime;
    }
    /**
     * Gets the deploySummary property value. WindowsDefenderApplicationControl supplemental policy deployment summary.
     * @return a windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary
     */
    @javax.annotation.Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary getDeploySummary() {
        return this._deploySummary;
    }
    /**
     * Gets the description property value. The description of WindowsDefenderApplicationControl supplemental policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceStatuses property value. The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy.
     * @return a windowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the displayName property value. The display name of WindowsDefenderApplicationControl supplemental policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDefenderApplicationControlSupplementalPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(WindowsDefenderApplicationControlSupplementalPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("contentFileName", (n) -> { currentObject.setContentFileName(n.getStringValue()); });
            this.put("creationDateTime", (n) -> { currentObject.setCreationDateTime(n.getOffsetDateTimeValue()); });
            this.put("deploySummary", (n) -> { currentObject.setDeploySummary(n.getObjectValue(WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the version property value. The WindowsDefenderApplicationControl supplemental policy's version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
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
        this._assignments = value;
    }
    /**
     * Sets the content property value. The WindowsDefenderApplicationControl supplemental policy content in byte array format.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the contentFileName property value. The WindowsDefenderApplicationControl supplemental policy content's file name.
     * @param value Value to set for the contentFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentFileName(@javax.annotation.Nullable final String value) {
        this._contentFileName = value;
    }
    /**
     * Sets the creationDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded.
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._creationDateTime = value;
    }
    /**
     * Sets the deploySummary property value. WindowsDefenderApplicationControl supplemental policy deployment summary.
     * @param value Value to set for the deploySummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploySummary(@javax.annotation.Nullable final WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary value) {
        this._deploySummary = value;
    }
    /**
     * Sets the description property value. The description of WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceStatuses property value. The list of device deployment states for this WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the displayName property value. The display name of WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the version property value. The WindowsDefenderApplicationControl supplemental policy's version.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
