package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventRegistrationConfiguration extends Entity implements Parsable {
    /**
     * The capacity property
     */
    private Integer capacity;
    /**
     * The questions property
     */
    private java.util.List<VirtualEventRegistrationQuestion> questions;
    /**
     * The registrationWebUrl property
     */
    private String registrationWebUrl;
    /**
     * Instantiates a new virtualEventRegistrationConfiguration and sets the default values.
     */
    public VirtualEventRegistrationConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventRegistrationConfiguration
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistrationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.virtualEventWebinarRegistrationConfiguration": return new VirtualEventWebinarRegistrationConfiguration();
            }
        }
        return new VirtualEventRegistrationConfiguration();
    }
    /**
     * Gets the capacity property value. The capacity property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCapacity() {
        return this.capacity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(VirtualEventRegistrationQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationWebUrl", (n) -> { this.setRegistrationWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the questions property value. The questions property
     * @return a virtualEventRegistrationQuestion
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistrationQuestion> getQuestions() {
        return this.questions;
    }
    /**
     * Gets the registrationWebUrl property value. The registrationWebUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRegistrationWebUrl() {
        return this.registrationWebUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeStringValue("registrationWebUrl", this.getRegistrationWebUrl());
    }
    /**
     * Sets the capacity property value. The capacity property
     * @param value Value to set for the capacity property.
     */
    public void setCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.capacity = value;
    }
    /**
     * Sets the questions property value. The questions property
     * @param value Value to set for the questions property.
     */
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistrationQuestion> value) {
        this.questions = value;
    }
    /**
     * Sets the registrationWebUrl property value. The registrationWebUrl property
     * @param value Value to set for the registrationWebUrl property.
     */
    public void setRegistrationWebUrl(@jakarta.annotation.Nullable final String value) {
        this.registrationWebUrl = value;
    }
}
