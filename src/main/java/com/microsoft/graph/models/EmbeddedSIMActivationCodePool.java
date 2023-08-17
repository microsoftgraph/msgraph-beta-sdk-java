package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A pool represents a group of embedded SIM activation codes.
 */
public class EmbeddedSIMActivationCodePool extends Entity implements Parsable {
    /**
     * The total count of activation codes which belong to this pool.
     */
    private Integer activationCodeCount;
    /**
     * The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.
     */
    private java.util.List<EmbeddedSIMActivationCode> activationCodes;
    /**
     * Navigational property to a list of targets to which this pool is assigned.
     */
    private java.util.List<EmbeddedSIMActivationCodePoolAssignment> assignments;
    /**
     * The time the embedded SIM activation code pool was created. Generated service side.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Navigational property to a list of device states for this pool.
     */
    private java.util.List<EmbeddedSIMDeviceState> deviceStates;
    /**
     * The admin defined name of the embedded SIM activation code pool.
     */
    private String displayName;
    /**
     * The time the embedded SIM activation code pool was last modified. Updated service side.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Instantiates a new embeddedSIMActivationCodePool and sets the default values.
     */
    public EmbeddedSIMActivationCodePool() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a embeddedSIMActivationCodePool
     */
    @jakarta.annotation.Nonnull
    public static EmbeddedSIMActivationCodePool createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmbeddedSIMActivationCodePool();
    }
    /**
     * Gets the activationCodeCount property value. The total count of activation codes which belong to this pool.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getActivationCodeCount() {
        return this.activationCodeCount;
    }
    /**
     * Gets the activationCodes property value. The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.
     * @return a embeddedSIMActivationCode
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmbeddedSIMActivationCode> getActivationCodes() {
        return this.activationCodes;
    }
    /**
     * Gets the assignments property value. Navigational property to a list of targets to which this pool is assigned.
     * @return a embeddedSIMActivationCodePoolAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmbeddedSIMActivationCodePoolAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. The time the embedded SIM activation code pool was created. Generated service side.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deviceStates property value. Navigational property to a list of device states for this pool.
     * @return a embeddedSIMDeviceState
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmbeddedSIMDeviceState> getDeviceStates() {
        return this.deviceStates;
    }
    /**
     * Gets the displayName property value. The admin defined name of the embedded SIM activation code pool.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationCodeCount", (n) -> { this.setActivationCodeCount(n.getIntegerValue()); });
        deserializerMap.put("activationCodes", (n) -> { this.setActivationCodes(n.getCollectionOfObjectValues(EmbeddedSIMActivationCode::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(EmbeddedSIMActivationCodePoolAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceStates", (n) -> { this.setDeviceStates(n.getCollectionOfObjectValues(EmbeddedSIMDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. The time the embedded SIM activation code pool was last modified. Updated service side.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activationCodeCount", this.getActivationCodeCount());
        writer.writeCollectionOfObjectValues("activationCodes", this.getActivationCodes());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
    }
    /**
     * Sets the activationCodeCount property value. The total count of activation codes which belong to this pool.
     * @param value Value to set for the activationCodeCount property.
     */
    public void setActivationCodeCount(@jakarta.annotation.Nullable final Integer value) {
        this.activationCodeCount = value;
    }
    /**
     * Sets the activationCodes property value. The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.
     * @param value Value to set for the activationCodes property.
     */
    public void setActivationCodes(@jakarta.annotation.Nullable final java.util.List<EmbeddedSIMActivationCode> value) {
        this.activationCodes = value;
    }
    /**
     * Sets the assignments property value. Navigational property to a list of targets to which this pool is assigned.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<EmbeddedSIMActivationCodePoolAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The time the embedded SIM activation code pool was created. Generated service side.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deviceStates property value. Navigational property to a list of device states for this pool.
     * @param value Value to set for the deviceStates property.
     */
    public void setDeviceStates(@jakarta.annotation.Nullable final java.util.List<EmbeddedSIMDeviceState> value) {
        this.deviceStates = value;
    }
    /**
     * Sets the displayName property value. The admin defined name of the embedded SIM activation code pool.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the modifiedDateTime property value. The time the embedded SIM activation code pool was last modified. Updated service side.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
}
