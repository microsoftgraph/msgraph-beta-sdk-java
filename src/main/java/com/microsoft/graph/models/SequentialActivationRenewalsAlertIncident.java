package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SequentialActivationRenewalsAlertIncident extends UnifiedRoleManagementAlertIncident implements Parsable {
    /** The activationCount property */
    private Integer activationCount;
    /** The assigneeDisplayName property */
    private String assigneeDisplayName;
    /** The assigneeId property */
    private String assigneeId;
    /** The assigneeUserPrincipalName property */
    private String assigneeUserPrincipalName;
    /** The roleDefinitionId property */
    private String roleDefinitionId;
    /** The roleDisplayName property */
    private String roleDisplayName;
    /** The roleTemplateId property */
    private String roleTemplateId;
    /** The sequenceEndDateTime property */
    private OffsetDateTime sequenceEndDateTime;
    /** The sequenceStartDateTime property */
    private OffsetDateTime sequenceStartDateTime;
    /**
     * Instantiates a new SequentialActivationRenewalsAlertIncident and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SequentialActivationRenewalsAlertIncident() {
        super();
        this.setOdataType("#microsoft.graph.sequentialActivationRenewalsAlertIncident");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SequentialActivationRenewalsAlertIncident
     */
    @javax.annotation.Nonnull
    public static SequentialActivationRenewalsAlertIncident createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SequentialActivationRenewalsAlertIncident();
    }
    /**
     * Gets the activationCount property value. The activationCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActivationCount() {
        return this.activationCount;
    }
    /**
     * Gets the assigneeDisplayName property value. The assigneeDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssigneeDisplayName() {
        return this.assigneeDisplayName;
    }
    /**
     * Gets the assigneeId property value. The assigneeId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssigneeId() {
        return this.assigneeId;
    }
    /**
     * Gets the assigneeUserPrincipalName property value. The assigneeUserPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssigneeUserPrincipalName() {
        return this.assigneeUserPrincipalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationCount", (n) -> { this.setActivationCount(n.getIntegerValue()); });
        deserializerMap.put("assigneeDisplayName", (n) -> { this.setAssigneeDisplayName(n.getStringValue()); });
        deserializerMap.put("assigneeId", (n) -> { this.setAssigneeId(n.getStringValue()); });
        deserializerMap.put("assigneeUserPrincipalName", (n) -> { this.setAssigneeUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("roleDisplayName", (n) -> { this.setRoleDisplayName(n.getStringValue()); });
        deserializerMap.put("roleTemplateId", (n) -> { this.setRoleTemplateId(n.getStringValue()); });
        deserializerMap.put("sequenceEndDateTime", (n) -> { this.setSequenceEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sequenceStartDateTime", (n) -> { this.setSequenceStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the roleDefinitionId property value. The roleDefinitionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Gets the roleDisplayName property value. The roleDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDisplayName() {
        return this.roleDisplayName;
    }
    /**
     * Gets the roleTemplateId property value. The roleTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleTemplateId() {
        return this.roleTemplateId;
    }
    /**
     * Gets the sequenceEndDateTime property value. The sequenceEndDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSequenceEndDateTime() {
        return this.sequenceEndDateTime;
    }
    /**
     * Gets the sequenceStartDateTime property value. The sequenceStartDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSequenceStartDateTime() {
        return this.sequenceStartDateTime;
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
        writer.writeIntegerValue("activationCount", this.getActivationCount());
        writer.writeStringValue("assigneeDisplayName", this.getAssigneeDisplayName());
        writer.writeStringValue("assigneeId", this.getAssigneeId());
        writer.writeStringValue("assigneeUserPrincipalName", this.getAssigneeUserPrincipalName());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeStringValue("roleDisplayName", this.getRoleDisplayName());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
        writer.writeOffsetDateTimeValue("sequenceEndDateTime", this.getSequenceEndDateTime());
        writer.writeOffsetDateTimeValue("sequenceStartDateTime", this.getSequenceStartDateTime());
    }
    /**
     * Sets the activationCount property value. The activationCount property
     * @param value Value to set for the activationCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivationCount(@javax.annotation.Nullable final Integer value) {
        this.activationCount = value;
    }
    /**
     * Sets the assigneeDisplayName property value. The assigneeDisplayName property
     * @param value Value to set for the assigneeDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssigneeDisplayName(@javax.annotation.Nullable final String value) {
        this.assigneeDisplayName = value;
    }
    /**
     * Sets the assigneeId property value. The assigneeId property
     * @param value Value to set for the assigneeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssigneeId(@javax.annotation.Nullable final String value) {
        this.assigneeId = value;
    }
    /**
     * Sets the assigneeUserPrincipalName property value. The assigneeUserPrincipalName property
     * @param value Value to set for the assigneeUserPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssigneeUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.assigneeUserPrincipalName = value;
    }
    /**
     * Sets the roleDefinitionId property value. The roleDefinitionId property
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
    /**
     * Sets the roleDisplayName property value. The roleDisplayName property
     * @param value Value to set for the roleDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDisplayName(@javax.annotation.Nullable final String value) {
        this.roleDisplayName = value;
    }
    /**
     * Sets the roleTemplateId property value. The roleTemplateId property
     * @param value Value to set for the roleTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleTemplateId(@javax.annotation.Nullable final String value) {
        this.roleTemplateId = value;
    }
    /**
     * Sets the sequenceEndDateTime property value. The sequenceEndDateTime property
     * @param value Value to set for the sequenceEndDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSequenceEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.sequenceEndDateTime = value;
    }
    /**
     * Sets the sequenceStartDateTime property value. The sequenceStartDateTime property
     * @param value Value to set for the sequenceStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSequenceStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.sequenceStartDateTime = value;
    }
}
