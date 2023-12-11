package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserVirtualEventsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new UserVirtualEventsRoot and sets the default values.
     */
    public UserVirtualEventsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserVirtualEventsRoot
     */
    @jakarta.annotation.Nonnull
    public static UserVirtualEventsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserVirtualEventsRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("webinars", (n) -> { this.setWebinars(n.getCollectionOfObjectValues(VirtualEventWebinar::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the webinars property value. The webinars property
     * @return a java.util.List<VirtualEventWebinar>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventWebinar> getWebinars() {
        return this.backingStore.get("webinars");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("webinars", this.getWebinars());
    }
    /**
     * Sets the webinars property value. The webinars property
     * @param value Value to set for the webinars property.
     */
    public void setWebinars(@jakarta.annotation.Nullable final java.util.List<VirtualEventWebinar> value) {
        this.backingStore.set("webinars", value);
    }
}
