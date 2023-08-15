package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ForwardingProfile extends Profile implements Parsable {
    /**
     * Specifies the users, groups, devices, and branch locations whose traffic is associated with the given traffic forwarding profile.
     */
    private java.util.List<Association> associations;
    /**
     * Profile priority.
     */
    private Integer priority;
    /**
     * The trafficForwardingType property
     */
    private TrafficForwardingType trafficForwardingType;
    /**
     * Instantiates a new forwardingProfile and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ForwardingProfile() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.forwardingProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a forwardingProfile
     */
    @jakarta.annotation.Nonnull
    public static ForwardingProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardingProfile();
    }
    /**
     * Gets the associations property value. Specifies the users, groups, devices, and branch locations whose traffic is associated with the given traffic forwarding profile.
     * @return a association
     */
    @jakarta.annotation.Nullable
    public java.util.List<Association> getAssociations() {
        return this.associations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associations", (n) -> { this.setAssociations(n.getCollectionOfObjectValues(Association::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("trafficForwardingType", (n) -> { this.setTrafficForwardingType(n.getEnumValue(TrafficForwardingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. Profile priority.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the trafficForwardingType property value. The trafficForwardingType property
     * @return a trafficForwardingType
     */
    @jakarta.annotation.Nullable
    public TrafficForwardingType getTrafficForwardingType() {
        return this.trafficForwardingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("associations", this.getAssociations());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeEnumValue("trafficForwardingType", this.getTrafficForwardingType());
    }
    /**
     * Sets the associations property value. Specifies the users, groups, devices, and branch locations whose traffic is associated with the given traffic forwarding profile.
     * @param value Value to set for the associations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssociations(@jakarta.annotation.Nullable final java.util.List<Association> value) {
        this.associations = value;
    }
    /**
     * Sets the priority property value. Profile priority.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the trafficForwardingType property value. The trafficForwardingType property
     * @param value Value to set for the trafficForwardingType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrafficForwardingType(@jakarta.annotation.Nullable final TrafficForwardingType value) {
        this.trafficForwardingType = value;
    }
}
