package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InactiveGroupFinding extends Finding implements Parsable {
    /**
     * Instantiates a new InactiveGroupFinding and sets the default values.
     */
    public InactiveGroupFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InactiveGroupFinding
     */
    @jakarta.annotation.Nonnull
    public static InactiveGroupFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InactiveGroupFinding();
    }
    /**
     * Gets the actionSummary property value. The actionSummary property
     * @return a ActionSummary
     */
    @jakarta.annotation.Nullable
    public ActionSummary getActionSummary() {
        return this.backingStore.get("actionSummary");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionSummary", (n) -> { this.setActionSummary(n.getObjectValue(ActionSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(AuthorizationSystemIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group property
     * @return a AuthorizationSystemIdentity
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemIdentity getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a PermissionsCreepIndex
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.backingStore.get("permissionsCreepIndex");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actionSummary", this.getActionSummary());
        writer.writeObjectValue("group", this.getGroup());
        writer.writeObjectValue("permissionsCreepIndex", this.getPermissionsCreepIndex());
    }
    /**
     * Sets the actionSummary property value. The actionSummary property
     * @param value Value to set for the actionSummary property.
     */
    public void setActionSummary(@jakarta.annotation.Nullable final ActionSummary value) {
        this.backingStore.set("actionSummary", value);
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final AuthorizationSystemIdentity value) {
        this.backingStore.set("group", value);
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.backingStore.set("permissionsCreepIndex", value);
    }
}
