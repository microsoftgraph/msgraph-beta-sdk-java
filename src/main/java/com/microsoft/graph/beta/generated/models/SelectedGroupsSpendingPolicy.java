package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A spending policy that governs only the users in its assigned groups. Omitting assignedGroupsor supplying an empty collection creates a disabled policy that is not enforced. The policytakes effect after at least one valid group is assigned and its other requirements are satisfied.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SelectedGroupsSpendingPolicy extends SpendingPolicy implements Parsable {
    /**
     * Instantiates a new {@link SelectedGroupsSpendingPolicy} and sets the default values.
     */
    public SelectedGroupsSpendingPolicy() {
        super();
        this.setOdataType("#microsoft.graph.selectedGroupsSpendingPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SelectedGroupsSpendingPolicy}
     */
    @jakarta.annotation.Nonnull
    public static SelectedGroupsSpendingPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelectedGroupsSpendingPolicy();
    }
    /**
     * Gets the assignedGroups property value. The groups the policy is assigned to. On create, omit this property or supply an emptycollection to create a disabled policy. Add the first group later through theassignedGroups/$ref operation to activate the policy when its other requirements are satisfied.
     * @return a {@link java.util.List<Group>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getAssignedGroups() {
        return this.backingStore.get("assignedGroups");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedGroups", (n) -> { this.setAssignedGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignedGroups", this.getAssignedGroups());
    }
    /**
     * Sets the assignedGroups property value. The groups the policy is assigned to. On create, omit this property or supply an emptycollection to create a disabled policy. Add the first group later through theassignedGroups/$ref operation to activate the policy when its other requirements are satisfied.
     * @param value Value to set for the assignedGroups property.
     */
    public void setAssignedGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.backingStore.set("assignedGroups", value);
    }
}
