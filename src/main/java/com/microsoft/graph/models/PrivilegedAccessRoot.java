package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedAccessRoot extends Entity implements Parsable {
    /**
     * A group that's governed through Privileged Identity Management (PIM).
     */
    private PrivilegedAccessGroup group;
    /**
     * Instantiates a new privilegedAccessRoot and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedAccessRoot
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(PrivilegedAccessGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. A group that's governed through Privileged Identity Management (PIM).
     * @return a privilegedAccessGroup
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroup getGroup() {
        return this.group;
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
        writer.writeObjectValue("group", this.getGroup());
    }
    /**
     * Sets the group property value. A group that's governed through Privileged Identity Management (PIM).
     * @param value Value to set for the group property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGroup(@jakarta.annotation.Nullable final PrivilegedAccessGroup value) {
        this.group = value;
    }
}
