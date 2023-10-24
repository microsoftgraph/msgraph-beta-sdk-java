package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedRoleSettings extends Entity implements Parsable {
    /**
     * The approvalOnElevation property
     */
    private Boolean approvalOnElevation;
    /**
     * The approverIds property
     */
    private java.util.List<String> approverIds;
    /**
     * The elevationDuration property
     */
    private PeriodAndDuration elevationDuration;
    /**
     * The isMfaOnElevationConfigurable property
     */
    private Boolean isMfaOnElevationConfigurable;
    /**
     * The lastGlobalAdmin property
     */
    private Boolean lastGlobalAdmin;
    /**
     * The maxElavationDuration property
     */
    private PeriodAndDuration maxElavationDuration;
    /**
     * The mfaOnElevation property
     */
    private Boolean mfaOnElevation;
    /**
     * The minElevationDuration property
     */
    private PeriodAndDuration minElevationDuration;
    /**
     * The notificationToUserOnElevation property
     */
    private Boolean notificationToUserOnElevation;
    /**
     * The ticketingInfoOnElevation property
     */
    private Boolean ticketingInfoOnElevation;
    /**
     * Instantiates a new PrivilegedRoleSettings and sets the default values.
     */
    public PrivilegedRoleSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedRoleSettings
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedRoleSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleSettings();
    }
    /**
     * Gets the approvalOnElevation property value. The approvalOnElevation property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApprovalOnElevation() {
        return this.approvalOnElevation;
    }
    /**
     * Gets the approverIds property value. The approverIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApproverIds() {
        return this.approverIds;
    }
    /**
     * Gets the elevationDuration property value. The elevationDuration property
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getElevationDuration() {
        return this.elevationDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalOnElevation", (n) -> { this.setApprovalOnElevation(n.getBooleanValue()); });
        deserializerMap.put("approverIds", (n) -> { this.setApproverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("elevationDuration", (n) -> { this.setElevationDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("isMfaOnElevationConfigurable", (n) -> { this.setIsMfaOnElevationConfigurable(n.getBooleanValue()); });
        deserializerMap.put("lastGlobalAdmin", (n) -> { this.setLastGlobalAdmin(n.getBooleanValue()); });
        deserializerMap.put("maxElavationDuration", (n) -> { this.setMaxElavationDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("mfaOnElevation", (n) -> { this.setMfaOnElevation(n.getBooleanValue()); });
        deserializerMap.put("minElevationDuration", (n) -> { this.setMinElevationDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("notificationToUserOnElevation", (n) -> { this.setNotificationToUserOnElevation(n.getBooleanValue()); });
        deserializerMap.put("ticketingInfoOnElevation", (n) -> { this.setTicketingInfoOnElevation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMfaOnElevationConfigurable property value. The isMfaOnElevationConfigurable property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMfaOnElevationConfigurable() {
        return this.isMfaOnElevationConfigurable;
    }
    /**
     * Gets the lastGlobalAdmin property value. The lastGlobalAdmin property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLastGlobalAdmin() {
        return this.lastGlobalAdmin;
    }
    /**
     * Gets the maxElavationDuration property value. The maxElavationDuration property
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaxElavationDuration() {
        return this.maxElavationDuration;
    }
    /**
     * Gets the mfaOnElevation property value. The mfaOnElevation property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMfaOnElevation() {
        return this.mfaOnElevation;
    }
    /**
     * Gets the minElevationDuration property value. The minElevationDuration property
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMinElevationDuration() {
        return this.minElevationDuration;
    }
    /**
     * Gets the notificationToUserOnElevation property value. The notificationToUserOnElevation property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNotificationToUserOnElevation() {
        return this.notificationToUserOnElevation;
    }
    /**
     * Gets the ticketingInfoOnElevation property value. The ticketingInfoOnElevation property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTicketingInfoOnElevation() {
        return this.ticketingInfoOnElevation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("approvalOnElevation", this.getApprovalOnElevation());
        writer.writeCollectionOfPrimitiveValues("approverIds", this.getApproverIds());
        writer.writePeriodAndDurationValue("elevationDuration", this.getElevationDuration());
        writer.writeBooleanValue("isMfaOnElevationConfigurable", this.getIsMfaOnElevationConfigurable());
        writer.writeBooleanValue("lastGlobalAdmin", this.getLastGlobalAdmin());
        writer.writePeriodAndDurationValue("maxElavationDuration", this.getMaxElavationDuration());
        writer.writeBooleanValue("mfaOnElevation", this.getMfaOnElevation());
        writer.writePeriodAndDurationValue("minElevationDuration", this.getMinElevationDuration());
        writer.writeBooleanValue("notificationToUserOnElevation", this.getNotificationToUserOnElevation());
        writer.writeBooleanValue("ticketingInfoOnElevation", this.getTicketingInfoOnElevation());
    }
    /**
     * Sets the approvalOnElevation property value. The approvalOnElevation property
     * @param value Value to set for the approvalOnElevation property.
     */
    public void setApprovalOnElevation(@jakarta.annotation.Nullable final Boolean value) {
        this.approvalOnElevation = value;
    }
    /**
     * Sets the approverIds property value. The approverIds property
     * @param value Value to set for the approverIds property.
     */
    public void setApproverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.approverIds = value;
    }
    /**
     * Sets the elevationDuration property value. The elevationDuration property
     * @param value Value to set for the elevationDuration property.
     */
    public void setElevationDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.elevationDuration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the isMfaOnElevationConfigurable property value. The isMfaOnElevationConfigurable property
     * @param value Value to set for the isMfaOnElevationConfigurable property.
     */
    public void setIsMfaOnElevationConfigurable(@jakarta.annotation.Nullable final Boolean value) {
        this.isMfaOnElevationConfigurable = value;
    }
    /**
     * Sets the lastGlobalAdmin property value. The lastGlobalAdmin property
     * @param value Value to set for the lastGlobalAdmin property.
     */
    public void setLastGlobalAdmin(@jakarta.annotation.Nullable final Boolean value) {
        this.lastGlobalAdmin = value;
    }
    /**
     * Sets the maxElavationDuration property value. The maxElavationDuration property
     * @param value Value to set for the maxElavationDuration property.
     */
    public void setMaxElavationDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.maxElavationDuration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the mfaOnElevation property value. The mfaOnElevation property
     * @param value Value to set for the mfaOnElevation property.
     */
    public void setMfaOnElevation(@jakarta.annotation.Nullable final Boolean value) {
        this.mfaOnElevation = value;
    }
    /**
     * Sets the minElevationDuration property value. The minElevationDuration property
     * @param value Value to set for the minElevationDuration property.
     */
    public void setMinElevationDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.minElevationDuration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the notificationToUserOnElevation property value. The notificationToUserOnElevation property
     * @param value Value to set for the notificationToUserOnElevation property.
     */
    public void setNotificationToUserOnElevation(@jakarta.annotation.Nullable final Boolean value) {
        this.notificationToUserOnElevation = value;
    }
    /**
     * Sets the ticketingInfoOnElevation property value. The ticketingInfoOnElevation property
     * @param value Value to set for the ticketingInfoOnElevation property.
     */
    public void setTicketingInfoOnElevation(@jakarta.annotation.Nullable final Boolean value) {
        this.ticketingInfoOnElevation = value;
    }
}
