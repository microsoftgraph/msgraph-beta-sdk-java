package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AdminWindows extends Entity implements Parsable {
    /**
     * Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     */
    private AdminWindowsUpdates updates;
    /**
     * Instantiates a new adminWindows and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdminWindows() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a adminWindows
     */
    @javax.annotation.Nonnull
    public static AdminWindows createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminWindows();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("updates", (n) -> { this.setUpdates(n.getObjectValue(AdminWindowsUpdates::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updates property value. Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @return a adminWindowsUpdates
     */
    @javax.annotation.Nullable
    public AdminWindowsUpdates getUpdates() {
        return this.updates;
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
        writer.writeObjectValue("updates", this.getUpdates());
    }
    /**
     * Sets the updates property value. Entity that acts as a container for all Windows Update for Business deployment service functionalities. Read-only.
     * @param value Value to set for the updates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdates(@javax.annotation.Nullable final AdminWindowsUpdates value) {
        this.updates = value;
    }
}
