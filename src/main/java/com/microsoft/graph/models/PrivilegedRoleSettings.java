package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedRoleSettings extends Entity implements Parsable {
    /** true if the approval is required when activate the role. false if the approval is not required when activate the role. */
    private Boolean _approvalOnElevation;
    /** List of Approval ids, if approval is required for activation. */
    private java.util.List<String> _approverIds;
    /** The duration when the role is activated. */
    private Period _elevationDuration;
    /** true if mfaOnElevation is configurable. false if mfaOnElevation is not configurable. */
    private Boolean _isMfaOnElevationConfigurable;
    /** Internal used only. */
    private Boolean _lastGlobalAdmin;
    /** Maximal duration for the activated role. */
    private Period _maxElavationDuration;
    /** true if MFA is required to activate the role. false if MFA is not required to activate the role. */
    private Boolean _mfaOnElevation;
    /** Minimal duration for the activated role. */
    private Period _minElevationDuration;
    /** true if send notification to the end user when the role is activated. false if do not send notification when the role is activated. */
    private Boolean _notificationToUserOnElevation;
    /** true if the ticketing information is required when activate the role. false if the ticketing information is not required when activate the role. */
    private Boolean _ticketingInfoOnElevation;
    /**
     * Instantiates a new privilegedRoleSettings and sets the default values.
     * @return a void
     */
    public PrivilegedRoleSettings() {
        super();
        this.setOdataType("#microsoft.graph.privilegedRoleSettings");
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
        return this._approvalOnElevation;
    }
    /**
     * Gets the approverIds property value. List of Approval ids, if approval is required for activation.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApproverIds() {
        return this._approverIds;
    }
    /**
     * Gets the elevationDuration property value. The duration when the role is activated.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getElevationDuration() {
        return this._elevationDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivilegedRoleSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("approvalOnElevation", (n) -> { currentObject.setApprovalOnElevation(n.getBooleanValue()); });
            this.put("approverIds", (n) -> { currentObject.setApproverIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("elevationDuration", (n) -> { currentObject.setElevationDuration(n.getPeriodValue()); });
            this.put("isMfaOnElevationConfigurable", (n) -> { currentObject.setIsMfaOnElevationConfigurable(n.getBooleanValue()); });
            this.put("lastGlobalAdmin", (n) -> { currentObject.setLastGlobalAdmin(n.getBooleanValue()); });
            this.put("maxElavationDuration", (n) -> { currentObject.setMaxElavationDuration(n.getPeriodValue()); });
            this.put("mfaOnElevation", (n) -> { currentObject.setMfaOnElevation(n.getBooleanValue()); });
            this.put("minElevationDuration", (n) -> { currentObject.setMinElevationDuration(n.getPeriodValue()); });
            this.put("notificationToUserOnElevation", (n) -> { currentObject.setNotificationToUserOnElevation(n.getBooleanValue()); });
            this.put("ticketingInfoOnElevation", (n) -> { currentObject.setTicketingInfoOnElevation(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isMfaOnElevationConfigurable property value. true if mfaOnElevation is configurable. false if mfaOnElevation is not configurable.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaOnElevationConfigurable() {
        return this._isMfaOnElevationConfigurable;
    }
    /**
     * Gets the lastGlobalAdmin property value. Internal used only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLastGlobalAdmin() {
        return this._lastGlobalAdmin;
    }
    /**
     * Gets the maxElavationDuration property value. Maximal duration for the activated role.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaxElavationDuration() {
        return this._maxElavationDuration;
    }
    /**
     * Gets the mfaOnElevation property value. true if MFA is required to activate the role. false if MFA is not required to activate the role.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMfaOnElevation() {
        return this._mfaOnElevation;
    }
    /**
     * Gets the minElevationDuration property value. Minimal duration for the activated role.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMinElevationDuration() {
        return this._minElevationDuration;
    }
    /**
     * Gets the notificationToUserOnElevation property value. true if send notification to the end user when the role is activated. false if do not send notification when the role is activated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNotificationToUserOnElevation() {
        return this._notificationToUserOnElevation;
    }
    /**
     * Gets the ticketingInfoOnElevation property value. true if the ticketing information is required when activate the role. false if the ticketing information is not required when activate the role.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTicketingInfoOnElevation() {
        return this._ticketingInfoOnElevation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setApprovalOnElevation(@javax.annotation.Nullable final Boolean value) {
        this._approvalOnElevation = value;
    }
    /**
     * Sets the approverIds property value. List of Approval ids, if approval is required for activation.
     * @param value Value to set for the approverIds property.
     * @return a void
     */
    public void setApproverIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._approverIds = value;
    }
    /**
     * Sets the elevationDuration property value. The duration when the role is activated.
     * @param value Value to set for the elevationDuration property.
     * @return a void
     */
    public void setElevationDuration(@javax.annotation.Nullable final Period value) {
        this._elevationDuration = value;
    }
    /**
     * Sets the isMfaOnElevationConfigurable property value. true if mfaOnElevation is configurable. false if mfaOnElevation is not configurable.
     * @param value Value to set for the isMfaOnElevationConfigurable property.
     * @return a void
     */
    public void setIsMfaOnElevationConfigurable(@javax.annotation.Nullable final Boolean value) {
        this._isMfaOnElevationConfigurable = value;
    }
    /**
     * Sets the lastGlobalAdmin property value. Internal used only.
     * @param value Value to set for the lastGlobalAdmin property.
     * @return a void
     */
    public void setLastGlobalAdmin(@javax.annotation.Nullable final Boolean value) {
        this._lastGlobalAdmin = value;
    }
    /**
     * Sets the maxElavationDuration property value. Maximal duration for the activated role.
     * @param value Value to set for the maxElavationDuration property.
     * @return a void
     */
    public void setMaxElavationDuration(@javax.annotation.Nullable final Period value) {
        this._maxElavationDuration = value;
    }
    /**
     * Sets the mfaOnElevation property value. true if MFA is required to activate the role. false if MFA is not required to activate the role.
     * @param value Value to set for the mfaOnElevation property.
     * @return a void
     */
    public void setMfaOnElevation(@javax.annotation.Nullable final Boolean value) {
        this._mfaOnElevation = value;
    }
    /**
     * Sets the minElevationDuration property value. Minimal duration for the activated role.
     * @param value Value to set for the minElevationDuration property.
     * @return a void
     */
    public void setMinElevationDuration(@javax.annotation.Nullable final Period value) {
        this._minElevationDuration = value;
    }
    /**
     * Sets the notificationToUserOnElevation property value. true if send notification to the end user when the role is activated. false if do not send notification when the role is activated.
     * @param value Value to set for the notificationToUserOnElevation property.
     * @return a void
     */
    public void setNotificationToUserOnElevation(@javax.annotation.Nullable final Boolean value) {
        this._notificationToUserOnElevation = value;
    }
    /**
     * Sets the ticketingInfoOnElevation property value. true if the ticketing information is required when activate the role. false if the ticketing information is not required when activate the role.
     * @param value Value to set for the ticketingInfoOnElevation property.
     * @return a void
     */
    public void setTicketingInfoOnElevation(@javax.annotation.Nullable final Boolean value) {
        this._ticketingInfoOnElevation = value;
    }
}
