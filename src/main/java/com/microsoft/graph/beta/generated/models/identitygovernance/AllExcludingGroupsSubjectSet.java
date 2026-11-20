package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.Group;
import com.microsoft.graph.beta.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllExcludingGroupsSubjectSet extends SubjectSet implements Parsable {
    /**
     * Instantiates a new {@link AllExcludingGroupsSubjectSet} and sets the default values.
     */
    public AllExcludingGroupsSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.allExcludingGroupsSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AllExcludingGroupsSubjectSet}
     */
    @jakarta.annotation.Nonnull
    public static AllExcludingGroupsSubjectSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllExcludingGroupsSubjectSet();
    }
    /**
     * Gets the excludedGroups property value. The excludedGroups property
     * @return a {@link java.util.List<Group>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getExcludedGroups() {
        return this.backingStore.get("excludedGroups");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludedGroups", (n) -> { this.setExcludedGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("excludedGroups", this.getExcludedGroups());
    }
    /**
     * Sets the excludedGroups property value. The excludedGroups property
     * @param value Value to set for the excludedGroups property.
     */
    public void setExcludedGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.backingStore.set("excludedGroups", value);
    }
}
