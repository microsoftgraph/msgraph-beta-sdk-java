package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedRoleSettings extends Entity implements Parsable {
    /** true if the approval is required when activate the role. false if the approval is not required when activate the role. */
    private Boolean approvalOnElevation;
    /** List of Approval ids, if approval is required for activation. */
    private java.util.List<String> approverIds;
    /** The duration when the role is activated. */
    private Period elevationDuration;
    /** true if mfaOnElevation is configurable. false if mfaOnElevation is not configurable. */
    private Boolean isMfaOnElevationConfigurable;
    /** Internal used only. */
    private Boolean lastGlobalAdmin;
    /** Maximal duration for the activated role. */
    private Period maxElavationDuration;
    /** true if MFA is required to activate the role. false if MFA is not required to activate the role. */
    private Boolean mfaOnElevation;
    /** Minimal duration for the activated role. */
    private Period minElevationDuration;
    /** true if send notification to the end user when the role is activated. false if do not send notification when the role is activated. */
    private Boolean notificationToUserOnElevation;
    /** true if the ticketing information is required when activate the role. false if the ticketing information is not required when activate the role. */
    private Boolean ticketingInfoOnElevation;
    /**
     * Instantiates a new privilegedRoleSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedRoleSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRoleSettings
     */
    @javax.annotation.Nonnull
    public static PrivilegedRoleSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleSettings();
    }
    /**
     * Gets the approvalOnElevation property value. true if the approval is required when activate the role. false if the approval is not required when activate the role.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApprovalOnElevation() {
        return this.approvalOnElevation;
    }
    /**
     * Gets the approverIds property value. List of Approval ids, if approval is required for activation.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApproverIds() {
        return this.approverIds;
    }
    /**
     * Gets the elevationDuration property value. The duration when the role is activated.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getElevationDuration() {
        return this.elevationDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalOnElevation", (n) -> { this.setApprovalOnElevation(n.getBooleanValue()); });
        deserializerMap.put("approverIds", (n) -> { this.setApproverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("elevationDuration", (n) -> { this.setElevationDuration(n.getPeriodValue()); });
        deserializerMap.put("isMfaOnElevationConfigurable", (n) -> { this.setIsMfaOnElevationConfigurable(n.getBooleanValue()); });
        deserializerMap.put("lastGlobalAdmin", (n) -> { this.setLastGlobalAdmin(n.getBooleanValue()); });
        deserializerMap.put("maxElavationDuration", (n) -> { this.setMaxElavationDuration(n.getPeriodValue()); });
        deserializerMap.put("mfaOnElevation", (n) -> { this.setMfaOnElevation(n.getBooleanValue()); });
        deserializerMap.put("minElevationDuration", (n) -> { this.setMinElevationDuration(n.getPeriodValue()); });
        deserializerMap.put("notificationToUserOnElevation", (n) -> { this.setNotificationToUserOnElevation(n.getBooleanValue()); });
        deserializerMap.put("ticketingInfoOnElevation", (n) -> { this.setTicketingInfoOnElevation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMfaOnElevationConfigurable property value. true if mfaOnElevation is configurable. false if mfaOnElevation is not configurable.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaOnElevationConfigurable() {
        return this.isMfaOnElevationConfigurable;
    }
    /**
     * Gets the lastGlobalAdmin property value. Internal used only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLastGlobalAdmin() {
        return this.lastGlobalAdmin;
    }
    /**
     * Gets the maxElavationDuration property value. Maximal duration for the activated role.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaxElavationDuration() {
        return this.maxElavationDuration;
    }
    /**
     * Gets the mfaOnElevation property value. true if MFA is required to activate the role. false if MFA is not required to activate the role.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMfaOnElevation() {
        return this.mfaOnElevation;
    }
    /**
     * Gets the minElevationDuration property value. Minimal duration for the activated role.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMinElevationDuration() {
        return this.minElevationDuration;
    }
    /**
     * Gets the notificationToUserOnElevation property value. true if send notification to the end user when the role is activated. false if do not send notification when the role is activated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNotificationToUserOnElevation() {
        return this.notificationToUserOnElevation;
    }
    /**
     * Gets the ticketingInfoOnElevation property value. true if the ticketing information is required when activate the role. false if the ticketing information is not required when activate the role.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTicketingInfoOnElevation() {
        return this.ticketingInfoOnElevation;
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
        writer.writeBooleanValue("approvalOnElevation", this.getApprovalOnElevation());
        writer.writeCollectionOfPrimitiveValues("approverIds", this.getApproverIds());
        writer.writePeriodValue("elevationDuration", this.getElevationDuration());
        writer.writeBooleanValue("isMfaOnElevationConfigurable", this.getIsMfaOnElevationConfigurable());
        writer.writeBooleanValue("lastGlobalAdmin", this.getLastGlobalAdmin());
        writer.writePeriodValue("maxElavationDuration", this.getMaxElavationDuration());
        writer.writeBooleanValue("mfaOnElevation", this.getMfaOnElevation());
        writer.writePeriodValue("minElevationDuration", this.getMinElevationDuration());
        writer.writeBooleanValue("notificationToUserOnElevation", this.getNotificationToUserOnElevation());
        writer.writeBooleanValue("ticketingInfoOnElevation", this.getTicketingInfoOnElevation());
    }
    /**
     * Sets the approvalOnElevation property value. true if the approval is required when activate the role. false if the approval is not required when activate the role.
     * @param value Value to set for the approvalOnElevation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovalOnElevation(@javax.annotation.Nullable final Boolean value) {
        this.approvalOnElevation = value;
    }
    /**
     * Sets the approverIds property value. List of Approval ids, if approval is required for activation.
     * @param value Value to set for the approverIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApproverIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.approverIds = value;
    }
    /**
     * Sets the elevationDuration property value. The duration when the role is activated.
     * @param value Value to set for the elevationDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setElevationDuration(@javax.annotation.Nullable final Period value) {
        this.elevationDuration = value;
    }
    /**
     * Sets the isMfaOnElevationConfigurable property value. true if mfaOnElevation is configurable. false if mfaOnElevation is not configurable.
     * @param value Value to set for the isMfaOnElevationConfigurable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaOnElevationConfigurable(@javax.annotation.Nullable final Boolean value) {
        this.isMfaOnElevationConfigurable = value;
    }
    /**
     * Sets the lastGlobalAdmin property value. Internal used only.
     * @param value Value to set for the lastGlobalAdmin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastGlobalAdmin(@javax.annotation.Nullable final Boolean value) {
        this.lastGlobalAdmin = value;
    }
    /**
     * Sets the maxElavationDuration property value. Maximal duration for the activated role.
     * @param value Value to set for the maxElavationDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxElavationDuration(@javax.annotation.Nullable final Period value) {
        this.maxElavationDuration = value;
    }
    /**
     * Sets the mfaOnElevation property value. true if MFA is required to activate the role. false if MFA is not required to activate the role.
     * @param value Value to set for the mfaOnElevation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMfaOnElevation(@javax.annotation.Nullable final Boolean value) {
        this.mfaOnElevation = value;
    }
    /**
     * Sets the minElevationDuration property value. Minimal duration for the activated role.
     * @param value Value to set for the minElevationDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinElevationDuration(@javax.annotation.Nullable final Period value) {
        this.minElevationDuration = value;
    }
    /**
     * Sets the notificationToUserOnElevation property value. true if send notification to the end user when the role is activated. false if do not send notification when the role is activated.
     * @param value Value to set for the notificationToUserOnElevation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationToUserOnElevation(@javax.annotation.Nullable final Boolean value) {
        this.notificationToUserOnElevation = value;
    }
    /**
     * Sets the ticketingInfoOnElevation property value. true if the ticketing information is required when activate the role. false if the ticketing information is not required when activate the role.
     * @param value Value to set for the ticketingInfoOnElevation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTicketingInfoOnElevation(@javax.annotation.Nullable final Boolean value) {
        this.ticketingInfoOnElevation = value;
    }
}
