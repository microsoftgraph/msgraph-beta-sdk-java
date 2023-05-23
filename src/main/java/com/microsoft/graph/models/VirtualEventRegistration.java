package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventRegistration extends Entity implements Parsable {
    /** The capacity property */
    private Integer capacity;
    /** The questions property */
    private java.util.List<VirtualEventRegistrationQuestion> questions;
    /** The registrants property */
    private java.util.List<VirtualEventRegistrant> registrants;
    /** The registrationWebUrl property */
    private String registrationWebUrl;
    /**
     * Instantiates a new virtualEventRegistration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventRegistration
     */
    @javax.annotation.Nonnull
    public static VirtualEventRegistration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistration();
    }
    /**
     * Gets the capacity property value. The capacity property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCapacity() {
        return this.capacity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(VirtualEventRegistrationQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("registrants", (n) -> { this.setRegistrants(n.getCollectionOfObjectValues(VirtualEventRegistrant::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationWebUrl", (n) -> { this.setRegistrationWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the questions property value. The questions property
     * @return a virtualEventRegistrationQuestion
     */
    @javax.annotation.Nullable
    public java.util.List<VirtualEventRegistrationQuestion> getQuestions() {
        return this.questions;
    }
    /**
     * Gets the registrants property value. The registrants property
     * @return a virtualEventRegistrant
     */
    @javax.annotation.Nullable
    public java.util.List<VirtualEventRegistrant> getRegistrants() {
        return this.registrants;
    }
    /**
     * Gets the registrationWebUrl property value. The registrationWebUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistrationWebUrl() {
        return this.registrationWebUrl;
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
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeCollectionOfObjectValues("registrants", this.getRegistrants());
        writer.writeStringValue("registrationWebUrl", this.getRegistrationWebUrl());
    }
    /**
     * Sets the capacity property value. The capacity property
     * @param value Value to set for the capacity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapacity(@javax.annotation.Nullable final Integer value) {
        this.capacity = value;
    }
    /**
     * Sets the questions property value. The questions property
     * @param value Value to set for the questions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestions(@javax.annotation.Nullable final java.util.List<VirtualEventRegistrationQuestion> value) {
        this.questions = value;
    }
    /**
     * Sets the registrants property value. The registrants property
     * @param value Value to set for the registrants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrants(@javax.annotation.Nullable final java.util.List<VirtualEventRegistrant> value) {
        this.registrants = value;
    }
    /**
     * Sets the registrationWebUrl property value. The registrationWebUrl property
     * @param value Value to set for the registrationWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationWebUrl(@javax.annotation.Nullable final String value) {
        this.registrationWebUrl = value;
    }
}
