package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows extends Entity implements Parsable {
    /** Entity that acts as a container for the functionality of the Windows Update for Business deployment service. Read-only. */
    private Updates _updates;
    /**
     * Instantiates a new windows and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.windows");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows
     */
    @javax.annotation.Nonnull
    public static Windows createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("updates", (n) -> { currentObject.setUpdates(n.getObjectValue(Updates::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updates property value. Entity that acts as a container for the functionality of the Windows Update for Business deployment service. Read-only.
     * @return a updates
     */
    @javax.annotation.Nullable
    public Updates getUpdates() {
        return this._updates;
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
     * Sets the updates property value. Entity that acts as a container for the functionality of the Windows Update for Business deployment service. Read-only.
     * @param value Value to set for the updates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdates(@javax.annotation.Nullable final Updates value) {
        this._updates = value;
    }
}
