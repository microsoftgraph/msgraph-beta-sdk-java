package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExchangeSettings} and sets the default values.
     */
    public ExchangeSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeSettings}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inPlaceArchiveMailboxId", (n) -> { this.setInPlaceArchiveMailboxId(n.getStringValue()); });
        deserializerMap.put("primaryMailboxId", (n) -> { this.setPrimaryMailboxId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inPlaceArchiveMailboxId property value. The inPlaceArchiveMailboxId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInPlaceArchiveMailboxId() {
        return this.backingStore.get("inPlaceArchiveMailboxId");
    }
    /**
     * Gets the primaryMailboxId property value. The unique identifier for the user&apos;s primary mailbox.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrimaryMailboxId() {
        return this.backingStore.get("primaryMailboxId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("inPlaceArchiveMailboxId", this.getInPlaceArchiveMailboxId());
        writer.writeStringValue("primaryMailboxId", this.getPrimaryMailboxId());
    }
    /**
     * Sets the inPlaceArchiveMailboxId property value. The inPlaceArchiveMailboxId property
     * @param value Value to set for the inPlaceArchiveMailboxId property.
     */
    public void setInPlaceArchiveMailboxId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inPlaceArchiveMailboxId", value);
    }
    /**
     * Sets the primaryMailboxId property value. The unique identifier for the user&apos;s primary mailbox.
     * @param value Value to set for the primaryMailboxId property.
     */
    public void setPrimaryMailboxId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryMailboxId", value);
    }
}
