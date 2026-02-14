package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExcludedGroupAssignment extends GroupAssignment implements Parsable {
    /**
     * Instantiates a new {@link ExcludedGroupAssignment} and sets the default values.
     */
    public ExcludedGroupAssignment() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.excludedGroupAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExcludedGroupAssignment}
     */
    @jakarta.annotation.Nonnull
    public static ExcludedGroupAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExcludedGroupAssignment();
    }
    /**
     * Gets the assignments property value. A collection of entities that govern the update deployment audience, defined as a Microsoft Entra group.
     * @return a {@link java.util.List<AssignedGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedGroup> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(AssignedGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
    }
    /**
     * Sets the assignments property value. A collection of entities that govern the update deployment audience, defined as a Microsoft Entra group.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<AssignedGroup> value) {
        this.backingStore.set("assignments", value);
    }
}
