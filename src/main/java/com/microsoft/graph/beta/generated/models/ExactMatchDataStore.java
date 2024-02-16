package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExactMatchDataStore extends ExactMatchDataStoreBase implements Parsable {
    /**
     * Instantiates a new {@link ExactMatchDataStore} and sets the default values.
     */
    public ExactMatchDataStore() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExactMatchDataStore}
     */
    @jakarta.annotation.Nonnull
    public static ExactMatchDataStore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchDataStore();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(ExactMatchSession::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sessions property value. The sessions property
     * @return a {@link java.util.List<ExactMatchSession>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExactMatchSession> getSessions() {
        return this.backingStore.get("sessions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
    }
    /**
     * Sets the sessions property value. The sessions property
     * @param value Value to set for the sessions property.
     */
    public void setSessions(@jakarta.annotation.Nullable final java.util.List<ExactMatchSession> value) {
        this.backingStore.set("sessions", value);
    }
}
