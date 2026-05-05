package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.ServicePrincipal;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForwardingProfileBase extends Profile implements Parsable {
    /**
     * Instantiates a new {@link ForwardingProfileBase} and sets the default values.
     */
    public ForwardingProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.forwardingProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ForwardingProfileBase}
     */
    @jakarta.annotation.Nonnull
    public static ForwardingProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.forwardingProfile": return new ForwardingProfile();
            }
        }
        return new ForwardingProfileBase();
    }
    /**
     * Gets the associations property value. The associations property
     * @return a {@link java.util.List<Association>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Association> getAssociations() {
        return this.backingStore.get("associations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associations", (n) -> { this.setAssociations(n.getCollectionOfObjectValues(Association::createFromDiscriminatorValue)); });
        deserializerMap.put("isCustomProfile", (n) -> { this.setIsCustomProfile(n.getBooleanValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("servicePrincipal", (n) -> { this.setServicePrincipal(n.getObjectValue(ServicePrincipal::createFromDiscriminatorValue)); });
        deserializerMap.put("trafficForwardingType", (n) -> { this.setTrafficForwardingType(n.getEnumValue(TrafficForwardingType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isCustomProfile property value. The isCustomProfile property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomProfile() {
        return this.backingStore.get("isCustomProfile");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the servicePrincipal property value. The servicePrincipal property
     * @return a {@link ServicePrincipal}
     */
    @jakarta.annotation.Nullable
    public ServicePrincipal getServicePrincipal() {
        return this.backingStore.get("servicePrincipal");
    }
    /**
     * Gets the trafficForwardingType property value. The trafficForwardingType property
     * @return a {@link TrafficForwardingType}
     */
    @jakarta.annotation.Nullable
    public TrafficForwardingType getTrafficForwardingType() {
        return this.backingStore.get("trafficForwardingType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("associations", this.getAssociations());
        writer.writeBooleanValue("isCustomProfile", this.getIsCustomProfile());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("servicePrincipal", this.getServicePrincipal());
        writer.writeEnumValue("trafficForwardingType", this.getTrafficForwardingType());
    }
    /**
     * Sets the associations property value. The associations property
     * @param value Value to set for the associations property.
     */
    public void setAssociations(@jakarta.annotation.Nullable final java.util.List<Association> value) {
        this.backingStore.set("associations", value);
    }
    /**
     * Sets the isCustomProfile property value. The isCustomProfile property
     * @param value Value to set for the isCustomProfile property.
     */
    public void setIsCustomProfile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCustomProfile", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the servicePrincipal property value. The servicePrincipal property
     * @param value Value to set for the servicePrincipal property.
     */
    public void setServicePrincipal(@jakarta.annotation.Nullable final ServicePrincipal value) {
        this.backingStore.set("servicePrincipal", value);
    }
    /**
     * Sets the trafficForwardingType property value. The trafficForwardingType property
     * @param value Value to set for the trafficForwardingType property.
     */
    public void setTrafficForwardingType(@jakarta.annotation.Nullable final TrafficForwardingType value) {
        this.backingStore.set("trafficForwardingType", value);
    }
}
