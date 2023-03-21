package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedAccessRoot extends Entity implements Parsable {
    /** The group property */
    private PrivilegedAccessGroup group;
    /**
     * Instantiates a new PrivilegedAccessRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedAccessRoot
     */
    @javax.annotation.Nonnull
    public static PrivilegedAccessRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(PrivilegedAccessGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group property
     * @return a privilegedAccessGroup
     */
    @javax.annotation.Nullable
    public PrivilegedAccessGroup getGroup() {
        return this.group;
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
        writer.writeObjectValue("group", this.getGroup());
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroup(@javax.annotation.Nullable final PrivilegedAccessGroup value) {
        this.group = value;
    }
}
