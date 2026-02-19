package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Assignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Assignment} and sets the default values.
     */
    public Assignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Assignment}
     */
    @jakarta.annotation.Nonnull
    public static Assignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Assignment();
    }
    /**
     * Gets the allotment property value. The allotment from which licenses are assigned. Not nullable.
     * @return a {@link Allotment}
     */
    @jakarta.annotation.Nullable
    public Allotment getAllotment() {
        return this.backingStore.get("allotment");
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the disabledServicePlanIds property value. The list of disabled service plans for this assignment. Not nullable.
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getDisabledServicePlanIds() {
        return this.backingStore.get("disabledServicePlanIds");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allotment", (n) -> { this.setAllotment(n.getObjectValue(Allotment::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("disabledServicePlanIds", (n) -> { this.setDisabledServicePlanIds(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("allotment", this.getAllotment());
        writer.writeObjectValue("assignedTo", this.getAssignedTo());
        writer.writeCollectionOfPrimitiveValues("disabledServicePlanIds", this.getDisabledServicePlanIds());
    }
    /**
     * Sets the allotment property value. The allotment from which licenses are assigned. Not nullable.
     * @param value Value to set for the allotment property.
     */
    public void setAllotment(@jakarta.annotation.Nullable final Allotment value) {
        this.backingStore.set("allotment", value);
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the disabledServicePlanIds property value. The list of disabled service plans for this assignment. Not nullable.
     * @param value Value to set for the disabledServicePlanIds property.
     */
    public void setDisabledServicePlanIds(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.backingStore.set("disabledServicePlanIds", value);
    }
}
