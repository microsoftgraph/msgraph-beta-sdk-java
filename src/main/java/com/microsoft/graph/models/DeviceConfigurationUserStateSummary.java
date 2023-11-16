package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfigurationUserStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceConfigurationUserStateSummary and sets the default values.
     */
    public DeviceConfigurationUserStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceConfigurationUserStateSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfigurationUserStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationUserStateSummary();
    }
    /**
     * Gets the compliantUserCount property value. Number of compliant users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantUserCount() {
        return this.BackingStore.get("compliantUserCount");
    }
    /**
     * Gets the conflictUserCount property value. Number of conflict users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictUserCount() {
        return this.BackingStore.get("conflictUserCount");
    }
    /**
     * Gets the errorUserCount property value. Number of error users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorUserCount() {
        return this.BackingStore.get("errorUserCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantUserCount", (n) -> { this.setCompliantUserCount(n.getIntegerValue()); });
        deserializerMap.put("conflictUserCount", (n) -> { this.setConflictUserCount(n.getIntegerValue()); });
        deserializerMap.put("errorUserCount", (n) -> { this.setErrorUserCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantUserCount", (n) -> { this.setNonCompliantUserCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableUserCount", (n) -> { this.setNotApplicableUserCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedUserCount", (n) -> { this.setRemediatedUserCount(n.getIntegerValue()); });
        deserializerMap.put("unknownUserCount", (n) -> { this.setUnknownUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nonCompliantUserCount property value. Number of NonCompliant users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantUserCount() {
        return this.BackingStore.get("nonCompliantUserCount");
    }
    /**
     * Gets the notApplicableUserCount property value. Number of not applicable users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableUserCount() {
        return this.BackingStore.get("notApplicableUserCount");
    }
    /**
     * Gets the remediatedUserCount property value. Number of remediated users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedUserCount() {
        return this.BackingStore.get("remediatedUserCount");
    }
    /**
     * Gets the unknownUserCount property value. Number of unknown users
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownUserCount() {
        return this.BackingStore.get("unknownUserCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("compliantUserCount", this.getCompliantUserCount());
        writer.writeIntegerValue("conflictUserCount", this.getConflictUserCount());
        writer.writeIntegerValue("errorUserCount", this.getErrorUserCount());
        writer.writeIntegerValue("nonCompliantUserCount", this.getNonCompliantUserCount());
        writer.writeIntegerValue("notApplicableUserCount", this.getNotApplicableUserCount());
        writer.writeIntegerValue("remediatedUserCount", this.getRemediatedUserCount());
        writer.writeIntegerValue("unknownUserCount", this.getUnknownUserCount());
    }
    /**
     * Sets the compliantUserCount property value. Number of compliant users
     * @param value Value to set for the compliantUserCount property.
     */
    public void setCompliantUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("compliantUserCount", value);
    }
    /**
     * Sets the conflictUserCount property value. Number of conflict users
     * @param value Value to set for the conflictUserCount property.
     */
    public void setConflictUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("conflictUserCount", value);
    }
    /**
     * Sets the errorUserCount property value. Number of error users
     * @param value Value to set for the errorUserCount property.
     */
    public void setErrorUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("errorUserCount", value);
    }
    /**
     * Sets the nonCompliantUserCount property value. Number of NonCompliant users
     * @param value Value to set for the nonCompliantUserCount property.
     */
    public void setNonCompliantUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("nonCompliantUserCount", value);
    }
    /**
     * Sets the notApplicableUserCount property value. Number of not applicable users
     * @param value Value to set for the notApplicableUserCount property.
     */
    public void setNotApplicableUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("notApplicableUserCount", value);
    }
    /**
     * Sets the remediatedUserCount property value. Number of remediated users
     * @param value Value to set for the remediatedUserCount property.
     */
    public void setRemediatedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("remediatedUserCount", value);
    }
    /**
     * Sets the unknownUserCount property value. Number of unknown users
     * @param value Value to set for the unknownUserCount property.
     */
    public void setUnknownUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("unknownUserCount", value);
    }
}
